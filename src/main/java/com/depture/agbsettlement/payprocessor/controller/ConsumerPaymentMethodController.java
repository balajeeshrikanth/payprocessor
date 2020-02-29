package com.depture.agbsettlement.payprocessor.controller;

import com.braintreegateway.*;
import com.braintreegateway.exceptions.BraintreeException;
import com.depture.agbsettlement.payprocessor.config.PaymentConfig;
import com.depture.agbsettlement.payprocessor.entity.ConsumerPaymentMethod;
import com.depture.agbsettlement.payprocessor.repository.ConsumerPaymentMethodRepository;
import com.depture.agbsettlement.payprocessor.view.ConsumerPaymentMethodView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/settlement/consumer/PayMethod")
public class ConsumerPaymentMethodController {


    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final static Logger LOGGER = LogManager.getLogger(ConsumerPaymentMethodController.class);


    @Autowired
    @Qualifier("jdbcConsumerPaymentMethodRepository")
    private ConsumerPaymentMethodRepository consumerPaymentMethodRepository;

    @PostMapping("/v1")
    public ResponseEntity<?> createConsumerPaymentMethod(@RequestBody ConsumerPaymentMethodView consumerPaymentMethodView) {
        BigInteger sqlreturnvalue;
        List<ConsumerPaymentMethod> consumerPaymentMethodList = new ArrayList<ConsumerPaymentMethod>();

        if (!consumerPaymentMethodView.getChannelid().equals("creditcard")){
            LOGGER.error("Error - Only Braintree creditcard supported :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        try {
            consumerPaymentMethodList = this.consumerPaymentMethodRepository.findByPayMethod(consumerPaymentMethodView.getCreditcard().getqConsumerpaymentmethod());
            if (consumerPaymentMethodList.size()>0){
                LOGGER.error("Error - Payment method exists in DB :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception ex){
            LOGGER.error("Error - Unknown Query error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        //Connect to Braintree and get Nonce
        String paymentToken = "NOTAVAILABLE";//Initial value

        if (!PaymentConfig.BTENVIRONMENT.equals("SANDBOX")){
            LOGGER.error("BrainTree environment is not Sandbox :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            return new ResponseEntity<>(null, HttpStatus.SERVICE_UNAVAILABLE);
        }
        try{
            BraintreeGateway braintreeGateway = new BraintreeGateway(Environment.SANDBOX,PaymentConfig.MERCHANTID,PaymentConfig.PUBLICKEY,PaymentConfig.PRIVATEKEY);
            PaymentMethodRequest paymentMethodRequest = new PaymentMethodRequest();
            paymentMethodRequest.customerId(consumerPaymentMethodView.getConsumerid());
            paymentMethodRequest.paymentMethodNonce(consumerPaymentMethodView.getCreditcard().getBraintreenonce());
            Result<? extends PaymentMethod> result = braintreeGateway.paymentMethod().create(paymentMethodRequest);
            PaymentMethod paymentMethod = result.getTarget();

            //paymentToken = paymentMethod.getToken();
            LOGGER.info("BrainTree Token Received {}", paymentToken);

        } catch (BraintreeException beX){
            LOGGER.error("BrainTree Exception :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            beX.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.SERVICE_UNAVAILABLE);
        } catch (Exception ex){
            LOGGER.error("General Exception :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.SERVICE_UNAVAILABLE);
        }

        // Now update Database
        ConsumerPaymentMethod consumerPaymentMethod = new ConsumerPaymentMethod(consumerPaymentMethodView.getConsumerid(),consumerPaymentMethodView.getCreditcard().getqConsumerpaymentmethod(),consumerPaymentMethodView.getCreditcard().getDefaultflag(),consumerPaymentMethodView.getCreditcard().getBraintreenonce());
        consumerPaymentMethod.setBtPaymentMethod(paymentToken);
        try {
            sqlreturnvalue = this.consumerPaymentMethodRepository.newConsumerPaymentMethod(consumerPaymentMethod);
            consumerPaymentMethod.setIdConsumerPaymentMethod(sqlreturnvalue.longValue());

        }catch (Exception ex){
            LOGGER.error("Error - DB Insert error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("success", HttpStatus.OK);

    }

    @GetMapping("/v1/{consumerid}")
    public ResponseEntity<?> getPaymentMethodForConsumer(@PathVariable("consumerid") String consumerid){

        List<ConsumerPaymentMethod> consumerPaymentMethodList = new ArrayList<ConsumerPaymentMethod>();

        try {
            consumerPaymentMethodList = this.consumerPaymentMethodRepository.findByConsumerId(consumerid);
            if (consumerPaymentMethodList.size()==0){
                LOGGER.error("Error - No Payment method exists in DB :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception ex){
            LOGGER.error("Error - Unknown Query error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(consumerPaymentMethodList, HttpStatus.OK);

    }

    @DeleteMapping("/v1/{qPaymentMethod}")
    public ResponseEntity<?> deletePaymentMethod(@PathVariable("qPaymentMethod") String qPaymentMethod){

        int sqlreturnvalue;

        List<ConsumerPaymentMethod> consumerPaymentMethodList = new ArrayList<ConsumerPaymentMethod>();
        try {
            consumerPaymentMethodList = this.consumerPaymentMethodRepository.findByPayMethod(qPaymentMethod);
            if (consumerPaymentMethodList.size()==0){
                LOGGER.error("Error - No Payment method exists in DB :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception ex){
            LOGGER.error("Error - Unknown Query error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        try {
            sqlreturnvalue = this.consumerPaymentMethodRepository.deleteByPaymentMethod(qPaymentMethod);
            LOGGER.info("Sqlreturn value {{",sqlreturnvalue);
        } catch (Exception ex){
            LOGGER.error("Error - Unknown Delete SQL  error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        }


        return new ResponseEntity<>("deletion success", HttpStatus.OK);

 }


}

package com.depture.agbsettlement.payprocessor.controller;

import com.depture.agbsettlement.payprocessor.entity.MerchantPaymentMethod;
import com.depture.agbsettlement.payprocessor.repository.MerchantPaymentMethodRepository;
import com.depture.agbsettlement.payprocessor.repository.MerchantPaypalPayoutsRepository;
import com.depture.agbsettlement.payprocessor.view.MerchantDwollaFundSourceView;
import com.depture.agbsettlement.payprocessor.view.MerchantDwollaMethodView;
import com.depture.agbsettlement.payprocessor.view.MerchantPayPalMethodView;
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
@RequestMapping("/settlement/merchant")
public class MerchantPaymentMethodController {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final static Logger LOGGER = LogManager.getLogger(MerchantPaymentMethodController.class);

    @Autowired
    @Qualifier("jdbcMerchantPaymentMethodRepository")
    private MerchantPaymentMethodRepository merchantPaymentMethodRepository;

    @PostMapping("/PaypalPayMethod/v1")
    public ResponseEntity<?> createMerchantPayPalMethod(@RequestBody MerchantPayPalMethodView merchantPayPalMethodView) {
        BigInteger sqlreturnvalue;
        List<MerchantPaymentMethod> merchantPaymentMethodList = new ArrayList<MerchantPaymentMethod>();

        MerchantPaymentMethod merchantPaymentMethod = new MerchantPaymentMethod(merchantPayPalMethodView.getMerchantid(),merchantPayPalMethodView.getVenueid(),"paypal",merchantPayPalMethodView.getPaypalid(),"",merchantPayPalMethodView.getLastname(),merchantPayPalMethodView.getFirstname(),merchantPayPalMethodView.getEmail());

        merchantPaymentMethod.setdCustomerId("NA");
        try{

            sqlreturnvalue = this.merchantPaymentMethodRepository.newMerchantPaymentMethod(merchantPaymentMethod);
        } catch (Exception ex){
            LOGGER.error("Error - DB Insert error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>("success", HttpStatus.OK);

    }


    @PostMapping("/DwollaCreateCustomer/v1")
    public ResponseEntity<?> createMerchantDwollaMethod(@RequestBody MerchantDwollaMethodView merchantDwollaMethodView) {
        BigInteger sqlreturnvalue;
        List<MerchantPaymentMethod> merchantPaymentMethodList = new ArrayList<MerchantPaymentMethod>();

        MerchantPaymentMethod merchantPaymentMethod = new MerchantPaymentMethod(merchantDwollaMethodView.getMerchantid(),merchantDwollaMethodView.getVenueid(),"dwolla","NA","",merchantDwollaMethodView.getLastname(),merchantDwollaMethodView.getFirstname(),merchantDwollaMethodView.getEmail());

        merchantPaymentMethod.setdCustomerId("NA");
        try{

            sqlreturnvalue = this.merchantPaymentMethodRepository.newMerchantPaymentMethod(merchantPaymentMethod);
        } catch (Exception ex){
            LOGGER.error("Error - DB Insert error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>("success", HttpStatus.OK);

    }

    @PostMapping("/DwollaFundSource/v1")
    public ResponseEntity<?> updateMerchantDwollaFundSource(@RequestBody MerchantDwollaFundSourceView merchantDwollaFundSourceView) {
        int sqlreturnvalue;
        List<MerchantPaymentMethod> merchantPaymentMethodList = new ArrayList<MerchantPaymentMethod>();

        try {

            merchantPaymentMethodList = this.merchantPaymentMethodRepository.findByMerchantAndVenue(merchantDwollaFundSourceView.getMerchantid(),merchantDwollaFundSourceView.getVenueid());

            if (merchantPaymentMethodList.size()==0){
                LOGGER.error("Error - No Merchant Payment method exists in DB :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception ex){
            LOGGER.error("Error - Unknown Query error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        MerchantPaymentMethod merchantPaymentMethod = merchantPaymentMethodList.get(0);
        merchantPaymentMethod.setFundingsource(merchantDwollaFundSourceView.getFundsource());

        try{

            sqlreturnvalue = this.merchantPaymentMethodRepository.updateFundingSource(merchantPaymentMethod);
        } catch (Exception ex){
            LOGGER.error("Error - DB Update error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>("success", HttpStatus.OK);

    }

    @GetMapping("/PayMethod/v1/{venueid}")
    public ResponseEntity<?> getPaymentMethodForMerchant(@PathVariable("venueid") String venueid){

        List<MerchantPaymentMethod> merchantPaymentMethodList= new ArrayList<MerchantPaymentMethod>();

        try {
            merchantPaymentMethodList = this.merchantPaymentMethodRepository.findByVenue(venueid);
            if (merchantPaymentMethodList.size()==0){
                LOGGER.error("Error - No Merchant Payment method exists in DB :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception ex){
            LOGGER.error("Error - Unknown Query error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(merchantPaymentMethodList, HttpStatus.OK);

    }

    @DeleteMapping("/PayMethod/v1/{merchantid}/{venueid}")
    public ResponseEntity<?> deleteMerchantPaymentMethod(@PathVariable("merchantid") String merchantid, @PathVariable("venueid") String venueid){

        int sqlreturnvalue;

        List<MerchantPaymentMethod> merchantPaymentMethodList = new ArrayList<MerchantPaymentMethod>();
        try {
            merchantPaymentMethodList = this.merchantPaymentMethodRepository.findByMerchantAndVenue(merchantid,venueid);
            if (merchantPaymentMethodList.size()==0){
                LOGGER.error("Error - No Merchant Payment method exists in DB :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception ex){
            LOGGER.error("Error - Unknown Query error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        try {
            sqlreturnvalue = this.merchantPaymentMethodRepository.deleteByPaymentMethod(merchantid,venueid);
            LOGGER.info("Sqlreturn value {{",sqlreturnvalue);
        } catch (Exception ex){
            LOGGER.error("Error - Unknown Delete SQL  error :: Execution Time {}", dateTimeFormatter.format(LocalDateTime.now()));
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        }


        return new ResponseEntity<>("deletion success", HttpStatus.OK);

    }


}

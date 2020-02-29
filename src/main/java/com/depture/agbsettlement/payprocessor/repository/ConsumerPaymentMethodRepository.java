package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.ConsumerPaymentMethod;

import java.math.BigInteger;
import java.util.List;

public interface ConsumerPaymentMethodRepository {

    int count();
    int save(ConsumerPaymentMethod consumerPaymentMethod);
    BigInteger newConsumerPaymentMethod(ConsumerPaymentMethod consumerPaymentMethod);
    int update(ConsumerPaymentMethod consumerPaymentMethod);
    int updateStatus(ConsumerPaymentMethod consumerPaymentMethod);
    int deleteById(int id);
    int deleteByPaymentMethod(String qpaymentmethod);
    List<ConsumerPaymentMethod> findAll();
    List<ConsumerPaymentMethod> findByConsumerAndPayMethod(String consumerid, String qpaymentmethod);
    List<ConsumerPaymentMethod> findByConsumerId(String consumerid);
    List<ConsumerPaymentMethod> findByPayMethod(String qpaymentmethod);


}

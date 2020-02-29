package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.ConsumerPayments;

import java.math.BigInteger;
import java.util.List;

public interface ConsumerPaymentsRepository {

    int count();
    int save(ConsumerPayments consumerPayments);
    BigInteger newConsumerPayment(ConsumerPayments consumerPayments);
    int update(ConsumerPayments consumerPayments);
    int updateStatus(ConsumerPayments consumerPayments);
    int deleteById(int id);
    List<ConsumerPayments> findAll();

}

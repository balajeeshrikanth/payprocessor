package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.ConsumerPayments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class JdbcConsumerPaymentsRepository implements ConsumerPaymentsRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(ConsumerPayments consumerPayments) {
        return 0;
    }

    @Override
    public BigInteger newConsumerPayment(ConsumerPayments consumerPayments) {
        return null;
    }

    @Override
    public int update(ConsumerPayments consumerPayments) {
        return 0;
    }

    @Override
    public int updateStatus(ConsumerPayments consumerPayments) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public List<ConsumerPayments> findAll() {
        return null;
    }
}

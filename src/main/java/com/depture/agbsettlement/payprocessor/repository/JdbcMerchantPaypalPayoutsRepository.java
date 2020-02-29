package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantPaypalPayouts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class JdbcMerchantPaypalPayoutsRepository implements MerchantPaypalPayoutsRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(MerchantPaypalPayouts merchantPaypalPayouts) {
        return 0;
    }

    @Override
    public BigInteger newMerchantPaypalPayouts(MerchantPaypalPayouts merchantPaypalPayouts) {
        return null;
    }

    @Override
    public int update(MerchantPaypalPayouts merchantPaypalPayouts) {
        return 0;
    }

    @Override
    public int updateStatus(MerchantPaypalPayouts merchantPaypalPayouts) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public List<MerchantPaypalPayouts> findAll() {
        return null;
    }
}

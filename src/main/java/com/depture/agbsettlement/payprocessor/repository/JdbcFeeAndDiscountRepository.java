package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.FeeAndDiscount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class JdbcFeeAndDiscountRepository implements FeeAndDiscountRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(FeeAndDiscount feeAndDiscount) {
        return 0;
    }

    @Override
    public BigInteger newFeeAndDiscount(FeeAndDiscount feeAndDiscount) {
        return null;
    }

    @Override
    public int update(FeeAndDiscount feeAndDiscount) {
        return 0;
    }

    @Override
    public int updateStatus(FeeAndDiscount feeAndDiscount) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public List<FeeAndDiscount> findAll() {
        return null;
    }
}

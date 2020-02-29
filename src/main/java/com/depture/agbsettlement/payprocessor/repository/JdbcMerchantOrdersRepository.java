package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class JdbcMerchantOrdersRepository implements MerchantOrdersRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(MerchantOrders merchantOrders) {
        return 0;
    }

    @Override
    public BigInteger newMerchantOrders(MerchantOrders merchantOrders) {
        return null;
    }

    @Override
    public int update(MerchantOrders merchantOrders) {
        return 0;
    }

    @Override
    public int updateStatus(MerchantOrders merchantOrders) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public List<MerchantOrders> findAll() {
        return null;
    }
}

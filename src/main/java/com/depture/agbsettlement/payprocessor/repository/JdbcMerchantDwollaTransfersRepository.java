package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantDwollaTransfers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class JdbcMerchantDwollaTransfersRepository implements  MerchantDwollaTransfersRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(MerchantDwollaTransfers merchantDwollaTransfers) {
        return 0;
    }

    @Override
    public BigInteger newMerchantDwollaTransfers(MerchantDwollaTransfers merchantDwollaTransfers) {
        return null;
    }

    @Override
    public int update(MerchantDwollaTransfers merchantDwollaTransfers) {
        return 0;
    }

    @Override
    public int updateStatus(MerchantDwollaTransfers merchantDwollaTransfers) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public List<MerchantDwollaTransfers> findAll() {
        return null;
    }
}

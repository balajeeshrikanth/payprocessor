package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.PayoutBatches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class JdbcPayoutBatchesRepository implements PayoutBatchesRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(PayoutBatches payoutBatches) {
        return 0;
    }

    @Override
    public BigInteger newPayoutBatches(PayoutBatches payoutBatches) {
        return null;
    }

    @Override
    public int update(PayoutBatches payoutBatches) {
        return 0;
    }

    @Override
    public int updateStatus(PayoutBatches payoutBatches) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public List<PayoutBatches> findAll() {
        return null;
    }
}

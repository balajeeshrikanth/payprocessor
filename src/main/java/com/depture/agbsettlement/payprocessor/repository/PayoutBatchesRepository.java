package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.PayoutBatches;

import java.math.BigInteger;
import java.util.List;

public interface PayoutBatchesRepository {

    int count();
    int save(PayoutBatches payoutBatches);
    BigInteger newPayoutBatches(PayoutBatches payoutBatches);
    int update(PayoutBatches payoutBatches);
    int updateStatus(PayoutBatches payoutBatches);
    int deleteById(int id);
    List<PayoutBatches> findAll();
}

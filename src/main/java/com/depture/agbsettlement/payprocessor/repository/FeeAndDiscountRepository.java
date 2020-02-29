package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.FeeAndDiscount;

import java.math.BigInteger;
import java.util.List;

public interface FeeAndDiscountRepository {

    int count();
    int save(FeeAndDiscount feeAndDiscount);
    BigInteger newFeeAndDiscount(FeeAndDiscount feeAndDiscount);
    int update(FeeAndDiscount feeAndDiscount);
    int updateStatus(FeeAndDiscount feeAndDiscount);
    int deleteById(int id);
    List<FeeAndDiscount> findAll();
}

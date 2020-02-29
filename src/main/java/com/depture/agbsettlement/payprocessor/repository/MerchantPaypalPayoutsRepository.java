package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantPaypalPayouts;

import java.math.BigInteger;
import java.util.List;

public interface MerchantPaypalPayoutsRepository {
    int count();
    int save(MerchantPaypalPayouts merchantPaypalPayouts);
    BigInteger newMerchantPaypalPayouts(MerchantPaypalPayouts merchantPaypalPayouts);
    int update(MerchantPaypalPayouts merchantPaypalPayouts);
    int updateStatus(MerchantPaypalPayouts merchantPaypalPayouts);
    int deleteById(int id);
    List<MerchantPaypalPayouts> findAll();

}

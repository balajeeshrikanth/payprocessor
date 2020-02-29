package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantPaymentMethod;

import java.math.BigInteger;
import java.util.List;

public interface MerchantPaymentMethodRepository {

    int count();
    int save(MerchantPaymentMethod merchantPaymentMethod);
    BigInteger newMerchantPaymentMethod(MerchantPaymentMethod merchantPaymentMethod);
    int update(MerchantPaymentMethod merchantPaymentMethod);
    int updateStatus(MerchantPaymentMethod merchantPaymentMethod);
    int updateFundingSource(MerchantPaymentMethod merchantPaymentMethod);
    int deleteById(int id);
    int deleteByPaymentMethod(String merchantid, String venueid);
    List<MerchantPaymentMethod> findAll();
    List<MerchantPaymentMethod> findByMerchantAndVenue(String merchantid,String venueid);
    List<MerchantPaymentMethod> findByVenue(String venueid);

}


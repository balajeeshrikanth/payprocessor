package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantOrders;

import java.math.BigInteger;
import java.util.List;

public interface MerchantOrdersRepository {

    int count();
    int save(MerchantOrders merchantOrders);
    BigInteger newMerchantOrders(MerchantOrders merchantOrders);
    int update(MerchantOrders merchantOrders);
    int updateStatus(MerchantOrders merchantOrders);
    int deleteById(int id);
    List<MerchantOrders> findAll();

}


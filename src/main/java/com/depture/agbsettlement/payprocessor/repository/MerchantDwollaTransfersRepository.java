package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantDwollaTransfers;

import java.math.BigInteger;
import java.util.List;

public interface MerchantDwollaTransfersRepository {

    int count();
    int save(MerchantDwollaTransfers merchantDwollaTransfers);
    BigInteger newMerchantDwollaTransfers(MerchantDwollaTransfers merchantDwollaTransfers);
    int update(MerchantDwollaTransfers merchantDwollaTransfers);
    int updateStatus(MerchantDwollaTransfers merchantDwollaTransfers);
    int deleteById(int id);
    List<MerchantDwollaTransfers> findAll();
}

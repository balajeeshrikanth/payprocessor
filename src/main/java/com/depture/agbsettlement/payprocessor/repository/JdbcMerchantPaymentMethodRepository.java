package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.MerchantPaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class JdbcMerchantPaymentMethodRepository implements  MerchantPaymentMethodRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(MerchantPaymentMethod merchantPaymentMethod) {
        return 0;
    }

    @Override
    public BigInteger newMerchantPaymentMethod(MerchantPaymentMethod merchantPaymentMethod) {
        return null;
    }

    @Override
    public int update(MerchantPaymentMethod merchantPaymentMethod) {
        return 0;
    }

    @Override
    public int updateStatus(MerchantPaymentMethod merchantPaymentMethod) {
        return 0;
    }

    @Override
    public int updateFundingSource(MerchantPaymentMethod merchantPaymentMethod) {
        int sqlreturnvalue = jdbcTemplate.update(
                "update MerchantPaymentMethod set fundingsource =? where   idMerchantPaymentMethod = ?  ",
                merchantPaymentMethod.getFundingsource(),merchantPaymentMethod.getIdMerchantPaymentMethod());
        return sqlreturnvalue;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public int deleteByPaymentMethod(String merchantid, String venueid) {
        return jdbcTemplate.update(
                "delete from MerchantPaymentMethod  where qMerchantId = ? AND qVenueId = ?",
                merchantid,venueid);
    }

    @Override
    public List<MerchantPaymentMethod> findAll() {
        return null;
    }

    @Override
    public List<MerchantPaymentMethod> findByMerchantAndVenue(String merchantid, String venueid) {
        return jdbcTemplate.query(
                "select idMerchantPaymentMethod, qMerchantId,qVenueId,channel,paypalid, fundingsource, lastname, firstname, emailid, datecreated, dateupdated, dCustomerId from ConsumerPaymentMethod where qMerchantId = ? and qVenueId=?",
                new Object[]{ merchantid,venueid},
                (rs,rowNum) -> new MerchantPaymentMethod(
                        rs.getLong("idMerchantPaymentMethod"),
                        rs.getString("qMerchantId"),
                        rs.getString("qVenueId"),
                        rs.getString("channel"),
                        rs.getString("paypalid"),
                        rs.getString("fundingsource"),
                        rs.getString("lastname"),
                        rs.getString("firstname"),
                        rs.getString("emailid"),
                        rs.getTimestamp("datecreated"),
                        rs.getTimestamp("dateupdated"),
                        rs.getString("dCustomerId")
                )
        );


    }

    @Override
    public List<MerchantPaymentMethod> findByVenue(String venueid) {
        return jdbcTemplate.query(
                "select idMerchantPaymentMethod, qMerchantId,qVenueId,channel,paypalid, fundingsource, lastname, firstname, emailid, datecreated, dateupdated, dCustomerId from ConsumerPaymentMethod where qVenueId = ? ",
                new Object[]{ venueid},
                (rs,rowNum) -> new MerchantPaymentMethod(
                        rs.getLong("idMerchantPaymentMethod"),
                        rs.getString("qMerchantId"),
                        rs.getString("qVenueId"),
                        rs.getString("channel"),
                        rs.getString("paypalid"),
                        rs.getString("fundingsource"),
                        rs.getString("lastname"),
                        rs.getString("firstname"),
                        rs.getString("emailid"),
                        rs.getTimestamp("datecreated"),
                        rs.getTimestamp("dateupdated"),
                        rs.getString("dCustomerId")
                )
        );
    }
}

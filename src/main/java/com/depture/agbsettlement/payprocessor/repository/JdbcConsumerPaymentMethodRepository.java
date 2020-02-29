package com.depture.agbsettlement.payprocessor.repository;

import com.depture.agbsettlement.payprocessor.entity.ConsumerPaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class JdbcConsumerPaymentMethodRepository implements ConsumerPaymentMethodRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(ConsumerPaymentMethod consumerPaymentMethod) {
        return 0;
    }

    @Override
    public BigInteger newConsumerPaymentMethod(ConsumerPaymentMethod consumerPaymentMethod) {

        String INSERT_CPM_SQL = "insert into ConsumerPaymentMethod ( qConsumerId, qPaymentMethod, defaultMethod, paymentNonce, btPaymentMethod ) values (?,?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int sqlreturnvalue = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(INSERT_CPM_SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, consumerPaymentMethod.getqConsumerId());
            ps.setString(2, consumerPaymentMethod.getqPaymentMethod());
            ps.setString(3, consumerPaymentMethod.getDefaultMethod());
            ps.setString(4, consumerPaymentMethod.getPaymentNonce());
            ps.setString(5, consumerPaymentMethod.getBtPaymentMethod());
            return ps;
        }, keyHolder);

        return (BigInteger) keyHolder.getKey();

    }


    @Override
    public int update(ConsumerPaymentMethod consumerPaymentMethod) {
        return 0;
    }

    @Override
    public int updateStatus(ConsumerPaymentMethod consumerPaymentMethod) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public int deleteByPaymentMethod(String qpaymentmethod) {
        return jdbcTemplate.update(
                "delete from ConsumerPaymentMethod  where qPaymentMethod = ?",
                qpaymentmethod);

    }

    @Override
    public List<ConsumerPaymentMethod> findAll() {
        return null;
    }

    @Override
    public List<ConsumerPaymentMethod> findByConsumerAndPayMethod(String consumerid, String qpaymentmethod) {
        return jdbcTemplate.query(
                "select qConsumerId,qPaymentMethod,defaultMethod,paymentNonce from ConsumerPaymentMethod where qConsumerId = ? and qPaymentMethod=?",
                new Object[]{ consumerid,qpaymentmethod},
                (rs,rowNum) -> new ConsumerPaymentMethod(
                        rs.getString("qConsumerId"),
                        rs.getString("qPaymentMethod"),
                        rs.getString("defaultMethod"),
                        rs.getString("paymentNonce")
                )
        );
    }

    @Override
    public List<ConsumerPaymentMethod> findByConsumerId(String consumerid) {
        return jdbcTemplate.query(
                "select  idConsumerPaymentMethod,qConsumerId,qPaymentMethod,defaultMethod,paymentNonce, btPaymentMethod, datecreated,dateupdated  from ConsumerPaymentMethod where qConsumerId = ? ",
                new Object[]{ consumerid},
                (rs,rowNum) -> new ConsumerPaymentMethod(
                        rs.getLong("idConsumerPaymentMethod"),
                        rs.getString("qConsumerId"),
                        rs.getString("qPaymentMethod"),
                        rs.getString("defaultMethod"),
                        rs.getString("paymentNonce"),
                        rs.getString("btPaymentMethod"),
                        rs.getTimestamp("datecreated"),
                        rs.getTimestamp("dateupdated")
                )
        );
    }

    @Override
    public List<ConsumerPaymentMethod> findByPayMethod(String qpaymentmethod) {
        return jdbcTemplate.query(
                "select qConsumerId,qPaymentMethod,defaultMethod,paymentNonce from ConsumerPaymentMethod where qPaymentMethod=?",
                new Object[]{ qpaymentmethod},
                (rs,rowNum) -> new ConsumerPaymentMethod(
                        rs.getString("qConsumerId"),
                        rs.getString("qPaymentMethod"),
                        rs.getString("defaultMethod"),
                        rs.getString("paymentNonce")
                )
        );
    }
}

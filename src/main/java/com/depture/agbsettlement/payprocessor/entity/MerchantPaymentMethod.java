package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Timestamp;

public class MerchantPaymentMethod {

    private Long idMerchantPaymentMethod;
    private String qMerchantId;
    private String qVenueId;
    private String channel;
    private String paypalid;
    private String fundingsource;
    private String lastname;
    private String firstname;
    private String emailid;
    private Timestamp datecreated;
    private Timestamp dateupdated;
    private String dCustomerId;

    public MerchantPaymentMethod(Long idMerchantPaymentMethod, String qMerchantId, String qVenueId, String channel, String paypalid, String fundingsource, String lastname, String firstname, String emailid, Timestamp datecreated, Timestamp dateupdated, String dCustomerId) {
        this.idMerchantPaymentMethod = idMerchantPaymentMethod;
        this.qMerchantId = qMerchantId;
        this.qVenueId = qVenueId;
        this.channel = channel;
        this.paypalid = paypalid;
        this.fundingsource = fundingsource;
        this.lastname = lastname;
        this.firstname = firstname;
        this.emailid = emailid;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
        this.dCustomerId = dCustomerId;
    }

    public MerchantPaymentMethod(Long idMerchantPaymentMethod, String qMerchantId, String qVenueId, String channel, String paypalid, String fundingsource, String lastname, String firstname, String emailid, Timestamp datecreated, String dCustomerId) {
        this.idMerchantPaymentMethod = idMerchantPaymentMethod;
        this.qMerchantId = qMerchantId;
        this.qVenueId = qVenueId;
        this.channel = channel;
        this.paypalid = paypalid;
        this.fundingsource = fundingsource;
        this.lastname = lastname;
        this.firstname = firstname;
        this.emailid = emailid;
        this.datecreated = datecreated;
        this.dCustomerId = dCustomerId;
    }

    public MerchantPaymentMethod(String qMerchantId, String qVenueId, String channel, String paypalid, String fundingsource, String lastname, String firstname, String emailid, Timestamp datecreated, Timestamp dateupdated, String dCustomerId) {
        this.qMerchantId = qMerchantId;
        this.qVenueId = qVenueId;
        this.channel = channel;
        this.paypalid = paypalid;
        this.fundingsource = fundingsource;
        this.lastname = lastname;
        this.firstname = firstname;
        this.emailid = emailid;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
        this.dCustomerId = dCustomerId;
    }

    public MerchantPaymentMethod(String qMerchantId, String qVenueId, String channel, String paypalid, String fundingsource, String lastname, String firstname, String emailid, Timestamp datecreated, String dCustomerId) {
        this.qMerchantId = qMerchantId;
        this.qVenueId = qVenueId;
        this.channel = channel;
        this.paypalid = paypalid;
        this.fundingsource = fundingsource;
        this.lastname = lastname;
        this.firstname = firstname;
        this.emailid = emailid;
        this.datecreated = datecreated;
        this.dCustomerId = dCustomerId;
    }

    public MerchantPaymentMethod(String qMerchantId, String qVenueId, String channel, String paypalid, String fundingsource, String lastname, String firstname, String emailid) {
        this.qMerchantId = qMerchantId;
        this.qVenueId = qVenueId;
        this.channel = channel;
        this.paypalid = paypalid;
        this.fundingsource = fundingsource;
        this.lastname = lastname;
        this.firstname = firstname;
        this.emailid = emailid;
        this.dCustomerId = "";
    }

    public Long getIdMerchantPaymentMethod() {
        return idMerchantPaymentMethod;
    }

    public void setIdMerchantPaymentMethod(Long idMerchantPaymentMethod) {
        this.idMerchantPaymentMethod = idMerchantPaymentMethod;
    }

    public String getqMerchantId() {
        return qMerchantId;
    }

    public void setqMerchantId(String qMerchantId) {
        this.qMerchantId = qMerchantId;
    }

    public String getqVenueId() {
        return qVenueId;
    }

    public void setqVenueId(String qVenueId) {
        this.qVenueId = qVenueId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPaypalid() {
        return paypalid;
    }

    public void setPaypalid(String paypalid) {
        this.paypalid = paypalid;
    }

    public String getFundingsource() {
        return fundingsource;
    }

    public void setFundingsource(String fundingsource) {
        this.fundingsource = fundingsource;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Timestamp getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Timestamp datecreated) {
        this.datecreated = datecreated;
    }

    public Timestamp getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Timestamp dateupdated) {
        this.dateupdated = dateupdated;
    }

    public String getdCustomerId() {
        return dCustomerId;
    }

    public void setdCustomerId(String dCustomerId) {
        this.dCustomerId = dCustomerId;
    }
}

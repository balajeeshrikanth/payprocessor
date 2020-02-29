package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Timestamp;

public class ConsumerPaymentMethod {

    private Long idConsumerPaymentMethod;
    private String qConsumerId;
    private String qPaymentMethod;
    private String defaultMethod;
    private String paymentNonce;
    private String btPaymentMethod;
    private Timestamp datecreated;
    private Timestamp dateupdated;

    public ConsumerPaymentMethod(Long idConsumerPaymentMethod, String qConsumerId, String qPaymentMethod, String defaultMethod, String paymentNonce, String btPaymentMethod, Timestamp datecreated, Timestamp dateupdated) {
        this.idConsumerPaymentMethod = idConsumerPaymentMethod;
        this.qConsumerId = qConsumerId;
        this.qPaymentMethod = qPaymentMethod;
        this.defaultMethod = defaultMethod;
        this.paymentNonce = paymentNonce;
        this.btPaymentMethod = btPaymentMethod;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public ConsumerPaymentMethod(Long idConsumerPaymentMethod, String qConsumerId, String qPaymentMethod, String defaultMethod, String paymentNonce, String btPaymentMethod, Timestamp datecreated) {
        this.idConsumerPaymentMethod = idConsumerPaymentMethod;
        this.qConsumerId = qConsumerId;
        this.qPaymentMethod = qPaymentMethod;
        this.defaultMethod = defaultMethod;
        this.paymentNonce = paymentNonce;
        this.btPaymentMethod = btPaymentMethod;
        this.datecreated = datecreated;
    }

    public ConsumerPaymentMethod(String qConsumerId, String qPaymentMethod, String defaultMethod, String paymentNonce, String btPaymentMethod, Timestamp datecreated, Timestamp dateupdated) {
        this.qConsumerId = qConsumerId;
        this.qPaymentMethod = qPaymentMethod;
        this.defaultMethod = defaultMethod;
        this.paymentNonce = paymentNonce;
        this.btPaymentMethod = btPaymentMethod;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public ConsumerPaymentMethod(String qConsumerId, String qPaymentMethod, String defaultMethod, String paymentNonce, String btPaymentMethod, Timestamp datecreated) {
        this.qConsumerId = qConsumerId;
        this.qPaymentMethod = qPaymentMethod;
        this.defaultMethod = defaultMethod;
        this.paymentNonce = paymentNonce;
        this.btPaymentMethod = btPaymentMethod;
        this.datecreated = datecreated;
    }

    public ConsumerPaymentMethod(String qConsumerId, String qPaymentMethod, String defaultMethod, String paymentNonce) {
        this.qConsumerId = qConsumerId;
        this.qPaymentMethod = qPaymentMethod;
        this.defaultMethod = defaultMethod;
        this.paymentNonce = paymentNonce;
    }

    public ConsumerPaymentMethod(String qConsumerId, String qPaymentMethod, String defaultMethod, String paymentNonce, String btPaymentMethod) {
        this.qConsumerId = qConsumerId;
        this.qPaymentMethod = qPaymentMethod;
        this.defaultMethod = defaultMethod;
        this.paymentNonce = paymentNonce;
        this.btPaymentMethod = btPaymentMethod;
    }

    public ConsumerPaymentMethod(Long idConsumerPaymentMethod, String qConsumerId, String qPaymentMethod, String defaultMethod, String paymentNonce, String btPaymentMethod) {
        this.idConsumerPaymentMethod = idConsumerPaymentMethod;
        this.qConsumerId = qConsumerId;
        this.qPaymentMethod = qPaymentMethod;
        this.defaultMethod = defaultMethod;
        this.paymentNonce = paymentNonce;
        this.btPaymentMethod = btPaymentMethod;
    }

    public Long getIdConsumerPaymentMethod() {
        return idConsumerPaymentMethod;
    }

    public void setIdConsumerPaymentMethod(Long idConsumerPaymentMethod) {
        this.idConsumerPaymentMethod = idConsumerPaymentMethod;
    }

    public String getqConsumerId() {
        return qConsumerId;
    }

    public void setqConsumerId(String qConsumerId) {
        this.qConsumerId = qConsumerId;
    }

    public String getqPaymentMethod() {
        return qPaymentMethod;
    }

    public void setqPaymentMethod(String qPaymentMethod) {
        this.qPaymentMethod = qPaymentMethod;
    }

    public String getDefaultMethod() {
        return defaultMethod;
    }

    public void setDefaultMethod(String defaultMethod) {
        this.defaultMethod = defaultMethod;
    }

    public String getPaymentNonce() {
        return paymentNonce;
    }

    public void setPaymentNonce(String paymentNonce) {
        this.paymentNonce = paymentNonce;
    }

    public String getBtPaymentMethod() {
        return btPaymentMethod;
    }

    public void setBtPaymentMethod(String btPaymentMethod) {
        this.btPaymentMethod = btPaymentMethod;
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
}

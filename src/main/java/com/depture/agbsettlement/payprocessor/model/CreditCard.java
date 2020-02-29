package com.depture.agbsettlement.payprocessor.model;

public class CreditCard {
    private String qConsumerpaymentmethod;
    private String defaultflag;
    private String braintreenonce;

    public CreditCard() {
        this.qConsumerpaymentmethod = "";
        this.defaultflag = "";
        this.braintreenonce ="";
    }

    public CreditCard(String qConsumerpaymentmethod, String defaultflag, String braintreenonce) {
        this.qConsumerpaymentmethod = qConsumerpaymentmethod;
        this.defaultflag = defaultflag;
        this.braintreenonce = braintreenonce;
    }

    public String getqConsumerpaymentmethod() {
        return qConsumerpaymentmethod;
    }

    public void setqConsumerpaymentmethod(String qConsumerpaymentmethod) {
        this.qConsumerpaymentmethod = qConsumerpaymentmethod;
    }

    public String getDefaultflag() {
        return defaultflag;
    }

    public void setDefaultflag(String defaultflag) {
        this.defaultflag = defaultflag;
    }

    public String getBraintreenonce() {
        return braintreenonce;
    }

    public void setBraintreenonce(String braintreenonce) {
        this.braintreenonce = braintreenonce;
    }
}

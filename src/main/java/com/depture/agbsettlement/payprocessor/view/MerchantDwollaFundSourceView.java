package com.depture.agbsettlement.payprocessor.view;

public class MerchantDwollaFundSourceView {

    private String merchantid;
    private String venueid;
    private String fundsource;

    public MerchantDwollaFundSourceView() {
        this.merchantid = "";
        this.venueid = "";
        this.fundsource = "";
    }

    public MerchantDwollaFundSourceView(String merchantid, String venueid, String fundsource) {
        this.merchantid = merchantid;
        this.venueid = venueid;
        this.fundsource = fundsource;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getVenueid() {
        return venueid;
    }

    public void setVenueid(String venueid) {
        this.venueid = venueid;
    }

    public String getFundsource() {
        return fundsource;
    }

    public void setFundsource(String fundsource) {
        this.fundsource = fundsource;
    }
}

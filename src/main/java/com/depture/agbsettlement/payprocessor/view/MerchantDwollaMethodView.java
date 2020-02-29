package com.depture.agbsettlement.payprocessor.view;

public class MerchantDwollaMethodView {

    private String merchantid;
    private String venueid;
    private String firstname;
    private String lastname;
    private String email;
    private String type;
    private String ipaddress;

    public MerchantDwollaMethodView() {

        this.merchantid ="";
        this.venueid="";
        this.firstname="";
        this.lastname="";
        this.email="";
        this.type="";
        this.ipaddress="";
    }

    public MerchantDwollaMethodView(String merchantid, String venueid, String firstname, String lastname, String email, String type, String ipaddress) {
        this.merchantid = merchantid;
        this.venueid = venueid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.type = type;
        this.ipaddress = ipaddress;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }
}

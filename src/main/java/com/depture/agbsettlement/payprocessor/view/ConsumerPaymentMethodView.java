package com.depture.agbsettlement.payprocessor.view;

import com.depture.agbsettlement.payprocessor.model.CreditCard;

public class ConsumerPaymentMethodView {

    private String consumerid;
    private String channelid;//creditcard, paypal, ach
    private CreditCard creditcard;

    public ConsumerPaymentMethodView() {
        this.consumerid = "";
        this.channelid ="creditcard";
        this.creditcard = new CreditCard();
    }

    public ConsumerPaymentMethodView(String consumerid, String channelid, CreditCard creditcard) {
        this.consumerid = consumerid;
        this.channelid = channelid;
        this.creditcard = creditcard;
    }

    public String getConsumerid() {
        return consumerid;
    }

    public void setConsumerid(String consumerid) {
        this.consumerid = consumerid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public CreditCard getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(CreditCard creditcard) {
        this.creditcard = creditcard;
    }
}

package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class MerchantOrders {
    private Long idMerchantOrders;
    private String qmerchantId;
    private String qvenueId;
    private String orderId;
    private String qOrderId;
    private double subTotal;
    private double instantDiscount;
    private double salesTax;
    private double tip;
    private double totalBillAmount;
    private String preOrderApplicable;
    private int numberOfPayments;
    private double actualAmountCharged;
    private double creditCardProcessingFee;
    private double creditCardAuthorizationFee;
    private double creorderFacilitationFee;
    private double creorderFacilitationDiscount;
    private double promotionFee;
    private double promotionFeeDiscountToMerchant;
    private double payoutAmount;
    private double bankPayoutFee;
    private double amountPaid;
    private String status;
    private Date payoutDate;
    private String qMerchantPaymentId;
    private Timestamp datecreated;
    private Timestamp dateupdated;
    private String paymentChannel;

    public MerchantOrders(Long idMerchantOrders, String qmerchantId, String qvenueId, String orderId, String qOrderId, double subTotal, double instantDiscount, double salesTax, double tip, double totalBillAmount, String preOrderApplicable, int numberOfPayments, double actualAmountCharged, double creditCardProcessingFee, double creditCardAuthorizationFee, double creorderFacilitationFee, double creorderFacilitationDiscount, double promotionFee, double promotionFeeDiscountToMerchant, double payoutAmount, double bankPayoutFee, double amountPaid, String status, Date payoutDate, String qMerchantPaymentId, Timestamp datecreated, Timestamp dateupdated, String paymentChannel) {
        this.idMerchantOrders = idMerchantOrders;
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalBillAmount = totalBillAmount;
        this.preOrderApplicable = preOrderApplicable;
        this.numberOfPayments = numberOfPayments;
        this.actualAmountCharged = actualAmountCharged;
        this.creditCardProcessingFee = creditCardProcessingFee;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.creorderFacilitationFee = creorderFacilitationFee;
        this.creorderFacilitationDiscount = creorderFacilitationDiscount;
        this.promotionFee = promotionFee;
        this.promotionFeeDiscountToMerchant = promotionFeeDiscountToMerchant;
        this.payoutAmount = payoutAmount;
        this.bankPayoutFee = bankPayoutFee;
        this.amountPaid = amountPaid;
        this.status = status;
        this.payoutDate = payoutDate;
        this.qMerchantPaymentId = qMerchantPaymentId;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
        this.paymentChannel = paymentChannel;
    }

    public MerchantOrders(Long idMerchantOrders, String qmerchantId, String qvenueId, String orderId, String qOrderId, double subTotal, double instantDiscount, double salesTax, double tip, double totalBillAmount, String preOrderApplicable, int numberOfPayments, double actualAmountCharged, double creditCardProcessingFee, double creditCardAuthorizationFee, double creorderFacilitationFee, double creorderFacilitationDiscount, double promotionFee, double promotionFeeDiscountToMerchant, double payoutAmount, double bankPayoutFee, double amountPaid, String status, Date payoutDate, String qMerchantPaymentId, Timestamp datecreated, String paymentChannel) {
        this.idMerchantOrders = idMerchantOrders;
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalBillAmount = totalBillAmount;
        this.preOrderApplicable = preOrderApplicable;
        this.numberOfPayments = numberOfPayments;
        this.actualAmountCharged = actualAmountCharged;
        this.creditCardProcessingFee = creditCardProcessingFee;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.creorderFacilitationFee = creorderFacilitationFee;
        this.creorderFacilitationDiscount = creorderFacilitationDiscount;
        this.promotionFee = promotionFee;
        this.promotionFeeDiscountToMerchant = promotionFeeDiscountToMerchant;
        this.payoutAmount = payoutAmount;
        this.bankPayoutFee = bankPayoutFee;
        this.amountPaid = amountPaid;
        this.status = status;
        this.payoutDate = payoutDate;
        this.qMerchantPaymentId = qMerchantPaymentId;
        this.datecreated = datecreated;
        this.paymentChannel = paymentChannel;
    }

    public MerchantOrders(String qmerchantId, String qvenueId, String orderId, String qOrderId, double subTotal, double instantDiscount, double salesTax, double tip, double totalBillAmount, String preOrderApplicable, int numberOfPayments, double actualAmountCharged, double creditCardProcessingFee, double creditCardAuthorizationFee, double creorderFacilitationFee, double creorderFacilitationDiscount, double promotionFee, double promotionFeeDiscountToMerchant, double payoutAmount, double bankPayoutFee, double amountPaid, String status, Date payoutDate, String qMerchantPaymentId, Timestamp datecreated, Timestamp dateupdated, String paymentChannel) {
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalBillAmount = totalBillAmount;
        this.preOrderApplicable = preOrderApplicable;
        this.numberOfPayments = numberOfPayments;
        this.actualAmountCharged = actualAmountCharged;
        this.creditCardProcessingFee = creditCardProcessingFee;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.creorderFacilitationFee = creorderFacilitationFee;
        this.creorderFacilitationDiscount = creorderFacilitationDiscount;
        this.promotionFee = promotionFee;
        this.promotionFeeDiscountToMerchant = promotionFeeDiscountToMerchant;
        this.payoutAmount = payoutAmount;
        this.bankPayoutFee = bankPayoutFee;
        this.amountPaid = amountPaid;
        this.status = status;
        this.payoutDate = payoutDate;
        this.qMerchantPaymentId = qMerchantPaymentId;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
        this.paymentChannel = paymentChannel;
    }

    public MerchantOrders(String qmerchantId, String qvenueId, String orderId, String qOrderId, double subTotal, double instantDiscount, double salesTax, double tip, double totalBillAmount, String preOrderApplicable, int numberOfPayments, double actualAmountCharged, double creditCardProcessingFee, double creditCardAuthorizationFee, double creorderFacilitationFee, double creorderFacilitationDiscount, double promotionFee, double promotionFeeDiscountToMerchant, double payoutAmount, double bankPayoutFee, double amountPaid, String status, Date payoutDate, String qMerchantPaymentId, Timestamp datecreated, String paymentChannel) {
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalBillAmount = totalBillAmount;
        this.preOrderApplicable = preOrderApplicable;
        this.numberOfPayments = numberOfPayments;
        this.actualAmountCharged = actualAmountCharged;
        this.creditCardProcessingFee = creditCardProcessingFee;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.creorderFacilitationFee = creorderFacilitationFee;
        this.creorderFacilitationDiscount = creorderFacilitationDiscount;
        this.promotionFee = promotionFee;
        this.promotionFeeDiscountToMerchant = promotionFeeDiscountToMerchant;
        this.payoutAmount = payoutAmount;
        this.bankPayoutFee = bankPayoutFee;
        this.amountPaid = amountPaid;
        this.status = status;
        this.payoutDate = payoutDate;
        this.qMerchantPaymentId = qMerchantPaymentId;
        this.datecreated = datecreated;
        this.paymentChannel = paymentChannel;
    }

    public Long getIdMerchantOrders() {
        return idMerchantOrders;
    }

    public void setIdMerchantOrders(Long idMerchantOrders) {
        this.idMerchantOrders = idMerchantOrders;
    }

    public String getQmerchantId() {
        return qmerchantId;
    }

    public void setQmerchantId(String qmerchantId) {
        this.qmerchantId = qmerchantId;
    }

    public String getQvenueId() {
        return qvenueId;
    }

    public void setQvenueId(String qvenueId) {
        this.qvenueId = qvenueId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getqOrderId() {
        return qOrderId;
    }

    public void setqOrderId(String qOrderId) {
        this.qOrderId = qOrderId;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getInstantDiscount() {
        return instantDiscount;
    }

    public void setInstantDiscount(double instantDiscount) {
        this.instantDiscount = instantDiscount;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }

    public String getPreOrderApplicable() {
        return preOrderApplicable;
    }

    public void setPreOrderApplicable(String preOrderApplicable) {
        this.preOrderApplicable = preOrderApplicable;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public double getActualAmountCharged() {
        return actualAmountCharged;
    }

    public void setActualAmountCharged(double actualAmountCharged) {
        this.actualAmountCharged = actualAmountCharged;
    }

    public double getCreditCardProcessingFee() {
        return creditCardProcessingFee;
    }

    public void setCreditCardProcessingFee(double creditCardProcessingFee) {
        this.creditCardProcessingFee = creditCardProcessingFee;
    }

    public double getCreditCardAuthorizationFee() {
        return creditCardAuthorizationFee;
    }

    public void setCreditCardAuthorizationFee(double creditCardAuthorizationFee) {
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
    }

    public double getCreorderFacilitationFee() {
        return creorderFacilitationFee;
    }

    public void setCreorderFacilitationFee(double creorderFacilitationFee) {
        this.creorderFacilitationFee = creorderFacilitationFee;
    }

    public double getCreorderFacilitationDiscount() {
        return creorderFacilitationDiscount;
    }

    public void setCreorderFacilitationDiscount(double creorderFacilitationDiscount) {
        this.creorderFacilitationDiscount = creorderFacilitationDiscount;
    }

    public double getPromotionFee() {
        return promotionFee;
    }

    public void setPromotionFee(double promotionFee) {
        this.promotionFee = promotionFee;
    }

    public double getPromotionFeeDiscountToMerchant() {
        return promotionFeeDiscountToMerchant;
    }

    public void setPromotionFeeDiscountToMerchant(double promotionFeeDiscountToMerchant) {
        this.promotionFeeDiscountToMerchant = promotionFeeDiscountToMerchant;
    }

    public double getPayoutAmount() {
        return payoutAmount;
    }

    public void setPayoutAmount(double payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    public double getBankPayoutFee() {
        return bankPayoutFee;
    }

    public void setBankPayoutFee(double bankPayoutFee) {
        this.bankPayoutFee = bankPayoutFee;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPayoutDate() {
        return payoutDate;
    }

    public void setPayoutDate(Date payoutDate) {
        this.payoutDate = payoutDate;
    }

    public String getqMerchantPaymentId() {
        return qMerchantPaymentId;
    }

    public void setqMerchantPaymentId(String qMerchantPaymentId) {
        this.qMerchantPaymentId = qMerchantPaymentId;
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

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }
}

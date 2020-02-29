package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Timestamp;

public class FeeAndDiscount {

    private Long idFeeAndDiscount;
    private String qMerchantId;
    private double creditCardProcessingFeePercent;
    private double creditCardAuthorizationFee;
    private double preorderFacilitationFeePercent;
    private double preorderFacilitationDiscountPercent;
    private double promotionFeePercent;
    private double promotionFeeDiscountToMerchantPercent;
    private double bankPayoutFeePercent;
    private Timestamp datecreated;
    private Timestamp dateupdated;

    public FeeAndDiscount(Long idFeeAndDiscount, String qMerchantId, double creditCardProcessingFeePercent, double creditCardAuthorizationFee, double preorderFacilitationFeePercent, double preorderFacilitationDiscountPercent, double promotionFeePercent, double promotionFeeDiscountToMerchantPercent, double bankPayoutFeePercent, Timestamp datecreated, Timestamp dateupdated) {
        this.idFeeAndDiscount = idFeeAndDiscount;
        this.qMerchantId = qMerchantId;
        this.creditCardProcessingFeePercent = creditCardProcessingFeePercent;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.preorderFacilitationFeePercent = preorderFacilitationFeePercent;
        this.preorderFacilitationDiscountPercent = preorderFacilitationDiscountPercent;
        this.promotionFeePercent = promotionFeePercent;
        this.promotionFeeDiscountToMerchantPercent = promotionFeeDiscountToMerchantPercent;
        this.bankPayoutFeePercent = bankPayoutFeePercent;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public FeeAndDiscount(Long idFeeAndDiscount, String qMerchantId, double creditCardProcessingFeePercent, double creditCardAuthorizationFee, double preorderFacilitationFeePercent, double preorderFacilitationDiscountPercent, double promotionFeePercent, double promotionFeeDiscountToMerchantPercent, double bankPayoutFeePercent, Timestamp datecreated) {
        this.idFeeAndDiscount = idFeeAndDiscount;
        this.qMerchantId = qMerchantId;
        this.creditCardProcessingFeePercent = creditCardProcessingFeePercent;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.preorderFacilitationFeePercent = preorderFacilitationFeePercent;
        this.preorderFacilitationDiscountPercent = preorderFacilitationDiscountPercent;
        this.promotionFeePercent = promotionFeePercent;
        this.promotionFeeDiscountToMerchantPercent = promotionFeeDiscountToMerchantPercent;
        this.bankPayoutFeePercent = bankPayoutFeePercent;
        this.datecreated = datecreated;
    }

    public FeeAndDiscount(String qMerchantId, double creditCardProcessingFeePercent, double creditCardAuthorizationFee, double preorderFacilitationFeePercent, double preorderFacilitationDiscountPercent, double promotionFeePercent, double promotionFeeDiscountToMerchantPercent, double bankPayoutFeePercent, Timestamp datecreated, Timestamp dateupdated) {
        this.qMerchantId = qMerchantId;
        this.creditCardProcessingFeePercent = creditCardProcessingFeePercent;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.preorderFacilitationFeePercent = preorderFacilitationFeePercent;
        this.preorderFacilitationDiscountPercent = preorderFacilitationDiscountPercent;
        this.promotionFeePercent = promotionFeePercent;
        this.promotionFeeDiscountToMerchantPercent = promotionFeeDiscountToMerchantPercent;
        this.bankPayoutFeePercent = bankPayoutFeePercent;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public FeeAndDiscount(String qMerchantId, double creditCardProcessingFeePercent, double creditCardAuthorizationFee, double preorderFacilitationFeePercent, double preorderFacilitationDiscountPercent, double promotionFeePercent, double promotionFeeDiscountToMerchantPercent, double bankPayoutFeePercent, Timestamp datecreated) {
        this.qMerchantId = qMerchantId;
        this.creditCardProcessingFeePercent = creditCardProcessingFeePercent;
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
        this.preorderFacilitationFeePercent = preorderFacilitationFeePercent;
        this.preorderFacilitationDiscountPercent = preorderFacilitationDiscountPercent;
        this.promotionFeePercent = promotionFeePercent;
        this.promotionFeeDiscountToMerchantPercent = promotionFeeDiscountToMerchantPercent;
        this.bankPayoutFeePercent = bankPayoutFeePercent;
        this.datecreated = datecreated;
    }

    public Long getIdFeeAndDiscount() {
        return idFeeAndDiscount;
    }

    public void setIdFeeAndDiscount(Long idFeeAndDiscount) {
        this.idFeeAndDiscount = idFeeAndDiscount;
    }

    public String getqMerchantId() {
        return qMerchantId;
    }

    public void setqMerchantId(String qMerchantId) {
        this.qMerchantId = qMerchantId;
    }

    public double getCreditCardProcessingFeePercent() {
        return creditCardProcessingFeePercent;
    }

    public void setCreditCardProcessingFeePercent(double creditCardProcessingFeePercent) {
        this.creditCardProcessingFeePercent = creditCardProcessingFeePercent;
    }

    public double getCreditCardAuthorizationFee() {
        return creditCardAuthorizationFee;
    }

    public void setCreditCardAuthorizationFee(double creditCardAuthorizationFee) {
        this.creditCardAuthorizationFee = creditCardAuthorizationFee;
    }

    public double getPreorderFacilitationFeePercent() {
        return preorderFacilitationFeePercent;
    }

    public void setPreorderFacilitationFeePercent(double preorderFacilitationFeePercent) {
        this.preorderFacilitationFeePercent = preorderFacilitationFeePercent;
    }

    public double getPreorderFacilitationDiscountPercent() {
        return preorderFacilitationDiscountPercent;
    }

    public void setPreorderFacilitationDiscountPercent(double preorderFacilitationDiscountPercent) {
        this.preorderFacilitationDiscountPercent = preorderFacilitationDiscountPercent;
    }

    public double getPromotionFeePercent() {
        return promotionFeePercent;
    }

    public void setPromotionFeePercent(double promotionFeePercent) {
        this.promotionFeePercent = promotionFeePercent;
    }

    public double getPromotionFeeDiscountToMerchantPercent() {
        return promotionFeeDiscountToMerchantPercent;
    }

    public void setPromotionFeeDiscountToMerchantPercent(double promotionFeeDiscountToMerchantPercent) {
        this.promotionFeeDiscountToMerchantPercent = promotionFeeDiscountToMerchantPercent;
    }

    public double getBankPayoutFeePercent() {
        return bankPayoutFeePercent;
    }

    public void setBankPayoutFeePercent(double bankPayoutFeePercent) {
        this.bankPayoutFeePercent = bankPayoutFeePercent;
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

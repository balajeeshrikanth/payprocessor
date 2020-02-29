package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Timestamp;

public class MerchantPaypalPayouts {

    private Long idMerchantPaypalPayments;
    private String qmerchantId;
    private String qvenueId;
    private String qMarchantPaymentId;
    private double paymentAmount;
    private String merchantPaypalId;
    private Timestamp processingDate;
    private String status;
    private String journalled;
    private String qPayoutBatchId;
    private String PayoutItemId;
    private String PayoutTransactionId;
    private String PayoutItemFees;
    private Timestamp PayoutTimeProcessed;
    private Timestamp datecreated;
    private Timestamp dateupdated;


    public MerchantPaypalPayouts(Long idMerchantPaypalPayments, String qmerchantId, String qvenueId, String qMarchantPaymentId, double paymentAmount, String merchantPaypalId, Timestamp processingDate, String status, String journalled, String qPayoutBatchId, String payoutItemId, String payoutTransactionId, String payoutItemFees, Timestamp payoutTimeProcessed, Timestamp datecreated, Timestamp dateupdated) {
        this.idMerchantPaypalPayments = idMerchantPaypalPayments;
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.merchantPaypalId = merchantPaypalId;
        this.processingDate = processingDate;
        this.status = status;
        this.journalled = journalled;
        this.qPayoutBatchId = qPayoutBatchId;
        PayoutItemId = payoutItemId;
        PayoutTransactionId = payoutTransactionId;
        PayoutItemFees = payoutItemFees;
        PayoutTimeProcessed = payoutTimeProcessed;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public MerchantPaypalPayouts(Long idMerchantPaypalPayments, String qmerchantId, String qvenueId, String qMarchantPaymentId, double paymentAmount, String merchantPaypalId, Timestamp processingDate, String status, String journalled, String qPayoutBatchId, String payoutItemId, String payoutTransactionId, String payoutItemFees, Timestamp payoutTimeProcessed, Timestamp datecreated) {
        this.idMerchantPaypalPayments = idMerchantPaypalPayments;
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.merchantPaypalId = merchantPaypalId;
        this.processingDate = processingDate;
        this.status = status;
        this.journalled = journalled;
        this.qPayoutBatchId = qPayoutBatchId;
        PayoutItemId = payoutItemId;
        PayoutTransactionId = payoutTransactionId;
        PayoutItemFees = payoutItemFees;
        PayoutTimeProcessed = payoutTimeProcessed;
        this.datecreated = datecreated;
    }

    public MerchantPaypalPayouts(String qmerchantId, String qvenueId, String qMarchantPaymentId, double paymentAmount, String merchantPaypalId, Timestamp processingDate, String status, String journalled, String qPayoutBatchId, String payoutItemId, String payoutTransactionId, String payoutItemFees, Timestamp payoutTimeProcessed, Timestamp datecreated, Timestamp dateupdated) {
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.merchantPaypalId = merchantPaypalId;
        this.processingDate = processingDate;
        this.status = status;
        this.journalled = journalled;
        this.qPayoutBatchId = qPayoutBatchId;
        PayoutItemId = payoutItemId;
        PayoutTransactionId = payoutTransactionId;
        PayoutItemFees = payoutItemFees;
        PayoutTimeProcessed = payoutTimeProcessed;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public MerchantPaypalPayouts(String qmerchantId, String qvenueId, String qMarchantPaymentId, double paymentAmount, String merchantPaypalId, Timestamp processingDate, String status, String journalled, String qPayoutBatchId, String payoutItemId, String payoutTransactionId, String payoutItemFees, Timestamp payoutTimeProcessed, Timestamp datecreated) {
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.merchantPaypalId = merchantPaypalId;
        this.processingDate = processingDate;
        this.status = status;
        this.journalled = journalled;
        this.qPayoutBatchId = qPayoutBatchId;
        PayoutItemId = payoutItemId;
        PayoutTransactionId = payoutTransactionId;
        PayoutItemFees = payoutItemFees;
        PayoutTimeProcessed = payoutTimeProcessed;
        this.datecreated = datecreated;
    }

    public Long getIdMerchantPaypalPayments() {
        return idMerchantPaypalPayments;
    }

    public void setIdMerchantPaypalPayments(Long idMerchantPaypalPayments) {
        this.idMerchantPaypalPayments = idMerchantPaypalPayments;
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

    public String getqMarchantPaymentId() {
        return qMarchantPaymentId;
    }

    public void setqMarchantPaymentId(String qMarchantPaymentId) {
        this.qMarchantPaymentId = qMarchantPaymentId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getMerchantPaypalId() {
        return merchantPaypalId;
    }

    public void setMerchantPaypalId(String merchantPaypalId) {
        this.merchantPaypalId = merchantPaypalId;
    }

    public Timestamp getProcessingDate() {
        return processingDate;
    }

    public void setProcessingDate(Timestamp processingDate) {
        this.processingDate = processingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJournalled() {
        return journalled;
    }

    public void setJournalled(String journalled) {
        this.journalled = journalled;
    }

    public String getqPayoutBatchId() {
        return qPayoutBatchId;
    }

    public void setqPayoutBatchId(String qPayoutBatchId) {
        this.qPayoutBatchId = qPayoutBatchId;
    }

    public String getPayoutItemId() {
        return PayoutItemId;
    }

    public void setPayoutItemId(String payoutItemId) {
        PayoutItemId = payoutItemId;
    }

    public String getPayoutTransactionId() {
        return PayoutTransactionId;
    }

    public void setPayoutTransactionId(String payoutTransactionId) {
        PayoutTransactionId = payoutTransactionId;
    }

    public String getPayoutItemFees() {
        return PayoutItemFees;
    }

    public void setPayoutItemFees(String payoutItemFees) {
        PayoutItemFees = payoutItemFees;
    }

    public Timestamp getPayoutTimeProcessed() {
        return PayoutTimeProcessed;
    }

    public void setPayoutTimeProcessed(Timestamp payoutTimeProcessed) {
        PayoutTimeProcessed = payoutTimeProcessed;
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

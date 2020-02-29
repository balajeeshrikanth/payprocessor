package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Timestamp;

public class MerchantDwollaTransfers {
    private Long idMerchantDwollaPayments;
    private String qMerchntId;
    private String qVenueId;
    private String qMarchantPaymentId;
    private double paymentAmount;
    private String fundingsource;
    private Timestamp processingDate;
    private String status;
    private String sweepStatus;
    private String qSweepId;
    private String journalled;
    private String dwollaPaymentId;
    private Timestamp datecreated;
    private Timestamp dateupdated;

    public MerchantDwollaTransfers(Long idMerchantDwollaPayments, String qMerchntId, String qVenueId, String qMarchantPaymentId, double paymentAmount, String fundingsource, Timestamp processingDate, String status, String sweepStatus, String qSweepId, String journalled, String dwollaPaymentId, Timestamp datecreated, Timestamp dateupdated) {
        this.idMerchantDwollaPayments = idMerchantDwollaPayments;
        this.qMerchntId = qMerchntId;
        this.qVenueId = qVenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.fundingsource = fundingsource;
        this.processingDate = processingDate;
        this.status = status;
        this.sweepStatus = sweepStatus;
        this.qSweepId = qSweepId;
        this.journalled = journalled;
        this.dwollaPaymentId = dwollaPaymentId;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public MerchantDwollaTransfers(Long idMerchantDwollaPayments, String qMerchntId, String qVenueId, String qMarchantPaymentId, double paymentAmount, String fundingsource, Timestamp processingDate, String status, String sweepStatus, String qSweepId, String journalled, String dwollaPaymentId, Timestamp datecreated) {
        this.idMerchantDwollaPayments = idMerchantDwollaPayments;
        this.qMerchntId = qMerchntId;
        this.qVenueId = qVenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.fundingsource = fundingsource;
        this.processingDate = processingDate;
        this.status = status;
        this.sweepStatus = sweepStatus;
        this.qSweepId = qSweepId;
        this.journalled = journalled;
        this.dwollaPaymentId = dwollaPaymentId;
        this.datecreated = datecreated;
    }

    public MerchantDwollaTransfers(String qMerchntId, String qVenueId, String qMarchantPaymentId, double paymentAmount, String fundingsource, Timestamp processingDate, String status, String sweepStatus, String qSweepId, String journalled, String dwollaPaymentId, Timestamp datecreated, Timestamp dateupdated) {
        this.qMerchntId = qMerchntId;
        this.qVenueId = qVenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.fundingsource = fundingsource;
        this.processingDate = processingDate;
        this.status = status;
        this.sweepStatus = sweepStatus;
        this.qSweepId = qSweepId;
        this.journalled = journalled;
        this.dwollaPaymentId = dwollaPaymentId;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public MerchantDwollaTransfers(String qMerchntId, String qVenueId, String qMarchantPaymentId, double paymentAmount, String fundingsource, Timestamp processingDate, String status, String sweepStatus, String qSweepId, String journalled, String dwollaPaymentId, Timestamp datecreated) {
        this.qMerchntId = qMerchntId;
        this.qVenueId = qVenueId;
        this.qMarchantPaymentId = qMarchantPaymentId;
        this.paymentAmount = paymentAmount;
        this.fundingsource = fundingsource;
        this.processingDate = processingDate;
        this.status = status;
        this.sweepStatus = sweepStatus;
        this.qSweepId = qSweepId;
        this.journalled = journalled;
        this.dwollaPaymentId = dwollaPaymentId;
        this.datecreated = datecreated;
    }

    public Long getIdMerchantDwollaPayments() {
        return idMerchantDwollaPayments;
    }

    public void setIdMerchantDwollaPayments(Long idMerchantDwollaPayments) {
        this.idMerchantDwollaPayments = idMerchantDwollaPayments;
    }

    public String getqMerchntId() {
        return qMerchntId;
    }

    public void setqMerchntId(String qMerchntId) {
        this.qMerchntId = qMerchntId;
    }

    public String getqVenueId() {
        return qVenueId;
    }

    public void setqVenueId(String qVenueId) {
        this.qVenueId = qVenueId;
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

    public String getFundingsource() {
        return fundingsource;
    }

    public void setFundingsource(String fundingsource) {
        this.fundingsource = fundingsource;
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

    public String getSweepStatus() {
        return sweepStatus;
    }

    public void setSweepStatus(String sweepStatus) {
        this.sweepStatus = sweepStatus;
    }

    public String getqSweepId() {
        return qSweepId;
    }

    public void setqSweepId(String qSweepId) {
        this.qSweepId = qSweepId;
    }

    public String getJournalled() {
        return journalled;
    }

    public void setJournalled(String journalled) {
        this.journalled = journalled;
    }

    public String getDwollaPaymentId() {
        return dwollaPaymentId;
    }

    public void setDwollaPaymentId(String dwollaPaymentId) {
        this.dwollaPaymentId = dwollaPaymentId;
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

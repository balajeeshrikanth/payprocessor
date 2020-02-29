package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Timestamp;

public class PayoutBatches {

    private Long idPayoutBatches;
    private String qPayoutBatchId;
    private Timestamp processingDate;
    private String status;
    private String payoutBatchId;
    private String batchStatus;
    private Timestamp payoutTimeCreated;
    private Timestamp payoutTimeCompleted;
    private double payoutBatchAmount;
    private double payoutFees;
    private Timestamp datecreated;
    private Timestamp dateupadted;

    public PayoutBatches(Long idPayoutBatches, String qPayoutBatchId, Timestamp processingDate, String status, String payoutBatchId, String batchStatus, Timestamp payoutTimeCreated, Timestamp payoutTimeCompleted, double payoutBatchAmount, double payoutFees, Timestamp datecreated, Timestamp dateupadted) {
        this.idPayoutBatches = idPayoutBatches;
        this.qPayoutBatchId = qPayoutBatchId;
        this.processingDate = processingDate;
        this.status = status;
        this.payoutBatchId = payoutBatchId;
        this.batchStatus = batchStatus;
        this.payoutTimeCreated = payoutTimeCreated;
        this.payoutTimeCompleted = payoutTimeCompleted;
        this.payoutBatchAmount = payoutBatchAmount;
        this.payoutFees = payoutFees;
        this.datecreated = datecreated;
        this.dateupadted = dateupadted;
    }

    public PayoutBatches(Long idPayoutBatches, String qPayoutBatchId, Timestamp processingDate, String status, String payoutBatchId, String batchStatus, Timestamp payoutTimeCreated, Timestamp payoutTimeCompleted, double payoutBatchAmount, double payoutFees, Timestamp datecreated) {
        this.idPayoutBatches = idPayoutBatches;
        this.qPayoutBatchId = qPayoutBatchId;
        this.processingDate = processingDate;
        this.status = status;
        this.payoutBatchId = payoutBatchId;
        this.batchStatus = batchStatus;
        this.payoutTimeCreated = payoutTimeCreated;
        this.payoutTimeCompleted = payoutTimeCompleted;
        this.payoutBatchAmount = payoutBatchAmount;
        this.payoutFees = payoutFees;
        this.datecreated = datecreated;
    }

    public PayoutBatches(String qPayoutBatchId, Timestamp processingDate, String status, String payoutBatchId, String batchStatus, Timestamp payoutTimeCreated, Timestamp payoutTimeCompleted, double payoutBatchAmount, double payoutFees, Timestamp datecreated, Timestamp dateupadted) {
        this.qPayoutBatchId = qPayoutBatchId;
        this.processingDate = processingDate;
        this.status = status;
        this.payoutBatchId = payoutBatchId;
        this.batchStatus = batchStatus;
        this.payoutTimeCreated = payoutTimeCreated;
        this.payoutTimeCompleted = payoutTimeCompleted;
        this.payoutBatchAmount = payoutBatchAmount;
        this.payoutFees = payoutFees;
        this.datecreated = datecreated;
        this.dateupadted = dateupadted;
    }

    public PayoutBatches(String qPayoutBatchId, Timestamp processingDate, String status, String payoutBatchId, String batchStatus, Timestamp payoutTimeCreated, Timestamp payoutTimeCompleted, double payoutBatchAmount, double payoutFees, Timestamp datecreated) {
        this.qPayoutBatchId = qPayoutBatchId;
        this.processingDate = processingDate;
        this.status = status;
        this.payoutBatchId = payoutBatchId;
        this.batchStatus = batchStatus;
        this.payoutTimeCreated = payoutTimeCreated;
        this.payoutTimeCompleted = payoutTimeCompleted;
        this.payoutBatchAmount = payoutBatchAmount;
        this.payoutFees = payoutFees;
        this.datecreated = datecreated;
    }

    public Long getIdPayoutBatches() {
        return idPayoutBatches;
    }

    public void setIdPayoutBatches(Long idPayoutBatches) {
        this.idPayoutBatches = idPayoutBatches;
    }

    public String getqPayoutBatchId() {
        return qPayoutBatchId;
    }

    public void setqPayoutBatchId(String qPayoutBatchId) {
        this.qPayoutBatchId = qPayoutBatchId;
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

    public String getPayoutBatchId() {
        return payoutBatchId;
    }

    public void setPayoutBatchId(String payoutBatchId) {
        this.payoutBatchId = payoutBatchId;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public Timestamp getPayoutTimeCreated() {
        return payoutTimeCreated;
    }

    public void setPayoutTimeCreated(Timestamp payoutTimeCreated) {
        this.payoutTimeCreated = payoutTimeCreated;
    }

    public Timestamp getPayoutTimeCompleted() {
        return payoutTimeCompleted;
    }

    public void setPayoutTimeCompleted(Timestamp payoutTimeCompleted) {
        this.payoutTimeCompleted = payoutTimeCompleted;
    }

    public double getPayoutBatchAmount() {
        return payoutBatchAmount;
    }

    public void setPayoutBatchAmount(double payoutBatchAmount) {
        this.payoutBatchAmount = payoutBatchAmount;
    }

    public double getPayoutFees() {
        return payoutFees;
    }

    public void setPayoutFees(double payoutFees) {
        this.payoutFees = payoutFees;
    }

    public Timestamp getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Timestamp datecreated) {
        this.datecreated = datecreated;
    }

    public Timestamp getDateupadted() {
        return dateupadted;
    }

    public void setDateupadted(Timestamp dateupadted) {
        this.dateupadted = dateupadted;
    }
}

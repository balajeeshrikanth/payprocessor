package com.depture.agbsettlement.payprocessor.entity;

import java.sql.Timestamp;
import java.util.Date;

public class ConsumerPayments {

    private Long idConsumerPayments;
    private String qmerchantId;
    private String qvenueId;
    private String orderId;
    private String qOrderId;
    private String qConsumerPaymentId;
    private String qconsumerId;
    private String qConsumerPaymentMethod;
    private double subTotal;
    private double instantDiscount;
    private double salesTax;
    private double tip;
    private double totalAmountDue;
    private String status;
    private double settlementAmount;
    private Date settledDate;
    private String journalled;
    private String bTransactionId;
    private String bStatus;
    private String bprocessorAuthCode;
    private String bgatewayRejectionReason;
    private String bprocessorResponseText;
    private String bprocessorSettlementResponseCode;
    private String bprocessorSettlementResponseText;
    private Timestamp datecreated;
    private Timestamp dateupdated;

    public ConsumerPayments(Long idConsumerPayments, String qmerchantId, String qvenueId, String orderId, String qOrderId, String qConsumerPaymentId, String qconsumerId, String qConsumerPaymentMethod, double subTotal, double instantDiscount, double salesTax, double tip, double totalAmountDue, String status, double settlementAmount, Date settledDate, String journalled, String bTransactionId, String bStatus, String bprocessorAuthCode, String bgatewayRejectionReason, String bprocessorResponseText, String bprocessorSettlementResponseCode, String bprocessorSettlementResponseText, Timestamp datecreated, Timestamp dateupdated) {
        this.idConsumerPayments = idConsumerPayments;
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.qConsumerPaymentId = qConsumerPaymentId;
        this.qconsumerId = qconsumerId;
        this.qConsumerPaymentMethod = qConsumerPaymentMethod;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalAmountDue = totalAmountDue;
        this.status = status;
        this.settlementAmount = settlementAmount;
        this.settledDate = settledDate;
        this.journalled = journalled;
        this.bTransactionId = bTransactionId;
        this.bStatus = bStatus;
        this.bprocessorAuthCode = bprocessorAuthCode;
        this.bgatewayRejectionReason = bgatewayRejectionReason;
        this.bprocessorResponseText = bprocessorResponseText;
        this.bprocessorSettlementResponseCode = bprocessorSettlementResponseCode;
        this.bprocessorSettlementResponseText = bprocessorSettlementResponseText;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public ConsumerPayments(Long idConsumerPayments, String qmerchantId, String qvenueId, String orderId, String qOrderId, String qConsumerPaymentId, String qconsumerId, String qConsumerPaymentMethod, double subTotal, double instantDiscount, double salesTax, double tip, double totalAmountDue, String status, double settlementAmount, Date settledDate, String journalled, String bTransactionId, String bStatus, String bprocessorAuthCode, String bgatewayRejectionReason, String bprocessorResponseText, String bprocessorSettlementResponseCode, String bprocessorSettlementResponseText, Timestamp datecreated) {
        this.idConsumerPayments = idConsumerPayments;
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.qConsumerPaymentId = qConsumerPaymentId;
        this.qconsumerId = qconsumerId;
        this.qConsumerPaymentMethod = qConsumerPaymentMethod;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalAmountDue = totalAmountDue;
        this.status = status;
        this.settlementAmount = settlementAmount;
        this.settledDate = settledDate;
        this.journalled = journalled;
        this.bTransactionId = bTransactionId;
        this.bStatus = bStatus;
        this.bprocessorAuthCode = bprocessorAuthCode;
        this.bgatewayRejectionReason = bgatewayRejectionReason;
        this.bprocessorResponseText = bprocessorResponseText;
        this.bprocessorSettlementResponseCode = bprocessorSettlementResponseCode;
        this.bprocessorSettlementResponseText = bprocessorSettlementResponseText;
        this.datecreated = datecreated;
    }

    public ConsumerPayments(String qmerchantId, String qvenueId, String orderId, String qOrderId, String qConsumerPaymentId, String qconsumerId, String qConsumerPaymentMethod, double subTotal, double instantDiscount, double salesTax, double tip, double totalAmountDue, String status, double settlementAmount, Date settledDate, String journalled, String bTransactionId, String bStatus, String bprocessorAuthCode, String bgatewayRejectionReason, String bprocessorResponseText, String bprocessorSettlementResponseCode, String bprocessorSettlementResponseText, Timestamp datecreated, Timestamp dateupdated) {
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.qConsumerPaymentId = qConsumerPaymentId;
        this.qconsumerId = qconsumerId;
        this.qConsumerPaymentMethod = qConsumerPaymentMethod;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalAmountDue = totalAmountDue;
        this.status = status;
        this.settlementAmount = settlementAmount;
        this.settledDate = settledDate;
        this.journalled = journalled;
        this.bTransactionId = bTransactionId;
        this.bStatus = bStatus;
        this.bprocessorAuthCode = bprocessorAuthCode;
        this.bgatewayRejectionReason = bgatewayRejectionReason;
        this.bprocessorResponseText = bprocessorResponseText;
        this.bprocessorSettlementResponseCode = bprocessorSettlementResponseCode;
        this.bprocessorSettlementResponseText = bprocessorSettlementResponseText;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public ConsumerPayments(String qmerchantId, String qvenueId, String orderId, String qOrderId, String qConsumerPaymentId, String qconsumerId, String qConsumerPaymentMethod, double subTotal, double instantDiscount, double salesTax, double tip, double totalAmountDue, String status, double settlementAmount, Date settledDate, String journalled, String bTransactionId, String bStatus, String bprocessorAuthCode, String bgatewayRejectionReason, String bprocessorResponseText, String bprocessorSettlementResponseCode, String bprocessorSettlementResponseText, Timestamp datecreated) {
        this.qmerchantId = qmerchantId;
        this.qvenueId = qvenueId;
        this.orderId = orderId;
        this.qOrderId = qOrderId;
        this.qConsumerPaymentId = qConsumerPaymentId;
        this.qconsumerId = qconsumerId;
        this.qConsumerPaymentMethod = qConsumerPaymentMethod;
        this.subTotal = subTotal;
        this.instantDiscount = instantDiscount;
        this.salesTax = salesTax;
        this.tip = tip;
        this.totalAmountDue = totalAmountDue;
        this.status = status;
        this.settlementAmount = settlementAmount;
        this.settledDate = settledDate;
        this.journalled = journalled;
        this.bTransactionId = bTransactionId;
        this.bStatus = bStatus;
        this.bprocessorAuthCode = bprocessorAuthCode;
        this.bgatewayRejectionReason = bgatewayRejectionReason;
        this.bprocessorResponseText = bprocessorResponseText;
        this.bprocessorSettlementResponseCode = bprocessorSettlementResponseCode;
        this.bprocessorSettlementResponseText = bprocessorSettlementResponseText;
        this.datecreated = datecreated;
    }

    public Long getIdConsumerPayments() {
        return idConsumerPayments;
    }

    public void setIdConsumerPayments(Long idConsumerPayments) {
        this.idConsumerPayments = idConsumerPayments;
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

    public String getqConsumerPaymentId() {
        return qConsumerPaymentId;
    }

    public void setqConsumerPaymentId(String qConsumerPaymentId) {
        this.qConsumerPaymentId = qConsumerPaymentId;
    }

    public String getQconsumerId() {
        return qconsumerId;
    }

    public void setQconsumerId(String qconsumerId) {
        this.qconsumerId = qconsumerId;
    }

    public String getqConsumerPaymentMethod() {
        return qConsumerPaymentMethod;
    }

    public void setqConsumerPaymentMethod(String qConsumerPaymentMethod) {
        this.qConsumerPaymentMethod = qConsumerPaymentMethod;
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

    public double getTotalAmountDue() {
        return totalAmountDue;
    }

    public void setTotalAmountDue(double totalAmountDue) {
        this.totalAmountDue = totalAmountDue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Date getSettledDate() {
        return settledDate;
    }

    public void setSettledDate(Date settledDate) {
        this.settledDate = settledDate;
    }

    public String getJournalled() {
        return journalled;
    }

    public void setJournalled(String journalled) {
        this.journalled = journalled;
    }

    public String getbTransactionId() {
        return bTransactionId;
    }

    public void setbTransactionId(String bTransactionId) {
        this.bTransactionId = bTransactionId;
    }

    public String getbStatus() {
        return bStatus;
    }

    public void setbStatus(String bStatus) {
        this.bStatus = bStatus;
    }

    public String getBprocessorAuthCode() {
        return bprocessorAuthCode;
    }

    public void setBprocessorAuthCode(String bprocessorAuthCode) {
        this.bprocessorAuthCode = bprocessorAuthCode;
    }

    public String getBgatewayRejectionReason() {
        return bgatewayRejectionReason;
    }

    public void setBgatewayRejectionReason(String bgatewayRejectionReason) {
        this.bgatewayRejectionReason = bgatewayRejectionReason;
    }

    public String getBprocessorResponseText() {
        return bprocessorResponseText;
    }

    public void setBprocessorResponseText(String bprocessorResponseText) {
        this.bprocessorResponseText = bprocessorResponseText;
    }

    public String getBprocessorSettlementResponseCode() {
        return bprocessorSettlementResponseCode;
    }

    public void setBprocessorSettlementResponseCode(String bprocessorSettlementResponseCode) {
        this.bprocessorSettlementResponseCode = bprocessorSettlementResponseCode;
    }

    public String getBprocessorSettlementResponseText() {
        return bprocessorSettlementResponseText;
    }

    public void setBprocessorSettlementResponseText(String bprocessorSettlementResponseText) {
        this.bprocessorSettlementResponseText = bprocessorSettlementResponseText;
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

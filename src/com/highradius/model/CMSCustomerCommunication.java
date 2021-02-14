package com.highradius.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class CMSCustomerCommunication {
	private static final long serialVersionUID = 1L;
	private int pkCommunicationId;
	private Date communicationTime;
	private String notes;
	private String communicationOpenItems;
	private String invoiceNumbers;
	private String documentNumberNorms;
	private String invoiceNumberNorms;
	private BigDecimal totalOpenAmount;
	private BigDecimal totalPastDueAmount;
	private String currency;
	private String customerName;
	private Integer callDurationSeconds;
	private String dialedNumber;
	private Integer fkUserId;
	private String callUniqueId;
	private String callTranscript;
	private String textractiveResponse;
	private String recordingFilePath;
	private String callSummaryNotes;
	private Integer callRecordingDurationSeconds;
	private String transferredToNumber;
	private Boolean isTransferred;
	private String createUser;
	
	private Date createTime;
	
	private String updateUser;
	
	private Date updateTime;
	public int getPkCommunicationId() {
		return pkCommunicationId;
	}
	public void setPkCommunicationId(int pkCommunicationId) {
		this.pkCommunicationId = pkCommunicationId;
	}
	public Date getCommunicationTime() {
		return communicationTime;
	}
	public void setCommunicationTime(Date communicationTime) {
		this.communicationTime = communicationTime;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getCommunicationOpenItems() {
		return communicationOpenItems;
	}
	public void setCommunicationOpenItems(String communicationOpenItems) {
		this.communicationOpenItems = communicationOpenItems;
	}
	public String getInvoiceNumbers() {
		return invoiceNumbers;
	}
	public void setInvoiceNumbers(String invoiceNumbers) {
		this.invoiceNumbers = invoiceNumbers;
	}
	public String getDocumentNumberNorms() {
		return documentNumberNorms;
	}
	public void setDocumentNumberNorms(String documentNumberNorms) {
		this.documentNumberNorms = documentNumberNorms;
	}
	public String getInvoiceNumberNorms() {
		return invoiceNumberNorms;
	}
	public void setInvoiceNumberNorms(String invoiceNumberNorms) {
		this.invoiceNumberNorms = invoiceNumberNorms;
	}
	public BigDecimal getTotalOpenAmount() {
		return totalOpenAmount;
	}
	public void setTotalOpenAmount(BigDecimal totalOpenAmount) {
		this.totalOpenAmount = totalOpenAmount;
	}
	public BigDecimal getTotalPastDueAmount() {
		return totalPastDueAmount;
	}
	public void setTotalPastDueAmount(BigDecimal totalPastDueAmount) {
		this.totalPastDueAmount = totalPastDueAmount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCallDurationSeconds() {
		return callDurationSeconds;
	}
	public void setCallDurationSeconds(Integer callDurationSeconds) {
		this.callDurationSeconds = callDurationSeconds;
	}
	public String getDialedNumber() {
		return dialedNumber;
	}
	public void setDialedNumber(String dialedNumber) {
		this.dialedNumber = dialedNumber;
	}
	public Integer getFkUserId() {
		return fkUserId;
	}
	public void setFkUserId(Integer fkUserId) {
		this.fkUserId = fkUserId;
	}
	public String getCallUniqueId() {
		return callUniqueId;
	}
	public void setCallUniqueId(String callUniqueId) {
		this.callUniqueId = callUniqueId;
	}
	public String getCallTranscript() {
		return callTranscript;
	}
	public void setCallTranscript(String callTranscript) {
		this.callTranscript = callTranscript;
	}
	public String getTextractiveResponse() {
		return textractiveResponse;
	}
	public void setTextractiveResponse(String textractiveResponse) {
		this.textractiveResponse = textractiveResponse;
	}
	public String getRecordingFilePath() {
		return recordingFilePath;
	}
	public void setRecordingFilePath(String recordingFilePath) {
		this.recordingFilePath = recordingFilePath;
	}
	public String getCallSummaryNotes() {
		return callSummaryNotes;
	}
	public void setCallSummaryNotes(String callSummaryNotes) {
		this.callSummaryNotes = callSummaryNotes;
	}
	public Integer getCallRecordingDurationSeconds() {
		return callRecordingDurationSeconds;
	}
	public void setCallRecordingDurationSeconds(Integer callRecordingDurationSeconds) {
		this.callRecordingDurationSeconds = callRecordingDurationSeconds;
	}
	public String getTransferredToNumber() {
		return transferredToNumber;
	}
	public void setTransferredToNumber(String transferredToNumber) {
		this.transferredToNumber = transferredToNumber;
	}
	public Boolean getIsTransferred() {
		return isTransferred;
	}
	public void setIsTransferred(Boolean isTransferred) {
		this.isTransferred = isTransferred;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}

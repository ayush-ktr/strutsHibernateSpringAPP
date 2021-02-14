package com.highradius.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class CMSDocHeader extends AuditedEntity {
	private static final long serialVersionUID = 1L;
	private Integer docHeaderId;
	private String salesInvoiceNumber;
	private String salesInvoiceNumberNorm;
	private Integer fkAccountId;
	private Integer strategyAgingBucketId;
	private Integer fkStrategyId;
	private Integer documentId;
	private Integer fkDocumentTypeId;
	private String documentNumber;
	private String documentNumberNorm;
	private Date documentDate;
	private String docTypeDescription;
	private BigDecimal actualOpenAmount;
	private BigDecimal currentOpenAmount;
	private BigDecimal paidAmount;
	private BigDecimal decimalField1;
	private BigDecimal decimalField2;
	private BigDecimal decimalField3;
	private BigDecimal decimalField4;
	private BigDecimal decimalField5;
	private BigDecimal decimalField6;
	private Date dateField1;
	private Date dateField2;
	private BigDecimal docHeaderDetailsDisputedAmount;
	private BigDecimal docHeaderDetailsOpenDisputedAmount;
	private BigDecimal docHeaderDetailsResolvedDisputedAmount;
	private BigDecimal docHeaderDetailsInvalidatedDisputedAmount;
	private BigDecimal docHeaderDetailsValidOpenAmount;
	private String docHeaderDetailsHasOpenDispute;
	private Date dueDate;
	private Integer daysPastDue;
	private Integer pkCustomerMapId;
	private Integer customerMapId;
	private String customerNumber;
	private String customerName;
	private String docType;
	private String paymentTerms;
	private String docFilePath;
	private String paymentStatus;
	private String latestNotes;
	private Date committedDate;
	private BigDecimal committedAmount;
	private String docFilePathLink;
	private String invoiceLevelpaymentCommitIds;
	private Integer isOpen;
	private Integer isValidDispute;
	private Integer daysToPay;
	private Date paidDate;
	private Date committedFor;
	private String paymentCommitIdsString;
	private boolean hasOpenPaymentCommitment;
	private String invoiceStatus;
	private String validdisputeStatus;
	private String debitCreditIndicator;
	private String fiscalYear;
	private String noLineItemAcct;
	private String itemText;
	private String reference;
	private String referenceKey1;
	private String referenceKeyLineItem;
	private String postingKey;
	private BigDecimal openAmount;
	private String poNumber;
	private String currency;
	private String reasonCodeName;
	private String customerCurrency;
	private String localCurrency;
	private String dualCurrency;
	private BigDecimal customerActualOpenAmount;
	private BigDecimal dualActualOpenAmount;
	private BigDecimal localActualOpenAmount;
	private BigDecimal dualCurrentOpenAmount;
	private BigDecimal localCurrentOpenAmount;
	private Integer isEscalated;
	private String escalated;
	private BigDecimal disputedAmount;
	private BigDecimal validDisputedAmount;
	private String referenceKey2;
	private String referenceKey5;
	private String documentType;
	private String orderNumber;
	private String invoiceNumber;
	private String referenceDocNumber;
	private String committedAmountWithCurrency;
	private Date lastCommittedDate;
	private BigDecimal retainageAmount;
	private Integer invoiceAge;
	private String latestTask;
	private String referenceKey3;
	private Date cashProjectionDate;
	private String companyCode;
	private String dunningBlock;
	private Date invoiceDate;
	private String originalDocType;
	private String referenceKey6;
	private String referenceKey7;
	private String referenceKey8;
	private String referenceKey4;
	private Date lastPaymentDate;
	private Date firstPaymentDate;
	private String assignmentId;
	private String referenceKey9;
	private String referenceKey10;
	private String referenceKey11;
	private String referenceKey12;
	private String notes = "View Notes";
	private String disputeStatus;
	private String glIndicator;
	private String glAccountNumber;
	private BigDecimal offsetAmount;
	private String clsDunningBlock;

	/* US-2508 Ability to export upto 50,000 records from a grid */
	private String businessArea;
	private String acctDocReferenceKey1;
	private String acctDocReferenceKey3;
	private String acctDocReferenceKey10;
	private String acctDocReferenceKey13;
	/* US-2508 Ability to export upto 50,000 records from a grid End */
	private BigDecimal validOpenAmount;
	private String escalatedTo;
	private String latestUserAction;
	// Slimfast
	private Date updateDate;
	private Date createDate;
	// transient
	private BigDecimal totalOpenCommittedAmt;
	private BigDecimal nextCommittedAmt;
	private String nextCommittedDate;
	private String arCustomerNumber;
	private String shipTo;
	private String shipmentNumber;
	private String referenceKey13;
	private String referenceKey14;
	private String referenceKey15;
	private String referenceKey16;
	private String referenceKey17;
	private String referenceKey18;
	private String referenceKey19;
	private String referenceKey20;
	private String referenceKey21;
	private String referenceKey22;
	private String referenceKey23;
	private String referenceKey24;
	private String referenceKey25;
	private String referenceKey26;
	private String referenceKey27;
	private String referenceKey28;
	private String referenceKey29;
	private String referenceKey30;
	private String referenceKey31;
	private String referenceKey32;
	private String referenceKey33;
	private String referenceKey34;
	private String referenceKey35;
	private String referenceKey36;
	private String referenceKey37;
	private String referenceKey38;
	private String referenceKey39;
	private String referenceKey40;
	private int hasAttachment;
	private Date discountDueDateNorm;
	private String documentFileClassifier;

	private Date baselineDate;
	private String salesInvoiceItems;
	private transient String viewDedutions;
	private BigDecimal invAmtGlobalNorm;
	private BigDecimal openAmtGlobalNorm;
	private String globalCurrency;
	private Integer customerId;
	// Transient variables -START
	private String editableDropDownField1;
	private String editableDropDownField2;
	private String editableDropDownField3;
	private BigDecimal availableOffsetAmount;
	// Transient variables -END
	private String portalSystemStatusId;
	private Date discountDate1Norm;
	private Date discountDate2Norm;
	private String invoiceCopyPresent;
	private Boolean referenceFlag1;
	private String invoiceTags;
	private BigDecimal paidAmtLocalCurr;
	private BigDecimal paidAmtGlobalCurr;
	private BigDecimal paidAmtDocCurr;
	
	private Date arClearingDateNorm;
	private Date arDocumentDateNorm;
	private Date arDueDateNorm;
	
	private Integer hasDirectDebitFailure;
	private Date directDebitFailureDate;
	
	private String overdue;
	
	private BigDecimal totalBrokenAmount;
	private Date latestCommittedFor;
	public Integer getDocHeaderId() {
		return docHeaderId;
	}
	public void setDocHeaderId(Integer docHeaderId) {
		this.docHeaderId = docHeaderId;
	}
	public String getSalesInvoiceNumber() {
		return salesInvoiceNumber;
	}
	public void setSalesInvoiceNumber(String salesInvoiceNumber) {
		this.salesInvoiceNumber = salesInvoiceNumber;
	}
	public String getSalesInvoiceNumberNorm() {
		return salesInvoiceNumberNorm;
	}
	public void setSalesInvoiceNumberNorm(String salesInvoiceNumberNorm) {
		this.salesInvoiceNumberNorm = salesInvoiceNumberNorm;
	}
	public Integer getFkAccountId() {
		return fkAccountId;
	}
	public void setFkAccountId(Integer fkAccountId) {
		this.fkAccountId = fkAccountId;
	}
	public Integer getStrategyAgingBucketId() {
		return strategyAgingBucketId;
	}
	public void setStrategyAgingBucketId(Integer strategyAgingBucketId) {
		this.strategyAgingBucketId = strategyAgingBucketId;
	}
	public Integer getFkStrategyId() {
		return fkStrategyId;
	}
	public void setFkStrategyId(Integer fkStrategyId) {
		this.fkStrategyId = fkStrategyId;
	}
	public Integer getDocumentId() {
		return documentId;
	}
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}
	public Integer getFkDocumentTypeId() {
		return fkDocumentTypeId;
	}
	public void setFkDocumentTypeId(Integer fkDocumentTypeId) {
		this.fkDocumentTypeId = fkDocumentTypeId;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getDocumentNumberNorm() {
		return documentNumberNorm;
	}
	public void setDocumentNumberNorm(String documentNumberNorm) {
		this.documentNumberNorm = documentNumberNorm;
	}
	public Date getDocumentDate() {
		return documentDate;
	}
	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}
	public String getDocTypeDescription() {
		return docTypeDescription;
	}
	public void setDocTypeDescription(String docTypeDescription) {
		this.docTypeDescription = docTypeDescription;
	}
	public BigDecimal getActualOpenAmount() {
		return actualOpenAmount;
	}
	public void setActualOpenAmount(BigDecimal actualOpenAmount) {
		this.actualOpenAmount = actualOpenAmount;
	}
	public BigDecimal getCurrentOpenAmount() {
		return currentOpenAmount;
	}
	public void setCurrentOpenAmount(BigDecimal currentOpenAmount) {
		this.currentOpenAmount = currentOpenAmount;
	}
	public BigDecimal getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}
	public BigDecimal getDecimalField1() {
		return decimalField1;
	}
	public void setDecimalField1(BigDecimal decimalField1) {
		this.decimalField1 = decimalField1;
	}
	public BigDecimal getDecimalField2() {
		return decimalField2;
	}
	public void setDecimalField2(BigDecimal decimalField2) {
		this.decimalField2 = decimalField2;
	}
	public BigDecimal getDecimalField3() {
		return decimalField3;
	}
	public void setDecimalField3(BigDecimal decimalField3) {
		this.decimalField3 = decimalField3;
	}
	public BigDecimal getDecimalField4() {
		return decimalField4;
	}
	public void setDecimalField4(BigDecimal decimalField4) {
		this.decimalField4 = decimalField4;
	}
	public BigDecimal getDecimalField5() {
		return decimalField5;
	}
	public void setDecimalField5(BigDecimal decimalField5) {
		this.decimalField5 = decimalField5;
	}
	public BigDecimal getDecimalField6() {
		return decimalField6;
	}
	public void setDecimalField6(BigDecimal decimalField6) {
		this.decimalField6 = decimalField6;
	}
	public Date getDateField1() {
		return dateField1;
	}
	public void setDateField1(Date dateField1) {
		this.dateField1 = dateField1;
	}
	public Date getDateField2() {
		return dateField2;
	}
	public void setDateField2(Date dateField2) {
		this.dateField2 = dateField2;
	}
	public BigDecimal getDocHeaderDetailsDisputedAmount() {
		return docHeaderDetailsDisputedAmount;
	}
	public void setDocHeaderDetailsDisputedAmount(BigDecimal docHeaderDetailsDisputedAmount) {
		this.docHeaderDetailsDisputedAmount = docHeaderDetailsDisputedAmount;
	}
	public BigDecimal getDocHeaderDetailsOpenDisputedAmount() {
		return docHeaderDetailsOpenDisputedAmount;
	}
	public void setDocHeaderDetailsOpenDisputedAmount(BigDecimal docHeaderDetailsOpenDisputedAmount) {
		this.docHeaderDetailsOpenDisputedAmount = docHeaderDetailsOpenDisputedAmount;
	}
	public BigDecimal getDocHeaderDetailsResolvedDisputedAmount() {
		return docHeaderDetailsResolvedDisputedAmount;
	}
	public void setDocHeaderDetailsResolvedDisputedAmount(BigDecimal docHeaderDetailsResolvedDisputedAmount) {
		this.docHeaderDetailsResolvedDisputedAmount = docHeaderDetailsResolvedDisputedAmount;
	}
	public BigDecimal getDocHeaderDetailsInvalidatedDisputedAmount() {
		return docHeaderDetailsInvalidatedDisputedAmount;
	}
	public void setDocHeaderDetailsInvalidatedDisputedAmount(BigDecimal docHeaderDetailsInvalidatedDisputedAmount) {
		this.docHeaderDetailsInvalidatedDisputedAmount = docHeaderDetailsInvalidatedDisputedAmount;
	}
	public BigDecimal getDocHeaderDetailsValidOpenAmount() {
		return docHeaderDetailsValidOpenAmount;
	}
	public void setDocHeaderDetailsValidOpenAmount(BigDecimal docHeaderDetailsValidOpenAmount) {
		this.docHeaderDetailsValidOpenAmount = docHeaderDetailsValidOpenAmount;
	}
	public String getDocHeaderDetailsHasOpenDispute() {
		return docHeaderDetailsHasOpenDispute;
	}
	public void setDocHeaderDetailsHasOpenDispute(String docHeaderDetailsHasOpenDispute) {
		this.docHeaderDetailsHasOpenDispute = docHeaderDetailsHasOpenDispute;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Integer getDaysPastDue() {
		return daysPastDue;
	}
	public void setDaysPastDue(Integer daysPastDue) {
		this.daysPastDue = daysPastDue;
	}
	public Integer getPkCustomerMapId() {
		return pkCustomerMapId;
	}
	public void setPkCustomerMapId(Integer pkCustomerMapId) {
		this.pkCustomerMapId = pkCustomerMapId;
	}
	public Integer getCustomerMapId() {
		return customerMapId;
	}
	public void setCustomerMapId(Integer customerMapId) {
		this.customerMapId = customerMapId;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getPaymentTerms() {
		return paymentTerms;
	}
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}
	public String getDocFilePath() {
		return docFilePath;
	}
	public void setDocFilePath(String docFilePath) {
		this.docFilePath = docFilePath;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getLatestNotes() {
		return latestNotes;
	}
	public void setLatestNotes(String latestNotes) {
		this.latestNotes = latestNotes;
	}
	public Date getCommittedDate() {
		return committedDate;
	}
	public void setCommittedDate(Date committedDate) {
		this.committedDate = committedDate;
	}
	public BigDecimal getCommittedAmount() {
		return committedAmount;
	}
	public void setCommittedAmount(BigDecimal committedAmount) {
		this.committedAmount = committedAmount;
	}
	public String getDocFilePathLink() {
		return docFilePathLink;
	}
	public void setDocFilePathLink(String docFilePathLink) {
		this.docFilePathLink = docFilePathLink;
	}
	public String getInvoiceLevelpaymentCommitIds() {
		return invoiceLevelpaymentCommitIds;
	}
	public void setInvoiceLevelpaymentCommitIds(String invoiceLevelpaymentCommitIds) {
		this.invoiceLevelpaymentCommitIds = invoiceLevelpaymentCommitIds;
	}
	public Integer getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}
	public Integer getIsValidDispute() {
		return isValidDispute;
	}
	public void setIsValidDispute(Integer isValidDispute) {
		this.isValidDispute = isValidDispute;
	}
	public Integer getDaysToPay() {
		return daysToPay;
	}
	public void setDaysToPay(Integer daysToPay) {
		this.daysToPay = daysToPay;
	}
	public Date getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}
	public Date getCommittedFor() {
		return committedFor;
	}
	public void setCommittedFor(Date committedFor) {
		this.committedFor = committedFor;
	}
	public String getPaymentCommitIdsString() {
		return paymentCommitIdsString;
	}
	public void setPaymentCommitIdsString(String paymentCommitIdsString) {
		this.paymentCommitIdsString = paymentCommitIdsString;
	}
	public boolean isHasOpenPaymentCommitment() {
		return hasOpenPaymentCommitment;
	}
	public void setHasOpenPaymentCommitment(boolean hasOpenPaymentCommitment) {
		this.hasOpenPaymentCommitment = hasOpenPaymentCommitment;
	}
	public String getInvoiceStatus() {
		return invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public String getValiddisputeStatus() {
		return validdisputeStatus;
	}
	public void setValiddisputeStatus(String validdisputeStatus) {
		this.validdisputeStatus = validdisputeStatus;
	}
	public String getDebitCreditIndicator() {
		return debitCreditIndicator;
	}
	public void setDebitCreditIndicator(String debitCreditIndicator) {
		this.debitCreditIndicator = debitCreditIndicator;
	}
	public String getFiscalYear() {
		return fiscalYear;
	}
	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}
	public String getNoLineItemAcct() {
		return noLineItemAcct;
	}
	public void setNoLineItemAcct(String noLineItemAcct) {
		this.noLineItemAcct = noLineItemAcct;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getReferenceKey1() {
		return referenceKey1;
	}
	public void setReferenceKey1(String referenceKey1) {
		this.referenceKey1 = referenceKey1;
	}
	public String getReferenceKeyLineItem() {
		return referenceKeyLineItem;
	}
	public void setReferenceKeyLineItem(String referenceKeyLineItem) {
		this.referenceKeyLineItem = referenceKeyLineItem;
	}
	public String getPostingKey() {
		return postingKey;
	}
	public void setPostingKey(String postingKey) {
		this.postingKey = postingKey;
	}
	public BigDecimal getOpenAmount() {
		return openAmount;
	}
	public void setOpenAmount(BigDecimal openAmount) {
		this.openAmount = openAmount;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getReasonCodeName() {
		return reasonCodeName;
	}
	public void setReasonCodeName(String reasonCodeName) {
		this.reasonCodeName = reasonCodeName;
	}
	public String getCustomerCurrency() {
		return customerCurrency;
	}
	public void setCustomerCurrency(String customerCurrency) {
		this.customerCurrency = customerCurrency;
	}
	public String getLocalCurrency() {
		return localCurrency;
	}
	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}
	public String getDualCurrency() {
		return dualCurrency;
	}
	public void setDualCurrency(String dualCurrency) {
		this.dualCurrency = dualCurrency;
	}
	public BigDecimal getCustomerActualOpenAmount() {
		return customerActualOpenAmount;
	}
	public void setCustomerActualOpenAmount(BigDecimal customerActualOpenAmount) {
		this.customerActualOpenAmount = customerActualOpenAmount;
	}
	public BigDecimal getDualActualOpenAmount() {
		return dualActualOpenAmount;
	}
	public void setDualActualOpenAmount(BigDecimal dualActualOpenAmount) {
		this.dualActualOpenAmount = dualActualOpenAmount;
	}
	public BigDecimal getLocalActualOpenAmount() {
		return localActualOpenAmount;
	}
	public void setLocalActualOpenAmount(BigDecimal localActualOpenAmount) {
		this.localActualOpenAmount = localActualOpenAmount;
	}
	public BigDecimal getDualCurrentOpenAmount() {
		return dualCurrentOpenAmount;
	}
	public void setDualCurrentOpenAmount(BigDecimal dualCurrentOpenAmount) {
		this.dualCurrentOpenAmount = dualCurrentOpenAmount;
	}
	public BigDecimal getLocalCurrentOpenAmount() {
		return localCurrentOpenAmount;
	}
	public void setLocalCurrentOpenAmount(BigDecimal localCurrentOpenAmount) {
		this.localCurrentOpenAmount = localCurrentOpenAmount;
	}
	public Integer getIsEscalated() {
		return isEscalated;
	}
	public void setIsEscalated(Integer isEscalated) {
		this.isEscalated = isEscalated;
	}
	public String getEscalated() {
		return escalated;
	}
	public void setEscalated(String escalated) {
		this.escalated = escalated;
	}
	public BigDecimal getDisputedAmount() {
		return disputedAmount;
	}
	public void setDisputedAmount(BigDecimal disputedAmount) {
		this.disputedAmount = disputedAmount;
	}
	public BigDecimal getValidDisputedAmount() {
		return validDisputedAmount;
	}
	public void setValidDisputedAmount(BigDecimal validDisputedAmount) {
		this.validDisputedAmount = validDisputedAmount;
	}
	public String getReferenceKey2() {
		return referenceKey2;
	}
	public void setReferenceKey2(String referenceKey2) {
		this.referenceKey2 = referenceKey2;
	}
	public String getReferenceKey5() {
		return referenceKey5;
	}
	public void setReferenceKey5(String referenceKey5) {
		this.referenceKey5 = referenceKey5;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getReferenceDocNumber() {
		return referenceDocNumber;
	}
	public void setReferenceDocNumber(String referenceDocNumber) {
		this.referenceDocNumber = referenceDocNumber;
	}
	public String getCommittedAmountWithCurrency() {
		return committedAmountWithCurrency;
	}
	public void setCommittedAmountWithCurrency(String committedAmountWithCurrency) {
		this.committedAmountWithCurrency = committedAmountWithCurrency;
	}
	public Date getLastCommittedDate() {
		return lastCommittedDate;
	}
	public void setLastCommittedDate(Date lastCommittedDate) {
		this.lastCommittedDate = lastCommittedDate;
	}
	public BigDecimal getRetainageAmount() {
		return retainageAmount;
	}
	public void setRetainageAmount(BigDecimal retainageAmount) {
		this.retainageAmount = retainageAmount;
	}
	public Integer getInvoiceAge() {
		return invoiceAge;
	}
	public void setInvoiceAge(Integer invoiceAge) {
		this.invoiceAge = invoiceAge;
	}
	public String getLatestTask() {
		return latestTask;
	}
	public void setLatestTask(String latestTask) {
		this.latestTask = latestTask;
	}
	public String getReferenceKey3() {
		return referenceKey3;
	}
	public void setReferenceKey3(String referenceKey3) {
		this.referenceKey3 = referenceKey3;
	}
	public Date getCashProjectionDate() {
		return cashProjectionDate;
	}
	public void setCashProjectionDate(Date cashProjectionDate) {
		this.cashProjectionDate = cashProjectionDate;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getDunningBlock() {
		return dunningBlock;
	}
	public void setDunningBlock(String dunningBlock) {
		this.dunningBlock = dunningBlock;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getOriginalDocType() {
		return originalDocType;
	}
	public void setOriginalDocType(String originalDocType) {
		this.originalDocType = originalDocType;
	}
	public String getReferenceKey6() {
		return referenceKey6;
	}
	public void setReferenceKey6(String referenceKey6) {
		this.referenceKey6 = referenceKey6;
	}
	public String getReferenceKey7() {
		return referenceKey7;
	}
	public void setReferenceKey7(String referenceKey7) {
		this.referenceKey7 = referenceKey7;
	}
	public String getReferenceKey8() {
		return referenceKey8;
	}
	public void setReferenceKey8(String referenceKey8) {
		this.referenceKey8 = referenceKey8;
	}
	public String getReferenceKey4() {
		return referenceKey4;
	}
	public void setReferenceKey4(String referenceKey4) {
		this.referenceKey4 = referenceKey4;
	}
	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}
	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}
	public Date getFirstPaymentDate() {
		return firstPaymentDate;
	}
	public void setFirstPaymentDate(Date firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}
	public String getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}
	public String getReferenceKey9() {
		return referenceKey9;
	}
	public void setReferenceKey9(String referenceKey9) {
		this.referenceKey9 = referenceKey9;
	}
	public String getReferenceKey10() {
		return referenceKey10;
	}
	public void setReferenceKey10(String referenceKey10) {
		this.referenceKey10 = referenceKey10;
	}
	public String getReferenceKey11() {
		return referenceKey11;
	}
	public void setReferenceKey11(String referenceKey11) {
		this.referenceKey11 = referenceKey11;
	}
	public String getReferenceKey12() {
		return referenceKey12;
	}
	public void setReferenceKey12(String referenceKey12) {
		this.referenceKey12 = referenceKey12;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDisputeStatus() {
		return disputeStatus;
	}
	public void setDisputeStatus(String disputeStatus) {
		this.disputeStatus = disputeStatus;
	}
	public String getGlIndicator() {
		return glIndicator;
	}
	public void setGlIndicator(String glIndicator) {
		this.glIndicator = glIndicator;
	}
	public String getGlAccountNumber() {
		return glAccountNumber;
	}
	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}
	public BigDecimal getOffsetAmount() {
		return offsetAmount;
	}
	public void setOffsetAmount(BigDecimal offsetAmount) {
		this.offsetAmount = offsetAmount;
	}
	public String getClsDunningBlock() {
		return clsDunningBlock;
	}
	public void setClsDunningBlock(String clsDunningBlock) {
		this.clsDunningBlock = clsDunningBlock;
	}
	public String getBusinessArea() {
		return businessArea;
	}
	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}
	public String getAcctDocReferenceKey1() {
		return acctDocReferenceKey1;
	}
	public void setAcctDocReferenceKey1(String acctDocReferenceKey1) {
		this.acctDocReferenceKey1 = acctDocReferenceKey1;
	}
	public String getAcctDocReferenceKey3() {
		return acctDocReferenceKey3;
	}
	public void setAcctDocReferenceKey3(String acctDocReferenceKey3) {
		this.acctDocReferenceKey3 = acctDocReferenceKey3;
	}
	public String getAcctDocReferenceKey10() {
		return acctDocReferenceKey10;
	}
	public void setAcctDocReferenceKey10(String acctDocReferenceKey10) {
		this.acctDocReferenceKey10 = acctDocReferenceKey10;
	}
	public String getAcctDocReferenceKey13() {
		return acctDocReferenceKey13;
	}
	public void setAcctDocReferenceKey13(String acctDocReferenceKey13) {
		this.acctDocReferenceKey13 = acctDocReferenceKey13;
	}
	public BigDecimal getValidOpenAmount() {
		return validOpenAmount;
	}
	public void setValidOpenAmount(BigDecimal validOpenAmount) {
		this.validOpenAmount = validOpenAmount;
	}
	public String getEscalatedTo() {
		return escalatedTo;
	}
	public void setEscalatedTo(String escalatedTo) {
		this.escalatedTo = escalatedTo;
	}
	public String getLatestUserAction() {
		return latestUserAction;
	}
	public void setLatestUserAction(String latestUserAction) {
		this.latestUserAction = latestUserAction;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public BigDecimal getTotalOpenCommittedAmt() {
		return totalOpenCommittedAmt;
	}
	public void setTotalOpenCommittedAmt(BigDecimal totalOpenCommittedAmt) {
		this.totalOpenCommittedAmt = totalOpenCommittedAmt;
	}
	public BigDecimal getNextCommittedAmt() {
		return nextCommittedAmt;
	}
	public void setNextCommittedAmt(BigDecimal nextCommittedAmt) {
		this.nextCommittedAmt = nextCommittedAmt;
	}
	public String getNextCommittedDate() {
		return nextCommittedDate;
	}
	public void setNextCommittedDate(String nextCommittedDate) {
		this.nextCommittedDate = nextCommittedDate;
	}
	public String getArCustomerNumber() {
		return arCustomerNumber;
	}
	public void setArCustomerNumber(String arCustomerNumber) {
		this.arCustomerNumber = arCustomerNumber;
	}
	public String getShipTo() {
		return shipTo;
	}
	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	public String getShipmentNumber() {
		return shipmentNumber;
	}
	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}
	public String getReferenceKey13() {
		return referenceKey13;
	}
	public void setReferenceKey13(String referenceKey13) {
		this.referenceKey13 = referenceKey13;
	}
	public String getReferenceKey14() {
		return referenceKey14;
	}
	public void setReferenceKey14(String referenceKey14) {
		this.referenceKey14 = referenceKey14;
	}
	public String getReferenceKey15() {
		return referenceKey15;
	}
	public void setReferenceKey15(String referenceKey15) {
		this.referenceKey15 = referenceKey15;
	}
	public String getReferenceKey16() {
		return referenceKey16;
	}
	public void setReferenceKey16(String referenceKey16) {
		this.referenceKey16 = referenceKey16;
	}
	public String getReferenceKey17() {
		return referenceKey17;
	}
	public void setReferenceKey17(String referenceKey17) {
		this.referenceKey17 = referenceKey17;
	}
	public String getReferenceKey18() {
		return referenceKey18;
	}
	public void setReferenceKey18(String referenceKey18) {
		this.referenceKey18 = referenceKey18;
	}
	public String getReferenceKey19() {
		return referenceKey19;
	}
	public void setReferenceKey19(String referenceKey19) {
		this.referenceKey19 = referenceKey19;
	}
	public String getReferenceKey20() {
		return referenceKey20;
	}
	public void setReferenceKey20(String referenceKey20) {
		this.referenceKey20 = referenceKey20;
	}
	public String getReferenceKey21() {
		return referenceKey21;
	}
	public void setReferenceKey21(String referenceKey21) {
		this.referenceKey21 = referenceKey21;
	}
	public String getReferenceKey22() {
		return referenceKey22;
	}
	public void setReferenceKey22(String referenceKey22) {
		this.referenceKey22 = referenceKey22;
	}
	public String getReferenceKey23() {
		return referenceKey23;
	}
	public void setReferenceKey23(String referenceKey23) {
		this.referenceKey23 = referenceKey23;
	}
	public String getReferenceKey24() {
		return referenceKey24;
	}
	public void setReferenceKey24(String referenceKey24) {
		this.referenceKey24 = referenceKey24;
	}
	public String getReferenceKey25() {
		return referenceKey25;
	}
	public void setReferenceKey25(String referenceKey25) {
		this.referenceKey25 = referenceKey25;
	}
	public String getReferenceKey26() {
		return referenceKey26;
	}
	public void setReferenceKey26(String referenceKey26) {
		this.referenceKey26 = referenceKey26;
	}
	public String getReferenceKey27() {
		return referenceKey27;
	}
	public void setReferenceKey27(String referenceKey27) {
		this.referenceKey27 = referenceKey27;
	}
	public String getReferenceKey28() {
		return referenceKey28;
	}
	public void setReferenceKey28(String referenceKey28) {
		this.referenceKey28 = referenceKey28;
	}
	public String getReferenceKey29() {
		return referenceKey29;
	}
	public void setReferenceKey29(String referenceKey29) {
		this.referenceKey29 = referenceKey29;
	}
	public String getReferenceKey30() {
		return referenceKey30;
	}
	public void setReferenceKey30(String referenceKey30) {
		this.referenceKey30 = referenceKey30;
	}
	public String getReferenceKey31() {
		return referenceKey31;
	}
	public void setReferenceKey31(String referenceKey31) {
		this.referenceKey31 = referenceKey31;
	}
	public String getReferenceKey32() {
		return referenceKey32;
	}
	public void setReferenceKey32(String referenceKey32) {
		this.referenceKey32 = referenceKey32;
	}
	public String getReferenceKey33() {
		return referenceKey33;
	}
	public void setReferenceKey33(String referenceKey33) {
		this.referenceKey33 = referenceKey33;
	}
	public String getReferenceKey34() {
		return referenceKey34;
	}
	public void setReferenceKey34(String referenceKey34) {
		this.referenceKey34 = referenceKey34;
	}
	public String getReferenceKey35() {
		return referenceKey35;
	}
	public void setReferenceKey35(String referenceKey35) {
		this.referenceKey35 = referenceKey35;
	}
	public String getReferenceKey36() {
		return referenceKey36;
	}
	public void setReferenceKey36(String referenceKey36) {
		this.referenceKey36 = referenceKey36;
	}
	public String getReferenceKey37() {
		return referenceKey37;
	}
	public void setReferenceKey37(String referenceKey37) {
		this.referenceKey37 = referenceKey37;
	}
	public String getReferenceKey38() {
		return referenceKey38;
	}
	public void setReferenceKey38(String referenceKey38) {
		this.referenceKey38 = referenceKey38;
	}
	public String getReferenceKey39() {
		return referenceKey39;
	}
	public void setReferenceKey39(String referenceKey39) {
		this.referenceKey39 = referenceKey39;
	}
	public String getReferenceKey40() {
		return referenceKey40;
	}
	public void setReferenceKey40(String referenceKey40) {
		this.referenceKey40 = referenceKey40;
	}
	public int getHasAttachment() {
		return hasAttachment;
	}
	public void setHasAttachment(int hasAttachment) {
		this.hasAttachment = hasAttachment;
	}
	public Date getDiscountDueDateNorm() {
		return discountDueDateNorm;
	}
	public void setDiscountDueDateNorm(Date discountDueDateNorm) {
		this.discountDueDateNorm = discountDueDateNorm;
	}
	public String getDocumentFileClassifier() {
		return documentFileClassifier;
	}
	public void setDocumentFileClassifier(String documentFileClassifier) {
		this.documentFileClassifier = documentFileClassifier;
	}
	public Date getBaselineDate() {
		return baselineDate;
	}
	public void setBaselineDate(Date baselineDate) {
		this.baselineDate = baselineDate;
	}
	public String getSalesInvoiceItems() {
		return salesInvoiceItems;
	}
	public void setSalesInvoiceItems(String salesInvoiceItems) {
		this.salesInvoiceItems = salesInvoiceItems;
	}
	public String getViewDedutions() {
		return viewDedutions;
	}
	public void setViewDedutions(String viewDedutions) {
		this.viewDedutions = viewDedutions;
	}
	public BigDecimal getInvAmtGlobalNorm() {
		return invAmtGlobalNorm;
	}
	public void setInvAmtGlobalNorm(BigDecimal invAmtGlobalNorm) {
		this.invAmtGlobalNorm = invAmtGlobalNorm;
	}
	public BigDecimal getOpenAmtGlobalNorm() {
		return openAmtGlobalNorm;
	}
	public void setOpenAmtGlobalNorm(BigDecimal openAmtGlobalNorm) {
		this.openAmtGlobalNorm = openAmtGlobalNorm;
	}
	public String getGlobalCurrency() {
		return globalCurrency;
	}
	public void setGlobalCurrency(String globalCurrency) {
		this.globalCurrency = globalCurrency;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getEditableDropDownField1() {
		return editableDropDownField1;
	}
	public void setEditableDropDownField1(String editableDropDownField1) {
		this.editableDropDownField1 = editableDropDownField1;
	}
	public String getEditableDropDownField2() {
		return editableDropDownField2;
	}
	public void setEditableDropDownField2(String editableDropDownField2) {
		this.editableDropDownField2 = editableDropDownField2;
	}
	public String getEditableDropDownField3() {
		return editableDropDownField3;
	}
	public void setEditableDropDownField3(String editableDropDownField3) {
		this.editableDropDownField3 = editableDropDownField3;
	}
	public BigDecimal getAvailableOffsetAmount() {
		return availableOffsetAmount;
	}
	public void setAvailableOffsetAmount(BigDecimal availableOffsetAmount) {
		this.availableOffsetAmount = availableOffsetAmount;
	}
	public String getPortalSystemStatusId() {
		return portalSystemStatusId;
	}
	public void setPortalSystemStatusId(String portalSystemStatusId) {
		this.portalSystemStatusId = portalSystemStatusId;
	}
	public Date getDiscountDate1Norm() {
		return discountDate1Norm;
	}
	public void setDiscountDate1Norm(Date discountDate1Norm) {
		this.discountDate1Norm = discountDate1Norm;
	}
	public Date getDiscountDate2Norm() {
		return discountDate2Norm;
	}
	public void setDiscountDate2Norm(Date discountDate2Norm) {
		this.discountDate2Norm = discountDate2Norm;
	}
	public String getInvoiceCopyPresent() {
		return invoiceCopyPresent;
	}
	public void setInvoiceCopyPresent(String invoiceCopyPresent) {
		this.invoiceCopyPresent = invoiceCopyPresent;
	}
	public Boolean getReferenceFlag1() {
		return referenceFlag1;
	}
	public void setReferenceFlag1(Boolean referenceFlag1) {
		this.referenceFlag1 = referenceFlag1;
	}
	public String getInvoiceTags() {
		return invoiceTags;
	}
	public void setInvoiceTags(String invoiceTags) {
		this.invoiceTags = invoiceTags;
	}
	public BigDecimal getPaidAmtLocalCurr() {
		return paidAmtLocalCurr;
	}
	public void setPaidAmtLocalCurr(BigDecimal paidAmtLocalCurr) {
		this.paidAmtLocalCurr = paidAmtLocalCurr;
	}
	public BigDecimal getPaidAmtGlobalCurr() {
		return paidAmtGlobalCurr;
	}
	public void setPaidAmtGlobalCurr(BigDecimal paidAmtGlobalCurr) {
		this.paidAmtGlobalCurr = paidAmtGlobalCurr;
	}
	public BigDecimal getPaidAmtDocCurr() {
		return paidAmtDocCurr;
	}
	public void setPaidAmtDocCurr(BigDecimal paidAmtDocCurr) {
		this.paidAmtDocCurr = paidAmtDocCurr;
	}
	public Date getArClearingDateNorm() {
		return arClearingDateNorm;
	}
	public void setArClearingDateNorm(Date arClearingDateNorm) {
		this.arClearingDateNorm = arClearingDateNorm;
	}
	public Date getArDocumentDateNorm() {
		return arDocumentDateNorm;
	}
	public void setArDocumentDateNorm(Date arDocumentDateNorm) {
		this.arDocumentDateNorm = arDocumentDateNorm;
	}
	public Date getArDueDateNorm() {
		return arDueDateNorm;
	}
	public void setArDueDateNorm(Date arDueDateNorm) {
		this.arDueDateNorm = arDueDateNorm;
	}
	public Integer getHasDirectDebitFailure() {
		return hasDirectDebitFailure;
	}
	public void setHasDirectDebitFailure(Integer hasDirectDebitFailure) {
		this.hasDirectDebitFailure = hasDirectDebitFailure;
	}
	public Date getDirectDebitFailureDate() {
		return directDebitFailureDate;
	}
	public void setDirectDebitFailureDate(Date directDebitFailureDate) {
		this.directDebitFailureDate = directDebitFailureDate;
	}
	public String getOverdue() {
		return overdue;
	}
	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}
	public BigDecimal getTotalBrokenAmount() {
		return totalBrokenAmount;
	}
	public void setTotalBrokenAmount(BigDecimal totalBrokenAmount) {
		this.totalBrokenAmount = totalBrokenAmount;
	}
	public Date getLatestCommittedFor() {
		return latestCommittedFor;
	}
	public void setLatestCommittedFor(Date latestCommittedFor) {
		this.latestCommittedFor = latestCommittedFor;
	}
	
}

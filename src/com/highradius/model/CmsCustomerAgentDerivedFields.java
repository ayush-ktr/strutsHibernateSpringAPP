package com.highradius.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class CmsCustomerAgentDerivedFields implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer pkCmsCustomerAgentDerivedFieldsId;
	private Integer fkAccountId;
	private Integer fkCustomerMapId;
	private String globalCurrency;
	private String localCurrency;
	private String documentCurrency;
	private BigDecimal invAmtGlobalCurrency;
	private String invAmtLocalCurrency;
	private String invAmtDocCurrency;
	private BigDecimal currentOpenAmtGlobalCurrency;
	private String currentOpenAmtLocalCurrency;
	private String currentOpenAmtDocCurrency;
	private BigDecimal pastDueAmtGlobalCurrency;
	private String pastDueAmtLocalCurrency;
	private String pastDueAmtDocCurrency;
	private BigDecimal pastDueBucket0AmtGlobalCurrency;
	private String pastDueBucket0AmtLocalCurrency;
	private String pastDueBucket0AmtDocCurrency;
	private BigDecimal pastDueBucket1AmtGlobalCurrency;
	private String pastDueBucket1AmtLocalCurrency;
	private String pastDueBucket1AmtDocCurrency;
	private BigDecimal pastDueBucket2AmtGlobalCurrency;
	private String pastDueBucket2AmtLocalCurrency;
	private String pastDueBucket2AmtDocCurrency;
	private BigDecimal pastDueBucket3AmtGlobalCurrency;
	private String pastDueBucket3AmtLocalCurrency;
	private String pastDueBucket3AmtDocCurrency;
	private BigDecimal pastDueBucket4AmtGlobalCurrency;
	private String pastDueBucket4AmtLocalCurrency;
	private String pastDueBucket4AmtDocCurrency;
	private BigDecimal pastDueBucket5AmtGlobalCurrency;
	private String pastDueBucket5AmtLocalCurrency;
	private String pastDueBucket5AmtDocCurrency;
	private BigDecimal pastDueBucket6AmtGlobalCurrency;
	private String pastDueBucket6AmtLocalCurrency;
	private String pastDueBucket6AmtDocCurrency;
	private BigDecimal pastDueBucket7AmtGlobalCurrency;
	private String pastDueBucket7AmtLocalCurrency;
	private String pastDueBucket7AmtDocCurrency;
	private BigDecimal pastDueBucket8AmtGlobalCurrency;
	private String pastDueBucket8AmtLocalCurrency;
	private String pastDueBucket8AmtDocCurrency;
	private BigDecimal pastDueBucket9AmtGlobalCurrency;
	private String pastDueBucket9AmtLocalCurrency;
	private String pastDueBucket9AmtDocCurrency;
	private BigDecimal pastDueBucket10AmtGlobalCurrency;
	private String pastDueBucket10AmtLocalCurrency;
	private String pastDueBucket10AmtDocCurrency;
	private BigDecimal pastDueBucket11AmtGlobalCurrency;
	private String pastDueBucket11AmtLocalCurrency;
	private String pastDueBucket11AmtDocCurrency;
	private BigDecimal pastDueBucket12AmtGlobalCurrency;
	private String pastDueBucket12AmtLocalCurrency;
	private String pastDueBucket12AmtDocCurrency;	
	// adding transient variables for amounts in currencies for correspondence starts
	
	private String currentOpenAmountDocCurrency;
	private String currentOpenAmountLocalCurrency;
	private BigDecimal currentOpenAmountGlobalCurrency;
	private String globalCurrencyForCurrentOpenAmount;
	private String formattedCurrentOpenAmountGlobalCurrency;
	
	private String currentOpenAmountRolledUpDocCurrency;
	private String currentOpenAmountRolledUpLocalCurrency;
	private BigDecimal currentOpenAmountRolledUpGlobalCurrency;
	private String globalCurrencyForRolledUpCurrentOpenAmount;
	private String formattedRolledUpCurrentOpenAmountGlobalCurrency;
	
	private String pastDueAmountDocCurrency;
	private String pastDueAmountLocalCurrency;
	private BigDecimal pastDueAmountGlobalCurrency;
	private String globalCurrencyForPastDueAmount;
	private String formattedPastDueAmountGlobalCurrency;
	
	private String pastDueAmountRolledUpDocCurrency;
	private String pastDueAmountRolledUpLocalCurrency;
	private BigDecimal pastDueAmountRolledUpGlobalCurrency;
	private String globalCurrencyForRolledUpPastDueAmount;
	private String formattedRolledUpPastDueAmountGlobalCurrency;
	
	private String totalOpenAmountDocCurrency;
	private String totalOpenAmountLocalCurrency;
	private BigDecimal totalOpenAmountGlobalCurrency;
	private String globalCurrencyForTotalOpenAmount;
	private String formattedTotalOpenAmountGlobalCurrency;
	
	private String totalOpenAmountRolledUpDocCurrency;
	private String totalOpenAmountRolledUpLocalCurrency;
	private BigDecimal totalOpenAmountRolledUpGlobalCurrency;
	private String globalCurrencyForRolledUpTotalOpenAmount;
	private String formattedRolledUpTotalOpenAmountGlobalCurrency;
	public Integer getPkCmsCustomerAgentDerivedFieldsId() {
		return pkCmsCustomerAgentDerivedFieldsId;
	}
	public void setPkCmsCustomerAgentDerivedFieldsId(Integer pkCmsCustomerAgentDerivedFieldsId) {
		this.pkCmsCustomerAgentDerivedFieldsId = pkCmsCustomerAgentDerivedFieldsId;
	}
	public Integer getFkAccountId() {
		return fkAccountId;
	}
	public void setFkAccountId(Integer fkAccountId) {
		this.fkAccountId = fkAccountId;
	}
	public Integer getFkCustomerMapId() {
		return fkCustomerMapId;
	}
	public void setFkCustomerMapId(Integer fkCustomerMapId) {
		this.fkCustomerMapId = fkCustomerMapId;
	}
	public String getGlobalCurrency() {
		return globalCurrency;
	}
	public void setGlobalCurrency(String globalCurrency) {
		this.globalCurrency = globalCurrency;
	}
	public String getLocalCurrency() {
		return localCurrency;
	}
	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}
	public String getDocumentCurrency() {
		return documentCurrency;
	}
	public void setDocumentCurrency(String documentCurrency) {
		this.documentCurrency = documentCurrency;
	}
	public BigDecimal getInvAmtGlobalCurrency() {
		return invAmtGlobalCurrency;
	}
	public void setInvAmtGlobalCurrency(BigDecimal invAmtGlobalCurrency) {
		this.invAmtGlobalCurrency = invAmtGlobalCurrency;
	}
	public String getInvAmtLocalCurrency() {
		return invAmtLocalCurrency;
	}
	public void setInvAmtLocalCurrency(String invAmtLocalCurrency) {
		this.invAmtLocalCurrency = invAmtLocalCurrency;
	}
	public String getInvAmtDocCurrency() {
		return invAmtDocCurrency;
	}
	public void setInvAmtDocCurrency(String invAmtDocCurrency) {
		this.invAmtDocCurrency = invAmtDocCurrency;
	}
	public BigDecimal getCurrentOpenAmtGlobalCurrency() {
		return currentOpenAmtGlobalCurrency;
	}
	public void setCurrentOpenAmtGlobalCurrency(BigDecimal currentOpenAmtGlobalCurrency) {
		this.currentOpenAmtGlobalCurrency = currentOpenAmtGlobalCurrency;
	}
	public String getCurrentOpenAmtLocalCurrency() {
		return currentOpenAmtLocalCurrency;
	}
	public void setCurrentOpenAmtLocalCurrency(String currentOpenAmtLocalCurrency) {
		this.currentOpenAmtLocalCurrency = currentOpenAmtLocalCurrency;
	}
	public String getCurrentOpenAmtDocCurrency() {
		return currentOpenAmtDocCurrency;
	}
	public void setCurrentOpenAmtDocCurrency(String currentOpenAmtDocCurrency) {
		this.currentOpenAmtDocCurrency = currentOpenAmtDocCurrency;
	}
	public BigDecimal getPastDueAmtGlobalCurrency() {
		return pastDueAmtGlobalCurrency;
	}
	public void setPastDueAmtGlobalCurrency(BigDecimal pastDueAmtGlobalCurrency) {
		this.pastDueAmtGlobalCurrency = pastDueAmtGlobalCurrency;
	}
	public String getPastDueAmtLocalCurrency() {
		return pastDueAmtLocalCurrency;
	}
	public void setPastDueAmtLocalCurrency(String pastDueAmtLocalCurrency) {
		this.pastDueAmtLocalCurrency = pastDueAmtLocalCurrency;
	}
	public String getPastDueAmtDocCurrency() {
		return pastDueAmtDocCurrency;
	}
	public void setPastDueAmtDocCurrency(String pastDueAmtDocCurrency) {
		this.pastDueAmtDocCurrency = pastDueAmtDocCurrency;
	}
	public BigDecimal getPastDueBucket0AmtGlobalCurrency() {
		return pastDueBucket0AmtGlobalCurrency;
	}
	public void setPastDueBucket0AmtGlobalCurrency(BigDecimal pastDueBucket0AmtGlobalCurrency) {
		this.pastDueBucket0AmtGlobalCurrency = pastDueBucket0AmtGlobalCurrency;
	}
	public String getPastDueBucket0AmtLocalCurrency() {
		return pastDueBucket0AmtLocalCurrency;
	}
	public void setPastDueBucket0AmtLocalCurrency(String pastDueBucket0AmtLocalCurrency) {
		this.pastDueBucket0AmtLocalCurrency = pastDueBucket0AmtLocalCurrency;
	}
	public String getPastDueBucket0AmtDocCurrency() {
		return pastDueBucket0AmtDocCurrency;
	}
	public void setPastDueBucket0AmtDocCurrency(String pastDueBucket0AmtDocCurrency) {
		this.pastDueBucket0AmtDocCurrency = pastDueBucket0AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket1AmtGlobalCurrency() {
		return pastDueBucket1AmtGlobalCurrency;
	}
	public void setPastDueBucket1AmtGlobalCurrency(BigDecimal pastDueBucket1AmtGlobalCurrency) {
		this.pastDueBucket1AmtGlobalCurrency = pastDueBucket1AmtGlobalCurrency;
	}
	public String getPastDueBucket1AmtLocalCurrency() {
		return pastDueBucket1AmtLocalCurrency;
	}
	public void setPastDueBucket1AmtLocalCurrency(String pastDueBucket1AmtLocalCurrency) {
		this.pastDueBucket1AmtLocalCurrency = pastDueBucket1AmtLocalCurrency;
	}
	public String getPastDueBucket1AmtDocCurrency() {
		return pastDueBucket1AmtDocCurrency;
	}
	public void setPastDueBucket1AmtDocCurrency(String pastDueBucket1AmtDocCurrency) {
		this.pastDueBucket1AmtDocCurrency = pastDueBucket1AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket2AmtGlobalCurrency() {
		return pastDueBucket2AmtGlobalCurrency;
	}
	public void setPastDueBucket2AmtGlobalCurrency(BigDecimal pastDueBucket2AmtGlobalCurrency) {
		this.pastDueBucket2AmtGlobalCurrency = pastDueBucket2AmtGlobalCurrency;
	}
	public String getPastDueBucket2AmtLocalCurrency() {
		return pastDueBucket2AmtLocalCurrency;
	}
	public void setPastDueBucket2AmtLocalCurrency(String pastDueBucket2AmtLocalCurrency) {
		this.pastDueBucket2AmtLocalCurrency = pastDueBucket2AmtLocalCurrency;
	}
	public String getPastDueBucket2AmtDocCurrency() {
		return pastDueBucket2AmtDocCurrency;
	}
	public void setPastDueBucket2AmtDocCurrency(String pastDueBucket2AmtDocCurrency) {
		this.pastDueBucket2AmtDocCurrency = pastDueBucket2AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket3AmtGlobalCurrency() {
		return pastDueBucket3AmtGlobalCurrency;
	}
	public void setPastDueBucket3AmtGlobalCurrency(BigDecimal pastDueBucket3AmtGlobalCurrency) {
		this.pastDueBucket3AmtGlobalCurrency = pastDueBucket3AmtGlobalCurrency;
	}
	public String getPastDueBucket3AmtLocalCurrency() {
		return pastDueBucket3AmtLocalCurrency;
	}
	public void setPastDueBucket3AmtLocalCurrency(String pastDueBucket3AmtLocalCurrency) {
		this.pastDueBucket3AmtLocalCurrency = pastDueBucket3AmtLocalCurrency;
	}
	public String getPastDueBucket3AmtDocCurrency() {
		return pastDueBucket3AmtDocCurrency;
	}
	public void setPastDueBucket3AmtDocCurrency(String pastDueBucket3AmtDocCurrency) {
		this.pastDueBucket3AmtDocCurrency = pastDueBucket3AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket4AmtGlobalCurrency() {
		return pastDueBucket4AmtGlobalCurrency;
	}
	public void setPastDueBucket4AmtGlobalCurrency(BigDecimal pastDueBucket4AmtGlobalCurrency) {
		this.pastDueBucket4AmtGlobalCurrency = pastDueBucket4AmtGlobalCurrency;
	}
	public String getPastDueBucket4AmtLocalCurrency() {
		return pastDueBucket4AmtLocalCurrency;
	}
	public void setPastDueBucket4AmtLocalCurrency(String pastDueBucket4AmtLocalCurrency) {
		this.pastDueBucket4AmtLocalCurrency = pastDueBucket4AmtLocalCurrency;
	}
	public String getPastDueBucket4AmtDocCurrency() {
		return pastDueBucket4AmtDocCurrency;
	}
	public void setPastDueBucket4AmtDocCurrency(String pastDueBucket4AmtDocCurrency) {
		this.pastDueBucket4AmtDocCurrency = pastDueBucket4AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket5AmtGlobalCurrency() {
		return pastDueBucket5AmtGlobalCurrency;
	}
	public void setPastDueBucket5AmtGlobalCurrency(BigDecimal pastDueBucket5AmtGlobalCurrency) {
		this.pastDueBucket5AmtGlobalCurrency = pastDueBucket5AmtGlobalCurrency;
	}
	public String getPastDueBucket5AmtLocalCurrency() {
		return pastDueBucket5AmtLocalCurrency;
	}
	public void setPastDueBucket5AmtLocalCurrency(String pastDueBucket5AmtLocalCurrency) {
		this.pastDueBucket5AmtLocalCurrency = pastDueBucket5AmtLocalCurrency;
	}
	public String getPastDueBucket5AmtDocCurrency() {
		return pastDueBucket5AmtDocCurrency;
	}
	public void setPastDueBucket5AmtDocCurrency(String pastDueBucket5AmtDocCurrency) {
		this.pastDueBucket5AmtDocCurrency = pastDueBucket5AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket6AmtGlobalCurrency() {
		return pastDueBucket6AmtGlobalCurrency;
	}
	public void setPastDueBucket6AmtGlobalCurrency(BigDecimal pastDueBucket6AmtGlobalCurrency) {
		this.pastDueBucket6AmtGlobalCurrency = pastDueBucket6AmtGlobalCurrency;
	}
	public String getPastDueBucket6AmtLocalCurrency() {
		return pastDueBucket6AmtLocalCurrency;
	}
	public void setPastDueBucket6AmtLocalCurrency(String pastDueBucket6AmtLocalCurrency) {
		this.pastDueBucket6AmtLocalCurrency = pastDueBucket6AmtLocalCurrency;
	}
	public String getPastDueBucket6AmtDocCurrency() {
		return pastDueBucket6AmtDocCurrency;
	}
	public void setPastDueBucket6AmtDocCurrency(String pastDueBucket6AmtDocCurrency) {
		this.pastDueBucket6AmtDocCurrency = pastDueBucket6AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket7AmtGlobalCurrency() {
		return pastDueBucket7AmtGlobalCurrency;
	}
	public void setPastDueBucket7AmtGlobalCurrency(BigDecimal pastDueBucket7AmtGlobalCurrency) {
		this.pastDueBucket7AmtGlobalCurrency = pastDueBucket7AmtGlobalCurrency;
	}
	public String getPastDueBucket7AmtLocalCurrency() {
		return pastDueBucket7AmtLocalCurrency;
	}
	public void setPastDueBucket7AmtLocalCurrency(String pastDueBucket7AmtLocalCurrency) {
		this.pastDueBucket7AmtLocalCurrency = pastDueBucket7AmtLocalCurrency;
	}
	public String getPastDueBucket7AmtDocCurrency() {
		return pastDueBucket7AmtDocCurrency;
	}
	public void setPastDueBucket7AmtDocCurrency(String pastDueBucket7AmtDocCurrency) {
		this.pastDueBucket7AmtDocCurrency = pastDueBucket7AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket8AmtGlobalCurrency() {
		return pastDueBucket8AmtGlobalCurrency;
	}
	public void setPastDueBucket8AmtGlobalCurrency(BigDecimal pastDueBucket8AmtGlobalCurrency) {
		this.pastDueBucket8AmtGlobalCurrency = pastDueBucket8AmtGlobalCurrency;
	}
	public String getPastDueBucket8AmtLocalCurrency() {
		return pastDueBucket8AmtLocalCurrency;
	}
	public void setPastDueBucket8AmtLocalCurrency(String pastDueBucket8AmtLocalCurrency) {
		this.pastDueBucket8AmtLocalCurrency = pastDueBucket8AmtLocalCurrency;
	}
	public String getPastDueBucket8AmtDocCurrency() {
		return pastDueBucket8AmtDocCurrency;
	}
	public void setPastDueBucket8AmtDocCurrency(String pastDueBucket8AmtDocCurrency) {
		this.pastDueBucket8AmtDocCurrency = pastDueBucket8AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket9AmtGlobalCurrency() {
		return pastDueBucket9AmtGlobalCurrency;
	}
	public void setPastDueBucket9AmtGlobalCurrency(BigDecimal pastDueBucket9AmtGlobalCurrency) {
		this.pastDueBucket9AmtGlobalCurrency = pastDueBucket9AmtGlobalCurrency;
	}
	public String getPastDueBucket9AmtLocalCurrency() {
		return pastDueBucket9AmtLocalCurrency;
	}
	public void setPastDueBucket9AmtLocalCurrency(String pastDueBucket9AmtLocalCurrency) {
		this.pastDueBucket9AmtLocalCurrency = pastDueBucket9AmtLocalCurrency;
	}
	public String getPastDueBucket9AmtDocCurrency() {
		return pastDueBucket9AmtDocCurrency;
	}
	public void setPastDueBucket9AmtDocCurrency(String pastDueBucket9AmtDocCurrency) {
		this.pastDueBucket9AmtDocCurrency = pastDueBucket9AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket10AmtGlobalCurrency() {
		return pastDueBucket10AmtGlobalCurrency;
	}
	public void setPastDueBucket10AmtGlobalCurrency(BigDecimal pastDueBucket10AmtGlobalCurrency) {
		this.pastDueBucket10AmtGlobalCurrency = pastDueBucket10AmtGlobalCurrency;
	}
	public String getPastDueBucket10AmtLocalCurrency() {
		return pastDueBucket10AmtLocalCurrency;
	}
	public void setPastDueBucket10AmtLocalCurrency(String pastDueBucket10AmtLocalCurrency) {
		this.pastDueBucket10AmtLocalCurrency = pastDueBucket10AmtLocalCurrency;
	}
	public String getPastDueBucket10AmtDocCurrency() {
		return pastDueBucket10AmtDocCurrency;
	}
	public void setPastDueBucket10AmtDocCurrency(String pastDueBucket10AmtDocCurrency) {
		this.pastDueBucket10AmtDocCurrency = pastDueBucket10AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket11AmtGlobalCurrency() {
		return pastDueBucket11AmtGlobalCurrency;
	}
	public void setPastDueBucket11AmtGlobalCurrency(BigDecimal pastDueBucket11AmtGlobalCurrency) {
		this.pastDueBucket11AmtGlobalCurrency = pastDueBucket11AmtGlobalCurrency;
	}
	public String getPastDueBucket11AmtLocalCurrency() {
		return pastDueBucket11AmtLocalCurrency;
	}
	public void setPastDueBucket11AmtLocalCurrency(String pastDueBucket11AmtLocalCurrency) {
		this.pastDueBucket11AmtLocalCurrency = pastDueBucket11AmtLocalCurrency;
	}
	public String getPastDueBucket11AmtDocCurrency() {
		return pastDueBucket11AmtDocCurrency;
	}
	public void setPastDueBucket11AmtDocCurrency(String pastDueBucket11AmtDocCurrency) {
		this.pastDueBucket11AmtDocCurrency = pastDueBucket11AmtDocCurrency;
	}
	public BigDecimal getPastDueBucket12AmtGlobalCurrency() {
		return pastDueBucket12AmtGlobalCurrency;
	}
	public void setPastDueBucket12AmtGlobalCurrency(BigDecimal pastDueBucket12AmtGlobalCurrency) {
		this.pastDueBucket12AmtGlobalCurrency = pastDueBucket12AmtGlobalCurrency;
	}
	public String getPastDueBucket12AmtLocalCurrency() {
		return pastDueBucket12AmtLocalCurrency;
	}
	public void setPastDueBucket12AmtLocalCurrency(String pastDueBucket12AmtLocalCurrency) {
		this.pastDueBucket12AmtLocalCurrency = pastDueBucket12AmtLocalCurrency;
	}
	public String getPastDueBucket12AmtDocCurrency() {
		return pastDueBucket12AmtDocCurrency;
	}
	public void setPastDueBucket12AmtDocCurrency(String pastDueBucket12AmtDocCurrency) {
		this.pastDueBucket12AmtDocCurrency = pastDueBucket12AmtDocCurrency;
	}
	public String getCurrentOpenAmountDocCurrency() {
		return currentOpenAmountDocCurrency;
	}
	public void setCurrentOpenAmountDocCurrency(String currentOpenAmountDocCurrency) {
		this.currentOpenAmountDocCurrency = currentOpenAmountDocCurrency;
	}
	public String getCurrentOpenAmountLocalCurrency() {
		return currentOpenAmountLocalCurrency;
	}
	public void setCurrentOpenAmountLocalCurrency(String currentOpenAmountLocalCurrency) {
		this.currentOpenAmountLocalCurrency = currentOpenAmountLocalCurrency;
	}
	public BigDecimal getCurrentOpenAmountGlobalCurrency() {
		return currentOpenAmountGlobalCurrency;
	}
	public void setCurrentOpenAmountGlobalCurrency(BigDecimal currentOpenAmountGlobalCurrency) {
		this.currentOpenAmountGlobalCurrency = currentOpenAmountGlobalCurrency;
	}
	public String getGlobalCurrencyForCurrentOpenAmount() {
		return globalCurrencyForCurrentOpenAmount;
	}
	public void setGlobalCurrencyForCurrentOpenAmount(String globalCurrencyForCurrentOpenAmount) {
		this.globalCurrencyForCurrentOpenAmount = globalCurrencyForCurrentOpenAmount;
	}
	public String getFormattedCurrentOpenAmountGlobalCurrency() {
		return formattedCurrentOpenAmountGlobalCurrency;
	}
	public void setFormattedCurrentOpenAmountGlobalCurrency(String formattedCurrentOpenAmountGlobalCurrency) {
		this.formattedCurrentOpenAmountGlobalCurrency = formattedCurrentOpenAmountGlobalCurrency;
	}
	public String getCurrentOpenAmountRolledUpDocCurrency() {
		return currentOpenAmountRolledUpDocCurrency;
	}
	public void setCurrentOpenAmountRolledUpDocCurrency(String currentOpenAmountRolledUpDocCurrency) {
		this.currentOpenAmountRolledUpDocCurrency = currentOpenAmountRolledUpDocCurrency;
	}
	public String getCurrentOpenAmountRolledUpLocalCurrency() {
		return currentOpenAmountRolledUpLocalCurrency;
	}
	public void setCurrentOpenAmountRolledUpLocalCurrency(String currentOpenAmountRolledUpLocalCurrency) {
		this.currentOpenAmountRolledUpLocalCurrency = currentOpenAmountRolledUpLocalCurrency;
	}
	public BigDecimal getCurrentOpenAmountRolledUpGlobalCurrency() {
		return currentOpenAmountRolledUpGlobalCurrency;
	}
	public void setCurrentOpenAmountRolledUpGlobalCurrency(BigDecimal currentOpenAmountRolledUpGlobalCurrency) {
		this.currentOpenAmountRolledUpGlobalCurrency = currentOpenAmountRolledUpGlobalCurrency;
	}
	public String getGlobalCurrencyForRolledUpCurrentOpenAmount() {
		return globalCurrencyForRolledUpCurrentOpenAmount;
	}
	public void setGlobalCurrencyForRolledUpCurrentOpenAmount(String globalCurrencyForRolledUpCurrentOpenAmount) {
		this.globalCurrencyForRolledUpCurrentOpenAmount = globalCurrencyForRolledUpCurrentOpenAmount;
	}
	public String getFormattedRolledUpCurrentOpenAmountGlobalCurrency() {
		return formattedRolledUpCurrentOpenAmountGlobalCurrency;
	}
	public void setFormattedRolledUpCurrentOpenAmountGlobalCurrency(
			String formattedRolledUpCurrentOpenAmountGlobalCurrency) {
		this.formattedRolledUpCurrentOpenAmountGlobalCurrency = formattedRolledUpCurrentOpenAmountGlobalCurrency;
	}
	public String getPastDueAmountDocCurrency() {
		return pastDueAmountDocCurrency;
	}
	public void setPastDueAmountDocCurrency(String pastDueAmountDocCurrency) {
		this.pastDueAmountDocCurrency = pastDueAmountDocCurrency;
	}
	public String getPastDueAmountLocalCurrency() {
		return pastDueAmountLocalCurrency;
	}
	public void setPastDueAmountLocalCurrency(String pastDueAmountLocalCurrency) {
		this.pastDueAmountLocalCurrency = pastDueAmountLocalCurrency;
	}
	public BigDecimal getPastDueAmountGlobalCurrency() {
		return pastDueAmountGlobalCurrency;
	}
	public void setPastDueAmountGlobalCurrency(BigDecimal pastDueAmountGlobalCurrency) {
		this.pastDueAmountGlobalCurrency = pastDueAmountGlobalCurrency;
	}
	public String getGlobalCurrencyForPastDueAmount() {
		return globalCurrencyForPastDueAmount;
	}
	public void setGlobalCurrencyForPastDueAmount(String globalCurrencyForPastDueAmount) {
		this.globalCurrencyForPastDueAmount = globalCurrencyForPastDueAmount;
	}
	public String getFormattedPastDueAmountGlobalCurrency() {
		return formattedPastDueAmountGlobalCurrency;
	}
	public void setFormattedPastDueAmountGlobalCurrency(String formattedPastDueAmountGlobalCurrency) {
		this.formattedPastDueAmountGlobalCurrency = formattedPastDueAmountGlobalCurrency;
	}
	public String getPastDueAmountRolledUpDocCurrency() {
		return pastDueAmountRolledUpDocCurrency;
	}
	public void setPastDueAmountRolledUpDocCurrency(String pastDueAmountRolledUpDocCurrency) {
		this.pastDueAmountRolledUpDocCurrency = pastDueAmountRolledUpDocCurrency;
	}
	public String getPastDueAmountRolledUpLocalCurrency() {
		return pastDueAmountRolledUpLocalCurrency;
	}
	public void setPastDueAmountRolledUpLocalCurrency(String pastDueAmountRolledUpLocalCurrency) {
		this.pastDueAmountRolledUpLocalCurrency = pastDueAmountRolledUpLocalCurrency;
	}
	public BigDecimal getPastDueAmountRolledUpGlobalCurrency() {
		return pastDueAmountRolledUpGlobalCurrency;
	}
	public void setPastDueAmountRolledUpGlobalCurrency(BigDecimal pastDueAmountRolledUpGlobalCurrency) {
		this.pastDueAmountRolledUpGlobalCurrency = pastDueAmountRolledUpGlobalCurrency;
	}
	public String getGlobalCurrencyForRolledUpPastDueAmount() {
		return globalCurrencyForRolledUpPastDueAmount;
	}
	public void setGlobalCurrencyForRolledUpPastDueAmount(String globalCurrencyForRolledUpPastDueAmount) {
		this.globalCurrencyForRolledUpPastDueAmount = globalCurrencyForRolledUpPastDueAmount;
	}
	public String getFormattedRolledUpPastDueAmountGlobalCurrency() {
		return formattedRolledUpPastDueAmountGlobalCurrency;
	}
	public void setFormattedRolledUpPastDueAmountGlobalCurrency(String formattedRolledUpPastDueAmountGlobalCurrency) {
		this.formattedRolledUpPastDueAmountGlobalCurrency = formattedRolledUpPastDueAmountGlobalCurrency;
	}
	public String getTotalOpenAmountDocCurrency() {
		return totalOpenAmountDocCurrency;
	}
	public void setTotalOpenAmountDocCurrency(String totalOpenAmountDocCurrency) {
		this.totalOpenAmountDocCurrency = totalOpenAmountDocCurrency;
	}
	public String getTotalOpenAmountLocalCurrency() {
		return totalOpenAmountLocalCurrency;
	}
	public void setTotalOpenAmountLocalCurrency(String totalOpenAmountLocalCurrency) {
		this.totalOpenAmountLocalCurrency = totalOpenAmountLocalCurrency;
	}
	public BigDecimal getTotalOpenAmountGlobalCurrency() {
		return totalOpenAmountGlobalCurrency;
	}
	public void setTotalOpenAmountGlobalCurrency(BigDecimal totalOpenAmountGlobalCurrency) {
		this.totalOpenAmountGlobalCurrency = totalOpenAmountGlobalCurrency;
	}
	public String getGlobalCurrencyForTotalOpenAmount() {
		return globalCurrencyForTotalOpenAmount;
	}
	public void setGlobalCurrencyForTotalOpenAmount(String globalCurrencyForTotalOpenAmount) {
		this.globalCurrencyForTotalOpenAmount = globalCurrencyForTotalOpenAmount;
	}
	public String getFormattedTotalOpenAmountGlobalCurrency() {
		return formattedTotalOpenAmountGlobalCurrency;
	}
	public void setFormattedTotalOpenAmountGlobalCurrency(String formattedTotalOpenAmountGlobalCurrency) {
		this.formattedTotalOpenAmountGlobalCurrency = formattedTotalOpenAmountGlobalCurrency;
	}
	public String getTotalOpenAmountRolledUpDocCurrency() {
		return totalOpenAmountRolledUpDocCurrency;
	}
	public void setTotalOpenAmountRolledUpDocCurrency(String totalOpenAmountRolledUpDocCurrency) {
		this.totalOpenAmountRolledUpDocCurrency = totalOpenAmountRolledUpDocCurrency;
	}
	public String getTotalOpenAmountRolledUpLocalCurrency() {
		return totalOpenAmountRolledUpLocalCurrency;
	}
	public void setTotalOpenAmountRolledUpLocalCurrency(String totalOpenAmountRolledUpLocalCurrency) {
		this.totalOpenAmountRolledUpLocalCurrency = totalOpenAmountRolledUpLocalCurrency;
	}
	public BigDecimal getTotalOpenAmountRolledUpGlobalCurrency() {
		return totalOpenAmountRolledUpGlobalCurrency;
	}
	public void setTotalOpenAmountRolledUpGlobalCurrency(BigDecimal totalOpenAmountRolledUpGlobalCurrency) {
		this.totalOpenAmountRolledUpGlobalCurrency = totalOpenAmountRolledUpGlobalCurrency;
	}
	public String getGlobalCurrencyForRolledUpTotalOpenAmount() {
		return globalCurrencyForRolledUpTotalOpenAmount;
	}
	public void setGlobalCurrencyForRolledUpTotalOpenAmount(String globalCurrencyForRolledUpTotalOpenAmount) {
		this.globalCurrencyForRolledUpTotalOpenAmount = globalCurrencyForRolledUpTotalOpenAmount;
	}
	public String getFormattedRolledUpTotalOpenAmountGlobalCurrency() {
		return formattedRolledUpTotalOpenAmountGlobalCurrency;
	}
	public void setFormattedRolledUpTotalOpenAmountGlobalCurrency(String formattedRolledUpTotalOpenAmountGlobalCurrency) {
		this.formattedRolledUpTotalOpenAmountGlobalCurrency = formattedRolledUpTotalOpenAmountGlobalCurrency;
	}
	
	// adding transient variables for amounts in currencies for correspondence ends
	
	}
	


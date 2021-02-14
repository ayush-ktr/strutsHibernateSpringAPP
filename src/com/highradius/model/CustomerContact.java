package com.highradius.model;

public class CustomerContact {

	private Integer pkCustomerContactId;
	private Integer accountId;
	private Integer fkDataTypeId;
	private String productDataTypeName;
	private String moduleName;
	private String customerName;
	private Integer fkCustomerMapId;
    private String firstName;
    private String lastName;
	private String department;
    private String role;
    private String emailId;
    private String phoneBusiness;
    private String phoneBusinessNorm;
    private String phoneMobile;
    private String phoneMobileNorm;
    private String phoneExtension;
    private String phoneBusinessExtensionNorm;
    private String phoneMobileExtensionNorm;
	private String address;
    private String fax;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String notes;
    private Integer corrRepicientRoleId;
    private Boolean isCampaignEligible=true;
    /*private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;*/
    private String isDefaultDisplay;
    private String recipientRoleName;
    private String recipientRoleNameLang;
    private String recipientRoleDesc;
    private String recipientRoleDescLang;
    private Integer contactTypeId;
    private String contactTypeName;
    private String title;
    private boolean createUserForContact ;
    private Integer fkSecurityRoleId ;
    private Integer fkUserId ;
    private boolean deleted;
    private String timeZone = null ;
    private String functionalRoleId = null ;
    private String source;
    private String referenceField1;
    private String referenceField2;
    private String referenceField3;
    private String referenceField4;
    private String referenceField5;
    private String fullName;
    private String countryCode;
    private String invContact;
	public Integer getPkCustomerContactId() {
		return pkCustomerContactId;
	}
	public void setPkCustomerContactId(Integer pkCustomerContactId) {
		this.pkCustomerContactId = pkCustomerContactId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getFkDataTypeId() {
		return fkDataTypeId;
	}
	public void setFkDataTypeId(Integer fkDataTypeId) {
		this.fkDataTypeId = fkDataTypeId;
	}
	public String getProductDataTypeName() {
		return productDataTypeName;
	}
	public void setProductDataTypeName(String productDataTypeName) {
		this.productDataTypeName = productDataTypeName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getFkCustomerMapId() {
		return fkCustomerMapId;
	}
	public void setFkCustomerMapId(Integer fkCustomerMapId) {
		this.fkCustomerMapId = fkCustomerMapId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneBusiness() {
		return phoneBusiness;
	}
	public void setPhoneBusiness(String phoneBusiness) {
		this.phoneBusiness = phoneBusiness;
	}
	public String getPhoneMobile() {
		return phoneMobile;
	}
	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneBusinessNorm() {
		return phoneBusinessNorm;
	}
	public void setPhoneBusinessNorm(String phoneBusinessNorm) {
		this.phoneBusinessNorm = phoneBusinessNorm;
	}
	public String getPhoneMobileNorm() {
		return phoneMobileNorm;
	}
	public void setPhoneMobileNorm(String phoneMobileNorm) {
		this.phoneMobileNorm = phoneMobileNorm;
	}
	public String getPhoneExtension() {
		return phoneExtension;
	}
	public void setPhoneExtension(String phoneExtension) {
		this.phoneExtension = phoneExtension;
	}
	public String getPhoneBusinessExtensionNorm() {
		return phoneBusinessExtensionNorm;
	}
	public void setPhoneBusinessExtensionNorm(String phoneBusinessExtensionNorm) {
		this.phoneBusinessExtensionNorm = phoneBusinessExtensionNorm;
	}
	public String getPhoneMobileExtensionNorm() {
		return phoneMobileExtensionNorm;
	}
	public void setPhoneMobileExtensionNorm(String phoneMobileExtensionNorm) {
		this.phoneMobileExtensionNorm = phoneMobileExtensionNorm;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Integer getCorrRepicientRoleId() {
		return corrRepicientRoleId;
	}
	public void setCorrRepicientRoleId(Integer corrRepicientRoleId) {
		this.corrRepicientRoleId = corrRepicientRoleId;
	}
	public Boolean getIsCampaignEligible() {
		return isCampaignEligible;
	}
	public void setIsCampaignEligible(Boolean isCampaignEligible) {
		this.isCampaignEligible = isCampaignEligible;
	}
	public String getIsDefaultDisplay() {
		return isDefaultDisplay;
	}
	public void setIsDefaultDisplay(String isDefaultDisplay) {
		this.isDefaultDisplay = isDefaultDisplay;
	}
	public String getRecipientRoleName() {
		return recipientRoleName;
	}
	public void setRecipientRoleName(String recipientRoleName) {
		this.recipientRoleName = recipientRoleName;
	}
	public String getRecipientRoleNameLang() {
		return recipientRoleNameLang;
	}
	public void setRecipientRoleNameLang(String recipientRoleNameLang) {
		this.recipientRoleNameLang = recipientRoleNameLang;
	}
	public String getRecipientRoleDesc() {
		return recipientRoleDesc;
	}
	public void setRecipientRoleDesc(String recipientRoleDesc) {
		this.recipientRoleDesc = recipientRoleDesc;
	}
	public String getRecipientRoleDescLang() {
		return recipientRoleDescLang;
	}
	public void setRecipientRoleDescLang(String recipientRoleDescLang) {
		this.recipientRoleDescLang = recipientRoleDescLang;
	}
	public Integer getContactTypeId() {
		return contactTypeId;
	}
	public void setContactTypeId(Integer contactTypeId) {
		this.contactTypeId = contactTypeId;
	}
	public String getContactTypeName() {
		return contactTypeName;
	}
	public void setContactTypeName(String contactTypeName) {
		this.contactTypeName = contactTypeName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCreateUserForContact() {
		return createUserForContact;
	}
	public void setCreateUserForContact(boolean createUserForContact) {
		this.createUserForContact = createUserForContact;
	}
	public Integer getFkSecurityRoleId() {
		return fkSecurityRoleId;
	}
	public void setFkSecurityRoleId(Integer fkSecurityRoleId) {
		this.fkSecurityRoleId = fkSecurityRoleId;
	}
	public Integer getFkUserId() {
		return fkUserId;
	}
	public void setFkUserId(Integer fkUserId) {
		this.fkUserId = fkUserId;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getFunctionalRoleId() {
		return functionalRoleId;
	}
	public void setFunctionalRoleId(String functionalRoleId) {
		this.functionalRoleId = functionalRoleId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getReferenceField1() {
		return referenceField1;
	}
	public void setReferenceField1(String referenceField1) {
		this.referenceField1 = referenceField1;
	}
	public String getReferenceField2() {
		return referenceField2;
	}
	public void setReferenceField2(String referenceField2) {
		this.referenceField2 = referenceField2;
	}
	public String getReferenceField3() {
		return referenceField3;
	}
	public void setReferenceField3(String referenceField3) {
		this.referenceField3 = referenceField3;
	}
	public String getReferenceField4() {
		return referenceField4;
	}
	public void setReferenceField4(String referenceField4) {
		this.referenceField4 = referenceField4;
	}
	public String getReferenceField5() {
		return referenceField5;
	}
	public void setReferenceField5(String referenceField5) {
		this.referenceField5 = referenceField5;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getInvContact() {
		return invContact;
	}
	public void setInvContact(String invContact) {
		this.invContact = invContact;
	}
    
    
}

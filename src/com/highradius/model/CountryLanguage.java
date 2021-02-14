package com.highradius.model;

public class CountryLanguage {
	private Country countryCode;
	private String language;
	private IsOfficial isOfficial;
	private Float percentage;
	public Country getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Country countryCode) {
		this.countryCode = countryCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public IsOfficial getIsOfficial() {
		return isOfficial;
	}
	public void setIsOfficial(IsOfficial isOfficial) {
		this.isOfficial = isOfficial;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	
}

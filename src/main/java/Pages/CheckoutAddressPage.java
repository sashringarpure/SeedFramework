package Pages;

import java.util.Map;

public class CheckoutAddressPage {
	
	private Map<String,String> checkoutAddressPageDomElements;
	private Map<String,String> checkoutAddressPageTestData;
	private String webElementBillingFirstName;
	private String webElementBillingLastName;
	private String webElementBillingCompany;
	private String webElementBillingAddress1;
	private String webElementBillingAddress2;
	private String webElementBillingCountry;
	private String webElementBillingCity;
	private String webElementBillingState;
	private String webElementBillingZip;
	private String webElementBillingPhone;
	private String webElementBillingEmail;
	private String webElementShippingFirstName;
	private String webElementShippingLastName;
	private String webElementShippingCompany;
	private String webElementShippingAddress1;
	private String webElementShippingAddress2;
	private String webElementShippingCountry;
	private String webElementShippingCity;
	private String webElementShippingState;
	private String webElementShippingZip;
	private String webElementShippingPhone;
	private String webElementShippingEmail;
	private String webElementContinueCheckout;
	private String webElementBillingShippingCheckBox;
	private String webElementSuggestedAddressRadioButton;
	private String webElementOriginalAddressRadioButton;
	private String webElementContinue;
	private String webElementEditAddress;
	private String webElementNotFoundEditAddress;
	private String webElementNotFoundCountinueAddress;
	
	private String testDataBillingFirstName;
	private String testDataBillingLastName;
	private String testDataBillingCompany;
	private String testDataBillingAddress1;
	private String testDataBillingAddress2;
	private String testDataBillingCountry;
	private String testDataBillingCity;
	private String testDataBillingState;
	private String testDataBillingZip;
	private String testDataBillingPhone;
	private String testDataBillingEmail;
	private String testDataShippingFirstName;
	private String testDataShippingLastName;
	private String testDataShippingCompany;
	private String testDataShippingAddress1;
	private String testDataShippingAddress2;
	private String testDataShippingCountry;
	private String testDataShippingCity;
	private String testDataShippingState;
	private String testDataShippingZip;
	private String testDataShippingPhone;
	private String testDataShippingEmail;
	
	public void setDomElements(Map<String,String> data) {
		this.checkoutAddressPageDomElements = data;
	}
	
	public void setTestData(Map<String,String> data) {
		this.checkoutAddressPageTestData = data;
	}
	
	public void setBillingFirstName(String key) {
		this.webElementBillingFirstName = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingLastName(String key) {
		this.webElementBillingLastName = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingCompany(String key) {
		this.webElementBillingCompany = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingAddress1(String key) {
		this.webElementBillingAddress1 = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingAddress2(String key) {
		this.webElementBillingAddress2 = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingCountry(String key) {
		this.webElementBillingCountry = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingCity(String key) {
		this.webElementBillingCity = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingState(String key) {
		this.webElementBillingState = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingZip(String key) {
		this.webElementBillingZip = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingPhone(String key) {
		this.webElementBillingPhone = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingEmail(String key) {
		this.webElementBillingEmail = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingFirstName(String key) {
		this.webElementShippingFirstName = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingLastName(String key) {
		this.webElementShippingLastName = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingCompany(String key) {
		this.webElementShippingCompany = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingAddress1(String key) {
		this.webElementShippingAddress1 = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingAddress2(String key) {
		this.webElementShippingAddress2 = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingCountry(String key) {
		this.webElementShippingCountry = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingCity(String key) {
		this.webElementShippingCity = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingState(String key) {
		this.webElementShippingState = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingZip(String key) {
		this.webElementShippingZip = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingPhone(String key) {
		this.webElementShippingPhone = checkoutAddressPageDomElements.get(key);
	}
	
	public void setShippingEmail(String key) {
		this.webElementShippingEmail = checkoutAddressPageDomElements.get(key);
	}
	
	public void setContinueCheckout(String key) {
		this.webElementContinueCheckout = checkoutAddressPageDomElements.get(key);
	}
	
	public void setBillingShippingCheckBox(String key) {
		this.webElementBillingShippingCheckBox = checkoutAddressPageDomElements.get(key);
	}
	
	public void setSuggestedAddress(String key) {
		this.webElementSuggestedAddressRadioButton = checkoutAddressPageDomElements.get(key);
	}
	
	public void setOriginalAddress(String key) {
		this.webElementOriginalAddressRadioButton = checkoutAddressPageDomElements.get(key);
	}
	
	public void setContinue(String key) {
		this.webElementContinue = checkoutAddressPageDomElements.get(key);
	}
	
	public void setEditAddress(String key) {
		this.webElementEditAddress = checkoutAddressPageDomElements.get(key);
	}
	
	public void setNotFoundEditAddress(String key) {
		this.webElementNotFoundEditAddress = checkoutAddressPageDomElements.get(key);
	}
	
	public void setNotFoundContinueAddress(String key) {
		this.webElementNotFoundCountinueAddress = checkoutAddressPageDomElements.get(key);
	}
	
	/*  Getter Functions  */
	
	public String getBillingFirstName() {
		return this.webElementBillingFirstName;
	}
	
	public String getBillingLastName() {
		return this.webElementBillingLastName;
	}
	
	public String getBillingCompany() {
		return this.webElementBillingCompany;
	}
	
	public String getBillingAddress1() {
		return this.webElementBillingAddress1;
	}
	
	public String getBillingAddress2() {
		return this.webElementBillingAddress2;
	}
	
	public String getBillingCountry() {
		return this.webElementBillingCountry;
	}
	
	public String getBillingCity() {
		return this.webElementBillingCity;
	}
	
	public String getBillingState() {
		return this.webElementBillingState;
	}
	
	public String getBillingZip() {
		return this.webElementBillingZip;
	}
	
	public String getBillingPhone() {
		return this.webElementBillingPhone;
	}
	
	public String getBillingEmail() {
		return this.webElementBillingEmail;
	}
	
	public String getShippingFirstName() {
		return this.webElementShippingFirstName;
	}
	
	public String getShippingLastName() {
		return this.webElementShippingLastName;
	}
	
	public String getShippingCompany() {
		return this.webElementShippingCompany;
	}
	
	public String getShippingAddress1() {
		return this.webElementShippingAddress1;
	}
	
	public String getShippingAddress2() {
		return this.webElementShippingAddress2;
	}
	
	public String getShippingCountry() {
		return this.webElementShippingCountry;
	}
	
	public String getShippingCity() {
		return this.webElementShippingCity;
	}
	
	public String getShippingState() {
		return this.webElementShippingState;
	}
	
	public String getShippingZip() {
		return this.webElementShippingZip;
	}
	
	public String getShippingPhone() {
		return this.webElementShippingPhone;
	}
	
	public String getShippingEmail() {
		return this.webElementShippingEmail;
	}
	
	public Map<String,String> getDomElements() {
		return this.checkoutAddressPageDomElements;
	}
	
	public Map<String,String> getTestData() {
		return this.checkoutAddressPageTestData;
	}
	
	public String getContinueCheckout() {
		return this.webElementContinueCheckout;
	}
	
	public String getSuggestedAddress() {
		return this.webElementSuggestedAddressRadioButton;
	}
	
	public String getOriginalAddress() {
		return this.webElementOriginalAddressRadioButton;
	}
	
	public String getContinue() {
		return this.webElementContinue;
	}
	
	public String getEditAddress() {
		return this.webElementEditAddress;
	}
	
	public String getNotFoundEditAddress() {
		return this.webElementNotFoundEditAddress;
	}
	
	public String getNotFoundContinueAddress() {
		return this.webElementNotFoundCountinueAddress;
	}
	
	/** 
	 * Test Data 
	 * **/
	public void setTestDataBillingFirstName(String key) {
		this.testDataBillingFirstName = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingLastName(String key) {
		this.testDataBillingLastName = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingCompany(String key) {
		this.testDataBillingCompany = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingAddress1(String key) {
		this.testDataBillingAddress1 = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingAddress2(String key) {
		this.testDataBillingAddress2 = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingCountry(String key) {
		this.testDataBillingCountry = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingCity(String key) {
		this.testDataBillingCity = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingState(String key) {
		this.testDataBillingState = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataBillingZip(String key) {
		this.testDataBillingZip = String.valueOf(checkoutAddressPageTestData.get(key));
	}
	
	public void setTestDataBillingPhone(String key) {
		this.testDataBillingPhone = String.valueOf(checkoutAddressPageTestData.get(key));
	}
	
	public void setTestDataBillingEmail(String key) {
		this.testDataBillingEmail = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingFirstName(String key) {
		this.testDataShippingFirstName = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingLastName(String key) {
		this.testDataShippingLastName = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingCompany(String key) {
		this.testDataShippingCompany = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingAddress1(String key) {
		this.testDataShippingAddress1 = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingAddress2(String key) {
		this.testDataShippingAddress2 = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingCountry(String key) {
		this.testDataShippingCountry = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingCity(String key) {
		this.testDataShippingCity = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingState(String key) {
		this.testDataShippingState = checkoutAddressPageTestData.get(key);
	}
	
	public void setTestDataShippingZip(String key) {
		this.testDataShippingZip = String.valueOf(checkoutAddressPageTestData.get(key));
	}
	
	public void setTestDataShippingPhone(String key) {
		this.testDataShippingPhone = String.valueOf(checkoutAddressPageTestData.get(key));
	}
	
	public void setTestDataShippingEmail(String key) {
		this.testDataShippingEmail = checkoutAddressPageTestData.get(key);
	}
	
	public String getTestDataBillingFirstName() {
		return this.testDataBillingFirstName;
	}
	
	public String getTestDataBillingLastName() {
		return this.testDataBillingLastName;
	}
	
	public String getTestDataBillingCompany() {
		return this.testDataBillingCompany;
	}
	
	public String getTestDataBillingAddress1() {
		return this.testDataBillingAddress1;
	}
	
	public String getTestDataBillingAddress2() {
		return this.testDataBillingAddress2;
	}
	
	public String getTestDataBillingCountry() {
		return this.testDataBillingCountry;
	}
	
	public String getTestDataBillingCity() {
		return this.testDataBillingCity;
	}
	
	public String getTestDataBillingState() {
		return this.testDataBillingState;
	}
	
	public String getTestDataBillingZip() {
		return this.testDataBillingZip;
	}
	
	public String getTestDataBillingPhone() {
		return this.testDataBillingPhone;
	}
	
	public String getTestDataBillingEmail() {
		return this.testDataBillingEmail;
	}
	
	public String getTestDataShippingFirstName() {
		return this.testDataShippingFirstName;
	}
	
	public String getTestDataShippingLastName() {
		return this.testDataShippingLastName;
	}
	
	public String getTestDataShippingCompany() {
		return this.testDataShippingCompany;
	}
	
	public String getTestDataShippingAddress1() {
		return this.testDataShippingAddress1;
	}
	
	public String getTestDataShippingAddress2() {
		return this.testDataShippingAddress2;
	}
	
	public String getTestDataShippingCountry() {
		return this.testDataShippingCountry;
	}
	
	public String getTestDataShippingCity() {
		return this.testDataShippingCity;
	}
	
	public String getTestDataShippingState() {
		return this.testDataShippingState;
	}
	
	public String getTestDataShippingZip() {
		return this.testDataShippingZip;
	}
	
	public String getTestDataShippingPhone() {
		return this.testDataShippingPhone;
	}
	
	public String getTestDataShippingEmail() {
		return this.testDataShippingEmail;
	}
	
	public String getBillingShippingCheckBox() {
		return this.webElementBillingShippingCheckBox;
	}
	
}

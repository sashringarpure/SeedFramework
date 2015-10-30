package Pages;

import java.util.Map;

public class CheckoutPaymentPage {
	
	private Map<String,String> checkoutPaymentPageDomElements;
	private Map<String,String> checkoutPaymentPageTestData;
	private String webElementCreditCardNumber;
	private String webElementExpiryMonth;
	private String webElementExpiryYear;
	private String webElementSecurityCode;
	private String webElementSubmitPayment;
	
	private String testDataCreditCardNumber;
	private String testDataExpiryMonth;
	private String testDataExpiryYear;
	private String testDataSecurityCode;
	
	public void setDomElements(Map<String,String> data) {
		this.checkoutPaymentPageDomElements = data;
	}
	
	public void setTestData(Map<String,String> data) {
		this.checkoutPaymentPageTestData = data;
	}
	
	public void setWebElementCreditCardNumber(String key) {
		this.webElementCreditCardNumber = checkoutPaymentPageDomElements.get(key);
	}
	
	public void setWebElementExpiryMonth(String key) {
		this.webElementExpiryMonth = checkoutPaymentPageDomElements.get(key);
	}
	
	public void setWebElementExpiryYear(String key) {
		this.webElementExpiryYear = checkoutPaymentPageDomElements.get(key);
	}
	
	public void setWebElementSecurityCode(String key) {
		this.webElementSecurityCode = checkoutPaymentPageDomElements.get(key);
	}
	
	public void setWebElementSubmitPayment(String key) {
		this.webElementSubmitPayment = checkoutPaymentPageDomElements.get(key);
	}
	
	public void setTestDataCreditCardNumber(String key) {
		this.testDataCreditCardNumber = String.valueOf(checkoutPaymentPageTestData.get(key));
	}
	
	public void setTestDataExpiryMonth(String key) {
		this.testDataExpiryMonth = String.valueOf(checkoutPaymentPageTestData.get(key));
	}
	
	public void setTestDataExpiryYear(String key) {
		this.testDataExpiryYear = String.valueOf(checkoutPaymentPageTestData.get(key));
	}
	
	public void setTestDataSecurityCode(String key) {
		this.testDataSecurityCode = String.valueOf(checkoutPaymentPageTestData.get(key));
	}
	
	public String getWebElementCreditCardNumber() {
		return this.webElementCreditCardNumber;
	}
	
	public String getWebElementExpiryMonth() {
		return this.webElementExpiryMonth;
	}
	
	public String getWebElementExpiryYear() {
		return this.webElementExpiryYear;
	}
	
	public String getWebElementSecurityCode() {
		return this.webElementSecurityCode;
	}
	
	public String getWebElementSubmitPayment() {
		return this.webElementSubmitPayment;
	}
	
	public String getTestDataCreditCardNumber() {
		return this.testDataCreditCardNumber;
	}
	
	public String getTestDataExpiryMonth() {
		return this.testDataExpiryMonth;
	}
	
	public String getTestDataExpiryYear() {
		return this.testDataExpiryYear;
	}
	
	public String getTestDataSecurityCode() {
		return this.testDataSecurityCode;
	}
	
	public Map<String,String> getPageDomElements() {
		return this.checkoutPaymentPageDomElements;
	}
	
	public Map<String,String> getPageTestData() {
		return this.checkoutPaymentPageTestData;
	}
	

}

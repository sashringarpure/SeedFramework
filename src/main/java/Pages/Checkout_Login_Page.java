package Pages;

import java.util.Map;


public class Checkout_Login_Page {

	private Map<String, String> checkoutLoginPageDomElements;
	private String checkoutAsGuest;
	
	public Checkout_Login_Page() {
		this.checkoutLoginPageDomElements = null;
		this.checkoutAsGuest = null;
	}
	
	public void setDomElements(Map<String,String> data) {
		this.checkoutLoginPageDomElements = data;
	}
	
	public void setCheckoutAsGuest(String key) {
		this.checkoutAsGuest = checkoutLoginPageDomElements.get(key);
	}
	
	public String getCheckoutAsGuest() {
		return this.checkoutAsGuest;
	}

}

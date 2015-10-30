package Pages;

import java.util.Map;


public class ShoppingCartPage {

	private Map<String, String> shoppingCartPageDomElements;
	private String secureCheckoutNow;
	
	public ShoppingCartPage() {
		this.shoppingCartPageDomElements = null;
		this.secureCheckoutNow = null;
	}
	
	public void setDomElements(Map<String,String> data) {
		this.shoppingCartPageDomElements = data;
	}
	
	public void setSecureCheckoutNow(String key) {
		this.secureCheckoutNow = shoppingCartPageDomElements.get(key);
	}
	
	public String getSecureCheckoutNow() {
		return this.secureCheckoutNow;
	}

}

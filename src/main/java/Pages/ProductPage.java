package Pages;

import java.util.Map;

public class ProductPage {

	private Map<String, String> productPageDomElements;
	private String addToCart;
	private String checkoutNow;
	private String headerCartCheckout;
	private String closeMiniBag;
	private String smallSize;
	private String mediumSize;
	private String largeSize;
	private String xlargeSize;
	private String xxlargeSize;
	private String xxxlargeSize;
	private String xxxxlargeSize;
	private String xxxxxlargeSize;
	
	public ProductPage() {
		this.productPageDomElements = null;
		this.checkoutNow = null;
		this.addToCart = null;
		this.headerCartCheckout = null;
		this.closeMiniBag = null;
		this.smallSize = null;
		this.mediumSize = null;
		this.largeSize = null;
		this.xlargeSize = null;
		this.xxlargeSize = null;
		this.xxxlargeSize = null;
		this.xxxxlargeSize = null;
		this.xxxxxlargeSize = null;
	}
	
	public void setDomElements(Map<String,String> data) {
		this.productPageDomElements = data;
	}
	
	public void setAddToCart(String key) {
		this.addToCart = productPageDomElements.get(key);
	}
	
	public String getAddToCart() {
		return this.addToCart;
	}
	
	public void setCheckoutNow(String key) {
		this.checkoutNow = productPageDomElements.get(key);
	}
	
	public String getCheckoutNow() {
		return this.checkoutNow;
	}
	
	public void setHeaderCartCheckout(String key) {
		this.headerCartCheckout = productPageDomElements.get(key);
	}
	
	public String getHeaderCartCheckout() {
		return this.headerCartCheckout;
	}
	
	public void setCloseMiniBag(String key) {
		this.closeMiniBag = productPageDomElements.get(key);
	}
	
	public String getCloseMiniBag() {
		return this.closeMiniBag;
	}
	
	public void setSmallSize(String key) {
		this.smallSize = productPageDomElements.get(key);
	}
	
	public String getSmallSize() {
		return this.smallSize;
	}
	
	public void setMediumSize(String key) {
		this.mediumSize = productPageDomElements.get(key);
	}
	
	public String getMediumSize() {
		return this.mediumSize;
	}
	
	public void setLargeSize(String key) {
		this.largeSize = productPageDomElements.get(key);
	}
	
	public String getLargeSize() {
		return this.largeSize;
	}
	
	public void setxlargeSize(String key) {
		this.xlargeSize = productPageDomElements.get(key);
	}
	
	public String getxlargeSize() {
		return this.xlargeSize;
	}
	
	public void setxxlargeSize(String key) {
		this.xxlargeSize = productPageDomElements.get(key);
	}
	
	public String getxxlargeSize() {
		return this.xxlargeSize;
	}
	
	public void setxxxlargeSize(String key) {
		this.xxxlargeSize = productPageDomElements.get(key);
	}
	
	public String getxxxlargeSize() {
		return this.xxxlargeSize;
	}
	
	public void setxxxxlargeSize(String key) {
		this.xxxxlargeSize = productPageDomElements.get(key);
	}
	
	public String getxxxxlargeSize() {
		return this.xxxxlargeSize;
	}
	
	public void setxxxxxlargeSize(String key) {
		this.xxxxxlargeSize = productPageDomElements.get(key);
	}
	
	public String getxxxxxlargeSize() {
		return this.xxxxxlargeSize;
	}

}

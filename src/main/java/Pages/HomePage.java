package Pages;

import java.util.ArrayList;


public class HomePage {

	private String qaEnv;
	private String productUrl;
	private ArrayList<String> partnerEnv;
	private ArrayList<String> browser;
	
	public HomePage() {}
	
	public void setQaEnv(String env) {
		this.qaEnv = env;
	}
	
	public String getQaEnv() {
		return this.qaEnv;
	}
	
	public void setPartnerEnv(ArrayList<String> env) {
		this.partnerEnv = env;
	}
	
	public void setBrowser(ArrayList<String> browser) {
		this.browser = browser;
	}
	
	public ArrayList<String> getBrowser() {
		return this.browser;
	}
	
	public ArrayList<String> getPartnerEnv() {
		return this.partnerEnv;
	}
	
	public void setProductUrl(String url) {
		this.productUrl = url;
	}
	
	public String getProductUrl() {
		return this.productUrl;
	}

}

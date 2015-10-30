package Flows;

import java.io.FileNotFoundException;

import EcomConstants.Ecom_Constants;
import Pages.Ecom;

import com.fanatics.seed.SeedFramework;

public class CheckoutLoginPageFlow {
	
	public CheckoutLoginPageFlow() {}
	
	public void setCheckoutLoginPageDomElements(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId) {
		
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom == null) 
				System.out.println("ecom is null");
			ecom.getCheckoutLoginPage().setDomElements(seedFramework.getSnakeYaml().getDomElementsFromYamlFile(filePath, env, partnerId));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
	
		ecom.getCheckoutLoginPage().setCheckoutAsGuest(Ecom_Constants.checkoutAsGuest);
		
	}
	
	public void clickGuestCheckout(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementById(ecom.getCheckoutLoginPage().getCheckoutAsGuest()));
		seedFramework.getElement().clickParentElement();
	}

}

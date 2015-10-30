package Flows;

import java.io.FileNotFoundException;

import EcomConstants.Ecom_Constants;
import Pages.Ecom;

import com.fanatics.seed.SeedFramework;

public class ShoppingCartPageFlow {
	
	public ShoppingCartPageFlow() {}
	
	public void setShoppingCartPageDomElements(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId) {
		
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom == null) 
				System.out.println("ecom is null");
			ecom.getShoppingCartPage().setDomElements(seedFramework.getSnakeYaml().getDomElementsFromYamlFile(filePath, env, partnerId));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
		
		ecom.getShoppingCartPage().setSecureCheckoutNow(Ecom_Constants.secureCheckout);
	}
	
	public void clickSecureCheckout(SeedFramework seedFramework, Ecom ecom) {
		if (seedFramework.getCDriver().getNumberOfElementsByXpath(ecom.getShoppingCartPage().getSecureCheckoutNow()) > 0) {
			  seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getShoppingCartPage().getSecureCheckoutNow()));
			  seedFramework.getElement().clickParentElement();
			}
	}

}

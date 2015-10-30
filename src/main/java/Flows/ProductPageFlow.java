package Flows;

import java.io.FileNotFoundException;

import EcomConstants.Ecom_Constants;
import Pages.Ecom;

import com.fanatics.seed.SeedFramework;

public class ProductPageFlow {
	
	public ProductPageFlow() {}
	
public void setProductPageDomElements(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId) {
		
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom == null) 
				System.out.println("ecom is null");
			ecom.getProductPage().setDomElements(seedFramework.getSnakeYaml().getDomElementsFromYamlFile(filePath, env, partnerId));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
		
		ecom.getProductPage().setAddToCart(Ecom_Constants.addToCartLocator);
		ecom.getProductPage().setCheckoutNow(Ecom_Constants.checkoutNowLocator);
		ecom.getProductPage().setHeaderCartCheckout(Ecom_Constants.headerCartCheckout);
		ecom.getProductPage().setCloseMiniBag(Ecom_Constants.closeMiniBag);
		ecom.getProductPage().setSmallSize(Ecom_Constants.smallSize);
		ecom.getProductPage().setMediumSize(Ecom_Constants.mediumSize);
		ecom.getProductPage().setLargeSize(Ecom_Constants.largeSize);
		ecom.getProductPage().setxlargeSize(Ecom_Constants.xlargeSize);
		ecom.getProductPage().setxxlargeSize(Ecom_Constants.xxlargeSize);
		ecom.getProductPage().setxxxlargeSize(Ecom_Constants.xxxlargeSize);
		ecom.getProductPage().setxxxxlargeSize(Ecom_Constants.xxxxlargeSize);
		ecom.getProductPage().setxxxxxlargeSize(Ecom_Constants.xxxxxlargeSize);
}

public void addItemToCart(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getAddToCart()));
	seedFramework.getElement().clickParentElement();
}

public void closeMiniBag(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getCloseMiniBag()));
	seedFramework.getElement().clickParentElement();
}

public void startCheckout(SeedFramework seedFramework, Ecom ecom) {
	if (seedFramework.getCDriver().getNumberOfElementsByXpath(ecom.getProductPage().getCheckoutNow()) > 0) {
		//webElement.setParentElement(this.explicitWait.ElementToBeClickableByXpath("//*[@class='mbTopButtonsContainer']/child::a[2]"));
	//System.out.println(productPage.getCheckoutNow());
	seedFramework.getElement().setParentElement(seedFramework.getCDriver().findElementByFluentWaitAndXPath(ecom.getProductPage().getCheckoutNow()));
	seedFramework.getElement().clickParentElement();
	} else {
		seedFramework.getElement().setParentElement(seedFramework.getCDriver().findElementByFluentWaitAndXPath(ecom.getProductPage().getHeaderCartCheckout()));
		seedFramework.getElement().clickParentElement();
	}
}

public void selectSmallSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getSmallSize()));
	seedFramework.getElement().clickParentElement();
}

public void selectMediumSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getMediumSize()));
	seedFramework.getElement().clickParentElement();
}

public void selectLargeSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getLargeSize()));
	seedFramework.getElement().clickParentElement();
}

public void selectxlargeSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getxlargeSize()));
	seedFramework.getElement().clickParentElement();
}

public void selectxxlargeSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getxxlargeSize()));
	seedFramework.getElement().clickParentElement();
}

public void selectxxxlargeSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getxxxlargeSize()));
	seedFramework.getElement().clickParentElement();
}

public void selectxxxxlargeSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getxxxxlargeSize()));
	seedFramework.getElement().clickParentElement();
}

public void selectxxxxxlargeSize(SeedFramework seedFramework, Ecom ecom) {
	seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getProductPage().getxxxxxlargeSize()));
	seedFramework.getElement().clickParentElement();
}

}

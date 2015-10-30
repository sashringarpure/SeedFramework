package Flows;

import java.io.FileNotFoundException;

import EcomConstants.Ecom_Constants;
import Pages.Ecom;

import com.fanatics.seed.SeedFramework;

public class CheckoutPaymentPageFlow {
	
	public CheckoutPaymentPageFlow() {}
	
	public void setCheckoutPaymentPageDomElements(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId) {
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom == null) 
				System.out.println("ecom is null");
			ecom.getCheckoutPaymentPage().setDomElements(seedFramework.getSnakeYaml().getDomElementsFromYamlFile(filePath, env, partnerId));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
		ecom.getCheckoutPaymentPage().setWebElementCreditCardNumber(Ecom_Constants.creditCardNumber);
		ecom.getCheckoutPaymentPage().setWebElementExpiryMonth(Ecom_Constants.expiryMonth);
		ecom.getCheckoutPaymentPage().setWebElementExpiryYear(Ecom_Constants.expiryYear);
		ecom.getCheckoutPaymentPage().setWebElementSecurityCode(Ecom_Constants.securityCode);
		ecom.getCheckoutPaymentPage().setWebElementSubmitPayment(Ecom_Constants.submitPayment);
	}
	
	public void setCheckoutPaymentPageTestData(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId, String testDataType) {
		
		try {
			ecom.getCheckoutPaymentPage().setTestData(seedFramework.getSnakeYaml().getTestDataFromYamlFile(filePath, env, partnerId, testDataType));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
		
		ecom.getCheckoutPaymentPage().setTestDataCreditCardNumber(Ecom_Constants.testDataCreditCardNumber);
		ecom.getCheckoutPaymentPage().setTestDataExpiryMonth(Ecom_Constants.testDataExpiryMonth);
		ecom.getCheckoutPaymentPage().setTestDataExpiryYear(Ecom_Constants.testDataExpiryYear);
		ecom.getCheckoutPaymentPage().setTestDataSecurityCode(Ecom_Constants.testDataSecurityCode);
		
	}
	
	public void enterCreditCardInfo(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutPaymentPage().getWebElementCreditCardNumber()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutPaymentPage().getTestDataCreditCardNumber());
		seedFramework.getDropDown().setSelect(seedFramework.getCDriver().findDropDownByFluentWaitAndXPathAndChromeDriver(ecom.getCheckoutPaymentPage().getWebElementExpiryMonth()) );
		seedFramework.getDropDown().selectByValue(ecom.getCheckoutPaymentPage().getTestDataExpiryMonth());
		seedFramework.getDropDown().setSelect(seedFramework.getCDriver().findDropDownByFluentWaitAndXPathAndChromeDriver(ecom.getCheckoutPaymentPage().getWebElementExpiryYear()) );
		seedFramework.getDropDown().selectByValue(ecom.getCheckoutPaymentPage().getTestDataExpiryYear());
		//seedFramework.getDropDown().selectByIndex(3);
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutPaymentPage().getWebElementSecurityCode()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutPaymentPage().getTestDataSecurityCode());
	}
	
	public void placeOrder(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutPaymentPage().getWebElementSubmitPayment()));
		seedFramework.getElement().clickParentElement();
	}

}

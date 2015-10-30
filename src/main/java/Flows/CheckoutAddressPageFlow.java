package Flows;

import java.io.FileNotFoundException;

import com.fanatics.seed.SeedFramework;

import EcomConstants.Ecom_Constants;
import Pages.Ecom;

public class CheckoutAddressPageFlow {
	
	public CheckoutAddressPageFlow() { }
	
	public void setCheckoutAddressPageDomElements(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId) {
		try {
				if (seedFramework.getSnakeYaml() == null) 
					System.out.println("seedframework is null");
				if (ecom == null) 
					System.out.println("ecom is null");
				ecom.getCheckoutAddressPage().setDomElements(seedFramework.getSnakeYaml().getDomElementsFromYamlFile(filePath, env, partnerId));
		} catch (FileNotFoundException fnfex) {
			System.out.println("File not found : " + filePath);
			System.exit(0);
		}
		
		ecom.getCheckoutAddressPage().setBillingFirstName(Ecom_Constants.billingFirstName);
		ecom.getCheckoutAddressPage().setBillingLastName(Ecom_Constants.billingLastName);
		ecom.getCheckoutAddressPage().setBillingCompany(Ecom_Constants.billingCompany);
		ecom.getCheckoutAddressPage().setBillingAddress1(Ecom_Constants.billingAddress1);
		ecom.getCheckoutAddressPage().setBillingAddress2(Ecom_Constants.billingAddress2);
		ecom.getCheckoutAddressPage().setBillingCountry(Ecom_Constants.billingCountry);
		ecom.getCheckoutAddressPage().setBillingCity(Ecom_Constants.billingCity);
		ecom.getCheckoutAddressPage().setBillingState(Ecom_Constants.billingState);
		ecom.getCheckoutAddressPage().setBillingZip(Ecom_Constants.billingZip);
		ecom.getCheckoutAddressPage().setBillingPhone(Ecom_Constants.billingPhone);
		ecom.getCheckoutAddressPage().setBillingEmail(Ecom_Constants.billingEmail);
		ecom.getCheckoutAddressPage().setShippingFirstName(Ecom_Constants.shippingFirstName);
		ecom.getCheckoutAddressPage().setShippingLastName(Ecom_Constants.shippingLastName);
		ecom.getCheckoutAddressPage().setShippingCompany(Ecom_Constants.shippingCompany);
		ecom.getCheckoutAddressPage().setShippingAddress1(Ecom_Constants.shippingAddress1);
		ecom.getCheckoutAddressPage().setShippingAddress2(Ecom_Constants.shippingAddress2);
		ecom.getCheckoutAddressPage().setShippingCountry(Ecom_Constants.shippingCountry);
		ecom.getCheckoutAddressPage().setShippingCity(Ecom_Constants.shippingCity);
		ecom.getCheckoutAddressPage().setShippingState(Ecom_Constants.shippingState);
		ecom.getCheckoutAddressPage().setShippingZip(Ecom_Constants.shippingZip);
		ecom.getCheckoutAddressPage().setShippingPhone(Ecom_Constants.shippingPhone);
		ecom.getCheckoutAddressPage().setShippingEmail(Ecom_Constants.shippingEmail);
		ecom.getCheckoutAddressPage().setContinueCheckout(Ecom_Constants.continueCheckout);
		ecom.getCheckoutAddressPage().setBillingShippingCheckBox(Ecom_Constants.shipToAboveBillingAddress);
		ecom.getCheckoutAddressPage().setContinue(Ecom_Constants.Continue);
		ecom.getCheckoutAddressPage().setEditAddress(Ecom_Constants.editAddress);
		ecom.getCheckoutAddressPage().setSuggestedAddress(Ecom_Constants.suggestedAddress);
		ecom.getCheckoutAddressPage().setOriginalAddress(Ecom_Constants.originalAddress);
		ecom.getCheckoutAddressPage().setNotFoundEditAddress(Ecom_Constants.nfEditAddress);
		ecom.getCheckoutAddressPage().setNotFoundContinueAddress(Ecom_Constants.nfContinueAddress);
	}
	
	public void setCheckoutAddressPageBillingAddressTestData(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId, String testDataType) {
		try {
			ecom.getCheckoutAddressPage().setTestData(seedFramework.getSnakeYaml().getTestDataFromYamlFile(filePath, env, partnerId, testDataType));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
		
		ecom.getCheckoutAddressPage().setTestDataBillingFirstName(Ecom_Constants.testDataBillingFirstName);
		ecom.getCheckoutAddressPage().setTestDataBillingLastName(Ecom_Constants.testDataBillingLastName);
		ecom.getCheckoutAddressPage().setTestDataBillingCompany(Ecom_Constants.testDataBillingCompany);
		ecom.getCheckoutAddressPage().setTestDataBillingAddress1(Ecom_Constants.testDataBillingAddress1);
		ecom.getCheckoutAddressPage().setTestDataBillingAddress2(Ecom_Constants.testDataBillingAddress2);
		ecom.getCheckoutAddressPage().setTestDataBillingCountry(Ecom_Constants.testDataBillingCountry);
		ecom.getCheckoutAddressPage().setTestDataBillingCity(Ecom_Constants.testDataBillingCity);
		ecom.getCheckoutAddressPage().setTestDataBillingState(Ecom_Constants.testDataBillingState);
		ecom.getCheckoutAddressPage().setTestDataBillingZip(Ecom_Constants.testDataBillingZip);
		ecom.getCheckoutAddressPage().setTestDataBillingPhone(Ecom_Constants.testDataBillingPhone);
		ecom.getCheckoutAddressPage().setTestDataBillingEmail(Ecom_Constants.testDataBillingEmail);

	}
	
	public void setCheckoutAddressPageShippingAddressTestData(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId, String testDataType) {
		try {
			ecom.getCheckoutAddressPage().setTestData(seedFramework.getSnakeYaml().getTestDataFromYamlFile(filePath, env, partnerId, testDataType));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
		
		ecom.getCheckoutAddressPage().setTestDataShippingFirstName(Ecom_Constants.testDataShippingFirstName);
		ecom.getCheckoutAddressPage().setTestDataShippingLastName(Ecom_Constants.testDataShippingLastName);
		ecom.getCheckoutAddressPage().setTestDataShippingCompany(Ecom_Constants.testDataShippingCompany);
		ecom.getCheckoutAddressPage().setTestDataShippingAddress1(Ecom_Constants.testDataShippingAddress1);
		ecom.getCheckoutAddressPage().setTestDataShippingAddress2(Ecom_Constants.testDataShippingAddress2);
		ecom.getCheckoutAddressPage().setTestDataShippingCountry(Ecom_Constants.testDataShippingCountry);
		ecom.getCheckoutAddressPage().setTestDataShippingCity(Ecom_Constants.testDataShippingCity);
		ecom.getCheckoutAddressPage().setTestDataShippingState(Ecom_Constants.testDataShippingState);
		ecom.getCheckoutAddressPage().setTestDataShippingZip(Ecom_Constants.testDataShippingZip);
		ecom.getCheckoutAddressPage().setTestDataShippingPhone(Ecom_Constants.testDataShippingPhone);
		ecom.getCheckoutAddressPage().setTestDataShippingEmail(Ecom_Constants.testDataShippingEmail);
		
	}
	
	public void setUITextBillingFirstName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingFirstName()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingFirstName());
	}
	
	public void setUITextBillingLastName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingLastName()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingLastName());
	}
	
	public void setUITextBillingCompanyName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingCompany()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingCompany());
	}
	
	public void setUITextBillingAddressLine1(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingAddress1()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingAddress1());
	}
	
	public void setUITextBillingCity(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingCity()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingCity());
	}
	
	public void setUITextBillingZip(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingZip()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingZip());
	}
	
	public void setUITextBillingTelephone(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingPhone()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingPhone());
	}
	
	public void setUITextBillingEmail(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingEmail()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataBillingEmail());
	}
	
	public void setUITextBillingState(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getDropDown().setSelect(seedFramework.getCDriver().findDropDownByFluentWaitAndXPathAndChromeDriver(ecom.getCheckoutAddressPage().getBillingState()) );
		seedFramework.getDropDown().selectByValue(ecom.getCheckoutAddressPage().getTestDataBillingState());
	}
	
	public void unclickBillingShippingSameCheckBox(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingShippingCheckBox()));
		if (seedFramework.getElement().isSelectedParent())
			seedFramework.getElement().clickParentElement();
	}
	
	public void clickBillingShippingSameCheckBox(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingShippingCheckBox()));
		if (!seedFramework.getElement().isSelectedParent())
			seedFramework.getElement().clickParentElement();
	}
	
	public void setUIBillingAddress(SeedFramework seedFramework, Ecom ecom) {
		this.setUITextBillingFirstName(seedFramework, ecom);
		this.setUITextBillingLastName(seedFramework, ecom);
		this.setUITextBillingCompanyName(seedFramework, ecom);
		this.setUITextBillingAddressLine1(seedFramework, ecom);
		this.setUITextBillingCity(seedFramework, ecom);
		this.setUITextBillingZip(seedFramework, ecom);
		this.setUITextBillingTelephone(seedFramework, ecom);
		this.setUITextBillingEmail(seedFramework, ecom);
		this.setUITextBillingState(seedFramework, ecom);
	}
	
	/**
	 * 
	 */
	
	public void setUITextShippingFirstName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingFirstName()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingFirstName());
	}
	
	public void setUITextShippingLastName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingLastName()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingLastName());
	}
	
	public void setUITextShippingCompanyName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingCompany()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingCompany());
	}
	
	public void setUITextShippingAddressLine1(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingAddress1()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingAddress1());
	}
	
	public void setUITextShippingCity(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingCity()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingCity());
	}
	
	public void setUITextShippingZip(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingZip()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingZip());
	}
	
	public void setUITextShippingTelephone(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingPhone()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingPhone());
	}
	
	public void setUITextShippingEmail(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingEmail()));
		seedFramework.getElement().sendKeysParent(ecom.getCheckoutAddressPage().getTestDataShippingEmail());
	}
	
	public void setUITextShippingState(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getDropDown().setSelect(seedFramework.getCDriver().findDropDownByFluentWaitAndXPathAndChromeDriver(ecom.getCheckoutAddressPage().getShippingState()) );
		seedFramework.getDropDown().selectByValue(ecom.getCheckoutAddressPage().getTestDataShippingState());
	}
	
	public void setUIShippingAddress(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingShippingCheckBox()));
		if (! seedFramework.getElement().isSelectedParent()) {
			this.setUITextShippingFirstName(seedFramework, ecom);
			this.setUITextShippingLastName(seedFramework, ecom);
			this.setUITextShippingCompanyName(seedFramework, ecom);
			this.setUITextShippingAddressLine1(seedFramework, ecom);
			this.setUITextShippingCity(seedFramework, ecom);
			this.setUITextShippingZip(seedFramework, ecom);
			this.setUITextShippingTelephone(seedFramework, ecom);
			this.setUITextShippingEmail(seedFramework, ecom);
			this.setUITextShippingState(seedFramework, ecom);
		}
		
	}
	
	/*
	 * 
	 * 
	 */
	
	public void clearUITextBillingFirstName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingFirstName()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingLastName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingLastName()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingCompanyName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingCompany()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingAddressLine1(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingAddress1()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingCity(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingCity()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingZip(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingZip()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingTelephone(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingPhone()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingEmail(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingEmail()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextBillingState(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getDropDown().setSelect(seedFramework.getCDriver().findDropDownByFluentWaitAndXPathAndChromeDriver(ecom.getCheckoutAddressPage().getBillingState()) );
		seedFramework.getDropDown().deselectByValue(ecom.getCheckoutAddressPage().getTestDataBillingState());
	}
	
	
	public void clearUIBillingAddress(SeedFramework seedFramework, Ecom ecom) {
		this.clearUITextBillingFirstName(seedFramework, ecom);
		this.clearUITextBillingLastName(seedFramework, ecom);
		this.clearUITextBillingCompanyName(seedFramework, ecom);
		this.clearUITextBillingAddressLine1(seedFramework, ecom);
		this.clearUITextBillingCity(seedFramework, ecom);
		this.clearUITextBillingZip(seedFramework, ecom);
		this.clearUITextBillingTelephone(seedFramework, ecom);
		this.clearUITextBillingEmail(seedFramework, ecom);
		this.clearUITextBillingState(seedFramework, ecom);
	}
	
	/**
	 * 
	 */
	
	public void clearUITextShippingFirstName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingFirstName()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingLastName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingLastName()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingCompanyName(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingCompany()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingAddressLine1(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingAddress1()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingCity(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingCity()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingZip(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingZip()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingTelephone(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingPhone()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingEmail(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getShippingEmail()));
		seedFramework.getElement().clearParentElement();
	}
	
	public void clearUITextShippingState(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getDropDown().setSelect(seedFramework.getCDriver().findDropDownByFluentWaitAndXPathAndChromeDriver(ecom.getCheckoutAddressPage().getShippingState()) );
		seedFramework.getDropDown().deselectByValue(ecom.getCheckoutAddressPage().getTestDataShippingState());
	}
	
	public void clearUIShippingAddress(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getBillingShippingCheckBox()));
		if (! seedFramework.getElement().isSelectedParent()) {
			this.clearUITextShippingFirstName(seedFramework, ecom);
			this.clearUITextShippingLastName(seedFramework, ecom);
			this.clearUITextShippingCompanyName(seedFramework, ecom);
			this.clearUITextShippingAddressLine1(seedFramework, ecom);
			this.clearUITextShippingCity(seedFramework, ecom);
			this.clearUITextShippingZip(seedFramework, ecom);
			this.clearUITextShippingTelephone(seedFramework, ecom);
			this.clearUITextShippingEmail(seedFramework, ecom);
			this.clearUITextShippingState(seedFramework, ecom);
		}
		
	}
	
	public void continueCheckout(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getContinueCheckout()));
		seedFramework.getElement().clickParentElement();
	}
	
	public void retainCustomerEnteredAddressOnAddressVerificationPopup(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getOriginalAddress()));
		seedFramework.getElement().clickParentElement();
	}
	
	public void editAddressOnAddressVerificationPopup(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getEditAddress()));
		seedFramework.getElement().clickParentElement();
	}
	
	public void clickContinueOnAddressVerificationPopup(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getContinue()));
		seedFramework.getElement().clickParentElement();
	}
	
	public void continueCheckoutWithInvalidAddress(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getNotFoundContinueAddress()));
		seedFramework.getElement().clickParentElement();
	}
	
	public void editInvalidAddress(SeedFramework seedFramework, Ecom ecom) {
		seedFramework.getElement().setParentElement(seedFramework.getExplicitWait().PresenceOfElementByXpath(ecom.getCheckoutAddressPage().getNotFoundEditAddress()));
		seedFramework.getElement().clickParentElement();
	}

}

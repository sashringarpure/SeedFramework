package Specs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fanatics.seed.SeedFramework;

import EcomConstants.Ecom_Constants;
import Flows.EcomFlows;
import Pages.Ecom;

public class Checkout {
	
	public static final String userName = "shaileshshringar1";
	public static final String automateKey = "P5giyoxg1abEqftq7prN";
	public static final String URL = "http://"+userName+":"+automateKey+"@hub.browserstack.com/wd/hub";
	private SeedFramework seedFramework;
	private Ecom ecom;
	private EcomFlows ecomFlows;
	private static Logger log = Logger.getLogger(Checkout.class.getName());
	
	@Parameters({"env"})
	@BeforeSuite
	public void getEnvDetails(String env) {
		ecom = new Ecom();
		ecom.initCheckoutPages();
		ecomFlows = new EcomFlows();
		ecomFlows.initCheckoutFlows();
		seedFramework = new SeedFramework();
		seedFramework.initElement();
		seedFramework.initSnakeYaml();
		seedFramework.initDropDown();
		if (env.equalsIgnoreCase("browserStack")) {
			seedFramework.initSeedFrameworkConstants();
			seedFramework.initDesiredCapabilities();
			seedFramework.getDesiredCapabilities().setDesiredCapabilities();
			seedFramework.getDesiredCapabilities().addCapability(seedFramework, seedFramework.getSeedFrameworkConstants().CapabilityConfigFile, seedFramework.getSeedFrameworkConstants().browserStackCapability);
			seedFramework.initRemoteWebdriver();
		} else {
			seedFramework.initCDriver();
			seedFramework.getCDriver().setChromeDriver();
			seedFramework.getCDriver().setWait(seedFramework.getCDriver().getChromeDriver(), Ecom_Constants.fluentWaitDuration, Ecom_Constants.fluentWaitPoll, TimeUnit.SECONDS);
			seedFramework.initExplicitWait(seedFramework.getCDriver().getChromeDriver(), Ecom_Constants.ExplicitWaitDuration);
			seedFramework.initJSExecutor(seedFramework.getCDriver().getChromeDriver());
		}
		ecomFlows.getHomePageFlow().setQaEnv(seedFramework, 
				ecom, 
				Ecom_Constants.qaEnvFile, 
				Ecom_Constants.qa_Env);
	}
	
	
	@Parameters({"env"})
	@BeforeTest
	public void navigateToHomePageForBrowserStack(String env) {
		if (env.equalsIgnoreCase("browserStack")) {
		try {
			seedFramework.getRemoteWebdriver().setRemoteWebDriver(new URL(URL), seedFramework.getDesiredCapabilities().getDesiredCapabilities());
			seedFramework.getRemoteWebdriver().setWait(seedFramework.getRemoteWebdriver().getRemoteWebDriver(), Ecom_Constants.fluentWaitDuration, Ecom_Constants.fluentWaitPoll, TimeUnit.SECONDS);
			seedFramework.initExplicitWait(seedFramework.getRemoteWebdriver().getRemoteWebDriver(), Ecom_Constants.ExplicitWaitDuration);
			seedFramework.initJSExecutor(seedFramework.getRemoteWebdriver().getRemoteWebDriver());
		} catch(Exception ex) {
			System.out.println("Unhandled exception occured in : navigateToHomePageForBrowserStack");
			System.exit(0);
		}
			seedFramework.getRemoteWebdriver().navigateTo(ecom.getHomePage().getQaEnv());
		} else {
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv());
		}
	}
	
	/*
	@DataProvider(name = "browser")
	public Object[][] getBrowsers() {
		ecomFlows.getHomePageFlow().setBrowser(seedFramework,
				ecom, 
				Ecom_Constants.browserConfigFile);
		ArrayList<String> browserList =  ecom.getHomePage().getBrowser();
		return new Object[][] {{browserList.get(0)}};
	}
	*/
	
	@DataProvider(name = "partnerEnvDataProvider")
	public Object[][] getPartnerEnv() {
		ecomFlows.getHomePageFlow().setPartnerEnv(seedFramework,
				ecom, 
				Ecom_Constants.partnerEnvFile);
		ArrayList<String> abc =  ecom.getHomePage().getPartnerEnv();
		//return new Object[][] {{abc.get(0)},{abc.get(1)},{abc.get(2)},{abc.get(3)}};
		return new Object[][] {{abc.get(0)}};
	}
	
	
	/*
	@Test(dataProvider = "partnerEnvDataProvider")
	public void checkOutAsGuest(String data) throws InterruptedException {

			ecomFlows.getHomePageFlow().setProductUrl(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productURLFile, 
					Ecom_Constants.qa_Env, 
					data, 
					Ecom_Constants.productURLKey);
			
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+data);
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+ecom.getHomePage().getProductUrl());
			
			ecomFlows.getProductPageFlow().setProductPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().addItemToCart(
					seedFramework, 
					ecom);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			
			ecomFlows.getProductPageFlow().closeMiniBag(seedFramework, ecom);
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().startCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getShoppingCartPageFlow().setShoppingCartPageDomElements(
					this.seedFramework,
					this.ecom, 
					Ecom_Constants.shoppingCartPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getShoppingCartPageFlow().clickSecureCheckout(
					this.seedFramework, 
					this.ecom);
			ecomFlows.getCheckoutLoginPageFlow().setCheckoutLoginPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.checkoutLoginPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutLoginPageFlow().clickGuestCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutAddressPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageBillingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Billing_Address");
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Shipping_Address");
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();

			ecomFlows.getCheckoutAddressPageFlow().
						setUIBillingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
						setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutPaymentPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Payment_Details.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Discover");
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			ecomFlows.getCheckoutPaymentPageFlow().enterCreditCardInfo(seedFramework, ecom);
			ecomFlows.getCheckoutPaymentPageFlow().placeOrder(seedFramework, ecom);
	}

	@Test(dataProvider = "partnerEnvDataProvider")
	public void checkOutAsGuestAndAcceptAddressSuggestion(String data) throws InterruptedException {

			ecomFlows.getHomePageFlow().setProductUrl(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productURLFile, 
					Ecom_Constants.qa_Env, 
					data, 
					Ecom_Constants.productURLKey);
			
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+data);
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+ecom.getHomePage().getProductUrl());
			
			ecomFlows.getProductPageFlow().setProductPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().addItemToCart(
					seedFramework, 
					ecom);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			
			ecomFlows.getProductPageFlow().closeMiniBag(seedFramework, ecom);
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().startCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getShoppingCartPageFlow().setShoppingCartPageDomElements(
					this.seedFramework,
					this.ecom, 
					Ecom_Constants.shoppingCartPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getShoppingCartPageFlow().clickSecureCheckout(
					this.seedFramework, 
					this.ecom);
			ecomFlows.getCheckoutLoginPageFlow().setCheckoutLoginPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.checkoutLoginPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutLoginPageFlow().clickGuestCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutAddressPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageBillingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Billing_Address");
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Shipping_Address_Verify");
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();

			ecomFlows.getCheckoutAddressPageFlow().
						setUIBillingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
						setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getCheckoutAddressPageFlow().clickContinueOnAddressVerificationPopup(seedFramework, ecom);
			
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutPaymentPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Payment_Details.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Discover");
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			ecomFlows.getCheckoutPaymentPageFlow().enterCreditCardInfo(seedFramework, ecom);
			ecomFlows.getCheckoutPaymentPageFlow().placeOrder(seedFramework, ecom);
	}
	
	
	@Test(dataProvider = "partnerEnvDataProvider")
	public void checkOutAsGuestAndRetainCustomerAddress(String data) throws InterruptedException {

			ecomFlows.getHomePageFlow().setProductUrl(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productURLFile, 
					Ecom_Constants.qa_Env, 
					data, 
					Ecom_Constants.productURLKey);
			
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+data);
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+ecom.getHomePage().getProductUrl());
			
			ecomFlows.getProductPageFlow().setProductPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().addItemToCart(
					seedFramework, 
					ecom);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			
			ecomFlows.getProductPageFlow().closeMiniBag(seedFramework, ecom);
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().startCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getShoppingCartPageFlow().setShoppingCartPageDomElements(
					this.seedFramework,
					this.ecom, 
					Ecom_Constants.shoppingCartPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getShoppingCartPageFlow().clickSecureCheckout(
					this.seedFramework, 
					this.ecom);
			ecomFlows.getCheckoutLoginPageFlow().setCheckoutLoginPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.checkoutLoginPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutLoginPageFlow().clickGuestCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutAddressPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageBillingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Billing_Address");
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Shipping_Address_Verify");
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();

			ecomFlows.getCheckoutAddressPageFlow().
						setUIBillingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
						setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getCheckoutAddressPageFlow().retainCustomerEnteredAddressOnAddressVerificationPopup(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().clickContinueOnAddressVerificationPopup(seedFramework, ecom);
			
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutPaymentPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Payment_Details.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Discover");
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			ecomFlows.getCheckoutPaymentPageFlow().enterCreditCardInfo(seedFramework, ecom);
			ecomFlows.getCheckoutPaymentPageFlow().placeOrder(seedFramework, ecom);
	}
	

	
	@Test(dataProvider = "partnerEnvDataProvider")
	public void checkOutAsGuestAndEditCustomerAddress(String data) throws InterruptedException {

			ecomFlows.getHomePageFlow().setProductUrl(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productURLFile, 
					Ecom_Constants.qa_Env, 
					data, 
					Ecom_Constants.productURLKey);
			
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+data);
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+ecom.getHomePage().getProductUrl());
			
			ecomFlows.getProductPageFlow().setProductPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().addItemToCart(
					seedFramework, 
					ecom);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			
			ecomFlows.getProductPageFlow().closeMiniBag(seedFramework, ecom);
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().startCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getShoppingCartPageFlow().setShoppingCartPageDomElements(
					this.seedFramework,
					this.ecom, 
					Ecom_Constants.shoppingCartPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getShoppingCartPageFlow().clickSecureCheckout(
					this.seedFramework, 
					this.ecom);
			ecomFlows.getCheckoutLoginPageFlow().setCheckoutLoginPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.checkoutLoginPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutLoginPageFlow().clickGuestCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutAddressPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageBillingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Billing_Address");
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Shipping_Address_Verify");
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();

			ecomFlows.getCheckoutAddressPageFlow().
						setUIBillingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
						setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getCheckoutAddressPageFlow().editAddressOnAddressVerificationPopup(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Shipping_Address");
			ecomFlows.getCheckoutAddressPageFlow().
				clearUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
				setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutPaymentPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Payment_Details.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Discover");
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			ecomFlows.getCheckoutPaymentPageFlow().enterCreditCardInfo(seedFramework, ecom);
			ecomFlows.getCheckoutPaymentPageFlow().placeOrder(seedFramework, ecom);
	}
	

	
	@Test(dataProvider = "partnerEnvDataProvider")
	public void checkOutAsGuestAndContinueWithInvalidAddress(String data) throws InterruptedException {

			ecomFlows.getHomePageFlow().setProductUrl(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productURLFile, 
					Ecom_Constants.qa_Env, 
					data, 
					Ecom_Constants.productURLKey);
			
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+data);
			seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+ecom.getHomePage().getProductUrl());
			
			ecomFlows.getProductPageFlow().setProductPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().addItemToCart(
					seedFramework, 
					ecom);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			
			ecomFlows.getProductPageFlow().closeMiniBag(seedFramework, ecom);
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().startCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getShoppingCartPageFlow().setShoppingCartPageDomElements(
					this.seedFramework,
					this.ecom, 
					Ecom_Constants.shoppingCartPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getShoppingCartPageFlow().clickSecureCheckout(
					this.seedFramework, 
					this.ecom);
			ecomFlows.getCheckoutLoginPageFlow().setCheckoutLoginPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.checkoutLoginPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutLoginPageFlow().clickGuestCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutAddressPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageBillingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Billing_Address");
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Invalid_Address");
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();

			ecomFlows.getCheckoutAddressPageFlow().
						setUIBillingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
						setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckoutWithInvalidAddress(seedFramework, ecom);
			
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutPaymentPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Payment_Details.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Discover");
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			ecomFlows.getCheckoutPaymentPageFlow().enterCreditCardInfo(seedFramework, ecom);
			ecomFlows.getCheckoutPaymentPageFlow().placeOrder(seedFramework, ecom);
	}
	
			
	
	@Test(dataProvider = "partnerEnvDataProvider")
	public void checkOutAsGuestAndEditInvalidAddress(String data) throws InterruptedException {

			ecomFlows.getHomePageFlow().setProductUrl(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productURLFile, 
					Ecom_Constants.qa_Env, 
					data, 
					Ecom_Constants.productURLKey);
			
			//seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+data);
			//seedFramework.getCDriver().navigateTo(ecom.getHomePage().getQaEnv()+ecom.getHomePage().getProductUrl());
			seedFramework.getRemoteWebdriver().navigateTo(ecom.getHomePage().getQaEnv()+data);
			seedFramework.getRemoteWebdriver().navigateTo(ecom.getHomePage().getQaEnv()+ecom.getHomePage().getProductUrl());
			
			ecomFlows.getProductPageFlow().setProductPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.productPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			
			System.out.println(seedFramework.getDesiredCapabilities().getDesiredCapabilities().toString());
			
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().addItemToCart(
					seedFramework, 
					ecom);
			
			Thread.sleep(Ecom_Constants.threadSleep);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			
			ecomFlows.getProductPageFlow().closeMiniBag(seedFramework, ecom);
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getProductPageFlow().startCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getShoppingCartPageFlow().setShoppingCartPageDomElements(
					this.seedFramework,
					this.ecom, 
					Ecom_Constants.shoppingCartPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getShoppingCartPageFlow().clickSecureCheckout(
					this.seedFramework, 
					this.ecom);
			ecomFlows.getCheckoutLoginPageFlow().setCheckoutLoginPageDomElements(
					this.seedFramework, 
					this.ecom, 
					Ecom_Constants.checkoutLoginPageDomElements, 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutLoginPageFlow().clickGuestCheckout(
					seedFramework, 
					ecom);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutAddressPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageBillingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Billing_Address");
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Invalid_Address");
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();

			ecomFlows.getCheckoutAddressPageFlow().
						setUIBillingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
						setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			Thread.sleep(Ecom_Constants.threadSleep);
			ecomFlows.getCheckoutAddressPageFlow().editInvalidAddress(seedFramework, ecom);
			
			ecomFlows.getCheckoutAddressPageFlow().setCheckoutAddressPageShippingAddressTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Billing_Shipping_Address.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Shipping_Address");
			ecomFlows.getCheckoutAddressPageFlow().
				clearUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().
				setUIShippingAddress(seedFramework, ecom);
			ecomFlows.getCheckoutAddressPageFlow().continueCheckout(seedFramework, ecom);
			
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageDomElements(this.seedFramework, 
					this.ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutPaymentPage.yml", 
					Ecom_Constants.qa_Env, 
					data);
			ecomFlows.getCheckoutPaymentPageFlow().setCheckoutPaymentPageTestData(seedFramework, 
					ecom, 
					"/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/Payment_Details.yml", 
					Ecom_Constants.qa_Env, 
					data, 
					"Discover");
			seedFramework.getJSExecutor().waitTillDocumentComplete();
			ecomFlows.getCheckoutPaymentPageFlow().enterCreditCardInfo(seedFramework, ecom);
			ecomFlows.getCheckoutPaymentPageFlow().placeOrder(seedFramework, ecom);
			System.out.println("successful execution.");
	}
	*/
}

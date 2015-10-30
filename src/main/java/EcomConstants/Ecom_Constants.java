package EcomConstants;

public class Ecom_Constants {

	/**
	 * Default
	 */
	
	public static final String qc3_Qa_Env = "qc3";
	public static final String qc2_Qa_Env = "qc2";
	public static final String qa_Env = qc3_Qa_Env;
	public static final String productURLFile = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Products.yml";
	public static final String productURLKey = "product";
	public static final String qaEnvFile = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/env.yml";
	public static final String partnerEnvFile = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Partners.yml";
	public static final String browserConfigFile = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/browsers.yml";
	
	
	/**
	 * Wait
	 */
	public static final int fluentWaitDuration = 90;
	public static final int fluentWaitPoll = 2;
	public static final int ExplicitWaitDuration = 90;
	public static final int threadSleep = 5000;
	
	/**
	 * Product Page
	 */
	public static final String productPageDomElements = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_ProductPage.yml";
	public static final String addToCartLocator = "addtocart";
	public static final String checkoutNowLocator = "checkoutNow";
	public static final String headerCartCheckout = "headerCartCheckout";
	public static final String closeMiniBag = "closeMiniBag";
	public static final String smallSize = "smallSize";
	public static final String mediumSize = "mediumSize";
	public static final String largeSize = "largeSize";
	public static final String xlargeSize = "xlargeSize";
	public static final String xxlargeSize = "xxlargeSize";
	public static final String xxxlargeSize = "xxxlargeSize";
	public static final String xxxxlargeSize = "xxxxlargeSize";
	public static final String xxxxxlargeSize = "xxxxxlargeSize";
	/**
	 * Shopping Cart Page
	 */
	public static final String shoppingCartPageDomElements = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_ShoppingCartPage.yml";
	public static final String secureCheckout = "secureCheckoutNow";
	
	/**
	 * Checkout Login Page
	 */
	public static final String checkoutLoginPageDomElements = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Dom_Elements/DomElements_CheckoutLoginPage.yml";
	public static final String checkoutAsGuest = "checkoutAsGuest";
	
	/**
	 * Shipping Address Verification
	 */
	public static final String shippingAddressUrl = "http://local-www.fanatics.com:10191/verify";
	public static final String shippingAddressDataProvider = "shippingAddress";
	public static final String shippingAddressRequestPayload = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/input/Test_Data/ShippingAddressRequest.yml";
	public static final String shippingAddressResponsePayload = "/Users/sshringarpure/Documents/workspace-sts-3.6.4.RELEASE/ecom/resources/expectedOutput/ShippingAddressResponse.yml";
	
	/**
	 * Checkout Address Page
	 */
	public static final String billingFirstName = "billingFirstName";
	public static final String billingLastName = "billingLastName";
	public static final String billingCompany = "billingCompany";
	public static final String billingAddress1 = "billingAddress1";
	public static final String billingAddress2 = "billingAddress2";
	public static final String billingCountry = "billingCountry";
	public static final String billingCity = "billingCity";
	public static final String billingState = "billingState";
	public static final String billingZip = "billingZip";
	public static final String billingPhone = "billingPhone";
	public static final String billingEmail = "billingEmail";
	public static final String shippingFirstName = "shippingFirstName";
	public static final String shippingLastName = "shippingLastName";
	public static final String shippingCompany = "shippingCompany";
	public static final String shippingAddress1 = "shippingAddress1";
	public static final String shippingAddress2 = "shippingAddress2";
	public static final String shippingCountry = "shippingCountry";
	public static final String shippingCity = "shippingCity";
	public static final String shippingState = "shippingState";
	public static final String shippingZip = "shippingZip";
	public static final String shippingPhone = "shippingPhone";
	public static final String shippingEmail = "shippingEmail";
	public static final String continueCheckout = "continueCheckout";
	public static final String Continue = "continue";
	public static final String suggestedAddress = "suggestedAddress";
	public static final String originalAddress = "originalAddress";
	public static final String editAddress = "editAddress";
	public static final String nfEditAddress = "nfEdit";
	public static final String nfContinueAddress = "nfContinue";
	public static final String shipToAboveBillingAddress = "shipToAboveBillingAddress";
	public static final String testDataBillingFirstName = "Billing_First_Name";
	public static final String testDataBillingLastName = "Billing_Last_Name";
	public static final String testDataBillingCompany = "Billing_Company_Name";
	public static final String testDataBillingAddress1 = "Billing_Address_Line_1";
	public static final String testDataBillingAddress2 = "Billing_Address_Line_2";
	public static final String testDataBillingCountry = "Billing_Country";
	public static final String testDataBillingCity = "Billing_City";
	public static final String testDataBillingState = "Billing_State";
	public static final String testDataBillingZip = "Billing_Zip";
	public static final String testDataBillingPhone = "Billing_Telephone";
	public static final String testDataBillingEmail = "Billing_Email";
	public static final String testDataShippingFirstName = "Shipping_First_Name";
	public static final String testDataShippingLastName = "Shipping_Last_Name";
	public static final String testDataShippingCompany = "Shipping_Company_Name";
	public static final String testDataShippingAddress1 = "Shipping_Address_Line_1";
	public static final String testDataShippingAddress2 = "Shipping_Address_Line_2";
	public static final String testDataShippingCountry = "Shipping_Country";
	public static final String testDataShippingCity = "Shipping_City";
	public static final String testDataShippingState = "Shipping_State";
	public static final String testDataShippingZip = "Shipping_Zip";
	public static final String testDataShippingPhone = "Shipping_Telephone";
	public static final String testDataShippingEmail = "Shipping_Email";
	public static final String testDataVerifyShippingFirstName = "Shipping_First_Name";
	public static final String testDataVerifyShippingLastName = "Shipping_Last_Name";
	public static final String testDataVerifyShippingCompany = "Shipping_Company_Name";
	public static final String testDataVerifyShippingAddress1 = "Shipping_Address_Line_1";
	public static final String testDataVerifyShippingAddress2 = "Shipping_Address_Line_2";
	public static final String testDataVerifyShippingCountry = "Shipping_Country";
	public static final String testDataVerifyShippingCity = "Shipping_City";
	public static final String testDataVerifyShippingState = "Shipping_State";
	public static final String testDataVerifyShippingZip = "Shipping_Zip";
	public static final String testDataVerifyShippingPhone = "Shipping_Telephone";
	public static final String testDataVerifyShippingEmail = "Shipping_Email";
	
	/**
	 * Checkout Payment Page
	 */
	public static final String creditCardNumber="creditCardNumber";
	public static final String expiryMonth = "expiryMonth";
	public static final String expiryYear = "expiryYear";
	public static final String securityCode = "securityCode";
	public static final String submitPayment = "submitPayment";
	
	public static final String testDataCreditCardNumber="creditCardNumber";
	public static final String testDataExpiryMonth="expiryMonth";
	public static final String testDataExpiryYear="expiryYear";
	public static final String testDataSecurityCode="securityCode";
}

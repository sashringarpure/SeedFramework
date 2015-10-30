package Flows;

public class EcomFlows {
	
	private CheckoutPaymentPageFlow checkoutPaymentPageFlow;
	private CheckoutAddressPageFlow checkoutAddressPageFlow;
	private CheckoutLoginPageFlow checkoutLoginPageFlow;
	private ShoppingCartPageFlow shoppingCartPageFlow;
	private ProductPageFlow productPageFlow;
	private HomePageFlow homePageFlow;
	
	public EcomFlows() {}
	
	public void initCheckoutFlows() {
		checkoutPaymentPageFlow = new CheckoutPaymentPageFlow();
		checkoutAddressPageFlow = new CheckoutAddressPageFlow();
		checkoutLoginPageFlow = new CheckoutLoginPageFlow();
		shoppingCartPageFlow = new ShoppingCartPageFlow();
		productPageFlow = new ProductPageFlow();
		homePageFlow = new HomePageFlow();
	}
	
	public CheckoutPaymentPageFlow getCheckoutPaymentPageFlow() {
		return this.checkoutPaymentPageFlow;
	}
	
	public CheckoutAddressPageFlow getCheckoutAddressPageFlow() {
		return this.checkoutAddressPageFlow;
	}
	
	public CheckoutLoginPageFlow getCheckoutLoginPageFlow() {
		return this.checkoutLoginPageFlow;
	}
	
	public ShoppingCartPageFlow getShoppingCartPageFlow() {
		return this.shoppingCartPageFlow;
	}
	
	public ProductPageFlow getProductPageFlow() {
		return this.productPageFlow;
	}
	
	public HomePageFlow getHomePageFlow() {
		return this.homePageFlow;
	}

}

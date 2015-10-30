package Pages;

public class Ecom {

	private Checkout_Login_Page checkoutLoginPage;
	private HomePage homePage;
	private ProductPage productPage;
	private ShoppingCartPage shoppingCartPage;
	private CheckoutAddressPage checkoutAddressPage;
	private CheckoutPaymentPage checkoutPaymentPage;
	
	public Ecom() {}
	
	public void initCheckoutPages() {
		this.checkoutLoginPage = new Checkout_Login_Page();
		this.homePage = new HomePage();
		this.productPage = new ProductPage();
		this.shoppingCartPage = new ShoppingCartPage();
		this.checkoutAddressPage = new CheckoutAddressPage();
		this.checkoutPaymentPage = new CheckoutPaymentPage();
	}
	
	public HomePage getHomePage() {
		return this.homePage;
	}
	
	public ProductPage getProductPage() {
		return this.productPage;
	}
	
	public Checkout_Login_Page getCheckoutLoginPage() {
		return this.checkoutLoginPage;
	}
	
	public ShoppingCartPage getShoppingCartPage() {
		return this.shoppingCartPage;
	}
	
	public CheckoutAddressPage getCheckoutAddressPage() {
		return this.checkoutAddressPage;
	}
	
	public CheckoutPaymentPage getCheckoutPaymentPage() {
		return this.checkoutPaymentPage;
	}

}

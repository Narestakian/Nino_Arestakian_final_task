package elementsSelenium;
import org.openqa.selenium.By;


public class BasketElements {
    public By basketBtn = By.id("wpmenucartli");
    public By addToCartBtn = By.xpath("//a[text()='Add to basket']");
    public By cartItemCount = By.xpath("//li[@id='wpmenucartli']//span[@class='cartcontents']");
    public By cartItemList  = By.xpath("//tr[@class='cart_item']");
    public By itemRemoveButton = By.xpath("//td[@class='product-remove']//a[@class='remove']");
    public By removalMessage = By.xpath("//p[@class='cart-empty']");
    public By shopButton = By.xpath("//a[text()='Shop']");
    public By addToCartHTML5Forms = By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart' and @href='/shop/?add-to-cart=181']");
    public By addToCartSeleniumRuby = By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart' and @href='/shop/?add-to-cart=160']");
    public By allBooks = By.xpath("//ul[@class='products masonry-done']//li[contains(@class, 'product')]");
    public By couponCode  = By.id("coupon_code");
    public By applyCoupon = By.xpath("//input[@name='apply_coupon']");
    public By subTotalPrice = By.xpath("//span[@class='woocommerce-Price-amount amount']");
    public By totalPrice = By.xpath("//td[@data-title='Total']//span[@class='woocommerce-Price-amount amount']");
    public By removeCoupon = By.xpath("//a[@class='woocommerce-remove-coupon' and @data-coupon='krishnasakinala']");
    public By checkOutBtn = By.xpath("//a[@href='https://practice.automationtesting.in/checkout/' and @class='checkout-button button alt wc-forward']");
    public By bdFirstName = By.id("billing_first_name");
    public By bdLastName = By.id("billing_last_name");
    public By bdEmailAddress = By.id("billing_email");
    public By bdPhone = By.id("billing_phone");
    public By bdCountry = By.id("s2id_billing_country");
    public By bdCountrySearch = By.id("s2id_autogen1_search");
    public By bdFindCountry = By.xpath("//span[text()='Georgia']");
    public By bdAddress = By.id("billing_address_1");
    public By bdCity = By.id("billing_city");
    public By bdState = By.id("billing_state");
    public By bdPostcode = By.id("billing_postcode");
    public By bdCashOnDelivery = By.xpath("//input[@name='payment_method' and @value='cod']");
    public By bdPlaceOrder = By.id("place_order");
    public By myAccount = By.xpath("//a[text()='My Account']");
    public By emailAddress = By.id("username");
    public By passwordField = By.id("password");
    public By loginButton = By.xpath("//input[@name='login']");
    public By myOrders = By.xpath("//a[text()='Orders']");
    public By orderNumber = By.xpath("//div[@class='woocommerce-MyAccount-content']");
    public By accountDetails  = By.xpath("//a[text()='Account Details']");
    public By accountFirstName = By.id("account_first_name");
    public By accountLastName = By.id("account_last_name");
    public By currentPassword  = By.id("password_current");
    public By newPasswordFirst  = By.id("password_1");
    public By newPasswordSecond  = By.id("password_2");
    public By savePassword  = By.xpath("//input[@name='save_account_details']");
    public By logOut = By.xpath("//a[text()='Logout']");
}
package testSelenium;

import org.testng.annotations.Test;
import stepsSelenium.BasketSteps;
import utils.SetUp;



public class BasketTest extends SetUp {
    BasketSteps basketSteps = new BasketSteps();
    @Test(priority =4)
    public void basketTest(){
        basketSteps.openPage();
        basketSteps.addOneBookToCart();
        basketSteps.checkAssertBasketChanged();
        basketSteps.clickBasketButton();
        basketSteps.checkCartQuantity();
        basketSteps.clickOnRemoveButton();
        basketSteps.checkItemRemoval();
        basketSteps.clickShopButton();
        basketSteps.addBooksToCard();
        basketSteps.clickBasketButton();
        basketSteps.setCouponCode("krishnasakinala");
        basketSteps.clickApplyCouponButton();
        basketSteps.comparePrices();
        basketSteps.scrollToRemoveElement();
        basketSteps.clickRemoveCoupon();
        basketSteps.checkRemoveButton();
        basketSteps.setCouponCode("krishnasakinala");
        basketSteps.clickApplyCouponButton();
        basketSteps.comparePrices();
        basketSteps.clickCheckOutButton();
        basketSteps.setFirstName("Nino");
        basketSteps.setLastName("Arestakian");
        basketSteps.setEmailAddress("n.larestakian@gmail.com");
        basketSteps.setPhone("591003647");
        basketSteps.clickOnCountry();
        basketSteps.setCountry("Georgia");
        basketSteps.clickFindCountry();
        basketSteps.setAddress("Todria");
        basketSteps.setCity("Rustavi");
        basketSteps.setState("Georgia");
        basketSteps.setPost("3700");
        basketSteps.clickOnCashOnDelivery();
        basketSteps.clickOnPlaceOrder();
        basketSteps.checkCashOnDeliveryAndAllImportantInformation();
        basketSteps.clickMyAccount();
        basketSteps.setUserName("n.karestakian@gmail.com");
        basketSteps.setPasswordField("Credo@12309#%!");
        basketSteps.clickLoginButton();
        basketSteps.clickMyOrders();
        basketSteps.checkOrders();
        basketSteps.clickAccountDetails();
        basketSteps.setAccountFirstName("Nino");
        basketSteps.setAccountLastName("Arestakian");
        basketSteps.setCurrentPassword("Credo@12309#%!");
        basketSteps.setNewPasswordFirst("Credo@12309#%");
        basketSteps.setNewPasswordSecond("Credo@12309#%");
        basketSteps.clickSavePassword();
        basketSteps.clickLogOut();
        basketSteps.setUserName("n.karestakian@gmail.com");
        basketSteps.setPasswordField("Credo@12309#%");
        basketSteps.clickLoginButton();

    }
}

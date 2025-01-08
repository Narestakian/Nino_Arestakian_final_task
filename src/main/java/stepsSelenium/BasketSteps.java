package stepsSelenium;

import elementsSelenium.BasketElements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import static utils.SetUp.*;



public class BasketSteps extends BasketElements {


    public void openPage() {
        driver.get("https://practice.automationtesting.in/product-category/javascript/");
    }

    public void addOneBookToCart() {
        findElement(addToCartBtn).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkAssertBasketChanged() {
        WebElement cartContents = findElement(cartItemCount);
        String cartText = cartContents.getText();
        Assert.assertTrue(cartText.contains("1 Item"));
    }

    public void clickBasketButton() {
        findElement(basketBtn).click();
    }

    public void checkCartQuantity() {
        Assert.assertTrue(findElement(cartItemList).isDisplayed());

    }

    public void clickOnRemoveButton() {
        findElement(itemRemoveButton).click();
    }

    public void checkItemRemoval() {
        Assert.assertTrue(findElement(removalMessage).isDisplayed());
    }

    public void clickShopButton() {
        findElement(shopButton).click();
    }

    public void addBooksToCard() {
        List<WebElement> allProducts = driver.findElements(allBooks);
        for (WebElement product : allProducts) {
            String productName = product.getText();
            if (productName.contains("HTML5 Forms")) {
                WebElement addToCart = product.findElement(addToCartHTML5Forms);
                addToCart.click();
                System.out.println("Added HTML5 Forms to cart");
            }

            if (productName.contains("Selenium Ruby")) {
                WebElement addToCart = product.findElement(addToCartSeleniumRuby);
                addToCart.click();
                System.out.println("Added Selenium Ruby to cart");
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


            public void setCouponCode (String text){
                findElement(couponCode).sendKeys(text);
            }

            public void clickApplyCouponButton () {
                findElement(applyCoupon).click();
            }

            public void comparePrices () {
                String price1 = findElement(subTotalPrice).getText();
                String price2 = findElement(totalPrice).getText();
                Assert.assertEquals(price1, price2);
            }

            public void scrollToRemoveElement () {
                js.executeScript("window.scrollBy(0, 150);");
            }

            public void clickRemoveCoupon () {
                findElement(removeCoupon).click();
            }

            public void checkRemoveButton(){
                Assert.assertTrue(findElement(removeCoupon).isDisplayed());

            }
            public void clickCheckOutButton(){
                findElement(checkOutBtn).click();
            }

            public void setFirstName(String text){
                findElement(bdFirstName).sendKeys(text);
            }

            public void setLastName(String text){
                findElement(bdLastName).sendKeys(text);
            }

            public void setEmailAddress(String text){
                findElement(bdEmailAddress).sendKeys(text);
            }

            public void setPhone(String text){
                findElement(bdPhone).sendKeys(text);
            }

            public void clickOnCountry(){
               findElement(bdCountry).click();
            }


           public void setCountry(String text){
            findElement(bdCountrySearch).sendKeys(text);
            }

            public void clickFindCountry(){
            findElement(bdFindCountry).click();
            }


            public void setAddress(String text){
                findElement(bdAddress).sendKeys(text);
            }

            public void setCity(String text){
                findElement(bdCity).sendKeys(text);
            }

            public void setState(String text){
                findElement(bdState).sendKeys(text);
            }

            public void setPost(String text){
                findElement(bdPostcode).sendKeys(text);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            public void clickOnCashOnDelivery(){
                findElement(bdCashOnDelivery).click();
            }

            public void clickOnPlaceOrder(){
                findElement(bdPlaceOrder).click();
            }
            public void checkCashOnDeliveryAndAllImportantInformation(){

            String text = js.executeScript("return document.documentElement.innerText;")
                    .toString();
                System.out.println(text);
            }

            public void clickMyAccount(){
            findElement(myAccount).click();
            }

            public void setUserName(String email){
            findElement(emailAddress).sendKeys(email);
            }

            public void setPasswordField(String text){
            findElement(passwordField).sendKeys(text);
            }

            public void clickLoginButton(){
            findElement(loginButton).click();
            }

            public void clickMyOrders(){
            findElement(myOrders).click();
            }

            public void checkOrders(){
                Assert.assertTrue(findElement(orderNumber).isDisplayed());
            }

            public void clickAccountDetails(){
            findElement(accountDetails).click();
            }

            public void setAccountFirstName(String name){
                findElement(accountFirstName).clear();
                findElement(accountFirstName).sendKeys(name);
            }
            public void setAccountLastName(String lastName){
                findElement(accountLastName).clear();
                findElement(accountLastName).sendKeys(lastName);
            }

            public void setCurrentPassword(String password){
            findElement(currentPassword).sendKeys(password);
            }

            public void setNewPasswordFirst(String password){
            findElement(newPasswordFirst).sendKeys(password);
            }

            public void setNewPasswordSecond (String password){
            findElement(newPasswordSecond ).sendKeys(password);
            }

            public void clickSavePassword(){
                findElement(savePassword).click();
            }

            public void clickLogOut(){
            findElement(logOut).click();
            }


        }




package stepsSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import elementsSelenide.PhpTravelsRegElements;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class PhpTravelsRegSteps extends PhpTravelsRegElements {
    public void openPage(){
        open("https://www.phptravels.net/");
    }

    public void clickAccountDropDown(){
        dropDown.click();
    }

    public void clickAccountSignUp(){
        signUp.click();
   }


    public void clickFirstName(String text){
        firstName.setValue(text);
    }

    public void clickLastName(String text){
        lastName.setValue(text);

    }

    public void clickSelectCountry(){
        selectCountry.click();
    }

    public void clickSearchField(String text){
        searchCountry.setValue(text).click();
    }

    public void clickGeorgianField(){
        georgiaField.click();
    }
    public void clickPhoneValue(String text){
        phoneField.setValue(text);
    }

    public void clickEmailAddress(String text){
        emailAddress.setValue(text);
    }

    public void clickPassword(String text){
        passwordField.setValue(text);
    }
    public void checkSubmitButtonIsDisabled(){
        submitField.shouldBe(Condition.disabled).shouldNotBe(Condition.clickable);
    }

    public void scrollToSignUp(){
        submitField.scrollTo();
    }

    public void clickCheckBox(){
        SelenideElement iframe = $x("//iframe[@title='reCAPTCHA']");
        switchTo().frame(iframe);

        checkBox.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
        switchTo().defaultContent();
    }


    public void checkSubmitButtonIsEnable(){
        submitField.shouldBe(Condition.enabled).shouldBe(Condition.clickable);
    }

    public void clickSignUpButton(){
        submitField.click();
    }
    public void waitForSuccessPageAndAssertText() {
        webdriver().shouldHave(url("https://www.phptravels.net/signup_success"));
        successMessage.shouldHave(Condition.text("Your account has been created Please check your mailbox for activation"));


    }
}

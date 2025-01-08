package elementsSelenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PhpTravelsRegElements {

    public SelenideElement dropDown = $x("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/a");
    public SelenideElement signUp = $x("//a[@href='https://www.phptravels.net/signup']");
    public SelenideElement firstName = $("#firstname");
    public SelenideElement lastName = $("#last_name");
    public SelenideElement selectCountry = $x("//button[@title='Select Country']");
    public SelenideElement searchCountry = $x("//input[@type='search']");
    public SelenideElement georgiaField = $x("//span[normalize-space(text())='Georgia']");
    public SelenideElement phoneField = $("#phone");
    public SelenideElement emailAddress = $("#user_email");
    public SelenideElement passwordField = $("#password");
    public SelenideElement checkBox = $("#recaptcha-anchor");
    public SelenideElement submitField = $("#submitBTN");
    public SelenideElement successMessage= $("div.rounded p");
}

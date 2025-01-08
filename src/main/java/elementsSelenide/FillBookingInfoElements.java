package elementsSelenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FillBookingInfoElements {
    public SelenideElement firstName = $x("//input[@name='user[first_name]']");
    public SelenideElement lastName = $x("//input[@name='user[last_name]']");
    public SelenideElement emailField = $x("//input[@name='user[email]']");
    public SelenideElement phoneField = $x("//input[@name='user[phone]']");
    public SelenideElement addressField = $x("//input[@class='form-control' and @placeholder='Address']");
    public SelenideElement adultFirstName = $x("//input[@name='firstname_1']");
    public SelenideElement adultLastName = $x("//input[@name='lastname_1']");
    public SelenideElement secondAdultFirstname = $x("//input[@name='firstname_2']");
    public SelenideElement secondAdultLastName = $x("//input[@name='lastname_2']");
    public SelenideElement childFirstName = $x("//input[@name='child_firstname_1']");
    public SelenideElement childLastName = $x("//input[@name='child_lastname_1']");
    public SelenideElement secondChildFirstName = $x("//input[@name='child_firstname_2']");
    public SelenideElement secondChildLasName = $x("//input[@name='child_lastname_2']");
    public SelenideElement payLaterButton = $x("//input[@id='gateway_pay_later']");
    public SelenideElement agreementCheckBox = $("#agreechb");
    public SelenideElement bookingConfirm = $x("//button[text()=' Booking Confirm']");
    public SelenideElement downloadAsPdfButton = $x("//button[contains(@class, 'btn border no_print')]");
    public SelenideElement chooseFile = $("#myFile");
    public SelenideElement submitButton = $("#submit-button");


}

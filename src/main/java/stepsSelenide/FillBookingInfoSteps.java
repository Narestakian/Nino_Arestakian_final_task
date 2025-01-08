package stepsSelenide;
import com.codeborne.selenide.Condition;
import elementsSelenide.FillBookingInfoElements;
import org.testng.Assert;
import java.io.File;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v129.page.Page.navigate;


public class FillBookingInfoSteps extends FillBookingInfoElements {


    public void setFirstname(String text){
        firstName.setValue(text);
    }

    public void setLastName(String text){
        lastName.setValue(text);
    }

    public void setEmailField(String text){
        emailField.setValue(text);
    }

    public void setPhoneField(String text){
        phoneField.setValue(text);
    }

    public void setAddressField(String text){
        addressField.setValue(text);
    }

    public void setAdultFirstName(String text){
        adultFirstName.setValue(text);
    }

    public void setAdultLastName(String text){
        adultLastName.setValue(text);
    }

    public void setSecondAdultFirstname(String text){
        secondAdultFirstname.setValue(text);
    }

    public void setSecondAdultLastName(String text){
        secondAdultLastName.setValue(text);
    }

    public void setChildFirstName(String text){
        childFirstName.setValue(text);
    }

    public void setChildLastName(String text){
        childLastName.setValue(text);
    }

    public void setSecondChildFirstName(String text){
        secondChildFirstName.setValue(text);
    }

    public void setSecondChildLasName(String text){
        secondChildLasName.setValue(text);
    }

    public void clickPayLaterButton(){
        payLaterButton.click();
    }
    public void clickAgreementCheckBox(){
        agreementCheckBox.click();
    }

    public void clickBookingConfirm(){
        bookingConfirm.click();
    }

    public void clickDownloadAsPdf(){
        downloadAsPdfButton.scrollTo();
        downloadAsPdfButton.shouldBe(clickable).click();
    }

    public void openNewPage(){
        open("https://webdriveruniversity.com/File-Upload/index.html");

    }


    public void uploadFile(){
    chooseFile.uploadFromClasspath("files");

}

    public void clickSubmitButton(){
        submitButton.click();
    }










}

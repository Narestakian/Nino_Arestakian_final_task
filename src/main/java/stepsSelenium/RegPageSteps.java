package stepsSelenium;

import elementsSelenium.RegPageElements;
import org.testng.Assert;

import static utils.SetUp.driver;
import static utils.SetUp.findElement;

public class RegPageSteps extends RegPageElements{


    public void openRegistrationPage() {
        driver.get("https://practice.automationtesting.in/my-account/");
    }

    public void setEmail(String email) {
        findElement(emailAddress).sendKeys(email);
    }

    public void setPassword(String password) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        findElement(regPassword).sendKeys(password);
    }

    public void clickRegister() {
        findElement(regButton).click();
    }

    public void checkRegHelloMessageSuccessText(String successText){
        Assert.assertTrue(findElement(regHelloMessage).getText().contains(successText));


    }
}
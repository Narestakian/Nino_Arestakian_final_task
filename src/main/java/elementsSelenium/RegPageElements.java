package elementsSelenium;

import org.openqa.selenium.By;





public class RegPageElements {


    public By emailAddress = By.id("reg_email");
    public By regPassword = By.id("reg_password");
    public By regButton = By.cssSelector("input[name='register']");
    public By regHelloMessage = By.xpath("//p[contains(text(),'Hello')]");

}

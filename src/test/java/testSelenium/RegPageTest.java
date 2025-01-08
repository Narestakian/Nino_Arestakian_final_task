package testSelenium;

import org.testng.annotations.Test;
import stepsSelenium.RegPageSteps;
import utils.SetUp;

public class RegPageTest extends SetUp {

    RegPageSteps regPageSteps = new RegPageSteps();

    @Test
    public void regPageTest() {
        regPageSteps.openRegistrationPage();
        regPageSteps.setEmail("n.karestakian@gmail.com");
        regPageSteps.setPassword("Credo@12309#%!");
        regPageSteps.clickRegister();
        regPageSteps.checkRegHelloMessageSuccessText("Hello");
    }
}
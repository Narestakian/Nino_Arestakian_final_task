package testSelenide;

import org.testng.annotations.Test;
import stepsSelenide.PhpTravelsRegSteps;
import utils.SetUp;

public class PhpTravelsRegTest extends SetUp {
    PhpTravelsRegSteps phpTravelsSteps = new PhpTravelsRegSteps();
    @Test

    public void phpTravelsTest(){
        phpTravelsSteps.openPage();
        phpTravelsSteps.clickAccountDropDown();
        phpTravelsSteps.clickAccountSignUp();
        phpTravelsSteps.clickFirstName("Nino");
        phpTravelsSteps.clickLastName("Arestakian");
        phpTravelsSteps.clickSelectCountry();
        phpTravelsSteps.clickSearchField("Georgia +995");
        phpTravelsSteps.clickGeorgianField();
        phpTravelsSteps.clickPhoneValue("591003647");
        phpTravelsSteps.clickEmailAddress("narestakian@gmail.com");
        phpTravelsSteps.clickPassword("Credo@123");
        phpTravelsSteps.scrollToSignUp();
        phpTravelsSteps.checkSubmitButtonIsDisabled();
        phpTravelsSteps.clickCheckBox();
        phpTravelsSteps.checkSubmitButtonIsEnable();
        phpTravelsSteps.clickSignUpButton();
        phpTravelsSteps.waitForSuccessPageAndAssertText();
    }
}

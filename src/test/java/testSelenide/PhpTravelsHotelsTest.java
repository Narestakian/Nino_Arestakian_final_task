package testSelenide;

import org.testng.annotations.Test;
import stepsSelenide.PhpTravelsHotelsSteps;
import utils.SetUp;

public class PhpTravelsHotelsTest extends SetUp {
    PhpTravelsHotelsSteps phpTravelsHotelsSteps =new PhpTravelsHotelsSteps();

    @Test
    public void phpTravelHotelsTest(){
        phpTravelsHotelsSteps.openHotelsPage();
        phpTravelsHotelsSteps.clickHotelsButton();
       phpTravelsHotelsSteps.selectCheckInDate();
       phpTravelsHotelsSteps.selectCheckOutDate();
    }

    }


package testSelenide;

import org.testng.annotations.Test;
import stepsSelenide.FillBookingInfoSteps;
import stepsSelenide.MostExpensiveHotelSteps;
import utils.SetUp;


public class MostExpensiveHotelTest extends SetUp {

    FillBookingInfoSteps fillBookingInfoSteps= new FillBookingInfoSteps();
    MostExpensiveHotelSteps mostExpensiveHotelSteps = new MostExpensiveHotelSteps();

 @Test(priority = 1)
    public void mostExpensiveHotelTest(){

     mostExpensiveHotelSteps.openHotelPage();
     mostExpensiveHotelSteps.findMostExpensiveHotel();
     mostExpensiveHotelSteps.checkToFindMostExpensiveHotel();
     mostExpensiveHotelSteps.clickOnMostExpensiveHotel();
     mostExpensiveHotelSteps.clickOnBookNow();
 }

 @Test(priority = 2)
 public void fillBookingInfoTest(){
     fillBookingInfoSteps.setFirstname("Nino");
     fillBookingInfoSteps.setLastName("Arestakian");
     fillBookingInfoSteps.setEmailField("n.arestakian@gmail.com");
     fillBookingInfoSteps.setPhoneField("591003647");
     fillBookingInfoSteps.setAddressField("Rustavi");
     fillBookingInfoSteps.setAdultFirstName("Joseph");
     fillBookingInfoSteps.setAdultLastName("Stalin");
     fillBookingInfoSteps.setSecondAdultFirstname("Adolf");
     fillBookingInfoSteps.setSecondAdultLastName("Hitler");
     fillBookingInfoSteps.setChildFirstName("Franklin D.");
     fillBookingInfoSteps.setChildLastName("Roosevelt");
     fillBookingInfoSteps.setSecondChildFirstName("Winston");
     fillBookingInfoSteps.setSecondChildLasName("Churchill");
     fillBookingInfoSteps.clickPayLaterButton();
     fillBookingInfoSteps.clickAgreementCheckBox();
     fillBookingInfoSteps.clickBookingConfirm();
     fillBookingInfoSteps.clickDownloadAsPdf();
     fillBookingInfoSteps.openNewPage();
     fillBookingInfoSteps.uploadFile();
     fillBookingInfoSteps.clickSubmitButton();


 }
}

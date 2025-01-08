package stepsSelenide;

import com.codeborne.selenide.Condition;
import elementsSelenide.PhpTravelsHotelsElements;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PhpTravelsHotelsSteps extends PhpTravelsHotelsElements {
    public LocalDate today = LocalDate.now();

    public void openHotelsPage() {
        open("https://www.phptravels.net/signup_success");
    }

    public void clickHotelsButton(){
        hotelsButton.click();
    }
    public void selectCheckInDate() {
        checkInField.shouldBe(Condition.visible);
        LocalDate checkInDate = today.plusMonths(1);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String formattedCheckInDate = checkInDate.format(formatter);

        checkInField.click();
        $x("//td[text()='" + formattedCheckInDate + "']").click();
    }
    public void selectCheckOutDate () {
        LocalDate today = LocalDate.now();
        String secondDate = today.plusDays(3).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        checkOutField.setValue(secondDate);

    }


}




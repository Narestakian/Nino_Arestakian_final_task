package elementsSelenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PhpTravelsHotelsElements {
    public SelenideElement hotelsButton = $x("//a[@href='https://www.phptravels.net/hotels']");
    public SelenideElement checkInField = $("#checkin");
    public SelenideElement checkOutField = $("#checkout");
    }



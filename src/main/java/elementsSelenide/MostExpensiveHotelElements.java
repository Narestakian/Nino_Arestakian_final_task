package elementsSelenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MostExpensiveHotelElements {
    public ElementsCollection hotelPrices = $$x("//span[contains(@class, 'price__num')]");
    public ElementsCollection hotelNames = $$x("//h6[@class='mb-0 mt-2 lenght-cover fs-5 mt-0']");
    public SelenideElement scrollToHotels = $x("/html/body/main/section[2]/div/div/div[1]/div/div/h5/strong");
    public SelenideElement clickOnBookNowButton = $x("//button[@type='submit' and contains(@class, 'btn btn-primary') and .//strong[text()=' Book Now ']]");
}

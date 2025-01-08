package stepsSelenide;

import elementsSelenide.MostExpensiveHotelElements;
import static com.codeborne.selenide.Selenide.open;
public class MostExpensiveHotelSteps extends MostExpensiveHotelElements {

    public void openHotelPage() {
        open("https://www.phptravels.net/hotels");
        scrollToHotels.scrollTo();
    }


    public String findMostExpensiveHotel() {
        double maxPrice = -1;
        String expensiveHotelName = "";


        for (int i = 0; i < hotelPrices.size(); i++) {
            String priceText = hotelPrices.get(i).getText().replaceAll("[^0-9.]", "");
            double price = Double.parseDouble(priceText);

            if (price > maxPrice) {
                maxPrice = price;
                expensiveHotelName = hotelNames.get(i).getText();
            }
        }
        return expensiveHotelName;

    }

    public void checkToFindMostExpensiveHotel() {
        String actualExpensiveHotelName = findMostExpensiveHotel();
        System.out.println("Actual: " + actualExpensiveHotelName);
    }

    public void clickOnMostExpensiveHotel() {
        String expensiveHotelName = findMostExpensiveHotel();

        for (int i = 0; i < hotelNames.size(); i++) {
            String hotelName = hotelNames.get(i).getText().trim();

            if (hotelName.equals(expensiveHotelName)) {
                hotelNames.get(i).click();
                break;
            }
        }

    }

    public void clickOnBookNow() {
        clickOnBookNowButton.scrollTo();
        clickOnBookNowButton.click();
    }
}


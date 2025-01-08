package stepsSelenium;

import elementsSelenium.ShopSortProductElements;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static utils.SetUp.driver;
import static utils.SetUp.findElement;

public class ShopSortProductSteps extends ShopSortProductElements {
    public void openShopPage(){
        driver.get("https://practice.automationtesting.in/shop/");
    }

    public void clickSortButton(){
        findElement(sortButton).click();
    }

    public void clickSortByLowToHigh(){
        findElement(sortLowToHighButton).click();
    }
    public boolean checkIfProductsSortedLowToHigh() {

        List<WebElement> productPricesElements = driver.findElements(productPriceLocator);


        List<Double> productPrices = new ArrayList<>();
        for (WebElement priceElement : productPricesElements) {
            String priceText = priceElement.getText().replace("₹", "").trim(); // Remove currency symbol (if applicable)
            productPrices.add(Double.parseDouble(priceText));
        }


        for (int i = 0; i < productPrices.size() - 1; i++) {
            if (productPrices.get(i) > productPrices.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}

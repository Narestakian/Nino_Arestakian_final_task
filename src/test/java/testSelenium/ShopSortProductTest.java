package testSelenium;

import org.testng.annotations.Test;
import stepsSelenium.ShopSortProductSteps;
import utils.SetUp;

public class ShopSortProductTest extends SetUp {
    ShopSortProductSteps shopSortProductSteps = new ShopSortProductSteps();

    @Test
    public void shopSortProducts() {


        shopSortProductSteps.openShopPage();
        shopSortProductSteps.clickSortButton();
        shopSortProductSteps.clickSortByLowToHigh();
        shopSortProductSteps.checkIfProductsSortedLowToHigh();

    }
}
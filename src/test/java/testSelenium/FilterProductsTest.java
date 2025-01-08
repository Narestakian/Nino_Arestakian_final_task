package testSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import stepsSelenium.FilterProductsSteps;
import utils.SetUp;

public class FilterProductsTest extends SetUp {
    FilterProductsSteps filterProductsSteps = new FilterProductsSteps();

    @Test
    public void filterProductsTest(){
        filterProductsSteps.openShopProductsPage();
        filterProductsSteps.filterByJavaScriptCategory();
        filterProductsSteps.verifyFilteredBooks();
        filterProductsSteps.applyPriceFilterBySlider();
        filterProductsSteps.clickOnFilterButton();
        Assert.assertTrue(filterProductsSteps.verifyOnlyOneBookDisplayed());




    }
}

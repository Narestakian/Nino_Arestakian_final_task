package stepsSelenium;

import elementsSelenium.FilterProductsElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static utils.SetUp.*;

public class FilterProductsSteps extends FilterProductsElements {

    public void openShopProductsPage() {
        driver.get("https://practice.automationtesting.in/shop/");
    }

    public void filterByJavaScriptCategory() {
        WebElement categoryCheckbox = findElement(javaScriptCategoryFilter);
        if (!categoryCheckbox.isSelected()) {
            categoryCheckbox.click();
        }
    }

    public boolean verifyFilteredBooks() {
        List<WebElement> filteredBooks = driver.findElements(bookList);

        for (WebElement book : filteredBooks) {
            if (!book.getText().contains("JavaScript")) {
                return false;
            }
        }
        return true;
    }

    public void clickOnFilterButton(){
        findElement(filterButton).click();
    }

    public void applyPriceFilterBySlider() {

        WebElement sliderHandle = findElement(sliderMoveOnTheLeft);
        actions.dragAndDropBy(sliderHandle ,150, 0).perform();
        findElement(filterButton).click();
    }


    public boolean verifyOnlyOneBookDisplayed() {
        List<WebElement> filteredBooks = driver.findElements(bookList);
        return filteredBooks.size() == 1;
    }


}

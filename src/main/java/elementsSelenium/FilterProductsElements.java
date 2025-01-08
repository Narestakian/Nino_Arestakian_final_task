package elementsSelenium;

import org.openqa.selenium.By;

public class FilterProductsElements {
    public By javaScriptCategoryFilter = By.xpath("//a[@href='https://practice.automationtesting.in/product-category/javascript/']");
    public By bookList = By.cssSelector(".product");
    public By filterButton = By.xpath("//button[text()='Filter']");
    public By sliderMoveOnTheLeft = By.xpath("//div[@id='woocommerce_price_filter-2']//span[contains(@class, 'ui-slider-handle') and starts-with(@style, 'left:')]");
}

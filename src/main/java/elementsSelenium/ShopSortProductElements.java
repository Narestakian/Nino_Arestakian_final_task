package elementsSelenium;

import org.openqa.selenium.By;

public class ShopSortProductElements {
    public By sortButton = By.xpath("//select[@name='orderby']/option[text()='Default sorting']");
    public By sortLowToHighButton = By.xpath("//select[@name='orderby']/option[text()='Sort by price: low to high']");
    public By productPriceLocator = By.xpath("//span[@class='woocommerce-Price-amount amount']");

}

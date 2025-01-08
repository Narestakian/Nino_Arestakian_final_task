package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;



public class SetUp {
    public static JavascriptExecutor js;
     public static  Actions actions;

    public static WebDriver driver;
    public static WebDriverWait globalWait;

    public static void SetUpGlobalWait(){
        globalWait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebElement findElement(By element){
        return globalWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


@BeforeMethod
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        Configuration.browserCapabilities = options;
        Configuration.browser = "chrome";
        Configuration.browserSize = null;
        Configuration.timeout = 15000;
        Configuration.downloadsFolder = "./downloads";

        WebDriverManager.chromedriver().setup();
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
        actions = new Actions(driver);

        SetUpGlobalWait();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class testDisableInput {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testDisableInput() {
        driver.get("http://uitestingplayground.com/disabledinput");


        WebElement inputField = driver.findElement(By.cssSelector("input.form-control"));


        WebElement enableButton = driver.findElement(By.cssSelector("button#enableButton"));
        enableButton.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(inputField));
        Assert.assertTrue(inputField.isEnabled(), "Input field was not enabled after clicking the button!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
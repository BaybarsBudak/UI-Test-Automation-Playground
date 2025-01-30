import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class testLoadDelay {

    @Test
    public void testLoadDelay() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/loaddelay");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Button Appearing After Delay']")));
        button.click();

        driver.quit();
    }
}

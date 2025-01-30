import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class testClientSideDelay {


    @Test
    public void testClientSideDelay() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/clientdelay");

        WebElement button = driver.findElement(By.id("ajaxButton"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement ajaxContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
        assert ajaxContent.getText().contains("Data calculated on the client side.");

        driver.quit();
    }
}

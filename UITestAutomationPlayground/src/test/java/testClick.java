import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class testClick {

    @Test
    public void testClick() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/click");

        WebElement button = driver.findElement(By.id("badButton"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
        assert successMessage.getText().contains("Button clicked");

        driver.quit();
    }


}

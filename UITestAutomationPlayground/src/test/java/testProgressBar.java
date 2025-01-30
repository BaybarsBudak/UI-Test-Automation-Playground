import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class testProgressBar {

    @Test
    public void testProgressBar() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/progressbar");

        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement progressBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='progressBar' and contains(text(), '75%')]")));
        assert progressBar.getText().contains("75%");

        driver.quit();
    }


}

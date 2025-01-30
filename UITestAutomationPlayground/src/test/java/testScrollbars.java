import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testScrollbars {

    @Test
    public void testScrollbars() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/scrollbars");

        WebElement button = driver.findElement(By.id("hidingButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();

        driver.quit();
    }
}

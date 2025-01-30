import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testOverlappedElement {

    @Test
    public void testOverlappedElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/overlapped");

        WebElement nameField = driver.findElement(By.id("name"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nameField);
        nameField.sendKeys("Test User");

        driver.quit();
    }


}

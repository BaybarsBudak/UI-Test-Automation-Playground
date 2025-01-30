import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testVisibility {


    @Test
    public void testVisibility() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/visibility");

        WebElement hideButton = driver.findElement(By.id("hideButton"));
        hideButton.click();

        WebElement removedButton = driver.findElement(By.id("removedButton"));
        assert !removedButton.isDisplayed();

        driver.quit();
    }



}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testDynamicId {

    @Test
    public void testDynamicID() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/dynamicid");

        WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Button with Dynamic ID')]"));
        button.click();

        driver.quit();
    }
}
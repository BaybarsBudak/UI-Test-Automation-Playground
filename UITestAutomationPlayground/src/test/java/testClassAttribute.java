import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testClassAttribute {

    @Test
    public void testClassAttribute() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/classattr");

        WebElement button = driver.findElement(By.xpath("//button[contains(concat(' ', @class, ' '), ' btn-primary ')]"));
        button.click();

        driver.quit();
    }
}

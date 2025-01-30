import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testMouseOver {


    @Test
    public void testMouseOver() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/mouseover");

        WebElement link = driver.findElement(By.linkText("Click me"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).click().perform();

        WebElement clickCount = driver.findElement(By.id("clickCount"));
        assert clickCount.getText().contains("1");

        driver.quit();
    }



}

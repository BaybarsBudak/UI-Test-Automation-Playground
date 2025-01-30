import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testHiddenLayers {


    @Test
public void testHiddenLayers() {
    WebDriver driver = new ChromeDriver();
    driver.get("http://uitestingplayground.com/hiddenlayers");

    WebElement button = driver.findElement(By.id("greenButton"));
    button.click();

    driver.quit();
}
}

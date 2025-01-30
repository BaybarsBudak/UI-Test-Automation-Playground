import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testTextInput {


    @Test
    public void testTextInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/textinput");

        WebElement inputField = driver.findElement(By.id("newButtonName"));
        inputField.sendKeys("New Button Text");

        WebElement button = driver.findElement(By.id("updatingButton"));
        button.click();

        assert button.getText().equals("New Button Text");

        driver.quit();
    }
}

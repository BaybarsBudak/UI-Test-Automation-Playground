import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testSampleApp {

    @Test
    public void testSampleApp() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/sampleapp");

        WebElement usernameField = driver.findElement(By.name("UserName"));
        usernameField.sendKeys("testuser");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("pwd");

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        WebElement statusLabel = driver.findElement(By.id("loginstatus"));
        assert statusLabel.getText().contains("Welcome");

        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testVerifyText {

    @Test
    public void testVerifyText() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/verifytext");

        WebElement textElement = driver.findElement(By.xpath("//span[contains(text(), 'Welcome')]"));
        assert textElement.getText().contains("Welcome");

        driver.quit();
    }



}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testDynamicTable {

    @Test
    public void testDynamicTable() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/dynamictable");

        WebElement cpuUsage = driver.findElement(By.xpath("//span[contains(text(), 'Chrome')]/following-sibling::span[contains(text(), '%')]"));
        assert cpuUsage.getText().contains("%");

        driver.quit();
    }





}

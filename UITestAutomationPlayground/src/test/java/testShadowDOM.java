import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testShadowDOM {

    @Test
    public void testShadowDOM() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/shadowdom");

        try {

            WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-host"));


            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);


            WebElement shadowContent = shadowRoot.findElement(By.cssSelector(".shadow-content"));


            String text = shadowContent.getText();
            System.out.println("Shadow DOM Content: " + text);
            assert text.contains("Shadow DOM Content");

        } catch (Exception e) {
            System.out.println("Hata oluştu: " + e.getMessage());
        } finally {

            driver.quit();
        }
    }
}
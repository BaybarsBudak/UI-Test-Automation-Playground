import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testFileUpload {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testFileUpload() {
        driver.get("http://uitestingplayground.com/fileupload");


        WebElement fileInput = driver.findElement(By.id("file"));
        fileInput.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testfile.txt");


        WebElement uploadButton = driver.findElement(By.id("upload-button"));
        uploadButton.click();


        WebElement uploadStatus = driver.findElement(By.id("uploaded-file"));
        Assert.assertTrue(uploadStatus.isDisplayed(), "File upload failed!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
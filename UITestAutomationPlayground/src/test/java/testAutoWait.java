import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAutoWait {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();


        try{

            driver.get("http://uitestingplayground.com/autowait");
            System.out.println("go Page");

            WebElement apply3sec = driver.findElement(By.xpath("//*[@id=\"applyButton3\"]"));
            apply3sec.click();
            System.out.println("3sec click");

            Thread.sleep(3000);

            WebElement button = driver.findElement(By.xpath("//*[@id=\"target\"]"));
            button.click();






        }catch (Exception e){







        }finally {
            driver.quit();

        }


    }





}
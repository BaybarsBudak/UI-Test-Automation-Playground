import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class testAlert {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();



        try{

            driver.get("http://uitestingplayground.com/alerts");
            System.out.println("go site");

            WebElement alertButton = driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
            alertButton.click();
            System.out.println("alerbutton click");

            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot");

            Thread.sleep(2000);
            System.out.println("2 sec");

            WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
            confirmButton.click();
            System.out.println("confirmButton clicked");

            Robot robot1 = new Robot();
            robot1.keyPress(KeyEvent.VK_ENTER);
            robot1.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot 1");

            Thread.sleep(2000);
            System.out.println("2 sec");

            Robot robot2 = new Robot();
            robot2.keyPress(KeyEvent.VK_ENTER);
            robot2.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot 2");

            WebElement promptButton = driver.findElement(By.xpath("//*[@id=\"promptButton\"]"));
            promptButton.click();
            System.out.println("promptButton clicked");

            Thread.sleep(2000);
            System.out.println("2 sec");

            Robot robot3 = new Robot();
            robot3.keyPress(KeyEvent.VK_ENTER);
            robot3.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot3");

            Thread.sleep(2000);
            System.out.println("2 sec");

            Robot robot4 = new Robot();
            robot4.keyPress(KeyEvent.VK_ENTER);
            robot4.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot 4");

            Thread.sleep(2000);
            System.out.println("2 sec");

            Robot robot5 = new Robot();
            robot5.keyPress(KeyEvent.VK_ENTER);
            robot5.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot 5");

            Thread.sleep(2000);
            System.out.println("2 sec");

            Robot robot6 = new Robot();
            robot6.keyPress(KeyEvent.VK_ENTER);
            robot6.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot 6");

            Thread.sleep(2000);
            System.out.println("2 sec");

            Robot robot7 = new Robot();
            robot7.keyPress(KeyEvent.VK_ENTER);
            robot7.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("robot 7");


        }catch (Exception e ){

            e.printStackTrace();

        }finally {

            driver.quit();
            System.out.println("driver quit");
        }





    }






}
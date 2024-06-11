import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class fileUpload {

    public static void main(String[] args) throws AWTException {
        //Launch chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //open Url

        driver.get("https://demoqa.com/upload-download");

        //find webelement choose
      //driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\user\\Desktop\\hibernate.txt");
        WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        Actions act = new Actions(driver);

        act.moveToElement(button).click().perform();

        Robot rb = new Robot();
        rb.delay(2000);

        StringSelection ss = new StringSelection("C:\\Users\\user\\Desktop\\hibernate.txt");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        //perform control + V action to past file

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);

    }
}

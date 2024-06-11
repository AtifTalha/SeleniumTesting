import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        //find alert button
       // driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

        //switch to alert window and accept the alert

        // driver.switchTo().alert().accept(); //ok button

        //confirm Ok Or Cancel the alert
//        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();

        driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();


        //alert with InputBox
//        WebElement button = driver.findElement(By.xpath("//button[@id='promtButton']"));
//        Actions act = new Actions(driver);
//        act.moveToElement(button).click().perform();


        driver.switchTo().alert().sendKeys("Atif");
        driver.switchTo().alert().accept();

    }
}

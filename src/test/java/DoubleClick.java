import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/buttons");

        WebElement DoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

        Actions act = new Actions(driver);

        act.doubleClick(DoubleClick).perform();



    }
}

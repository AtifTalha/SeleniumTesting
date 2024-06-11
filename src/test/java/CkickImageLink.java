import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CkickImageLink {


    public static void main(String[] args) {

        //launch Chrome Browser
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //Open the Url
        driver.get("https://www.bigcommerce.com/articles/ecommerce/best-ecommerce-website-design/");

        //find web element image and open Url
        driver.findElement(By.xpath("(//img[@class='hidden md:block'])[1]")).click();
       // System.out.println(driver.getTitle());
       if (driver.getTitle().equals("Enterprise ecommerce, simplified. | BigCommerce")){
           System.out.println("test passed");

       }else{
           System.out.println("Test failed");
       }

        driver.close();

    }
}

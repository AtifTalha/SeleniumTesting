import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonCount {


    public static void main(String[] args) {

        //launch chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //maximise browser
        driver.manage().window().maximize();

        //open the Url
       // driver.get("https://designsystem.digital.gov/components/radio-buttons/");
        driver.get("https://www.calculator.net/");

        //finding radio buttons
        List<WebElement> listOfRadioButtons =  driver.findElements(By.tagName("label"));

        //print out the total no of radio buttons
         System.out.println("Total radio Buttons: " + listOfRadioButtons.size());

         //close the current browser



    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CountPrintHyperLink {

    public static void main(String[] args) {
        //launch chrome Browser
    System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    //launch web page https://www.calculator.net/
        driver.get("https://www.calculator.net/");

        //List<WebElement> linkElements =  driver.findElement(By.tagName("a"));
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

  System.out.println("Total links on webpage: " + linkElements.size());

  for(WebElement el:linkElements){
      System.out.println(el.getText());
  }







    }

}

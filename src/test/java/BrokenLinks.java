import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //wait for 10 sec

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open Url

        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        int resCode = 200; //valid link
        int brokenLinksCount = 0 ;

        System.out.println("Total links on page: " + linkList.size());

       for(WebElement el:linkList){
           String url = el.getAttribute("href");
           try{
               URL urllink = new URL(url);
               HttpURLConnection huc = (HttpURLConnection)urllink.openConnection();
               huc.setRequestMethod("HEAD");
               huc.connect();

               resCode = huc.getResponseCode();

               if (resCode >=400)
               {
                   System.out.println(url + "Broken link");
                   brokenLinksCount++;
               }
           }
           catch (MalformedURLException e){

           }
           catch (Exception e){

           }
       }
        System.out.println("total Broken links : " + brokenLinksCount);
    }

}

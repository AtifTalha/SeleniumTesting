import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumTest {
   public static WebDriver driver ;
@BeforeTest
    public void Setup(){
    System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

driver  = new ChromeDriver();
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");



}
@Test
public void testSteps()  {
driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();

try {
    Thread.sleep(1000);
}
catch (InterruptedException e ){
    throw new RuntimeException();
}
                    //1000 milliseconds is one second.


    driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

    WebElement webElement = driver.findElement(By.id("ShoeType"));
String firstValue = webElement.getText();
    String expectedValue = "Formal Shoes";

    Assert.assertEquals(expectedValue,firstValue);
try {
    Thread.sleep(2000);
}
catch (InterruptedException e){
    throw new RuntimeException();
}

driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button")).click();
    driver.close();
}
}

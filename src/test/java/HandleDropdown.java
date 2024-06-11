import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));

        Select dropdown = new Select(element);

//        dropdown.selectByVisibleText("Option 1");

        //dropdown.selectByValue("2");
        dropdown.selectByIndex(1);
if (dropdown.isMultiple()){
    System.out.println("Dropdown is multiple");
}else {
    System.out.println("dropdown is not multiple");
}

        List<WebElement> allOptions = dropdown.getOptions();
        System.out.println("Total options" + allOptions.size());
for (WebElement el:allOptions){
    System.out.println(el.getText());
}


    }
}

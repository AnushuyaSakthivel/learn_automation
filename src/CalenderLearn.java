import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalenderLearn {

    public static void main(String  []args){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
        List<WebElement> all =driver.findElements(By.cssSelector(".ui-state-default"));
        int count = all.size();
        for (int i =1;i <= count;i++){
            String date = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
            if(date.equalsIgnoreCase("23")){
                driver.findElement(By.cssSelector(".ui-state-default")).click();
                System.out.println("selcted");
                break;
            }
        }


    }


}

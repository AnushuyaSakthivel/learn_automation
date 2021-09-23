import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main (String [] args){
        System.setProperty("webdriver.chrome.drive","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());

        //limiting driver scope to footer level
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //limiting to another level

        WebElement minidriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(minidriver.findElements(By.tagName("a")).size());

        //I got output for this also
      //  System.out.println(driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).size());

        for (int i=1; i < minidriver.findElements(By.tagName("a")).size() ; i++){
            String pressingcontrol = Keys.chord(Keys.CONTROL,Keys.ENTER);//to open in new tab
            minidriver.findElements(By.tagName("a")).get(i).sendKeys(pressingcontrol);//using send keys to click on particlular link by pressing control at the same time

            System.out.println(driver.getTitle());





        }
        Set<String> winHandles = driver.getWindowHandles();
        Iterator<String> it = winHandles.iterator();

        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());

        }







    }
}

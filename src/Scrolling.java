import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Scrolling {

    public static void main (String [] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        /* //Scrolling
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=100");

//div[@class='tableFixHead']/table/tbody/tr/td[4] this is too big
        //xpath //td[4]
        //css td:nth-child(4) or .tableFixHead td:nth-child(4)


         */
        /*

        //Assignment:
        WebElement tbl = driver.findElement(By.cssSelector(".table-display"));
        System.out.println("Rows : "+tbl.findElements(By.tagName("tr")).size());
        System.out.println("columns : "+ tbl.findElements(By.tagName("th")).size());

        System.out.println(tbl.findElements(By.tagName("tr")).get(2).getText());

         */
        /*

        //Assignment 2:

        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("uni");
        Thread.sleep(3000);
       List<WebElement> sugg = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] div"));
       for (WebElement indi : sugg){
           if(indi.getText().equalsIgnoreCase("United Kingdom (UK)")){
               indi.click();
               break;

           }

       }
        System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));


         */








    }


}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class WebTable {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        /*
        //sorting
        driver.findElement(By.xpath("//tr/th[1]")).click();//selct column header

        List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));//first column elements

        List<String> uiSort = items.stream().map(s->s.getText()).collect(Collectors.toList());

        List<String> res = items.stream().map(s->s.getText()).sorted().collect(Collectors.toList());


        Assert.assertTrue(uiSort.equals(res));


        //Pagination
        //List <String> Page =items.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());


         */
        //Search
        driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("rice");
        List<WebElement> allelement = driver.findElements(By.xpath("//tr/td[1]"));

        List <WebElement> page = allelement.stream().filter(s->s.getText().contains("rice")).collect(Collectors.toList());
        Assert.assertEquals(allelement.size(),page.size());


    }
}

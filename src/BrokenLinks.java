import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    public static int getstatuscode(String url) throws IOException {
        HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respcode =  conn.getResponseCode();

        return respcode;


    }

    public static void main (String [] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        //STep1 - get all urls by href attr
        //use java to get status code
        //Status code >400, then broken

        /*
//for one singlr url
       String target = driver.findElement(By.xpath("//a[contains(text(),'Broken Link')]")).getAttribute("href");

       HttpURLConnection conn=(HttpURLConnection) new URL(target).openConnection();
       conn.setRequestMethod("HEAD");
       conn.connect();
        int respcode =  conn.getResponseCode();
        System.out.println(respcode);
        if (respcode >400){
            System.out.println("It is a broken link");

        }


         */



        List<WebElement> allLink = driver.findElements(By.cssSelector("div[id='gf-BIG'] a"));
        SoftAssert sa = new SoftAssert();
        for (WebElement link : allLink){
            String individualLink = link.getAttribute("href");
           int rescode = getstatuscode(individualLink);
           // Assert.assertTrue(rescode<400,"This link "+individualLink+"is not broken");
            sa.assertTrue(rescode<400,"This link "+individualLink+"is not broken");



            /*
           if (rescode > 400){
               System.out.println(rescode + "SO it is broken link");
           }
           else{
               System.out.println(rescode + " It is not broken link");
           }

             */
        }
        sa.assertAll();




    }



}

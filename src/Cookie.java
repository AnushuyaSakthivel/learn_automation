import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;

public class Cookie {
    public static  void main (String [] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
/*
        //delete all the cookies
        driver.manage().deleteAllCookies();

        //delete one cookie
        driver.manage().deleteCookieNamed("sessioncookie");

        //delete the session cookie and ake sure it gets logout


 */
        //Scrrenshoting
        //casting driver obj to screenshot obj

       File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrnshot, new File("D:\\sample.png"));
        //with c drive, Access denied exception occurs








    }
}

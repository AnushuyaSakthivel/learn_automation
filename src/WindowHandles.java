import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WindowHandles {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> handle = driver.getWindowHandles();
        Iterator<String> it = handle.iterator();
        String parentID = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        String whole = driver.findElement(By.cssSelector(".im-para.red")).getText();
        String email="";
        Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(whole);
        while (m.find()) {
           email = m.group();
        }
        driver.switchTo().window(parentID);
        driver.findElement(By.cssSelector("#username")).sendKeys(email);



    }
}

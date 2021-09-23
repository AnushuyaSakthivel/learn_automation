import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSession {


    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions act = new Actions(driver);
        /* hover over a element
        act.moveToElement(driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span"))).build().perform();
 */
        /*
        //uppercase
        WebElement searchbox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        act.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("WashingMachine").doubleClick().build().perform();
*/
        //rightclick
        act.moveToElement(driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span"))).contextClick().build().perform();



    }


}

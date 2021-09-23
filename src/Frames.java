import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //frame by webelement
        //WebElement framecls = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.cssSelector("#draggable"));
        WebElement dest = driver.findElement(By.cssSelector("#droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(src, dest).build().perform();



    }

}

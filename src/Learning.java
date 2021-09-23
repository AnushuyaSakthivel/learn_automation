import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Learning {


    public static void main (String args[])
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String requiredProduct[] = {"Cucumber","Mushroom","Beans"};
        addItemToCart(driver,requiredProduct);


        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='cart-preview active']/div[@class='action-block']/button")).click();
        //Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
        WebDriverWait w = new WebDriverWait(driver,10);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
    }


    public static void addItemToCart(WebDriver driver, String requiredProduct[])
    {
        List<WebElement> prod = driver.findElements(By.xpath("//h4[@class='product-name']"));
        int count=0;

        /* select only cucumber and add to cart
        for (int i =0;i< prod.size();i++){
            String target = prod.get(i).getText();
            if (target.contains("Cucumber")){
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }
*/
        //if suppose have multiple items to select then go with this approach
        //create an array of items of req items
        //convert it into arrylist and use contains methodto check the item is present in req item
        //formate the name according to input



        for (int i = 0; i< prod.size();i++){
            String[] target = prod.get(i).getText().split(" -");
            List al = Arrays.asList(requiredProduct);
            if(al.contains(target[0])){
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                count++;
                if(count == requiredProduct.length){
                    break;
                }
            }
        }



    }


}

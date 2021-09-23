import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdowns {
//https://www.cleartrip.com/
    //https://rahulshettyacademy.com/AutomationPractice/


    public static void main (String[] args) throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.cleartrip.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dd = new Select(staticDropdown);
        dd.selectByIndex(2);
        System.out.println(dd.getFirstSelectedOption().getText());//its writtern type is webelement
        dd.selectByValue("USD");//value is attribute
*/
        //looping to click multiple time
/*        driver.findElement(By.id("divpaxinfo")).click();
        for (int i =1; i<3;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
*//*
        //dynamic dropdown
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
*/
        /*
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : suggestions){
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
            else{
                continue;
            }
        }
        */
        /*
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
        // System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
         driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
       // System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
        List<WebElement> getcheckboxcount = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(getcheckboxcount.size());

*/
        /*

       driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        //Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        //Thread.sleep(3000);
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

        List<WebElement> count = driver.findElements(By.xpath("//div[@id='checkbox-example'] //input[@type='checkbox']"))
        System.out.println(count.size());

*/
/*
        //System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
        if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")){
            System.out.println("Object is enabled");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("object is disabled");
            Assert.assertFalse(false);
        }

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
        //System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
        if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")){
            System.out.println("Object is enabled");
                Assert.assertTrue(true);
        }
        else{
            System.out.println("object is disabled");
            Assert.assertFalse(false);
        }
*/
        /* e2e
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
        if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")){
            System.out.println("Object is enabled");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("object is disabled");
            Assert.assertFalse(false);
        }

        driver.findElement(By.id("divpaxinfo")).click();
        for (int i =1; i<3;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dd = new Select(staticDropdown);
        dd.selectByIndex(2);

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

*/
        /*
driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Anushuya");
driver.findElement(By.cssSelector("#alertbtn")).click();
System.out.println("alert came");
System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().accept();
driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
driver.switchTo().alert().dismiss();

*/
        /*
Cleartrip.com place selction dropdown
        driver.switchTo().alert().dismiss();
driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("new");
       driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
List<WebElement> sugg =driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
for (WebElement places : sugg){
    if(places.getText().equalsIgnoreCase("New york")){
        places.click();
        break;
    }
    else{
        continue;
    }
    }
*/
        //clear trip assignment
       WebElement adult = driver.findElement(By.xpath("//select[@id='Adults']"));
       Select ad = new Select(adult);
       ad.selectByValue("3");

       WebElement children = driver.findElement(By.xpath("//select[@id='Childrens']"));
       Select child = new Select(children);
       child.selectByIndex(2);

       WebElement infants = driver.findElement(By.xpath("//select[@id='Infants']"));
       Select inf = new Select(infants);
       inf.selectByVisibleText("1");

       driver.findElement(By.cssSelector("#DepartDate")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("a.ui-state-default.ui-state-highlight.ui-state-active")).click();

       driver.findElement(By.cssSelector("#MoreOptionsLink")).click();

       WebElement classtype = driver.findElement(By.xpath("//select[@id='Class']"));
       Select classtypes = new Select(classtype);
       classtypes.selectByVisibleText("Premium Economy");

       driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("spicejet");






    }




}

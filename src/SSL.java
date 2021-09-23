import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.security.DrbgParameters;

public class SSL {

    public static void main (String [] args){
        //genral chrome browser
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        //cap.acceptInsecureCerts();
        //or can be done as
        cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);

        //belongs to chrome browser
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
    }
}

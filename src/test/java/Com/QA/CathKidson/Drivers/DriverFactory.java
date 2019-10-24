package Com.QA.CathKidson.Drivers;

import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory() {
        PageFactory.initElements(driver, this);
    }

    public void Browser(String browser) {
        switch (browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                driver = new InternetExplorerDriver();
                break;
        }
    }

    public void setUpUrl(String url) {
        driver.get(url);
    }

    public void maximiseWindow() {
        driver.manage().window().maximize();
    }


    public void timeOut() {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    @FindBy(css =".cookie_cta")
    private WebElement deleteCookie;
    public void deleteCookies() {
        deleteCookie.click();

    }
   // public void closeBrowser(){
     //   driver.close();
   // }
}

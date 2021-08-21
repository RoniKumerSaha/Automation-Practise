package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import testData.Browser;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class DriverSetup {
    private static WebDriver driver;


    public static void setUpDriver(){
        System.setProperty("webdriver.chrome.driver", Browser.DRIVER_PATH);
        System.setProperty("webdriver.chrome.silentOutput", Browser.SILENT_OUTPUT);
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Browser.TIMEOUT, TimeUnit.SECONDS);
        driver.get(Browser.URL);
    }

    public static void closeDriver(){
        driver.quit();
    }
}

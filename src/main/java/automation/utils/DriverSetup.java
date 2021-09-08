package automation.utils;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class DriverSetup {
    public static WebDriver driver;
    //public static HomePage homePage;

    public static void setUpDriver(){
        System.setProperty("webdriver.chrome.driver", Browser.DRIVER_PATH);
        System.setProperty("webdriver.chrome.silentOutput", Browser.SILENT_OUTPUT);
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver = setEventListener(driver);
        driver.get(Browser.URL);
       // homePage = new HomePage(driver);
    }

    public static WebDriver setEventListener(WebDriver driver){
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        MyWebdriverEventListener myWebdriverEventListener = new MyWebdriverEventListener();
        eventFiringWebDriver.register(myWebdriverEventListener);
        return eventFiringWebDriver;
    }

    public static void takeScreenShot(Scenario scenario){
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                com.google.common.io.Files.move(screenshot, new File("output/"+ scenario.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static void closeDriver(){
        driver.quit();
    }
}

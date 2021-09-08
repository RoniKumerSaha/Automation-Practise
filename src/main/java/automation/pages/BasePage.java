package automation.pages;

import automation.utils.Browser;
import automation.utils.DriverSetup;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BasePage extends DriverSetup{
    public BasePage() {
        initElements(driver, this);
    }
    public String getPageTitle(){
        return driver.getTitle();
    }

    public void waitFor(WebElement what, int howLong){
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(howLong))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class,NullPointerException.class);
        wait.until(ExpectedConditions.visibilityOf(what));
    }
    public void waitFor(WebElement what){
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(Browser.TIMEOUT))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class,NullPointerException.class);
        wait.until(ExpectedConditions.visibilityOf(what));
    }


    public void closeTab(){
        driver.close();
    }
    public void switchToNewTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }

    public void switchToMainWindow(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }
}

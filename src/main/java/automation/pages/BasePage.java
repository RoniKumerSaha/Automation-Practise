package automation.pages;

import automation.utils.Browser;
import automation.utils.DriverSetup;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BasePage extends DriverSetup{
    public BasePage() {
        initElements(driver, this);
    }
    public String getPageTitle(){
        return driver.getTitle();
    }

    public void waitFor(WebElement what, int howMuch){
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(howMuch))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class,NullPointerException.class);
        wait.until(ExpectedConditions.visibilityOf(what));
    }
    public void waitFor(WebElement what){
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(Browser.TIMEOUT))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class,NullPointerException.class);
        wait.until(ExpectedConditions.visibilityOf(what));
    }
}

package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePage extends BasePage{
    @FindBy(xpath = "//img[@src='Jmeter720.png']")
    WebElement elementInsideIframe;

    public boolean elementDisplayed() {
        //switchToIframe("a077aa5e");
        return elementInsideIframe.isDisplayed();
    }

    public void switchToIframe(String id){
        driver.switchTo().frame(id);
    }
}

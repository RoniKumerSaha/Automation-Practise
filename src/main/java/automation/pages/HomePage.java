package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[@title='Contact Us'])")
    public WebElement contactUs;

    public void clickContactUs(){
        this.contactUs.click();
    }

}

package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class SocialMediaPage extends BasePage{
    @FindBy(css = "div[class='css-1dbjc4n r-6gpygo r-14gqq1x']")
    WebElement twitterAccountName;

    public String getAccountName(){
        wait(2);
        return twitterAccountName.getText();
    }

}

package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
    @FindBy(xpath = "//h1")
    private WebElement productTitle;

    public String getProductName(){
        return productTitle.getText();
    }
}

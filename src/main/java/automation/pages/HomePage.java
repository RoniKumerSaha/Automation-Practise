package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[@title='Contact Us'])")
    private WebElement contactUs;

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenCategory;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    private WebElement dressesCategory;

    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    private WebElement tShirtsCategory;

    public boolean categoryVisible(){
        return (womenCategory.isDisplayed() && dressesCategory.isDisplayed() && tShirtsCategory.isDisplayed());
    }

    public void selectCategory(String category){
        switch (category){
            case "Women":
                womenCategory.click();
                break;
            case "Dresses":
                dressesCategory.click();
                break;
            case "T-shirts":
                tShirtsCategory.click();
                break;
        }
    }

    public void selectProduct(String product){
        driver.findElement(By.xpath("(//a[@title='" + product + "'])[2]")).click();
    }

}

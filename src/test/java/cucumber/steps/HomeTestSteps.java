package cucumber.steps;
import automation.pages.HomePage;
import automation.pages.ProductDetailsPage;
import automation.utils.DriverSetup;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomeTestSteps extends DriverSetup {
    @Given("^I am on Home Page$")
    public void i_am_on_Home_Page()  {
        Assert.assertTrue(new HomePage().getPageTitle().contains("My Store"));
    }
    @Then("^I should see my all the product categories$")
    public void iShouldSeeMyAllTheProductCategories() {
        Assert.assertTrue(new HomePage().categoryVisible());
    }

    @When("^I select category \"([^\"]*)\"$")
    public void iSelectCategory(String category) {
        new HomePage().selectCategory(category);
    }

    @And("^I click a product \"([^\"]*)\"$")
    public void iClickAProduct(String product) {
        new HomePage().selectProduct(product);
    }

    @Then("^I should see details of the product \"([^\"]*)\"$")
    public void iShouldSeeDetailsOfTheProduct(String product) {
        Assert.assertTrue(new ProductDetailsPage().getProductName().contains(product));
    }
}

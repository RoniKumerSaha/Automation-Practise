package cucumber.steps;
import automation.pages.HomePage;
import automation.utils.DriverSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomeTestSteps extends DriverSetup {
    @Given("^I am on Home Page$")
    public void i_am_on_Home_Page()  {
        Assert.assertTrue(new HomePage().getPageTitle().contains("My Store"));
    }

    @Then("^I should see my all the options$")
    public void i_should_see_my_all_the_options() {
        HomePage homepage = new HomePage();
        homepage.waitFor(homepage.contactUs, 10);
    }
}

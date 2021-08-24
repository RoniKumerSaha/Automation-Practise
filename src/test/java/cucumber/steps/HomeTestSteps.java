package cucumber.steps;
import automation.pages.HomePage;
import automation.utils.DriverSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomeTestSteps extends DriverSetup {
    @Given("^I am on Home Page$")
    public void i_am_on_Home_Page()  {
        System.out.println("Working");
        Assert.assertTrue(new HomePage().getPageTitle().contains("My store"));
    }

    @Then("^I should see my all the options$")
    public void i_should_see_my_all_the_options() {
        System.out.println("Working");
        HomePage homepage = new HomePage();
        homepage.waitFor(homepage.contactUs);
        homepage.contactUs.click();
    }
}

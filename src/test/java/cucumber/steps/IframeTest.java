package cucumber.steps;

import automation.pages.HomePage;
import automation.pages.IframePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class IframeTest {

    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String siteUrl)  {
        HomePage.driver.get(siteUrl);
    }

    @Then("^I should be able to see error message$")
    public void iShouldBeAbleToSeeErrorMessage() {
        Assert.assertTrue(new IframePage().elementDisplayed());
    }
}

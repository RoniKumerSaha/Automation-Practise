package cucumber.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeTestSteps {
    @Given("^I am on Home Page$")
    public void i_am_on_Home_Page()  {
        System.out.println("Working");
    }

    @Then("^I should see my all the options$")
    public void i_should_see_my_all_the_options() {
        System.out.println("Working");
    }
}

package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApiSteps {
    Response res = null;
    @Given("^I create a GET api call for user$")
    public void iCreateAGETApiCallForUser() {
        RestAssured.baseURI = "https://gorest.co.in";
        res = RestAssured.given()
                .header("Authorization","Bearer 840644080a66c732d9c77f0e4d5fc6040778d17037664cec10d4b08421cad8f3")
                .get("/public/v1/users");
    }

    @Then("^I should see all users$")
    public void iShouldSeeAllUsers() {
        System.out.println(res.asString());
    }
}

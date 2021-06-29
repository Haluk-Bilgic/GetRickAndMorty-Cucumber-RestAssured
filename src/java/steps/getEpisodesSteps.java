package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getEpisodesSteps {

    @Given("^I perform Get operations for episodes$")
    public void ı_perform_Get_operations_for_episodes() throws Throwable {
given().contentType(ContentType.JSON);
    }

    @Then("^I should see verify name as \"([^\"]*)\"$")
    public void ı_should_see_verify_name_as(String name) throws Throwable {
GetMethods.episode(name);
    }

}

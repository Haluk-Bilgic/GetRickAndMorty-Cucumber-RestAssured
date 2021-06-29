package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getLocationSteps {
    @Given("^I perform Get operations for Location$")
    public void ı_perform_Get_operations_for_Location() throws Throwable {
given().contentType(ContentType.JSON);
    }

    @Then("^I should see verify wrong Location$")
    public void ı_should_see_verify_wrong_Location() throws Throwable {
GetMethods.location();
    }

}

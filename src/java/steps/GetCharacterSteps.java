package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GetCharacterSteps {

    @Given("^I perform Get Operations for \"([^\"]*)\"$")
    public void ı_perform_Get_Operations_for(String url) throws Throwable {

    }

    @Given("^I perform Get for the Character number \"([^\"]*)\"$")
    public void ı_perform_Get_for_the_Character_number(String number) throws Throwable {
GetMethods.getMethodCharacter(number);
    }

    @Then("^I should see Character's name as \"([^\"]*)\"$")
    public void ı_should_see_Character_s_name_as(String name) throws Throwable {

    }

    @Then("^I should see verify GET parameter$")
    public void ı_should_see_verify_GET_parameter() throws Throwable {
GetMethods.characterQueryParam();
    }
}

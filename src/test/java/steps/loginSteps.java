package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
    }

    @When("User enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
    }

    @Then("User should be redirected to the home page")
    public void userShouldBeRedirectedToTheHomePage() {
        System.out.println("hello how are you ");
    }
}

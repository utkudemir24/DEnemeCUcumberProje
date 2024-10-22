package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc=new DialogContent();


    @When("Enter username and Password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.usernameLogin,"TeamNine");
        dc.mySendKeys(dc.passwordLogin, "TeamTester");
        dc.myClick(dc.buttonLogin);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.LoginContainsText(dc.successMessageLogin,"Welcome");
    }
}

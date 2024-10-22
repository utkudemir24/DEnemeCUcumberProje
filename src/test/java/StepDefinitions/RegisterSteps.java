package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterSteps {
    DialogContent dc = new DialogContent();
    @Given("Navigate to Para Bank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }

    @When("Fill out the registration form and click the register button")
    public void fillOutTheRegistrationFormAndClickTheRegisterButton() {
        String dataAlp= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf
        String dataNum= RandomStringUtils.randomNumeric(4);
        dc.myClick(dc.registerLink);
        dc.mySendKeys(dc.firstName,dataAlp);
        dc.mySendKeys(dc.lastName,dataAlp);
        dc.mySendKeys(dc.adress,dataAlp);
        dc.mySendKeys(dc.city,dataAlp);
        dc.mySendKeys(dc.state,dataAlp);
        dc.mySendKeys(dc.zipCode,dataNum);
        dc.mySendKeys(dc.phone,dataNum);
        dc.mySendKeys(dc.snn,dataNum);
        dc.mySendKeys(dc.userName,dataAlp);
        dc.mySendKeys(dc.password,dataNum);
        dc.mySendKeys(dc.repeatedPassword,dataNum);
        dc.myClick(dc.registerButton);
    }


    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.LoginContainsText(dc.successMessage, "success");

    }
}

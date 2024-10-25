package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class PayingBilssSteps {

    DialogContent dc=new DialogContent();
    LeftNav lv=new LeftNav();

    @Given("Click on the bill payment button")
    public void clickOnTheBillPaymentButton() {
        lv.myClick(lv.billpay);
    }

    @When("Electricity payment")
    public void electricityPayment() {
        String dataAlp= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf
        String dataNum= RandomStringUtils.randomNumeric(4);

        dc.mySendKeys(dc.payenamePaying,"Elektirik");
        dc.mySendKeys(dc.adressPaying,dataAlp);
        dc.mySendKeys(dc.cityPaying,dataAlp);
        dc.mySendKeys(dc.statePaying,dataAlp);
        dc.mySendKeys(dc.zipcodePaying,dataNum);
        dc.mySendKeys(dc.numberPaying,dataNum);
        dc.mySendKeys(dc.accountPaying,dataNum);
        dc.mySendKeys(dc.verifyaccountPaying,dataNum);
        dc.mySendKeys(dc.amountPaying,dataNum);
     //   dc.mySendKeys(dc.fromPaying,dataNum);
        dc.sendpaymentPaying.click();
    }

    @Then("User should paying successfully")
    public void userShouldPayingSuccessfully() {
        dc.LoginContainsText(dc.successMessageodemetamamPaying,"Bill Payment Complete");

    }

    @When("Water payment")
    public void waterPayment() {
        String dataAlp= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf
        String dataNum= RandomStringUtils.randomNumeric(4);

        dc.mySendKeys(dc.payenamePaying,"Su");
        dc.mySendKeys(dc.adressPaying,dataAlp);
        dc.mySendKeys(dc.cityPaying,dataAlp);
        dc.mySendKeys(dc.statePaying,dataAlp);
        dc.mySendKeys(dc.zipcodePaying,dataNum);
        dc.mySendKeys(dc.numberPaying,dataNum);
        dc.mySendKeys(dc.accountPaying,dataNum);
        dc.mySendKeys(dc.verifyaccountPaying,dataNum);
        dc.mySendKeys(dc.amountPaying,dataNum);
      //  dc.mySendKeys(dc.fromPaying,dataNum);
        dc.sendpaymentPaying.click();
    }

    @When("Natural gas payment")
    public void naturalGasPayment() {
        String dataAlp= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf
        String dataNum= RandomStringUtils.randomNumeric(4);

        dc.mySendKeys(dc.payenamePaying,"Dogal Gaz");
        dc.mySendKeys(dc.adressPaying,dataAlp);
        dc.mySendKeys(dc.cityPaying,dataAlp);
        dc.mySendKeys(dc.statePaying,dataAlp);
        dc.mySendKeys(dc.zipcodePaying,dataNum);
        dc.mySendKeys(dc.numberPaying,dataNum);
        dc.mySendKeys(dc.accountPaying,dataNum);
        dc.mySendKeys(dc.verifyaccountPaying,dataNum);
        dc.mySendKeys(dc.amountPaying,dataNum);
        //dc.mySendKeys(dc.fromPaying,dataNum);
        dc.sendpaymentPaying.click();
    }
}

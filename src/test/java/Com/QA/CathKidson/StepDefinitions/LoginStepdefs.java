package Com.QA.CathKidson.StepDefinitions;

import Com.QA.CathKidson.PageObject.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.hamcrest.Matchers;

import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepdefs {
    private Login login = new Login();

    @And("^I should be able to select the Radio button \"([^\"]*)\"$")
    public void iShouldBeAbleToSelectTheRadioButton(String arg0) throws Throwable {
        login.loginCustomerRadioButton();

    }

    @And("^I enter the text in password box\"([^\"]*)\"$")
    public void iEnterTheTextInPasswordBox(String password) throws Throwable {
     login.enterPasswordText(password);
    }

    @And("^I click on Log in to my account button$")
    public void iClickOnLogInToMyAccountButton() {
        login.logintomyaccountbutton();
    }

    @Then("^I should be able to successfully see \"([^\"]*)\" page$")
    public void iShouldBeAbleToSuccessfullySeePage(String arg0) {
        String actual = login.accountAssertionheader();
        assertThat("account header not matching",actual, Matchers.equalToIgnoringCase("MY ACCOUNT"));
    }
}

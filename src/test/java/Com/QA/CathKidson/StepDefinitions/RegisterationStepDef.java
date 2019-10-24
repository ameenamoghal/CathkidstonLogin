package Com.QA.CathKidson.StepDefinitions;

import Com.QA.CathKidson.PageObject.Register;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterationStepDef {
private Register register = new Register();

    @Given("^I am on Homepage$")
    public void IAmOnHomepage() {

    }
    @Then("^I should be to able to view the Login/Registration page$")
    public void iShouldBeToAbleToViewTheLoginRegistrationPage() {
    }

        @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
register.setNewCustomerRegistration();
    }

    @And("^I should enter EMAIL ADDRESS \"([^\"]*)\"$")
    public void iShouldEnterEMAILADDRESS(String emailId) throws Throwable {
register.setEmailAddress(emailId);
    }

    @And("^I should be able to select the radio button \"([^\"]*)\"$")
    public void iShouldBeAbleToSelectTheRadioButton(String title) throws Throwable {
        register.setNewCustomerRadioButton();
         }


    @And("^I select TITLE \"([^\"]*)\"$")
    public void iSelectTITLE(String title) throws Throwable {
register.setSelectDropDownTitle(title);
    }


    @And("^I enter the text in FIRST NAME box as \"([^\"]*)\"$")
    public void iEnterTheTextInFIRSTNAMEBoxAs(String firstName1) throws Throwable {
register.setFirstName(firstName1);
    }


    @And("^I enter the text in LAST NAME box as \"([^\"]*)\"$")
    public void iEnterTheTextInLASTNAMEBoxAs(String lastName1) throws Throwable {
register.setLastName(lastName1);
    }


    @And("^I enter the text in TELEPHONE NUMNER as \"([^\"]*)\"$")
    public void iEnterTheTextInTELEPHONENUMNERAs(String telephoneNumber1) throws Throwable {
register.setTelephoneNumber(telephoneNumber1);
    }


    @And("^I enter the text in ENTER PASSWORD field \"([^\"]*)\"$")
    public void iEnterTheTextInENTERPASSWORDField(String password1) throws Throwable {
        register.setPassword(password1);
    }


    @And("^I enter the text in CONFIRM PASSWORD field \"([^\"]*)\"$")
    public void iEnterTheTextInCONFIRMPASSWORDField(String confirmPassword1) throws Throwable {
register.setConfirmPassword(confirmPassword1);
    }


    @And("^I click on \"([^\"]*)\" tick box$")
    public void iClickOnTickBox(String arg0) throws Throwable {
register.setCustomerMarketingTickBox();
    }


    @Then("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String arg0) throws Throwable {
register.setCreateMyAccountButton();
    }



}


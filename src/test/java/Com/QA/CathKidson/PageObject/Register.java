package Com.QA.CathKidson.PageObject;

import Com.QA.CathKidson.Drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Register extends DriverFactory {

@FindBy(linkText="LOGIN/REGISTER") //
private WebElement registration;
public void setNewCustomerRegistration(){
registration.click();
}

@FindBy(css="#j_username")
private WebElement emailAddress;
public void setEmailAddress(String emailId){
emailAddress.sendKeys(emailId);
}

@FindBy(xpath="(//label[@class='inline_label'])[2]")
private WebElement newCustomerRadioButton;
public void setNewCustomerRadioButton() {
deleteCookies();
  newCustomerRadioButton.click();
  }

    @FindBy(css="#title")
private WebElement selectDropDownTitle;
public void setSelectDropDownTitle(String title){
selectDropDownTitle.click();
Select select = new Select(selectDropDownTitle);
select.selectByVisibleText(title);
}

@FindBy(css ="#first_name")
private WebElement firstName;
public void setFirstName(String firstName1) {
firstName.sendKeys(firstName1);
}

@FindBy(css ="#last_name")
private WebElement lastName;
public void setLastName(String lastName1){
lastName.sendKeys(lastName1);
}

@FindBy(css="#telephone_number")
private WebElement telephoneNumber;
public void setTelephoneNumber(String telephoneNumber1){
telephoneNumber.sendKeys(telephoneNumber1);
}

@FindBy(css = "#password")
private WebElement password;
public void setPassword(String password1){
password.sendKeys(password1);
}

@FindBy(css ="#confirm_password")
private  WebElement confirmPassword;
public void setConfirmPassword(String confirmPassword1){
confirmPassword.sendKeys(confirmPassword1);
}

@FindBy(xpath = "//label[contains(text(),'Join our email club and be the first one to know about')]")
private WebElement customerMarketingTickBox;
public void setCustomerMarketingTickBox(){
customerMarketingTickBox.click();
}

@FindBy(xpath ="//button[@class='submit button btn btn_info btn_large btn_block']" )
private WebElement createMyAccountButton;
public void setCreateMyAccountButton(){
createMyAccountButton.click();
}
}

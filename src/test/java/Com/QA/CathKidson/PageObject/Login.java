package Com.QA.CathKidson.PageObject;

import Com.QA.CathKidson.Drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends DriverFactory {

    @FindBy(xpath ="(//label[@class='inline_label'])[1]")
    private WebElement registeredCustomerRadioButton;

    public void loginCustomerRadioButton() {
      deleteCookies();
        registeredCustomerRadioButton.click();
    }

    @FindBy(css="#j_password")
    private WebElement passwordbox;

    public void enterPasswordText(String password) {
        passwordbox.sendKeys(password);
    }

    @FindBy(xpath = "//button[@class='submit button btn btn_primary btn_large btn_block']")
    private WebElement logintoaccountbutton;

    public void logintomyaccountbutton() {
        logintoaccountbutton.click();
    }
@FindBy(xpath="//li[@class='last']")
    private WebElement accountHeaderAssertionpriavte;
       public String accountAssertionheader(){
           return accountHeaderAssertionpriavte.getText();
                  }
   }

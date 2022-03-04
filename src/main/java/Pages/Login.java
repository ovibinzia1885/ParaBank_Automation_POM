package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    @FindBy(className = "input")
    WebElement userName;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(className = "button")
    WebElement loginBtn;
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    WebElement openNewaccountlink;
    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    WebElement transferFundlink;
    @FindBy(id="amount")
    WebElement transferAmount;
    @FindBy(className = "button")
    WebElement transferbtn;
    @FindBy(xpath = "//a[contains(text(),'Find Transactions')]")
    WebElement findTranscetionlink;
    @FindBy(xpath = "//a[contains(text(),'Update Contact Info')]")
    WebElement updateContactlink;
    @FindBy(id="customer.phoneNumber")
    WebElement updatePhonenumber;


}

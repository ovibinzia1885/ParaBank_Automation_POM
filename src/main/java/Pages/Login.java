package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

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
    @FindBy(id="criteria.onDate")
    WebElement transferFundcheck;
    @FindBy(className = "button")
    WebElement findTransferfund;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }




}

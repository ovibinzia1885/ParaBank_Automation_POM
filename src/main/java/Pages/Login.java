package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(className = "input")
    WebElement userName;
    @FindBy(name = "password")
    WebElement userPassword;
//    @FindBy(className = "button")
//    WebElement loginBtn;
   @FindBy(xpath = "//input[@type='submit']")
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

    @FindBy(id="customer.phoneNumber")
    WebElement updatePhonenumber;
    @FindBy(id="criteria.onDate")
    WebElement transferFundcheck;
    @FindBy(className = "button")
    WebElement findTransferfund;
    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    WebElement btnLogout;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void DoLogin(String username,String password) throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        userName.sendKeys(username);
        userPassword.sendKeys(password);
        Thread.sleep(1000);
        loginBtn.click();
        Thread.sleep(200);
       // openNewaccountlink.click();
       // btnLogout.click();




    }


}

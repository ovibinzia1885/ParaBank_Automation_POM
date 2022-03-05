package Pages;

import Utility.Utility;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


public class OpenNewAccount {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    WebElement openNewaccountlink;
    @FindBy(id="type")
    WebElement selectaccount;
    @FindBy(id="fromAccountId")
    WebElement fromAccount;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement createNewaccountbtn;
    @FindBy(xpath = "//h1[contains(text(),'Account Opened!')]")
    WebElement titile;



    public OpenNewAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public String CheckingOpenAccount() throws IOException, ParseException, InterruptedException {
        openNewaccountlink.click();
        Thread.sleep(2000);
        createNewaccountbtn.click();
        Thread.sleep(2000);
        return titile.getText();

    }






}

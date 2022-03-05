package Pages;

import Utility.Utility;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Savings {
    WebDriver driver;
    Utility utility;
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    WebElement openNewaccountlink;
    @FindBy(id="newAccountid")
    WebElement newaccount;
    @FindBy(xpath = "//h1[contains(text(),'Account Opened!')]")
    WebElement titile;
    @FindBy(id="type")
    WebElement selectaccount;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnSubmit;


    public Savings(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void SavingOpenAccount() throws IOException, ParseException {
        Utility utility=new Utility();
        utility.writeInJSONaccount(newaccount);
        openNewaccountlink.click();
        Select checking=new Select(selectaccount);
        checking.selectByValue("1");
        btnSubmit.click();
        //return titile.getText();


    }
}

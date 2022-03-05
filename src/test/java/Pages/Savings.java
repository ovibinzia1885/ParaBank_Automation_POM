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
    @FindBy(xpath = "//a[@id='newAccountId']")
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

    public void SavingOpenAccount() throws IOException, ParseException, InterruptedException {
        Utility utility=new Utility();
        openNewaccountlink.click();
        Select checking=new Select(selectaccount);
        checking.selectByValue("1");
        Thread.sleep(1000);
        btnSubmit.click();
        Thread.sleep(3000);
        String text=newaccount.getText();
        utility.writeInJSONaccount(text);
        //return titile.getText();


    }
}

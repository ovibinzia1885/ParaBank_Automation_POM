package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferAccount {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    WebElement transFerbtn;
    @FindBy(id="amount")
    WebElement transferAmount;
    @FindBy(id = "fromAccountId")
    WebElement fromAccount;
    @FindBy(id="toAccountId")
    WebElement toAccount;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnTransfer;

    public TransferAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void TransferFund() throws InterruptedException {
        transFerbtn.click();
        transferAmount.sendKeys("30");
        fromAccount.sendKeys("24999");
        toAccount.sendKeys("25110");

//        Select se1=new Select(fromAccount);
//        se1.selectByValue("24222");
//        Select se2=new Select(toAccount);
//        se2.selectByValue("24333");
        Thread.sleep(1000);
        btnTransfer.click();
        Thread.sleep(1000);



    }
}

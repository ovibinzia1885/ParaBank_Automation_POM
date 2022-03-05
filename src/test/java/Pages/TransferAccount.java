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
    @FindBy(id="newAccountId")
    WebElement newAccountid;

    public TransferAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void TransferFund() throws InterruptedException {
        transFerbtn.click();
        Thread.sleep(2000);

        transferAmount.sendKeys("30");
//        fromAccount.clear();
//        fromAccount.sendKeys("24999");
//        toAccount.clear();
//        toAccount.sendKeys("25110");

//       Select se1=new Select(fromAccount);
//        se1.selectByValue("30993");
//        Thread.sleep(2000);
//        Select se2=new Select(toAccount);
//        se2.selectByValue("31104");

        Thread.sleep(1000);
        btnTransfer.click();
        Thread.sleep(3000);



    }
}

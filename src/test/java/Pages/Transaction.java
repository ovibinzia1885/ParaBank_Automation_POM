package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Transaction {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Find Transactions')]")
    WebElement findTrasactionbtn;
    @FindBy(id="criteria.onDate")
    WebElement dateField;
    @FindBy(xpath = "//button")
    List<WebElement> btntransction;
    @FindBy(xpath = "//h1[contains(text(),'Transaction Results')]")
    WebElement text;
    @FindBy(id="criteria.amount")
    WebElement amounttr;


    public Transaction(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void FindTranaction() throws InterruptedException {
        findTrasactionbtn.click();
        amounttr.sendKeys("30");
        Thread.sleep(3000);
        btntransction.get(3).click();
//        return text.getText();
    }
}

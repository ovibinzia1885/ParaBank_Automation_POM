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
    @FindBy(xpath = "//input[@type='submit']")
    List<WebElement> btntransction;
    @FindBy(xpath = "//h1[contains(text(),'Transaction Results')]")
    WebElement text;


    public Transaction(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String FindTranaction() throws InterruptedException {
        findTrasactionbtn.click();
        dateField.sendKeys("03-03-2022");
        Thread.sleep(1000);
        btntransction.get(1).click();
        return null;
    }
}

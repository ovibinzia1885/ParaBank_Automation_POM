package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePhoneNumber {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Update Contact Info')]")
    WebElement updateContactlink;
    @FindBy(id="customer.phoneNumber")
    WebElement updateNumber;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnUpdate;
    @FindBy(xpath ="//h1[contains(text(),'Profile Updated')]")
    WebElement profileUpdate;


    public UpdatePhoneNumber(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public String UserPhoneNumberUpdate() throws InterruptedException {
        updateContactlink.click();
        updateNumber.clear();
        updateNumber.sendKeys("01819888");
        Thread.sleep(1000);
        btnUpdate.click();
        Thread.sleep(1000);
        return profileUpdate.getText();



    }
}

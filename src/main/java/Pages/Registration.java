package Pages;

import Utility.Utility;
import com.github.javafaker.Faker;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class Registration {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy (xpath = "//a[contains(text(),'Register')]")
    WebElement btnRegistration;
    @FindBy(id="customer.firstName")
    WebElement customerFirstname;
    @FindBy(id="customer.lastName")
    WebElement customerLastname;
    @FindBy(id="customer.address.street")
    WebElement customerAddress;
    @FindBy(id="customer.address.city")
    WebElement customerCity;
    @FindBy(id="customer.address.state")
    WebElement customerState;
    @FindBy(id="customer.address.zipCode")
    WebElement zipCode;
    @FindBy(id="customer.phoneNumber")
    WebElement customerPhonenumber;
    @FindBy(id="customer.ssn")
    WebElement customerSsn;
    @FindBy(id="customer.username")
    WebElement customerUsername;
    @FindBy(id="customer.password")
    WebElement Password;
    @FindBy(id="repeatedPassword")
    WebElement confirmPassword;
//    @FindBy(className = "button")
//    WebElement btnsubmitRegistration;
    @FindBy(xpath = "//input[@type='submit']")
    List<WebElement> btnSubmit;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    WebElement btnLogout;


    public Registration(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void doRegistration() throws InterruptedException, IOException, ParseException {
        Faker faker = new Faker();
        Utility utility=new Utility();
        String phone = "0181"+(int)(Math.random() * (9999999 - 1000000 + 1) + 1000000);
//        String phone =(int)(Math.random() * (1 - 0 + 1) + 0);
        String ssn="120"+(int)(Math.random()*10);
        String password = "P@ssword123";
        String username=faker.name().username();
        utility.writeInJSON(username,password);

        btnRegistration.click();
        customerFirstname.sendKeys(faker.name().firstName());
        customerLastname.sendKeys(faker.name().lastName());
        customerAddress.sendKeys(faker.address().streetAddress());
        customerCity.sendKeys(faker.address().city());
        customerState.sendKeys(faker.address().state());
        zipCode.sendKeys(faker.address().zipCode());
        customerPhonenumber.sendKeys(phone);
        customerSsn.sendKeys(ssn);
        customerUsername.sendKeys(username);
        Password.sendKeys(password);
        confirmPassword.sendKeys(password);
        Thread.sleep(2000);
        btnSubmit.get(1).click();
        Thread.sleep(5000);
//       wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
         btnLogout.click();

















    }
}

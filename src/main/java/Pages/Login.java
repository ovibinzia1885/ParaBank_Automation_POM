package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    @FindBy(className = "input")
    WebElement userName;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(className = "button")
    WebElement loginBtn;
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    WebElement openNewaccountlink;


}

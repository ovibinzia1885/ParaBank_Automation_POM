package TestRunner;
import Pages.Login;
import Pages.UpdatePhoneNumber;
import SetUp.setup;
import Utility.Utility;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UpdateAccount extends setup {
    Login login;
    Utility utility;
    UpdatePhoneNumber updatePhoneNumber;
    @Test
    public void NumberUpdate() throws InterruptedException, IOException, ParseException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        login=new Login(driver);
        utility=new Utility();
        updatePhoneNumber=new UpdatePhoneNumber(driver);
        int index =(int)(Math.random() * (1 - 0 + 1) + 0);
        String username=utility.readFromJSON(index,"username");
        String password=utility.readFromJSON(index,"password");
        login.DoLogin(username,password);
       String sucess= updatePhoneNumber.UserPhoneNumberUpdate();
        Assert.assertEquals(sucess,"Profile Updated");
    }

}

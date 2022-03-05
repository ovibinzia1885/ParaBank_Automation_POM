package TestRunner;

import Pages.Login;
import Pages.OpenNewAccount;
import SetUp.setup;
import Utility.Utility;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestRunner extends setup {
    Login login;
    Utility utility;
    OpenNewAccount openNewAccount;
    @Test
    public void UserLogin() throws IOException, ParseException, InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        login=new Login(driver);
        utility=new Utility();
        openNewAccount= new OpenNewAccount(driver);
        int index =(int)(Math.random() * (1 - 0 + 1) + 0);
        String username=utility.readFromJSON(index,"username");
        String password=utility.readFromJSON(index,"password");
        login.DoLogin(username,password);
        String sucess=openNewAccount.CheckingOpenAccount();
        Assert.assertEquals(sucess,"Account Opened!");

//        for(int i=1;i<=2;i++){
//            openNewAccount.SavingOpenAccount();
//
//        }

    }

}

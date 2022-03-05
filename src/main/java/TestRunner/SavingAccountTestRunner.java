package TestRunner;

import Pages.Login;
import Pages.Savings;
import SetUp.setup;
import Utility.Utility;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SavingAccountTestRunner extends setup {
    Login login;
    Utility utility;
   Savings savings;

    @Test
    public void UserAccountSaving() throws IOException, ParseException, InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        login = new Login(driver);
        utility = new Utility();
        savings = new Savings(driver);
        int index = (int) (Math.random() * (1 - 0 + 1) + 0);
        String username = utility.readFromJSON(index, "username");
        String password = utility.readFromJSON(index, "password");
        login.DoLogin(username, password);
        for (int i = 1; i <= 2; i++) {
             savings.SavingOpenAccount();
           // Assert.assertEquals(sucess, "Account Opened!");

        }
    }
    }

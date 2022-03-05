package TestRunner;

import Pages.Login;
import Pages.OpenNewAccount;
import Pages.Transaction;
import SetUp.setup;
import Utility.Utility;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TransctionTestRunner extends setup {
    Login login;
    Utility utility;
    Transaction transaction;
    @Test
    public void TransctionFund() throws IOException, ParseException, InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        login=new Login(driver);
        utility=new Utility();
        transaction=new Transaction(driver);
        int index =(int)(Math.random() * (1 - 0 + 1) + 0);
        String username=utility.readFromJSON(index,"username");
        String password=utility.readFromJSON(index,"password");
        login.DoLogin(username,password);
        String successMessage=transaction.FindTranaction();
        Assert.assertEquals(successMessage, "Transaction Results");
    }
}

package TestRunner;

import Pages.TransferAccount;
import SetUp.setup;
import Pages.Login;
import Pages.OpenNewAccount;
import SetUp.setup;
import Utility.Utility;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TransferTestRunner extends setup {
    Login login;
    Utility utility;
    TransferAccount transferAccount;
    @Test
    public void FundTransferAmount() throws IOException, ParseException, InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        login=new Login(driver);
        utility=new Utility();
        transferAccount=new TransferAccount(driver);
        int index =(int)(Math.random() * (1 - 0 + 1) + 0);
        String username=utility.readFromJSON(index,"username");
        String password=utility.readFromJSON(index,"password");
        login.DoLogin(username,password);
        transferAccount.TransferFund();

    }


}

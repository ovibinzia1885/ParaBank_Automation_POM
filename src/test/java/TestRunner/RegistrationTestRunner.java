package TestRunner;

import Pages.Registration;
import SetUp.setup;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationTestRunner extends setup {
    Registration registration;

    @Test
    public void UserRegistration() throws InterruptedException, IOException, ParseException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        registration=new Registration(driver);
        for(int i=1;i<=2;i++){
            registration.doRegistration();
            Thread.sleep(2000);
        }

    }
}

package TestRunner;

import Pages.Registration;
import SetUp.setup;
import org.testng.annotations.Test;

public class RegistrationTestRunner extends setup {
    Registration registration;

    @Test
    public void UserRegistration() throws InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        registration=new Registration(driver);
        for(int i=1;i<=2;i++){
            registration.doRegistration();
            Thread.sleep(2000);
        }

    }
}

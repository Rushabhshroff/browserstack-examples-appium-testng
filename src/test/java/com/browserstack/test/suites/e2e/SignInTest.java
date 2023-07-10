package com.browserstack.test.suites.e2e;

import com.browserstack.app.pages.HomePage;
import com.browserstack.app.pages.LoginPage;
import com.browserstack.test.suites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {

    @Test
    public void SelectEnvironment() {
        try {
//            driver.setSetting("driver", "compose");
            Thread.sleep(1000000);
            new LoginPage(driver).SetupEnvironment();
        }catch(Exception ex) {

        }
    }
}

package com.browserstack.test.suites.e2e;

import com.browserstack.app.pages.HomePage;
import com.browserstack.test.suites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {

    @Test
    public void signIn() {
        HomePage page = new HomePage(driver)
                .navigateToSignIn()
                .loginWith("fav_user", "testingisfun99");
    }
}

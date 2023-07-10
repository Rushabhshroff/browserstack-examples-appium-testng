package com.browserstack.app.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(tagName = "Environment")
    private MobileElement environmentInput;

    @AndroidFindBy(tagName = "License")
    private MobileElement licenseInput;

    @AndroidFindBy(tagName = "Build")
    private MobileElement buildNumber;

    @AndroidFindBy(tagName = "Commit")
    private MobileElement commit;

    public LoginPage(AppiumDriver<?> driver) {
        super(driver);
    }

    public void SetupEnvironment() {
        buildNumber.getText();
        commit.getText();
        environmentInput.setValue("PROD");
    }
}

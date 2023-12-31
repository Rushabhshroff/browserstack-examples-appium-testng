package com.browserstack.app.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    @AndroidFindBy(accessibility = "menu")
    @iOSXCUITFindBy(accessibility = "menu")
    private WebElement menuLink;

    @AndroidFindBy(accessibility = "nav-signin")
    @iOSXCUITFindBy(accessibility = "nav-signin")
    private WebElement signInLink;

    @AndroidFindBy(accessibility = "nav-cart")
    @iOSXCUITFindBy(accessibility = "nav-cart")
    private WebElement cartLink;

    @AndroidFindBy(xpath = "//*[@text = 'Orders']")
    @iOSXCUITFindBy(id = "Orders")
    private WebElement ordersLink;

    public HomePage(AppiumDriver<?> driver) {
        super(driver);
    }

    public LoginPage navigateToSignIn() {
        menuLink.click();
        signInLink.click();
        return new LoginPage(driver);
    }
}

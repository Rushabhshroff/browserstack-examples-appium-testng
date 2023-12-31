![Logo](https://www.browserstack.com/images/static/header-logo.jpg)

# BrowserStack Examples Appium TestNG

## Introduction

TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful.

This BrowserStack Example repository demonstrates an Appium test framework written in TestNG with parallel testing capabilities. The Appium test scripts are written for the open source [todo](todo). This BrowserStack Demo Mobile App is an e-commerce mobile application which showcases multiple real-world user scenarios. The app is bundled with offers data, orders data and products data that contains everything you need to start using the app and run tests out-of-the-box.

The Appium tests are run on different platforms like on-prem and BrowserStack using various run configurations and test capabilities.

---

## Repository setup

- Clone the repository

- Ensure you have the following dependencies installed on the machine
   - Java >= 8
   - Maven >= 3.1+

  Maven:
    ```sh
     mvn install -DskipTests
    ```


## Test Reporting

- [Allure reports](#generating-allure-reports)

---

# BrowserStack

[BrowserStack](https://browserstack.com) provides instant access to 2,000+ real mobile devices and browsers on a highly reliable cloud infrastructure that effortlessly scales as testing needs grow.

## Prerequisites

- Create a new [BrowserStack account](https://www.browserstack.com/users/sign_up) or use an existing one.
- Identify your BrowserStack username and access key from the [BrowserStack App Automate Dashboard](https://app-automate.browserstack.com/) and export them as environment variables using the below commands.

   - For \*nix based and Mac machines:

  ```sh
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```

   - For Windows:

  ```shell
  set BROWSERSTACK_USERNAME=<browserstack-username>
  set BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```

Note:
- We have configured a list of test capabilities in the [browserstack-android.yml](configs/browserstack-android.yml) & [browserstack-ios.yml](configs/browserstack-ios.yml) file. You can certainly update them based on your device / browser test requirements.
- The exact test capability values can be easily identified using the [Browserstack Capability Generator](https://browserstack.com/automate/capabilities)


## Running Your Tests on BrowserStack

### Prerequisites

You need to upload the `APK` or `IPA` to BrowserStack, before you can run the test on BrowserStack. BrowserStack will provide you with an `app_url` which you need to use.

You can upload the `APK` or `IPA` using a file on your filesystem or using a public url.

cURL command: 
``` shell
curl -u "browserstack_username:browserstack_access_key" \
-X POST "https://api-cloud.browserstack.com/app-automate/upload" \
-F "file=@/path/to/ipa/or/apk"
-F "custom_id=BrowserStackDemoApp"
```

More information on [Upload apps from filesystem](https://www.browserstack.com/docs/app-automate/appium/upload-app-from-filesystem), [Upload apps using public URL](https://www.browserstack.com/docs/app-automate/appium/upload-app-using-public-url) or [Define custom ID for app](https://www.browserstack.com/docs/app-automate/appium/upload-app-define-custom-id).

**OR**

With Browserstack SDK, all the effort is taken away from the user.

All you need to do is add specify the path of your `APK` or `IPA` file in your browserstack.yml as shown below:
```
app: ./path/to/my/demo/app.apk or ./path/to/my/demo/app.ipa
```

If your app does indeed exist in the path provided, the sdk will be able to identify it, upload it, and use it for your tests.

### Run a specific test on BrowserStack

In this section, we will run a single test on an Android device on Browserstack. To change test capabilities for this configuration, please refer to the `browserstack-single.yml` file in resources/conf/capabilities/

- How to run the test?


  Android:
  ```sh
  mvn clean test -P sample -Dbrowserstack.config=configs/browserstack-android.yml
  ```

  iOS:
  ```sh
  mvn clean test -P sample -Dbrowserstack.config=configs/browserstack-ios.yml
  ```


- Output

  This run profile executes a single test on a single device on BrowserStack. Please refer to your [BrowserStack App Automate Dashboard](https://app-automate.browserstack.com/) for test results.


## Generating Allure Reports

- Generate Report using the following command: 

  Maven:
  ```sh
  mvn allure:report
  ```

- Serve the Allure report on a server: 

  Maven:
  ```sh
  mvn allure:serve
  ```

## Additional Resources

- View your test results on the [BrowserStack App Automate Dashboard](https://www.browserstack.com/app-automate)
- Documentation for writing [Automate test scripts in Java](https://www.browserstack.com/automate/java)
- Customizing your tests capabilities on BrowserStack using our [test capability generator](https://www.browserstack.com/app-automate/capabilities)
- [List of Browsers & mobile devices](https://www.browserstack.com/list-of-browsers-and-platforms?product=automate) for automation testing on BrowserStack
- [Using Automate REST API](https://www.browserstack.com/automate/rest-api) to access information about your tests via the command-line interface
- Understand how many parallel sessions you need by using our [Parallel Test Calculator](https://www.browserstack.com/app-automate/parallel-calculator?ref=github)
- For testing public web applications behind IP restriction, [Inbound IP Whitelisting](https://www.browserstack.com/local-testing/inbound-ip-whitelisting) can be enabled with the [BrowserStack Enterprise](https://www.browserstack.com/enterprise) offering

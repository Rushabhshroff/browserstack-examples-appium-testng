const {remote} = require('webdriverio');

const capabilities = {
  platformName: 'Android',
  'appium:automationName': 'Espresso',
  'appium:showGradleLog':'true',
  'appium:forceEspressoRebuild':'true',
  'appium:deviceName': 'Android',
  "appium:espressoBuildConfig":"{ \"additionalAppDependencies\": [ \"com.google.android.material:material:1.0.0\", \"androidx.lifecycle:lifecycle-extensions:2.1.0\",\"androidx.annotation:annotation:1.1.0\"] }",
  'appium:app': '/Users/rushabh/Documents/DemoRepos/browserstack-examples-appium-testng/apps/android.apk',
};

const wdOpts = {
  host: 'localhost',
  port: 4723,
  logLevel: 'info',
  path:'/wd/hub',
  connectionRetryCount: 0,
  capabilities,
};

async function runTest() {
  const driver = await remote(wdOpts);
  try {
    await driver.pause(60000);
  } finally {
    await driver.quit();
  }
}

runTest().catch(console.error);
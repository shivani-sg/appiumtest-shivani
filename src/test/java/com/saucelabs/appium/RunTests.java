package com.saucelabs.appium;

import cucumber.junit.Cucumber;
import io.appium.java_client.AppiumDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
//import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"html:target/cucumber"},
        tags = "@2")
public class RunTests {

    static AppiumDriver driver;
    @BeforeClass
    public static void start() throws MalformedURLException {

//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("deviceName", "HUAWEI");
//            capabilities.setCapability("app", "/Users/stevejobs/Downloads/org.openintents.shopping_100213.apk");
//            capabilities.setCapability("appPackage", "org.openintents.shopping");
//            capabilities.setCapability("appActivity", "org.openintents.shopping.ShoppingActivity");
//            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }


    @AfterClass
    public static void stop()
    {
//        driver.quit();
    }

//    public static AppiumDriver getDriver()
//    {
//        return driver;
//    }
}

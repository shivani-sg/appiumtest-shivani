package com.saucelabs.appium;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class StepDefs {
    static boolean IOS = false;


    AppiumDriver driver;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "HUAWEI");
        capabilities.setCapability("app", "org.openintents.shopping_100213.apk");
        capabilities.setCapability("appPackage", "org.openintents.shopping");
        capabilities.setCapability("appActivity", "org.openintents.shopping.ShoppingActivity");
        driver =  new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }

    @After
    public void stopRun() throws Exception {
        driver.quit();
    }



    @Then("^User should Navigate to the list Page$")
    public void User_should_Navigate_to_the_Test_Case_view_list_Page() {

                MobileElement el1 = (MobileElement) driver.findElementById("org.openintents.shopping:id/layout_choice_bottom");
                el1.click();

    }



    @When("^he add items to the basket$")
    public void heAddItemsToTheBasket() {
        MobileElement el2 = (MobileElement) driver.findElementById("org.openintents.shopping:id/autocomplete_add_item");
        el2.sendKeys("item 1");
        MobileElement el3 = (MobileElement) driver.findElementById("org.openintents.shopping:id/button_add_item");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("org.openintents.shopping:id/autocomplete_add_item");
        el4.sendKeys("item 2");
        MobileElement el5 = (MobileElement) driver.findElementById("org.openintents.shopping:id/button_add_item");
        el5.click();
    }

    @And("^add one more shopping list$")
    public void addOneMoreShoppingList() {
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementById("org.openintents.shopping:id/edittext");
        el8.sendKeys("list 2");
        MobileElement el9 = (MobileElement) driver.findElementById("android:id/button1");
        el9.click();
    }

    @And("^delete the item from the first shopping list$")
    public void deleteTheItemFromTheFirstShoppingList() {
        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.TextView");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.CheckBox");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Clean up list");
        el13.click();
    }

    @Then("^the deleted item should not be shown$")
    public void theDeletedItemShouldNotBeShown() {

    }
}

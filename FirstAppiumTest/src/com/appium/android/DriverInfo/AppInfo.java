package com.appium.android.DriverInfo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import java.io.IOException;
import java.net.URL;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppInfo {
    protected AppiumDriver<AndroidElement> driver;

    protected void waitForElement() throws Exception{
        WebElement waitElem = (new WebDriverWait(driver,15)).until(ExpectedConditions.presenceOfElementLocated(By.className("")));
    }


    @Before
    public void setUp() throws Exception {
        // set up appium
//        File classpathRoot = new File(System.getProperty("user.dir")); //?
//        File appDir = new File(classpathRoot, "../../../apps/ContactManager"); //folder
//        File app = new File("D:\\Projects\\Zappy\\ZappyBuilds", "app-release.apk"); //testAppName
//        new File("D:\\Projects\\Zappy\\ZappyBuilds\\ContactManager.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Google Nexus 5");
        capabilities.setCapability("platformVersion", "4.4.4");
        capabilities.setCapability("udid", "192.168.27.101:5555");
        capabilities.setCapability("app", "D:\\Projects\\Zappy\\ZappyBuilds\\app-release.apk");
//        capabilities.setCapability("appPackage", "com.example.android.contactmanager");//packageName
        capabilities.setCapability("appActivity", "com.compareking.zappy.ui.activity.UnauthorizedActivity"); //activi
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }



    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}

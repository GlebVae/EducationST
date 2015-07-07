package com.appium.android.tests;

import com.appium.android.AppPath.AppInfo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginApp extends AppInfo {
    @Test
    public void chooseLoginIn ()throws Exception{
        WebElement el = driver.findElement(By.name("LOG IN"));
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Ciri Rivia");
        textFieldsList.get(1).sendKeys("gerald@izrivii.com");
        driver.findElementByName("LOG IN").click();
    }
}

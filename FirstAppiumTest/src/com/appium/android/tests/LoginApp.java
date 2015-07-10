package com.appium.android.tests;

import com.appium.android.DriverInfo.AppInfo;
import io.appium.java_client.android.AndroidElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginApp extends AppInfo {
    private static Logger log = Logger.getLogger(LoginApp.class.getName());


    @Test
    public void chooseLoginIn() throws Exception {
        WebElement el = driver.findElement(By.name("LOG IN"));
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Ciri Rivia");
        textFieldsList.get(1).sendKeys("gerald@izrivii.com");
        driver.findElementByName("LOG IN").click();
//        WebElement waitElem = (new WebDriverWait(driver,15)).until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.Button")));
//        driver.findElementsByName("OK");
//        el.click();
        log.info("Passed");
        try {
            throw new Exception("Some exception");
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Exception: ", ex);
        }
        log.fine("some minor, debug message");
        if (log.isLoggable(Level.FINE)) {
            log.fine("Some CPU consuming message: ");
        }
    }
}


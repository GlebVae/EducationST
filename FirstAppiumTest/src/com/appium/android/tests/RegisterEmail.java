package com.appium.android.tests;

import com.appium.android.AppPath.AppInfo;
import io.appium.java_client.android.AndroidElement;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisterEmail extends AppInfo {
    @Test
    public void chooseRegEmail ()throws Exception{
        WebElement el = driver.findElement(By.name("Email"));
        assertEquals("Email", el.getText());
        el.click();
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("gerald@izrivii.com");
        textFieldsList.get(1).sendKeys("Ciri  Rivia");
        textFieldsList.get(2).sendKeys("12345678adb");

//        driver.findElementsById("com.compareking.zappy:id/signup_email_email_et");
//        assertEquals("Email", el.getText());
//        el.sendKeys("gelard@izrivii.com");

//        driver.findElementsById("com.compareking.zappy:id/signup_email_username_et");
////        assertEquals("Username", el.getText());
//        el.sendKeys("CiriRivia");
//
//        driver.findElementsById("com.compareking.zappy:id/signup_email_password_et");
////        assertEquals("Password", el.getText());
//        el.sendKeys("12345678adb");

        driver.findElementByName("REGISTER").click();
    }


}



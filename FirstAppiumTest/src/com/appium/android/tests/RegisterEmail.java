package com.appium.android.tests;

import com.appium.android.DriverInfo.SetupInfo;
import io.appium.java_client.android.AndroidElement;
import static org.junit.Assert.assertEquals;

import java.io.*;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// унаследовал от класса родителя, описывающий драйвер
public class RegisterEmail extends SetupInfo {

    @Test
    public void chooseRegEmail ()throws Exception{
        printInfo("Test chooseRegEmail has started");
        //нашли первую кнопку
        WebElement email = driver.findElement(By.name("Email"));
        assertEquals("Email", email.getText());
        printInfo("just clicked element with loc: " + email.getLocation() + " and name: " + email.getText());
        email.click();
        takeScreenshot("Email");
        //нашли поле ввода пасса
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("gerald@izrivii.com");
        printInfo("Entered email: " + textFieldsList.get(0).getText());
        textFieldsList.get(1).sendKeys("Ciri  Rivia");
        printInfo("Entered username: " + textFieldsList.get(1).getText());
        textFieldsList.get(2).sendKeys("12345678adb");
        takeScreenshot("Login");
        //нашли кнопку регистрации
        WebElement register = driver.findElementByName("REGISTER");
        assertEquals("REGISTER", register.getText());
        printInfo("just clicked element with loc: " + register.getLocation() + " and name: " + register.getText());
        register.click();
        //повесиkb ожидание появления экрана
        waitElemByName("Done");
        takeScreenshot("Done");
        WebElement backIcon = driver.findElement(By.className("android.widget.ImageButton"));
        printInfo("just clicked element with loc: " + backIcon.getLocation() + " and name: " + backIcon.getTagName());
        backIcon.click();
        takeScreenshot("Returned from app");
        waitElemByName("REGISTER");
    }

//    @Test
//    public void chooseLoginIn() throws Exception {
//        WebElement el = driver.findElement(By.name("LOG IN"));
//        el.click();
//        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
//        textFieldsList.get(0).sendKeys("CiriRivia");
//        textFieldsList.get(1).sendKeys("gerald@izrivii.com");
//        driver.findElementByName("LOG IN").click();
//    }

}



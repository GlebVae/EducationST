package com.appium.android.DriverInfo;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import java.awt.*;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.Buffer;
import java.util.NoSuchElementException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;

public class SetupInfo {
    protected AppiumDriver<AndroidElement> driver;

    public void writeLog(String text) {
        try {
            File f = new File("D://results//Log.txt");
            File dir = f.getParentFile();
            if (!f.exists()) {
                dir.mkdir();
                f.createNewFile();
            }
//            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile(), true));
            bw.write(text);
            bw.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void printInfo (String text) throws IOException {
        System.out.println(text);
        writeLog(text + "\n");

    }

    protected void takeScreenshot(String name)
    {
        try {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("D:\\results\\screenshots\\scr" + name +".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void waitElemByName(String name) throws Exception{
        WebDriverWait waiter = new WebDriverWait(driver, 20);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
    }
    protected void waitElemByClassName(String name){
        WebDriverWait waiter = new WebDriverWait(driver, 20);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.className(name)));
    }

//    protected void getLoc (String name){
//
//        System.out.println("just clicked element with loc: " + name.getLocation() + " and name: " + name.getText());
//    }

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

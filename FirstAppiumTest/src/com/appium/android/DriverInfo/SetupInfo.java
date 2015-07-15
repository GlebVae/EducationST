package com.appium.android.DriverInfo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



import java.io.*;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetupInfo {

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

    protected AppiumDriver<AndroidElement> driver;

    protected void writeLog(String text) {
        try {
            File f = new File("/results/Log.txt");
            File dir = f.getParentFile();
            if (!f.exists()) {
                dir.mkdir();
                f.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile(), true));
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void printInfo(String text) throws IOException {
        System.out.println(text);
        writeLog(text + "\n");
    }

    protected void takeScreenshot(String name) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("results/screenshots/scr" + name + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void waitElemByName(String name, int timeWait) throws Exception {
        WebDriverWait waiter = new WebDriverWait(driver, timeWait);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
    }

    protected void waitElemByClassName(String name, int timeWait) throws Exception {
        WebDriverWait waiter = new WebDriverWait(driver, timeWait);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.className(name)));
    }

    protected void waitElemById(String name, int timeWait) throws Exception {
        WebDriverWait waiter = new WebDriverWait(driver, timeWait);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.id(name)));
    }

    protected void loginFast4Fields (String className,String email, String username, String password) throws IOException {
        List<AndroidElement> textFieldsList = driver.findElementsByClassName(className);
        textFieldsList.get(0).sendKeys(email);
        printInfo("Entered email: " + textFieldsList.get(0).getText());
        textFieldsList.get(1).sendKeys(username);
        printInfo("Entered username: " + textFieldsList.get(1).getText());
        textFieldsList.get(2).sendKeys(password);
        printInfo("User entered password");
    }

    protected void loginFast2Fields(String className,String email,String password) throws IOException {
        List<AndroidElement> textFieldsList = driver.findElementsByClassName(className);
        textFieldsList.get(0).sendKeys(email);
        printInfo("Entered email: " + textFieldsList.get(0).getText());
        textFieldsList.get(1).sendKeys(password);
        printInfo("User entered password");
    }
}


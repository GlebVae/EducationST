////package com.appium.android.tests;
////
////import com.appium.android.DriverInfo.SetupInfo;
////import io.appium.java_client.android.AndroidElement;
////
////import java.util.List;
////import java.util.logging.Level;
////import java.util.logging.Logger;
////
////import org.junit.Test;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebElement;
////
////public class LoginApp extends SetupInfo {
////    @Test
////    public void chooseLoginIn() throws Exception {
////        WebElement el = driver.findElement(By.name("LOG IN"));
////        el.click();
////        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
////        textFieldsList.get(0).sendKeys("CiriRivia");
////        textFieldsList.get(1).sendKeys("gerald@izrivii.com");
////        driver.findElementByName("LOG IN").click();
//////        WebElement waitElem = (new WebDriverWait(driver,15)).until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.Button")));
//////        driver.findElementsByName("OK");
//////        el.click();
////
////    }
//}


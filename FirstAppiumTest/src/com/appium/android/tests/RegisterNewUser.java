package com.appium.android.tests;

import com.appium.android.DriverInfo.SetupInfo;
import io.appium.java_client.android.AndroidElement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// унаследовал от класса родителя, описывающий драйвер
public class RegisterNewUser extends SetupInfo {
    @Test
    public void chooseRegEmail() throws Exception {
        printInfo("Test chooseRegEmail has started");
        //нашли кнопку регистрациии через емейл

        WebElement email = driver.findElement(By.name("Email"));
        assertEquals("Email", email.getText());
        printInfo("just clicked element with loc: " + email.getLocation() + " and name: " + email.getText());
        email.click();
        takeScreenshot("Email");

        //нашли поля ввода данных и ввели их

        loginFast4Fields("android.widget.EditText","gerald@izrivii.com","Ciri  Rivia","12345678adb");
//        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
//        textFieldsList.get(0).sendKeys("gerald@izrivii.com");
//        printInfo("Entered email: " + textFieldsList.get(0).getText());
//        textFieldsList.get(1).sendKeys("Ciri  Rivia");
//        printInfo("Entered username: " + textFieldsList.get(1).getText());
//        textFieldsList.get(2).sendKeys("12345678adb");
        takeScreenshot("Login");

        //нашли кнопку подтверждения регистрации

        WebElement register = driver.findElementByName("REGISTER");
        assertEquals("REGISTER", register.getText());
        printInfo("just clicked element with loc: " + register.getLocation() + " and name: " + register.getText());
        register.click();

        //повесили ожидание экрана

        waitElemByName("Done", 20);
        takeScreenshot("Done");
        WebElement backIcon = driver.findElement(By.className("android.widget.ImageButton"));
        printInfo("just clicked element with loc: " + backIcon.getLocation() + " and name: " + backIcon.getTagName());
        backIcon.click();
        takeScreenshot("Returned from app");
        waitElemByName("REGISTER", 20);

        //вернлись на главный экран и проверили появление кнопки log in

        WebElement backToStart = driver.findElement(By.className("android.widget.ImageButton"));
        printInfo("Pressed Back Button");
        driver.navigate().back();
//  данный элемент существует, но при нажатии не происходит никаких действий, однако область под элементом работает
//        printInfo("just clicked element with loc: " + backToStart.getLocation() + "and name: " + backToStart.getTagName());
//        backToStart.click();
        waitElemByName("LOG IN", 20);

        //проверяем можно ли войти новым пользователем

        WebElement login = driver.findElement(By.name("LOG IN"));
        printInfo("just clicked element with loc: " + login.getLocation() + " and name: " + login.getText());
        login.click();

        loginFast2Fields("android.widget.EditText", "gerald@izrivii.com","12345678adb" );

//        List<AndroidElement> textFiledList = driver.findElementsByClassName("android.widget.EditText");
//        textFieldsList.get(0).sendKeys("gerald@izrivii.com");
//        printInfo("Entered email: " + textFieldsList.get(0).getText());
//        textFieldsList.get(1).sendKeys("12345678adb");

        takeScreenshot("ChekingNewUserData");
        printInfo("just clicked element with loc: " + login.getLocation() + "and name: " + login.getText());
        driver.findElementByName("LOG IN").click();
        waitElemByName("Done", 20);
    }

    @Test
    public void wrongEmailData()throws Exception {

    }
}




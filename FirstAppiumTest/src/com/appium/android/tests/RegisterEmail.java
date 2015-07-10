package com.appium.android.tests;

import com.appium.android.DriverInfo.AppInfo;
import com.sun.jna.platform.FileUtils;
import io.appium.java_client.android.AndroidElement;
import static org.junit.Assert.assertEquals;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;
import java.util.UUID;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import javax.xml.bind.SchemaOutputResolver;

    // унаследовал от класса родителя, описывающий драйвер
public class RegisterEmail extends AppInfo {
    //создал логгер
    private static Logger log = Logger.getLogger(RegisterEmail.class.getName());

    @Test
    public void chooseRegEmail ()throws Exception{
        createFileLog();
        //нашли первую кнопку
        WebElement el = driver.findElement(By.name("Email"));
        assertEquals("Email", el.getText());
        el.click();
        System.out.println("just clicked element with loc: " + el.getLocation());
        //нашли поле ввода пасса
        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("gerald@izrivii.com");
        System.out.println("Entered email: " + textFieldsList.get(0).getText());
        textFieldsList.get(1).sendKeys("Ciri  Rivia");
        System.out.println("Entered username: " + textFieldsList.get(1).getText());
        textFieldsList.get(2).sendKeys("12345678adb");
        System.out.println("Entered password: " + textFieldsList.get(2).getText());
        //нашли кнопку регистрации
        WebElement register = driver.findElementByName("REGISTER");
        register.click();
        System.out.println("just clicked element with loc: " + register.getLocation());
        //повесить ожидание появления экрана
        WebElement waitElem = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(By.name("Done")));
        WebElement backIcon = driver.findElement(By.className("android.widget.ImageButton"));
        backIcon.click();
        System.out.println("just clicked element with loc: " + backIcon.getLocation());
    }

    public void createFileLog() {
            System.out.println("Test had started");
        try {
            String intro = "First Appium test. Checking Email Registration. ";
            String log = "Test had started";
            File f = new File("D://Log.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(intro + "\n");
            bw.write(log + "\n");
            bw.write("Entered email: "  );
            bw.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}



package com.cydeo.tests.day06_alerts_iFrames_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alerts {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }
    //https://practice.cydeo.com/javascript_alerts




    @Test
    public void alertTest1(){
     //   WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        informationAlertButton.click();

        Alert alert= driver.switchTo().alert();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        alert.accept();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        WebElement resultButton= driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultButton.isDisplayed(), "Result text is not displayed");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        String expectedText= "You successfully clicked an alert";
        String actualText= resultButton.getText();

        Assert.assertEquals(expectedText,actualText);
    }
}

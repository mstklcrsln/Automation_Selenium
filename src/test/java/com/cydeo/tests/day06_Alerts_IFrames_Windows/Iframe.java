package com.cydeo.tests.day06_Alerts_IFrames_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {
    WebDriver driver;
    @BeforeClass
    public void setupMethod (){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_test (){
      //  WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p")); This can not find the element
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

    }
//
}

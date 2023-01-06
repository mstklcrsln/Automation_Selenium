package com.cydeo.tests.day06_Alerts_IFrames_Windows;

import com.cydeo.testbase.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeShort extends Testbase {

    @Test
    public void iFrameTest (){
        driver.get("http://practice.cydeo.com/iframe");
        WebElement iframe= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);

       // driver.switchTo().frame(0);
       // driver.switchTo().frame("mce_0_ifr");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement textArea= driver.findElement(By.tagName("p"));
        Assert.assertTrue(textArea.isDisplayed());

        driver.switchTo().parentFrame();



    }

}

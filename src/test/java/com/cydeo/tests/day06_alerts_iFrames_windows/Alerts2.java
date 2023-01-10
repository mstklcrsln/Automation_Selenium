package com.cydeo.tests.day06_alerts_iFrames_windows;

import com.cydeo.testbase.Testbase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts2 extends Testbase {

    @Test
    public  void aletTest (){
        driver.get("http://practice.cydeo.com/javascript_alerts");
       WebElement jsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //                                                           ?/button[@innertext='Click for JS Alert']
        //                                                            //div[@id='content']/div/button[1]

        jsAlert.click();

        // pop-u comes      to handle alerts ==>

        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement resultText= driver.findElement(By.id("result"));
        //                                          ("//p[@id='result']"));
        //                                          /html//p[@id='result']
        //                                           //p[#'result']

        Assert.assertTrue(resultText.isDisplayed());
    }

}

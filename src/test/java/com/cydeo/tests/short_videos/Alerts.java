package com.cydeo.tests.short_videos;

import com.cydeo.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts extends TestBase {

    @Test
    public void alertButton (){
        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement alertButton  = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]"));
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        alertButton.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        Alert alert= driver.switchTo().alert();
        alert.accept();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        WebElement resultText= driver.findElement(By.id("result"));

        Assert.assertTrue(resultText.isDisplayed());
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);



    }








}

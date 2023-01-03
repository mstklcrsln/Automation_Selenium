package com.cydeo.tests.day05_DynamicWebElements;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumTestNG {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }
    @AfterMethod
    public void teardownMethod(){

    }

    @Test
    public void seleniumTest(){
       // at first we write here and carry upside
        //  WebDriver driver = WebDriverFactory.getDriver("chrome");
      //  driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     //   driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }
}

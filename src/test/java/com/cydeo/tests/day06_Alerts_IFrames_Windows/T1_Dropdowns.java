package com.cydeo.tests.day06_Alerts_IFrames_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Dropdowns {
    public WebDriver driver;
    @BeforeMethod
    public void setpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");


    }
    @Test
    public void dropdown_Task5 () throws InterruptedException {


        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);

        String expectedOptionText= "California";
        String actualOptionText= stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptionText,expectedOptionText);

    }
    @Test
    public void dropdownTask6 (){
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1924");

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("11");

        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByIndex(0);

        String expectedYear= "1924";
        String expectedMonth= "December";
        String expectedDay= "1";
        String actualYear= yearDropdown.getFirstSelectedOption().getText();
        String actualMonth= monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);


    }
    @AfterMethod
    public void teardownMethod(){
       driver.close();
    }

}

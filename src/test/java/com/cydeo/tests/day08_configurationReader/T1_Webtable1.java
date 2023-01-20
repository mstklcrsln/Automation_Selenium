package com.cydeo.tests.day08_configurationReader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Webtable1 {
    WebDriver driver;
    //1. Go to: https://practice.cydeo.com/web-tables
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }


    @Test
    public void orderNameVerifyTest (){
        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        //locate the cell which includes Bob Martin

        ////table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[2]
        ////table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']

        WebElement bobMartinCell= driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String actualText= bobMartinCell.getText();
        String expectedText= "Bob Martin";

        Assert.assertEquals(actualText,expectedText);



        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        WebElement bobMartinDateCell=
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        //      //table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]
        //      //td[.='Bob Martin']/../td[5]
        String actualDate= bobMartinDateCell.getText();
        String expectedDate= "12/31/2021";
        Assert.assertEquals(actualDate,expectedDate);
    }
    // we use the utility method from WebTableutil
    @Test
    public void test2(){
      String alexandraOrderDate = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("alexandraOrderDate = " + alexandraOrderDate);//alexandraOrderDate = 04/15/2021

        String johnOrderDate = WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println("johnOrderDate = " + johnOrderDate);//johnOrderDate = 01/08/2021
    }

    //test about the method from util class
    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver, "Ned Stark", "05/12/2021");
        //est passed but we did not write anything in the console
    }




}
/*
1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021
 */
package com.cydeo.tests.day4_findElements_CheckBox_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T2_GettingElements {
    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("tps://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.


        //4- Print out the number of the links on the page.


        //5- Print out the texts of the links.


        //6- Print out the HREF attribute values of the links


    }

}
/*
TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */
package com.cydeo.tests.day02_locators_get;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {
        /*
        TC #1: Cydeo practice tool verifications
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com
        3. Verify URL contains
        Expected: cydeo
        4. Verify title:
        Expected: Practice
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); // opens driver
      //  ChromeOptions option = new ChromeOptions();
        //option.addArguments("headless");
      //  WebDriver driver = new ChromeDriver(option);
       // driver.manage().window().maximize(); // maximizes the window

       // driver.get(); these have same functions
        driver.navigate().to("https://practice.cydeo.com/");

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification passed");
        } else {
            System.out.println("URL verification failed!!"); //URL verification passed
        }

        String expectedTitle= "Practice";
        String actualTitle= driver.getTitle();
        // if (driver.getTitle().equals("Practice"))
        if(expectedURL.equals(actualURL)){
            System.out.println("title verification passed");
        } else {
            System.out.println("title verification failed"); //title verification failed
        }
        driver.close();

    }
}

























package com.cydeo.tests.day02_locators_get;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_EtsyTask {
    public static void main(String[] args) {

       //TC #1: Etsy Title Verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();

        //3. Search for “wooden spoon”


        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”





    }
}

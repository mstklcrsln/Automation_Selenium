package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {


       //  1- setting up the web driver manager
        // we create our browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver, this line will open our browser

        WebDriver driver = new ChromeDriver();

        // 3- Test if driver is working as expected, this is our selenium method that is allowing us to get
        driver.get("https://www.turkeyoutdoor.org/");

    }

}

package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;

public class ChromeDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Downloads/chromedriver_win32");

        WebDriver driver= new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("www.google.com");

    }
}

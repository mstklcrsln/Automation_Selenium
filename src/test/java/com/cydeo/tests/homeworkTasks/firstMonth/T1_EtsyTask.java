package com.cydeo.tests.homeworkTasks.firstMonth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_EtsyTask {
    public static void main(String[] args) {
            /*
            TC #1: Etsy Title Verification
            1. Open Chrome browser
            2. Go to https://www.etsy.com
            3. Search for “wooden spoon”
            4. Verify title:
            Expected: “Wooden spoon | Etsy”
             */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.etsy.com");

        



    }
}

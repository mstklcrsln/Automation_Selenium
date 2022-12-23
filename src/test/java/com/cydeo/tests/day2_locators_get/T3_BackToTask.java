package com.cydeo.tests.day2_locators_get;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_BackToTask {
    public static void main(String[] args) {

       /* TC #2: Back and forth navigation
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com
        3- Click to A/B Testing from top of the list.
        4- Verify title is:
        Expected: No A/B Test
        5- Go back to home page by using the .back();
        6- Verify title equals:
        Expected: Practice*/

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.
     //   driver.findElement(By.linkText("A/B Testing")).click();           for use again and again

        WebElement abTestLink= driver.findElement(By.linkText("A/B Testing")); // in here there is no click
        abTestLink.click();

        //  4- Verify title is:
        //        Expected: No A/B Test

        String actualTitle= driver.getTitle();
        String expectedTitle= "No A/B Test";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!"); //Title verification PASS!
        }else {
            System.out.println("Title verification FAILED!");
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

       // 6- Verify title equals:


        // Expected: Practice*/

    }
}

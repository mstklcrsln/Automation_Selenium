package com.cydeo.tests.day2_locators_get;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleTask {
    public static void main(String[] args) {


        /*
        TC#3: Google search
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Write “apple” in search box
        4- press enter using KEYS enter
        5- Verify title:
        Expected: Title should start with “apple” word
         */


        WebDriverManager.chromedriver().setup(); // we setup the browser driver

        WebDriver driver = new ChromeDriver();  // we open the browser

        driver.manage().window().maximize();  //we maximize browser

        driver.get("https://google.com");   //we go to google.com

        //  3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        /*
        to write qpple in the searchbox. to able to do any action write anything, or click, or send keys or what ever anything we HAVE TO LOCATE IT
        we located the web element using the finelement method and name locator.
        we inspected and found this name attribute value from the google page.
         */

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);  //we sendKeys method and write apple and using Keys.Enter method click enter


        // 5- Verify title:

        String expectedIntitle = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedIntitle)){
            System.out.println("Title verification PASS!");
        } else {
            System.out.println("Title verification FAILED!!!");
        }



    }
}

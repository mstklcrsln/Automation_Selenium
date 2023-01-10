package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_LoginButton {
    public static void main(String[] args) {


        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
      WebDriver  driver=  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

            // LOCATING USİNG CLASS ATTRIBUTE
       // WebElement signInButon = driver.findElement(By.className("login-btn"));  ALL THESE FİNDS THE SAME ELEMENT
      //  WebElement signInButton = driver.findElement(By.cssSelector("input[class= 'login-btn']"));
        // LOCATING USİNG TYPE ATTRIBUTE
       // WebElement signInButton = driver.findElement(By.cssSelector("input[type= 'submit']"));
        // LOCATING USİNG ON CLICK ATTRIBUTE
       // WebElement signInButton = driver.findElement(By.cssSelector("input[onclick= "BX.addClass(this, 'wait');""));
        // LOCATING USİNG VALUE ATTRIBUTE
        WebElement signInButton = driver.findElement(By.cssSelector("input[value= 'Log In']"));
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from


    }

}

/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
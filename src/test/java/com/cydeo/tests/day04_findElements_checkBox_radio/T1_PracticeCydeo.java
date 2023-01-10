package com.cydeo.tests.day04_findElements_checkBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_PracticeCydeo {

    public static void main(String[] args) {

        //1. Open Chrome browser
        //WebDriverManager.chromedriver().setup();
        //
        // WebDriver driver = new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");


        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLink1= driver.findElement(By.cssSelector("a[class='nav-link']"));  //Locates the same thing
        WebElement homeLink2= driver.findElement(By.cssSelector("a.nav-link"));         //Locates the same thing
        WebElement homeLink3= driver.findElement(By.cssSelector("a[href=\"/\"]"));      //Locates the same thing

        //b. “Forgot password” header
        WebElement forgotPass1= driver.findElement(By.cssSelector("div.example>h2"));

        //using xpath
        WebElement forgotPass3= driver.findElement(By.xpath("//h2"));
        WebElement forgotPass2= driver.findElement(By.xpath("//h2[text()= 'Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox= driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox2= driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        WebElement retrievePass= driver.findElement(By.xpath("//button[@id='form_submit']"));
                                                                            ////button[@class='radius']
                                                                            ////button[@type='submit']


        //f. “Powered by Cydeo text
        WebElement poweredBy= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
                                                                        // //a[@target='_blank']
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //4. Verify all web elements are displayed.

        System.out.println(homeLink2.isDisplayed()); //true
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed()); //true
        System.out.println("retrievePass.isDisplayed() = " + retrievePass.isDisplayed()); //true
        System.out.println("inputBox2.isDisplayed() = " + inputBox2.isDisplayed()); //true
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }

}

/*
XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
 */
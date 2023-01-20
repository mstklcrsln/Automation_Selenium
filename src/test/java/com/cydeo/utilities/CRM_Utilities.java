package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CRM_Utilities {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
        @Test
    public static void crm_login (WebDriver driver){

        driver.get("https://login1.nextbasecrm.com");
        //3. Enter valid username
        WebElement inputUsername= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement inputPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    }
        @Test
        public static void crm_login (WebDriver driver, String username, String  password){ // method overloading

        //3. Enter valid username
        WebElement inputUsername= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        //4. Enter valid password
        WebElement inputPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.sendKeys(password);

        //5. Click to `Log In` button
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    }

}

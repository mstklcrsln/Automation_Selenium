package com.cydeo.tests.day07_webtables_javafaker_utilities;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CrmLogin {
    public WebDriver driver;
    //1. Create new test and make set ups
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test (){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUsername= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");


        //4. Enter valid password
        WebElement inputPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();

        //6. Verify title is as expected:

        BrowserUtils.verifyTitle(driver,"Portal"); // title has changed
        //Expected: Portal

        //This test failes because web page changed
    }
}
/*
1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal

USERNAME PASSWORD

helpdesk1@cybertekschool.com    UserUser
Helpdesk2@cybertekschool.com    UserUser
 */
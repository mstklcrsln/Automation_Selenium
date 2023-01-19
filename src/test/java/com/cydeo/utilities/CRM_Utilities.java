package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void crm_login (WebDriver driver){

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

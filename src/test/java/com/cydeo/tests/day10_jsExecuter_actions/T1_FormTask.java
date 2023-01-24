package com.cydeo.tests.day10_jsExecuter_actions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_FormTask {
    @Test
    public void registration_form_test (){
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url")); // we get from conf.properties file
        Faker faker =new Faker();


        WebElement inputFirstName= Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
      inputFirstName.sendKeys(faker.name().firstName());

    }


}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.
Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
 */
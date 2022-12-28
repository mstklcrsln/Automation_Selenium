package com.cydeo.tests.day3_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_getTaskPractice {
    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
       WebElement username=  driver.findElement(By.className("login-inp"));
       // driver.findElement(By.className("login-inp")).sendKeys("incorrect");
       username.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword=  driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to login button.
       WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();
        //6- Verify error message text is as expected:
       WebElement errorMessage = driver.findElement(By.className("errortext"));

        //Expected: Incorrect login or password
        String expectedErrorMessage= "Incorrect login or password";
        String actualErrorMessage= errorMessage.getText();
        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED");
        } else {
            System.out.println("Error message verification FAILED");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        WebDriver driver1 = WebDriverFactory.getDriver("chrome");
    }
}

/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
PS: Inspect and decide which locator you should be using to locate web
elements.
 */
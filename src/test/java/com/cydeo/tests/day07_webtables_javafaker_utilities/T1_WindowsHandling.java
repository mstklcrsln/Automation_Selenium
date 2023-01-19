package com.cydeo.tests.day07_webtables_javafaker_utilities;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowsHandling {
    public WebDriver driver;

    //1. Create new test and make set ups
    @BeforeMethod
    public void setupMethod (){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

        @Test
    public void window_handling_test (){
        //2. Go to : https://www.amazon.com
       driver.get("https://www.amazon.com.tr");

        /*   WebElement alertTurkey= driver.findElement(By.xpath("(//span//input[@class='a-button-input']) [2]"));
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
           alertTurkey.click();

           WebElement secondAlert = driver.findElement(By.xpath("//button[@name='glowDoneButton']"));
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            secondAlert.click();*/


        //3. Copy paste the lines from below into your class

            ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://turkeyoutdoor.org','_blank');");


        //4. Create a logic to switch to the tab where Etsy.com is open

             Set<String> allWindowsHandles= driver.getWindowHandles();

          for (String each : driver.getWindowHandles() ) {
              driver.switchTo().window(each);

              System.out.println("Current URL is: "+ driver.getCurrentUrl());
              /*
                Current URL is: https://www.amazon.com/
                Current URL is: https://www.facebook.com/
                Current URL is: https://www.google.com/
                Current URL is: https://www.turkeyoutdoor.org/
               */

              if (driver.getCurrentUrl().contains("outdoor")){ // it stops on the etsy page
                  break;
              }
              System.out.println("Current URL is: "+ driver.getCurrentUrl());
          }


        //5. Assert: Title contains “Etsy”
           String expectedTitle= "Etsy";
          String actualTitle= driver.getTitle();
            Assert.assertTrue(actualTitle.contains(expectedTitle));

            BrowserUtils.switchWindowAndVerify(driver, "etsy" , "Etsy");

        // code has changed after writing first time
    }
}
/*
1. Create new test and make set ups
2. Go to : https://www.amazon.com
3. Copy paste the lines from below into your class
4. Create a logic to switch to the tab where Etsy.com is open
5. Assert: Title contains “Etsy”
Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
These lines will simply open new tabs using something called JavascriptExecutor
and get those pages. We will learn JavascriptExecutor later as well.
 */
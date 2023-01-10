package com.cydeo.tests.day06_alerts_iFrames_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandle {
    WebDriver driver;

    @BeforeClass
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }
    @Test
    public void windows_test (){

        // storing main handle is good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();
        //  System.out.println("mainHandle = " + mainHandle);  mainHandle = CDwindow-2011CBE1109520C87AC7F4E3712F5A6B

        String expectedTitle = "Windows";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("Title before click :"+ actualTitle); //Windows

        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

      //  Set <String> allWindowHandles = driver.getWindowHandles();

      //  for (String each: allWindowHandles) { // this will show all the opened pages
        for (String each: driver.getWindowHandles()) { // this will show all the opened pages
           driver.switchTo().window(each);
            System.out.println("Current title while switching windows.: " + driver.getTitle());
            /*
            Current title while switching windows.: Windows
            Current title while switching windows.: New Window
             */
        }

        String expectedTitleAfterClick = "New Window";

        actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);
        System.out.println("Title after click :"+ actualTitle); //Title after click :New Window

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
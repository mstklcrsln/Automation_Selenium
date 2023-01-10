package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    in this class only general utility methods that are not related to some specific page
     */


    //This method will accept int (in seconds and execute thread.sleep for given duration
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }


    }

    //switch window and verify

    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedTitle) {

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().contains(expectedInURL)) { // it stops on the wanted page
                break;
            }
        }
        String actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
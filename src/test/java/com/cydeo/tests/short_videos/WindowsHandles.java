package com.cydeo.tests.short_videos;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandles extends TestBase {

    @Test
    public void windowsTest (){
        driver.get("https://practice.cydeo.com/windows");

        String currentHandle = driver.getWindowHandle();
        System.out.println(currentHandle); //CDwindow-BC8A22024EE6279022E753F4F4B694E0


        Set<String> allWindowsHandles = driver.getWindowHandles();
        System.out.println(allWindowsHandles);
        /*
        the same page and the same numbers
        CDwindow-B77D55022FECDA378957D94DCDE48644
        [CDwindow-B77D55022FECDA378957D94DCDE48644]     this is in Set
         */

        WebElement clickButton = driver.findElement(By.xpath("//a[@href=\"/windows/new\"]"));
        clickButton.click();

        System.out.println(driver.getWindowHandles());
        /*
        [CDwindow-F6B25BB676615502A9F82691BDF7582A]
        [CDwindow-F6B25BB676615502A9F82691BDF7582A, CDwindow-A095EA15E5467DF3867DAD4488DC9DB4]
        we have two windows.
         */

        // to get each pages titles

        allWindowsHandles = driver.getWindowHandles();

        for (String eachHandle: allWindowsHandles){
            System.out.println("allWindowsHandles = " + allWindowsHandles);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        /*
        allWindowsHandles = [CDwindow-F8FDADCA56ED6ADC052825FD5F2159DE, CDwindow-52DCA471CC3DD2294EA75BB9DE73CDE5]
        driver.getTitle() = Windows
        allWindowsHandles = [CDwindow-F8FDADCA56ED6ADC052825FD5F2159DE, CDwindow-52DCA471CC3DD2294EA75BB9DE73CDE5]
        driver.getTitle() = New Window
         */
    }
}

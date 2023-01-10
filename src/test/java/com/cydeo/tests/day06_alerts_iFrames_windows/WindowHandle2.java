package com.cydeo.tests.day06_alerts_iFrames_windows;

import com.cydeo.testbase.Testbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandle2 extends Testbase {
    @Test
    public void windowsTest() throws InterruptedException {

    driver.get("https://practice.cydeo.com/windows");

    String currentHandle= driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle); //currentHandle = CDwindow-D267E79DF4F6232C34B21AD2779AF2AA

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles); //allHandles = [CDwindow-A76783E8A2EB1AE1EB25079DD7784926]

        WebElement clickButton= driver.findElement(By.xpath("//div[@id='content']//a[@href='/windows/new']"));
                                                                            ////?/a[@innertext='Click Here']
                                                                             ////a[@href='/windows/new']
        clickButton.click();
        Thread.sleep(3000);

        System.out.println("after clicking driver.getWindowHandles() = " + driver.getWindowHandles()); //after clicking driver.getWindowHandles() = [CDwindow-0548A44BB5C3F75455A0B0AD33086650, CDwindow-35D0B902C477F44A1673C4C327D069E4]
        System.out.println("fter clickingdriver.getWindowHandle() = " + driver.getWindowHandle()); //fter clickingdriver.getWindowHandle() = CDwindow-0548A44BB5C3F75455A0B0AD33086650

        allHandles=driver.getWindowHandles();

        for (String eachHandle: allHandles){
            System.out.println("eachHandle = " + eachHandle);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            /*
            eachHandle = CDwindow-3E763A2CEBD6CF15ADFB4B0F19B415A9
            driver.getTitle() = Windows
            eachHandle = CDwindow-01AA1EEE33890024874486F0E5EE691F
            driver.getTitle() = New Window
             */
        }
    }


}

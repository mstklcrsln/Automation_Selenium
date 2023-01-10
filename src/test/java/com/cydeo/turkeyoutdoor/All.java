package com.cydeo.turkeyoutdoor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class All {
    public static WebDriver driver;

    public static void testAllLinksOnTheHomepage() {

        List<String> allPages = new ArrayList<>();
        for (int i = 1; i < 50; i++) {//Firstly, inspect your site, set the breakpoint of "i" based on the number of "href tags" on the page
            //This loop finds all href tags and store their values in allPages list
            String eachAddress = driver.findElement(By.xpath("(//a[@href])[" + i + "]")).getAttribute("href");
            allPages.add(eachAddress);
        }


        for (String each : allPages) {//This loop opens each link on a new tab
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.open('" + each + "', '_blank');");
        }


        Set<String> AllHandles = driver.getWindowHandles();
        int count = 1;
        for (String eachHandle : AllHandles) {//Navigate each tab and get title/URL
            driver.switchTo().window(eachHandle);
            System.out.println(count + ". page title is : " + driver.getTitle() + "\n" +
                    count + ". link is: " + driver.getCurrentUrl());
            driver.switchTo().parentFrame();
            count++;
        }
    }
}

package com.cydeo.tests.day4_findElements_CheckBox_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T2_GettingElements {
    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size()); //allLinks.size() = 2

        for (WebElement each : allLinks) { //iter +enter==>shortcut
            System.out.println("Text of links"+ each.getText());
            //with each.getText() Text of linksHome and Text of linksCYDEO
            //Text of links[[ChromeDriver: chrome on WINDOWS (8caff665bbabbb255590b2130f3da49e)] -> tag name: a]
            //Text of links[[ChromeDriver: chrome on WINDOWS (8caff665bbabbb255590b2130f3da49e)] -> tag name: a]


            //6- Print out the HREF attribute values of the links
            System.out.println("Href values "+ each.getAttribute("href"));   }


        //5- Print out the texts of the links.
        /*
        Text of linksHome
        Href values https://practice.cydeo.com/
        Text of linksCYDEO
        Href values https://cydeo.com/
         */
    }

}
/*
TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */
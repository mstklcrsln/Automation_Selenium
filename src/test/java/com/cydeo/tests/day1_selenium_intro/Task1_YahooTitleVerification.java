package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        // Yahoo title verification

        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //open chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // go to Türkiye'nin Outdoor Sayfası https://turkeyoutdoor.org/
        driver.get("https://turkeyoutdoor.org/");


       // verify title

        String expectedTitle= "Türkiye'nin Outdoor Sayfası - Doğa Yürüyüşü, Hiking, Trekking, Kampçılık, Dağcılık, Ekstrem Sporlar, Doğa Sporları, Macera Turizmi, Doğa Turizmi, Outdoor Forum, Outdoor Ekipman, Outdoor Giyim, Outdoor Grupları";


        String actualTitle=  driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected");
        }else{
            System.out.println("Title is not expected, verification failed");
        }
        //Title is expected


    }
}

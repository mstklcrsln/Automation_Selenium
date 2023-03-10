package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- Setup the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the selenium WebDriver
        // This line is opening empty page
        WebDriver driver = new ChromeDriver();

        //to make fullscreen
        driver.manage().window().maximize();

        //it takes fullscreen like maximize
        // driver.manage().window().fullscreen();

        // 3- Go to tesla.com
        driver.get("https://www.tesla.com");

         // stop code execution for 2-3 seconds
        Thread.sleep(300);

        // use selenium to navigate back

        driver.navigate().back();

        // stop code execution for 2-3 seconds
        Thread.sleep(300);

        //this is forwarding
        driver.navigate().forward();

        //this is refreshing
        driver.navigate().refresh();

        //navigate.to

        driver.navigate().to("https://turkeyoutdoor.org/");

        driver.getTitle();
        System.out.println(driver.getTitle()); //Türkiye'nin Outdoor Sayfası - Doğa Yürüyüşü, Hiking, Trekking, Kampçılık, Dağcılık, Ekstrem Sporlar, Doğa Sporları, Macera Turizmi, Doğa Turizmi, Outdoor Forum, Outdoor Ekipman, Outdoor Giyim, Outdoor Grupları

        String currentTitle= driver.getTitle();
        System.out.println(currentTitle); //Türkiye'nin Outdoor Sayfası - Doğa Yürüyüşü, Hiking, ....

        // getting current URL using selenium

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL); //https://turkeyoutdoor.org/
        System.out.println(driver.getCurrentUrl()); //https://turkeyoutdoor.org/

        //to make fullscreen
        driver.manage().window().maximize();

        //for closing currently opening window
        driver.quit();


        // for finishing everything
        driver.close();
    }
}



















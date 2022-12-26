package com.cydeo.tests.homeworkTasks.firstMonth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutdoorTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://turkeyoutdoor.org/");

        driver.getTitle();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Türkiye'nin Outdoor Sayfası";
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}

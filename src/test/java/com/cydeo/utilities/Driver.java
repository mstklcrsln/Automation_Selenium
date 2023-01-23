package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
     creating a private constructor, so we're closing access to the object of this class
     from outside the class
     */
    private Driver(){

    }
    /*
    we made webdriver private, because we want to close access from outside the class
    we made webdriver static because we will use it in a static method, and we need to use static keyword's advantages
     */
    private static WebDriver driver;

    /*
    create a reusable method which will same driver instance when we call it
     */
    public static WebDriver getDriver (){
        if (driver==null){
            //we get the browser from configuration reader class by using getProperty method
            String browserType = ConfigurationReader.getProperty("browser");
        // depending on the browser type that will return from the conf.porperties file
            //switch statement will determine the case, and open the matching browser
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               /* case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver= new SafariDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
            }
        }
        return driver;
    }

}

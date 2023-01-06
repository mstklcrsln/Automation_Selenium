package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

        WebDriver driver;

    public static WebDriver getDriver (String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox") ){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("given browser type is not currently supported");
            System.out.println("Driver = null");
            return null;
        }
    }

    public void turkeyoutdoor (String text){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        WebElement googleSearchBox= driver.findElement(By.xpath("//input[@class= 'gLFyf']"));
        googleSearchBox.sendKeys(text+ Keys.ENTER);


        WebElement turkeyoutdoorText = driver.findElement(By.xpath("//a[@href='https://turkeyoutdoor.org/']/h3"));
        turkeyoutdoorText.click();
    }


    public void googleSearchBox (String searchText){
        driver.get("https://www.google.com/");
        WebElement googleSearchBox= driver.findElement(By.xpath("//input[@class= 'gLFyf']"));
        //googleSearchBox.click();
        googleSearchBox.sendKeys(searchText+ Keys.ENTER);

    }

  /*  public static WebDriver getDriver (String browserName){


        switch (browserName.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Unknown browser type "+ browserName);
                driver= null;
        }*/

    }





























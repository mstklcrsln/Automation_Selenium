package com.cydeo.tests.day06_alerts_iFrames_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


    WebDriver driver;

    @Test (dataProvider = "searchData")
    public void test1 (String keywords, String expectedTitle){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        WebElement googleSearchBox= driver.findElement(By.xpath("//input[@class= 'gLFyf']"));
        googleSearchBox.sendKeys(keywords+ Keys.ENTER);

        Assert.assertEquals(driver.getTitle(), expectedTitle);
        driver.quit();
    }

    @DataProvider (name= "searchData")
    public Object [][] testData () {
        return new Object[][]{
                {"selenium", "selenium - Google'da Ara"},
                {"java", "java - Google'da Ara"},
                {"outdoor", "outdoor - Google'da Ara"},
                {"cydeo", "cydeo - Google'da Ara"},
                {"job", "job - Google'da Ara"},
        };
    }
}

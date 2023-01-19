package com.cydeo.tests.short_videos;

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
    public void test1 (String keyword, String expectedTitle){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(keyword+ Keys.ENTER);

        Assert.assertEquals(driver.getTitle(), expectedTitle);
        driver.quit();
    }

    @DataProvider(name = "searchData")
    public Object [][] testData () {
        return  new Object[][] {
                {"Selenium", "selenium - Google'da Ara"},
                {"java", "java - Google'da Ara"},
                {"turkeyoutdoor", "turkeyoutdoor - Google'da Ara"},
                {"cydeo", "cydeo - Google'da Ara"},
        };
    }

}

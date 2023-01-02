package com.cydeo.turkeyoutdoor;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FromGoogle {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        for (int i = 0; i <5 ; i++) {
            driver.get("https://www.google.com/");

            WebElement search= driver.findElement(By.cssSelector(".a4bIc > input[role='combobox']"));
            search.sendKeys("Türkiye'nin Outdoor Sayfası"+ Keys.ENTER);

            WebElement turkeyOutdoor=  driver.findElement(By.cssSelector("a[href= 'https://turkeyoutdoor.org/']>h3"));
            turkeyOutdoor.click();

        }driver.close();
     }
}

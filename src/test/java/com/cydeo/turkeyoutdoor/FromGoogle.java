package com.cydeo.turkeyoutdoor;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FromGoogle {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        for (int i = 0; i <90 ; i++) {
            driver.get("https://www.google.com/");
            Thread.sleep(12000);
            WebElement search= driver.findElement(By.cssSelector(".a4bIc > input[role='combobox']"));
            search.sendKeys("Türkiye'nin Outdoor Sayfası"+ Keys.ENTER);
           Thread.sleep(15000);

            WebElement turkeyOutdoor=  driver.findElement(By.cssSelector("a[href= 'https://turkeyoutdoor.org/']>h3"));
            turkeyOutdoor.click();
            Thread.sleep(12000);
        }driver.close();
     }
}

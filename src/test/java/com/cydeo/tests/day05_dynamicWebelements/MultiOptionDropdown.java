package com.cydeo.tests.day05_dynamicWebelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiOptionDropdown  {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement multiItemDropdown = driver.findElement(By.xpath("//select[@name='Languages']"));

        Select multiItemSelect = new Select(multiItemDropdown);
        System.out.println(multiItemSelect.isMultiple()); //true

        multiItemSelect.selectByIndex(2);
        multiItemSelect.selectByValue("ruby");
        multiItemSelect.selectByVisibleText("Python");

        //for deselect
        multiItemSelect.deselectByIndex(2);


    }
}

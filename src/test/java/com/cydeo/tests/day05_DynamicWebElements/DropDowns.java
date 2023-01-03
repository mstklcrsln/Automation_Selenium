package com.cydeo.tests.day05_DynamicWebElements;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class DropDowns {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownTest(){
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentSelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualSimpleDropdownTExt= currentSelectedOption.getText();
        String expectedSimpleDropdownTExt="Please select an option";

        Assert.assertEquals(actualSimpleDropdownTExt, expectedSimpleDropdownTExt);

        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropdownText= stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSimpleDropdownTExt,expectedSimpleDropdownTExt);




    }
}

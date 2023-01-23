package com.cydeo.tests.short_videos;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HoverOver extends TestBase {

    @Test
    public void hoverover () {
        driver.get("https://practice.cydeo.com/hovers");
        WebElement picture1 = driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
        WebElement picture1Text= driver.findElement(By.xpath("//h5[text()='name: user1']"));

       // WebElement Picture2 = driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"));
        //WebElement Picture3 = driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[3]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(picture1).perform();
        Assert.assertTrue(picture1Text.isDisplayed());

        // to find all img elements

        List <WebElement> images = driver.findElements(By.tagName("img"));

        for (WebElement image : images) {
            actions.moveToElement(image).pause(2000).perform();
        }
    }
}

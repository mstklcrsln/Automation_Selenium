package com.cydeo.tests.day10_jsExecuter_actions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadsPractice {
    @Test
    public void upload_test(){

        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path = "E:\\__Mesut Siteler__\\20200831_183135.jpg";


        //3. Upload the file.
        WebElement fileUploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        BrowserUtils.sleep(3);
        // we send the file directly to the site
        fileUploadButton.sendKeys(path); // we upload file without clicking upload button,


        WebElement uploadButton= Driver.getDriver().findElement(By.tagName("h3"));
        BrowserUtils.sleep(3);
        uploadButton.click(); //File Uploaded!


        //4. Assert:
        //-File uploaded text is displayed on the page
        Assert.assertTrue(uploadButton.isDisplayed()); //test passed



    }
}

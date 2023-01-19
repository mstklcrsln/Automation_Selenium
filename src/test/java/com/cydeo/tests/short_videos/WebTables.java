package com.cydeo.tests.short_videos;

import com.cydeo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends TestBase {


    @Test
    public void webTables (){
        driver.get("https://practice.cydeo.com/tables");

        WebElement row3Cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
       System.out.println("before clicking first name "+ row3Cell2.getText()); //Jason


        WebElement firstName = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();
        row3Cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("after clicking first name "+ row3Cell2.getText()); //John


        WebElement jasonCell= driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println(jasonCell.getText()); //jason

        // to print all cells from row 3
        List <WebElement> allRow3Cells = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        for (WebElement eachCell : allRow3Cells) {
            System.out.println(eachCell.getText());
            /*
            Smith
            John
            jsmith@gmail.com
            $50.00
            http://www.jsmith.com
            edit delete
             */
        }


    }



}

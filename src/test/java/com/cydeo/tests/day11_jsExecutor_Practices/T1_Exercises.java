package com.cydeo.tests.day11_jsExecutor_Practices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_Exercises {

    @Test
    public void scrolldown_test(){
        Driver.getDriver().get("https://practice.cydeo.com/");

        Actions actions = new Actions(Driver.getDriver());

        WebElement poweredBy = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));
        BrowserUtils.sleep(4);
        actions.moveToElement(poweredBy).perform();

        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        BrowserUtils.sleep(4);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP);

      //  Driver.getDriver().quit();
        Driver.closeDriver(); // we called our new method from Driver utility class



    }
}

/*
TC #4: Scroll practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method
TC #5: Scroll practice 2
1- Continue from where the Task 4 is left in the same test.
2- Scroll back up to “Home” link using PageUP button
 */
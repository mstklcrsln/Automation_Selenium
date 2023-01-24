package com.cydeo.tests.day10_jsExecuter_actions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavaScript_Practice {

    //this pages goes scroll down infinite
    //https://practice.cydeo.com/infinite_scroll


    @Test
    public void javascript_executor_test1(){

        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
       /* JavascriptExecutor js= new JavascriptExecutor() { // we can not create an object from an interface
            @Override
            public Object executeScript(String script, Object... args) {
                return null;
            }

            @Override
            public Object executeAsyncScript(String script, Object... args) {
                return null;
            }*/

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); // we casted our driver tye to js executor
        BrowserUtils.sleep(3);

     //  (JavascriptExecutor)((JavascriptExecutor) Driver.getDriver()).executeScript();

        js.executeScript("window.scrollBy(0,70000)");


      /*  for (int i = 0; i <10 ; i++) {
         //   BrowserUtils.sleep(3);

            //  (JavascriptExecutor)((JavascriptExecutor) Driver.getDriver()).executeScript();

            js.executeScript("window.scrollBy(0,70000)");
        }
        for (int i = 0; i <10 ; i++) {
            //   BrowserUtils.sleep(3);

            //  (JavascriptExecutor)((JavascriptExecutor) Driver.getDriver()).executeScript();

            js.executeScript("window.scrollBy(0,-70000)");
        }*/
    }



    }

/*
TC #6: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/infinite_scroll
3- Use below JavaScript method and scroll
a. 750 pixels down 10 times.
b. 750 pixels up 10 times
JavaScript method to use : window.scrollBy(0,0)
 */
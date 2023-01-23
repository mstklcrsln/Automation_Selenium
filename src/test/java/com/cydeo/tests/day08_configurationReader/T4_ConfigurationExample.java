package com.cydeo.tests.day08_configurationReader;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_ConfigurationExample {
  /*  public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browserType = ConfigurationReader.getProperty("browser"); // this line come the conf. class and return the browser value (chrome) from that class
        driver = WebDriverFactory.getDriver(browserType);

        // driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser")); same above

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    */

    @Test
    public void google_search_text() {
        Driver.getDriver().get("https://www.google.com");
        //3- Write “apple” in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);


        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }


}
/*
 @BeforeMethod
   public void setupMethod(){
    //We are getting the browserType dynamically from our configuration.properties file
     String browserType = ConfigurationReader.getProperty("browser");
       driver = WebDriverFactory.getDriver(browserType);

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   }

   @Test
   public void google_search_test(){
      Driver.getDriver() --> driver

      Driver.getDriver().get("https://www.google.com");

      //3- Write “apple” in search box
      WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

      googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

      //4- Verify title:
      //Expected: apple - Google Search
      String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
      String actualTitle = Driver.getDriver().getTitle();

      Assert.assertEquals(actualTitle, expectedTitle);
   }

}
   WebDriver driver;
   //TC #4: Google search
   //1- Open a chrome browser
   // 2- Go to: https://google.com
   @BeforeMethod
   public void setupMethod() {

      String browserType= ConfigurationReader.getProperty("browser"); // this line come the conf. class and return the browser value (chrome) from that class
      driver = WebDriverFactory.getDriver(browserType);

      // driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser")); same above

      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.google.com");
   }

 /* @Test
      public void google_search_text(){
          //3- Write “apple” in search box
      WebElement googleSearchBox= driver.findElement(By.xpath("//input[@name='q']"));
      googleSearchBox.sendKeys("apple"+ Keys.ENTER);


    //4- Verify title:
    //Expected: apple - Google Search
      String expectedTitle= "apple - Google Search";
      String actualTitle= driver.getTitle();
      Assert.assertEquals(expectedTitle,actualTitle);

    //Use `configuration.properties` for the following:

    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
    //assertion should not fail.

}
   @Test
   public void google_search_test(){
      //Driver.getDriver() --> driver

      Driver.getDriver().get("https://www.google.com");

      //3- Write “apple” in search box
      WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

      googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

      //4- Verify title:
      //Expected: apple - Google Search
      String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
      String actualTitle = Driver.getDriver().getTitle();

      Assert.assertEquals(actualTitle, expectedTitle);
}

/*
TC #4: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Google Search
Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.
 */
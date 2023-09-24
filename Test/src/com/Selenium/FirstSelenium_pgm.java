package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium_pgm 
{
   public static void main(String[] args) 
   {
      //Creating a driver object referencing WebDriver interface
      WebDriver driver = null;

      //Setting webdriver.gecko.driver property
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");

      //Instantiating driver object and launching browser
      driver.get("https://www.google.com/");
    
      //Using get() method to open a webpage
//      driver.get("http://google.com");

      //Closing the browser
      driver.quit();

   }

}
	



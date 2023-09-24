package com.softwaretestingo.learnSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Seleniumpgm_withoutlogs 
{
   private static final int LOGFILE = 0;

public static void main(String[] args) 
   {
      //Creating a driver object referencing WebDriver interface
      WebDriver driver;
      //Setting webdriver.gecko.driver property
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\OneDrive\\Documents\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      System.setProperty(FirefoxDriver.SystemProperty.BROWSER_BINARY,"true");
      System.setProperty(FirefoxDriver.SystemProperty.BROWSER_BINARY,"logs.txt");
      
      // If you want to Store the GeckoDriver Logs in the Temporary Folder
      //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,System.getProperty("java.io.tmpdir")+"geckodriverlogs.txt");
      //Instantiating driver object and launching browser
      driver = new FirefoxDriver();
    
      //Using get() method to open a webpage
      driver.get("http://google.com");
      //Closing the browser
      driver.quit();
   }

public static int getLogfile() {
	return LOGFILE;
}
}
package com.softwaretestingo.learnSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LaunchChrome_WithMaximize_Browser 
{
   public static void main(String[] args) throws InterruptedException 
   {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      
      //For Disable Chrome Info Bar
      ChromeOptions option=new ChromeOptions();
      option.addArguments("disable-infobars");
      option.addArguments("--start-maximized");
      
      WebDriver driver=new ChromeDriver(option);
      driver.get("https://www.google.com");
      Thread.sleep(5000);
      driver.close();
   }
}
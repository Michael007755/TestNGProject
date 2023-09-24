package com.softwaretestingo.learnSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchFirefox_2_53 
{
   public static void main(String[] args) 
   {
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.softwaretestingo.com");
      driver.close();
   }
}
package com.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commomMethods 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get("https://softwaretestingo.blogspot.com/2020/08/css-selector-adv-example.html");
      
//      driver.findElement(By.id("username")).sendKeys("SoftwareTestingo");
//      Thread.sleep(5000);
//      driver.close();
      
      driver.findElement(By.id("username")).sendKeys("GOWDAPERU VINODKUMAR");
      System.out.println("VINODKUMAR Typed In Username Textbox");
      Thread.sleep(3000);
      driver.findElement(By.id("username")).clear();
      System.out.println("UserName Textbox Cleared");
      Thread.sleep(3000);
      driver.close();
   }
}
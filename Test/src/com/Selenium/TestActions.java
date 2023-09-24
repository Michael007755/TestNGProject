package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


 
public class TestActions {
	

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com/");
//		 Thread.sleep(3000);
//		driver.findElement(By.className("ico-login")).click();
//		 Thread.sleep(3000);
		
	
		driver.findElement(By.id("email")).sendKeys("gowdaperu00777@gmail.com");
//		 Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("paul@123");
//		 Thread.sleep(5000);
		 driver.findElement(By.name("login")).click();
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		 driver.close();


		


	
		
	}
}
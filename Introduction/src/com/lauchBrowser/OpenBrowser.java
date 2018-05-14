package com.lauchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowser {
	WebDriver driver;
		@BeforeClass
		public void setDrivePro()
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		// TODO Auto-generated method stub
		@BeforeMethod
		public void getURL()
		{
			driver.get("http://the-internet.herokuapp.com/login");
		}
		
		@Test
		public void test()
		{
			WebElement username=driver.findElement(By.id("username"));
			username.sendKeys("tomsmith");
			System.out.println(username);
			driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
			driver.findElement(By.className("radius")).click();
			
			WebElement lableText=driver.findElement(By.tagName("h2"));
			
			driver.findElement(By.cssSelector("a.button.secondary.radius")).click();;
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "Secure Area");
			
		}
		@AfterClass
		public void cleanUp()
		{
			driver.close();
			//driver.findElement(By.)
		}
		



}

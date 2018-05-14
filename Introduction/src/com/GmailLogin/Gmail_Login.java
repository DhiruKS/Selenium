package com.GmailLogin;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		System.out.println(driver.getTitle());
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
		//set property is is static method persent in System class which work on key and value 
		//for fire fox browser 
		WebDriver driver =new FirefoxDriver();
		WebDriverWait d=new WebDriverWait(driver, 10);
		//driver.get("https://login.salesforce.com/?locale=in");
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		
		//How to retrive the current URL
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("djks226@gmail.com");
		System.out.println("Pass");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		System.out.println("Pass");
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9740081279");
		System.out.println("Pass");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9740081279");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
		//div[@id='passwordNext']
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
//		driver.get("https://google.com");
		System.out.println(driver.getTitle());
//		
		
		
	}

}

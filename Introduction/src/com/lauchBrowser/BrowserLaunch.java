package com.lauchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the driver object of chrome 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		//How to retrive the current URL
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//for some application like banking right click is disabled do we use the 
		//page source method 
		driver.getPageSource();
		driver.get("https://gmail.com");
		driver.navigate().back();
		driver.quit();
		
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
//		//set property is is static method persent in System class which work on key and value 
//		//for fire fox browser 
//		WebDriver driver =new FirefoxDriver();
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
//		
		
		
		//for Internet Explor 
		
	}

}

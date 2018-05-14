package com.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FromMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
		//set property is is static method present in System class which work on key and value 
		//for fire fox browser 
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		
		System.out.println("Before clciking on the multi city radio button ");
		System.out.println(driver.findElement(By.xpath("//input[@mt-id='returnDate']")).isDisplayed());
		/*
		 * isDisplayed will only return true and false only if the web element is present in code of HTML if no such element is present \
		 * with that name then isDispayed () throw an error
		 * 
		 *  if you want to validate an object present on the web page or code base  then we will use the size of () and we will store in unt type variable 
		 *  and with proper if condition we can verified whether the element is present on page or not
		 */
		System.out.println("After clciking on the multi city radio button ");
		//click on the multi city
		driver.findElement(By.xpath("//div[@id='multicity']")).click();
		//it will return false 
		System.out.println(driver.findElement(By.xpath("//input[@mt-id='returnDate']")).isDisplayed());

		//To check whether the elements are enabled or not
		System.out.println("Before clciking on the One way radio button ");

		driver.findElement(By.xpath("//label[@for='switch__input_2']")).click();
		//return true
		System.out.println(driver.findElement(By.xpath("//input[@mt-id='returnDate']")).isEnabled());
		System.out.println("after clciking on the One way radio button ");
		driver.findElement(By.xpath("//label[@for='switch__input_1']")).click();
		//return false
		System.out.println(driver.findElement(By.xpath("//input[@mt-id='returnDate']")).isEnabled());
		int count=driver.findElements(By.xpath("//input[@mt-id='returnDate']/div")).size();
		if(count==0)
		{
			System.out.println("varified");
		}
	
	}

}

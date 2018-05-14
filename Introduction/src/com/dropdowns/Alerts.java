package com.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
		//set property is is static method present in System class which work on key and value 
		//for fire fox browser 
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@type='button']")).click();
		//to get the text from alert box
		System.out.println(driver.switchTo().alert().getText());
		///to accept the alert box
		driver.switchTo().alert().accept();
		//switchto is use to switch our control to pop up
		driver.findElement(By.xpath("//input[@type='button']")).click();
		//to dismis the alert box
		driver.switchTo().alert().dismiss();
		//we can also wirte some text if there is any text box present the java popup
		driver.switchTo().alert().sendKeys("dksingh@gmail.com");
		
	}

}

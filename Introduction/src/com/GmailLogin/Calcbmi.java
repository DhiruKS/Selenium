package com.GmailLogin;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calcbmi {

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
		driver.get("http://www.calcbmi.com/");
	}
	
	@Test
	public void test()
	{
		String Heading=driver.findElement(By.tagName("h1")).getText();
	
		System.out.println(Heading);
		Assert.assertEquals("Calculate BMI", Heading);
		
		int radio=driver.findElements(By.xpath("//input[@type='radio']")).size();
		if(radio!=0)
		{
			if(driver.findElement(By.xpath("//input[@id='ctw']")).isDisplayed() && driver.findElement(By.xpath("//input[@id='ctw']")).isSelected())
			{
				driver.findElement(By.xpath("//input[@id='ctb']")).click();
				System.out.println(driver.findElement(By.xpath("//input[@id='ctb']")).isSelected());
			}
			else
			{
				Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctw']")).isDisplayed());
			}
		}
		
		String ButtonBMI=driver.findElement(By.xpath("//input[@id='sm']")).getCssValue("color");
		System.out.println(ButtonBMI);
		String TagNAme=driver.findElement(By.xpath("//input[@id='cm']")).getTagName();
		System.out.println(TagNAme);
		
		String AttributeName=driver.findElement(By.xpath("//input[@id='kg']")).getAttribute("id");
		System.out.println(AttributeName);
	}
	@AfterClass
	public void cleanUp()
	{
		driver.close();
		//driver.findElement(By.)
	}

}

package com.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//static drops down are those which develop by the using select key word to handle we need to use the select class 
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
		//set property is is static method present in System class which work on key and value 
		//for fire fox browser 
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		System.out.println(driver.getTitle());
		Select sc= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		sc.selectByValue("2");
		sc.selectByIndex(4);
		sc.selectByVisibleText("8");
		
		
		//dynamic drop down if the web element is not define by the select tags 
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		//driver.findElement(By.xpath("//a[@value='DEL']")).click();
		//****Hear our code will fail because in the application developer has use same code or the component for the dest and source 
		//***due to same code rendering , selenium will search for web element from top left and first time and second time code will try to find the value 
		//***of source
		
		//To handle this we will wrap the xpath in parentheses bracket and will provide the index or 2nd instance.
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		//handle the checkboxes button 
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
		// if will web element is not in focus then we will receive the error saying other element getting click 
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
		
		//Handle the radio button 
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size());
	    int count=	driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
	    driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(1).click();
	    
	    for (int i = 0; i < count; i++) 
	    {
	    	  driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
		}
	    
	    
		//dynamic radio button which are designed with radio tag or value
		
	    //alert box if we are not able to inspect element than its is the java popup or it will browser popup
	    
		
	}

}

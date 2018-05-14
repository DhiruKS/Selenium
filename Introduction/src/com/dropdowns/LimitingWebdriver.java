package com.dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LimitingWebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
				//set property is is static method present in System class which work on key and value 
				//for fire fox browser 
				WebDriver driver =new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				driver.get("https://www.ebay.com/");
				System.out.println(driver.getTitle());
				WebElement footer = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]/ul"));
				System.out.println(footer.findElements(By.tagName("a")).size());
				//find all the link name 
				for (int i = 0; i <footer.findElements(By.tagName("a")).size()-1;  i++) 
				{
					System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
					if (footer.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
						footer.findElements(By.tagName("a")).get(i).click();
						System.out.println(driver.getTitle());
						
					}
				}
				

	}

}

package ActionAndFramesSel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nakari {
	
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
		driver.get("https://www.naukri.com/");
	}
	//fluent wait is helpful in ajax call
	
	@Test
    public void calulateBMI()
    {
           String parentHandle= driver.getWindowHandle();
           Set<String> handles= driver.getWindowHandles();
           for(String h1:handles)
           {
                 driver.switchTo().window(h1);
                 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
                 if(!h1.equals(parentHandle))
                 {
                        driver.close();
                        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
                 }
                 
                 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
           }
    }

	@AfterClass
	public void cleanUp()
	{
	//	driver.close();
		//driver.findElement(By.)
	}


}

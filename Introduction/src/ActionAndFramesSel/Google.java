package ActionAndFramesSel;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	WebElement element;
	Actions builder;
	//Action act;
	@BeforeClass
	public void setDrivePro()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	// TODO Auto-generated method stub
	@BeforeMethod
	public void getURL()
	{
		driver.get("https://www.google.com/");
		
	}
	@Test
    public void calulateBMI()
    {
		element=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		builder=new Actions(driver);
		builder.keyDown(Keys.SHIFT)
		.sendKeys("j")
		.keyUp(Keys.SHIFT)
		.sendKeys("ava code")
		.doubleClick()
		.sendKeys(Keys.ENTER)
		.contextClick();
		
		Action act=builder.build();
		act.perform();
		
		
		
    }
    
	

}

package ActionAndFramesSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//firefox.exe -p to open and set the profile we need to hit  this command in run
public class ScreenShots {
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
    public void takeScreenShot()
    {
		ProfilesIni my= new ProfilesIni();
		FirefoxProfile myFF=my.getProfile("Dhirajsel");
		FirefoxOptions ffOption =new FirefoxOptions();
		ffOption.setProfile(myFF);
		driver=new FirefoxDriver(ffOption);
    }
    

}
/*
Auto IT
Installation steps 
1.click o down loads 
2.click on downloas 
2.click on editor download 
first
solid       

*/
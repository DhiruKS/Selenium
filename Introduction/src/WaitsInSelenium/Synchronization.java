package WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.trivago.in/");
		
/*		
		//run the application without wait 
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		//trying to click with out wait and its will throw error that no such element found on the browser to handle we need to org.openqa.selenium.NoSuchElementException: Unable to locate element::
		//synchronize or selenium code with web application
		driver.findElement(By.xpath("//h3[@class='name__copytext m-0 item__slideout-toggle' and @title='Washington Jefferson Hotel']")).click();
*/
		/*in selenium we have 1st implicite wait which we have to declare once the browser will get instantate 
		 * once we will declare the implicit wait it will wait for entire execution until driver obj get vanish by Garbage collector.
		 * implicit wait always keep on checking or communicating with the dom ,when ever it will find such element it will come  
		 * out form the wait condition and perform further execution  
		 * in implicit wait we canot put any logic its simply wait but in Explicit wait we can wait by giving specific logic dor particular web element.
		 * 
		 * 	//fluent wait is helpful in ajax call
		*	here we are using the concept of polling which divide the whole wait in equal part 
		 */
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//implicit wait is a static and overloaded method present in timeouts method under manage () of web driver class
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='df_overlay_close_wrap overlay__close']"));
		
		System.out.println("Before click on the hotel");
		System.out.println(driver.findElement(By.xpath("//div[@class='gal-collage__wrp']")).isDisplayed());
		driver.findElement(By.xpath("//h3[@class='name__copytext m-0 item__slideout-toggle' and @title='Washington Jefferson Hotel']")).click();
		System.out.println("after click on the hotel");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='gal-collage__wrp']")).isDisplayed());

		System.out.println("pass");
		
//		
//		WebDriverWait d= new WebDriverWait(driver,10);
//		d.until(ExpectedConditions.)
		
		

	}

}

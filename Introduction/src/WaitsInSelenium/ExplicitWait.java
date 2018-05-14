package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.trivago.in/");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='df_overlay_close_wrap overlay__close']"));
		
		WebDriverWait d=new WebDriverWait(driver, 10);
		/*Expicit wait comes under the web driver Wait package in selenium to use explicit wait we need to import the the package and have to create the obj of 
		 * WebDriverWait class ,in this will have parametrized overloaded constructor which takes Webdriver  type and time unit. 
		 * 
		 * Explicit wait have several conditionals wait method which use for specific element loaded .Its also keeps on communicating with dom to locate the element 
		 * 
		 */
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='name__copytext m-0 item__slideout-toggle' and @title='Washington Jefferson Hotel']")));
		System.out.println("Before click on the hotel");
		System.out.println(driver.findElement(By.xpath("//div[@class='gal-collage__wrp']")).isDisplayed());
		driver.findElement(By.xpath("//h3[@class='name__copytext m-0 item__slideout-toggle' and @title='Washington Jefferson Hotel']")).click();
		System.out.println("after click on the hotel");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='gal-collage__wrp']")).isDisplayed());

	}

}

package ActionAndFramesSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class ActionsAndFramesSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//contest click right cilck 
		/*
		 * All kind of mouse and keyboard interaction as well as to formulate user gestures are handle by the action class
		 * if we have to perform more then 1 operation then me use build() method which means our action is ready and Perform () is used to execute t
		 * that operation
		 * to hold any keys in the keyboard we have to use ketDown(Keys.keyname)
		 */
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//we are passing driver capabilities in action class now action class type having the power full capabilities of web driver 
		
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		//we are using the composite action means in single step we are try to doing more than 1 process build will make our code 
		//ready and performed is use to do action what ever we want.
		
		//Composite action 
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getText());
		
		//select all the text 
		act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		//fetch all links on the web page 
		driver.findElements(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']")).size();
		//severmethods of Actions class that we use on daily basis
		//return type of find elements () is collection of list which is of webElement type
		
		}

}

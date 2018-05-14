package ActionAndFramesSel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
				//WebDriver driver= new ChromeDriver();
//				//driver.get("https://google.com");
////				//System.out.println(driver.getTitle());
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");
//		//set property is is static method present in System class which work on key and value 
//		//for fire fox browser 
		WebDriver driver =new FirefoxDriver();
		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
//				driver.get("https://www.gmail.com/");
//				System.out.println(driver.getTitle());
//				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				/*
//				 * When ever we click on the link and new window or new tab is opened the getTitle () will return the title of parent window by default
//				 * 1st we will get all the windows which are open by elenium it will return set of string in terms of ID .
//				 * 
//				 */
//				driver.findElement(By.linkText("Help")).click();
//				System.out.println(driver.getTitle());
//				Set<String>ids=driver.getWindowHandles();
		//		Retype of get windown handle () is collection string type set
//				Iterator<String> id=ids.iterator();
//				String ParentId=id.next();
//				String ChildId=id.next();
//				driver.switchTo().window(ChildId);
//				System.out.println(driver.getTitle());
//				driver.findElement(By.linkText("Sign in")).click();
//				
				
				
				//Frames techniques
				/*
				 * Frame is a component which host the web page its is seprate form HTML its just a special container to have some special web componet 
				 */
//				driver.get("http://jqueryui.com/droppable/");
//				driver.findElement(By.id("draggable")).isDisplayed();
//				//this above statments will fail because selenium will not recognize by its own its own we need to tell selenium 
//				);
//				driver.findElement(By.id("draggable")).isDisplayed();
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Aus");
				//drag and drop;
				Actions act =new Actions(driver);
				Thread.sleep(5000);
				
				
				act.doubleClick(driver.findElement(By.xpath("//span[@class='Q8LRLc']"))).dragAndDrop(driver.findElement(By.xpath("//span[@class='Q8LRLc']")),driver.findElement(By.xpath("//input[@id='lst-ib']"))).build().perform();
				
			
				
				
				

				
	}

}

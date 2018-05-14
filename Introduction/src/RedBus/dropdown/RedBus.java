package RedBus.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {
	
	public static void main(String[] args) throws InterruptedException 
	
    {
		
              System.setProperty("webdriver.gecko.driver", "C:\\Users\\dksingh\\Documents\\Selenium\\geckodriver.exe");

               WebDriver driver=new FirefoxDriver();

               driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

              driver.get("https://www.redbus.in/");

              driver.findElement(By.id("src")).sendKeys("Bangalore");

              Thread.sleep(10000);
              WebElement Srcdrpdwn=driver.findElement(By.xpath("//ul[@class='autoFill']"));
             List<WebElement> wb= Srcdrpdwn.findElements(By.xpath("//li[contains(@select-id,'results')]"));
            // List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='autoFill']"));
             System.out.println(wb.size());
                      

    

              for(int i=0;i<wb.size();i++)

              {
            	  String s;
            	  String s2="Bangalore Package";
            	  WebElement  Actdata;
            	  if(i==0)
            	  {
            		  Actdata =  driver.findElement(By.xpath("//ul[@class='autoFill']/li"));
            		  s=Actdata.getText();
            		  System.out.println(s);
            		  if(s.equals(s2))
                	  {
            			  System.out.println(s);
            			  Thread.sleep(3000);
            			  Actdata.click();
                	  }
                	  //Bangalore Package
            	  }
            	  if(i!=0)
            	  {
            		  Actdata=  driver.findElement(By.xpath("//ul[@class='autoFill']/li["+i+"]"));
            		  s=Actdata.getText();
            		  System.out.println(s);
            		  if(s.equals(s2))
                	  {
//            			  System.out.println(s);
            			  Thread.sleep(3000);

            			  Actdata.click();
            			  break;
                	  }
            	  }
            	  
       	  
              }
    }
}
            	 
 //       	  
//class Cal_spice {
//	static WebDriver driver;
//	public static void main(String[] args) throws InterruptedException 
//	{
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:\\Workspace\\Selenium\\geckodriver.exe");
//	    driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.spicejet.com/");
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Bengaluru (BLR)");
//		Thread.sleep(2000);
//		//System.out.println(driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']")).isDisplayed());
//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Delhi (DEL)");
//		System.out.println("Pass");
//		//System.out.println(driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']")).isDisplayed());
//		DepCalender("July","16");
//		Thread.sleep(4000);
//		System.out.println(driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']")).isDisplayed());
//		retCal("December","10");
//	}
//	public static void DepCalender(String Month,String date) throws InterruptedException
//	{
//		String Currt_month;
//		
//		for (int i = 0; i < 10; i++) {
//			 Currt_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//				System.out.println(Currt_month);
//
//			if(!Currt_month.equals(Month))
//			{
//				System.out.println(i);
//				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//				Thread.sleep(3000);
//				
//			}
//			
//			
//		}

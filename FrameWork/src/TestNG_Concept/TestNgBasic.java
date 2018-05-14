package TestNG_Concept;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgBasic {
/*
 * testNg itself act as java compiler 
 * what ever logic we are writing in test Ng in side @test annotation it will treat as a single test cases
 * 
 * We need to follow the frame work convention every time while writing the scripts its means if we are writing scripts for any 
 * module then each and every test method name starts with module name.
 * 
 * we have a concept of regular expression in testNg its means if we want to include or exclude the methods of a class then inside class under methods tag
 * we can simply use include and exclude with regular expression .
 * 
 * through test ng we can control the flow of the execution by priority ,include and exclude
 * 
 * before test annotation is used to cleanup  and to start the appium server 
 * after test used clear the cookies to get the reports 
 * 
 * Before and after method will be executed each and  every test
 * 
 * Before test is depends on testng file based on test method in scope but before method will execute before and after each and every test
 * 
 * Before class scope is specific to that particular class launch browser 
 * class/method is class level suit and test is testng level based on the method in scope
 * if we want to run the test cases for multiple data set or we have to loop the the test with 
 * multiple combination  to achieve we need to use data provide 
 * its relented to specific test cases 
 * 
 * 
 * 
 */
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("beforeClass()");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("i have highest priority beforeTest()");
	}
	@Parameters({"URL"})
	@Test
	public void demo2(String SiteUrl)
	{
		System.out.println("i will execute first");
		System.out.println(SiteUrl);
	}
	@Test
	public void demo1()
	{
		System.out.println("i will execute second");
	}
	@AfterTest
	public void afterMethod()
	{
		System.out.println("i will execute in last ");
	}
}

package TestNG_Concept;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriority {

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest()");
	}
	@Test
	public void weblogin()
	{
		System.out.println("i will execute  8th weblogin()");
	}
	@Test
	public void MobileLogin()
	{
		System.out.println("i will execute first 9th MobileLogin()");
	}
	/*if we want to remove any particular method in test testNg xml we can easily remove that method by writing in the exclude tag inside the class
	 * 
	 * we can get control on specific methods class and package from test ng
	 * 
	 * the execution flow is depends on how we are writing the xml though the execution will tale place on basis of test annotation 
	 * but in that @test annotation is executed in alpha numeric order if we didn't set the priority 
	 */
	@AfterTest
	public void afterMethod()
	{
		System.out.println("i will execute in last ");
	}
}

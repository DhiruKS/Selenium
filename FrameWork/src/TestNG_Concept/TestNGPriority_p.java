package TestNG_Concept;

import org.testng.annotations.Test;

public class TestNGPriority_p {
	
	@Test
	public void cartPage1()
	{
		System.out.println("i will execute 3rdcart page" );
	}
	
	@Test
	public void cartPage2()
	{
		System.out.println("i will execute 4rth cart page" );
	}
	
	@Test
	public void cartPage3()
	{
		System.out.println("i will execute first 5thcart page" );
	}
	
	@Test
	public void cartPage4()
	{
		System.out.println("i will execute f6th cart page" );
	}
	@Test
	public void homePage()
	{
		System.out.println("i will execute first seventh Home page ");
	}

}

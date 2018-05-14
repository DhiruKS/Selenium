package TestNGInclude;

import org.testng.annotations.Test;

public class IncludeClass {

	@Test
	public void includeMethod()
	{
		System.out.println("i will execute 10includeMethod()");
		
	}
	@Test
	public void includeMe()
	{
		System.out.println("i will execute 11 includeMe()");
	}
}

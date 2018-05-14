package TestNGInclude;

import org.testng.annotations.Test;

public class ExcludeClass {
	@Test
	public void execludeMethod()
	{
		System.out.println("i will execute 12 execludeMethod()");
	}
	@Test
	public void execludeMe()
	{
		System.out.println("i will execute 13 execludeMe()");
	}
}

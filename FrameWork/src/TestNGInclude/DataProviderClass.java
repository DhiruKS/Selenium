package TestNGInclude;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataProviderClass {
	
	
	/*
	 * if we have to set globe environment variable value thought the application then we have to go for parameter concept 
	 * we can driver most common variable thought the test Ng xml file 
	 * we can define those parameter after the suite 
	 * to bring that value we need to put annotation parameter in side that we need to 
	 * 
	 * give parameter name before the test its means its will only applicable to
	 * o that  test case only
	 * 
	 *  we can use the parameterization at class level 
	 *  if we want to run the test cases for multiple data set or we have to loop the the test with 
 * multiple combination  to achieve we need to use data provide 
	 */
	@Parameters({"URL"})
	@Test
	public void login(String siteUrl )
	{
		System.out.println(siteUrl);
	}
	
	@Test(dataProvider="getDta")
	public void Validat(String Uname,String Pwd)
	{
		System.out.println("validate");
		System.out.println(Uname);
		System.out.println(Pwd);
	}
	@DataProvider
	public Object[][] getDta()
	{
		//if we hace to validate certain set of data for login or for address vaidation 
		//we need to cretae the obj of obj class row represt no of time we need to validate 
		//coloum represent the no of data we have to validate
		//depends on groups and data provider we need to provide with in test anotation as a parameter
		//we can depends on ,multiple methods helper attribute enabled,timeout
		Object[][] obj=new Object[3][2];
		obj[0][0]="chrome@gmail.com";
		obj[0][1]="chromebrowser";
		obj[1][0]="FF@gmail.com";
		obj[1][1]="FirefoxBrowser";
		obj[2][0]="IE@gmail.com";
		obj[2][1]="InternetBrowser";
		return obj;
		
	}

}

package DataDrivernClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DataDriveing {
	/*
	 * there should be some central place where we can store the data and if in future there is some change 
	 * then we have the ability to  to change the data from central place and its will reflect every everywhere
	 * 
	 * to handle the common parameter across the test cases to handle this we can use data driven
	 * 
	 * there is a class call properties in java
	 * properties class an interpret only that file which has extension .properties
	 * 
	 * we need to inform java that where is our file is present to which location read o
	 * FileInputStream is a class in java which actually point where our file lies 
	 * by take the path as an argument
	 */
	@Test
	public void login() throws IOException
	{
		Properties prop=new Properties();
		//with the help of properties class we can use the data present in the properties file 
		
		FileInputStream fis=new FileInputStream("C:\\tutorials\\my_selenium\\FrameWork\\src\\DataDrivernClass\\Data.properties");
		//File input stream class need the path of properties where it is located  its takes path as an argument 
		//we need to connect the Properties class with file input stream 
		//so that our code and use that data
		//there is a method called load and its acepect a file stream reference
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
		
		
	}

}

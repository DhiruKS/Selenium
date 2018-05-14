package TestNGInclude;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Ttestlisterners is an interface which implements testNg listeners
public class ListernersClass implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//when ever the test case is fail this block will executed its means listener 
		//class keep on listening testng results when its fail it automatically come and execute 
		//here we have to write SC code 
		//for rest api is failed 
		//we need to notify ore testng that where is our listeners class is located its mandatory
		//after the suite and before test we need to write listeners attribute 
		//provide valid path of the class along with package name
		//afetr each and every test our listeners pass method will execute 
		System.out.println("i got failed due to bug in app" + result.getName());
		//to know at which points its got failed we have a method called result .name
		//we have a class called itestresult which describe the failed test name 
		//at suite level we need to put parallel ="test" and thread count =2"
		//but its not recommend because it will slow done the app
		//at class level also we can define parallel ="classes "
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

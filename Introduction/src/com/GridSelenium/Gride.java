package com.GridSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gride {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		/*
		 * Selenium grid allows us to execute our scripts on different machine and different browser
		 * selenium grid supports different distributive execution with the help of this we can do parallel execution on multiple browser/machine
		 * 
		 * Hub is the central point that will receive all the request and distribute on the right node the grid there will only one Hub.
		 * node is the selenium instance which will execute the scripts loaded on the Hub .
		 * nods can be launched on multiple machine with different browser.
		 * advantage:
		 *  grid is nothing but remote selenium web driver to work wit grid we need to download selenium stand alone server 
		 * 
		 */
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		/*
		 * dc is a class in selenium which have several method to install ssl , to set browser properity to handle browser specific pop ups .
		 * dc is mandatory in selenium grid 
		 * in selenium grid we use the remote web driver class in which we pass hub url and browser propertie .
		 * forwarding the new session canot find 
		 */
		WebDriver driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());

	}

}

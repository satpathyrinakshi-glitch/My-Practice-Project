package com.skillio3;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class beforeTestPractice {
	protected static RemoteWebDriver driver;
	
	@BeforeTest
	@Parameters("BrowserName")
	public  void beforeTestDemo(String Browsername){
		if(Browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			System.out.println("I am chrome driver");
		}
		else if(Browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			System.out.println("I am firefox driver");
		}
		else if(Browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("I am Edge driver");}
			
			else {System.err.println("Invalid Browser Name");}
		
	}
	@Test
	public static void driverClose() throws InterruptedException{
		Thread.sleep(2000);
	driver.close();
	
	}
	}



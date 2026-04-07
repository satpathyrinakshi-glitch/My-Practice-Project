package com.skillio3;



import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTestNG{
	
	@Test
	public  void URLCheck() throws InterruptedException{
	RemoteWebDriver driver=new ChromeDriver();
	//Testcase1.Verify URL is opening.
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	String act=driver.getCurrentUrl();
	Thread.sleep(5000);
	String exp="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	Thread.sleep(5000);
	Assert.assertEquals(act, exp);

	driver.quit();
	}
}
 
package com.skillio3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertPractice {
	@Test
	public static void SoftAssert() throws InterruptedException{
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class=\"_58bkzqdd _3n8fna1co _3n8fna10j _3n8fnaod _3n8fna1 _3n8fnac7 _58bkzqk _1i2djtb9 _1i2djt0\"]"));
		String act=driver.findElement(By.xpath("//div[@class=\"_58bkzqdd _3n8fna1co _3n8fna10j _3n8fnaod _3n8fna1 _3n8fnac7 _58bkzqk _1i2djtb9 _1i2djt0\"]")).getText();
		System.out.println(act);
		Thread.sleep(3000);
		String req="Select delivery location";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(act, req);
		sa.assertEquals(11, 11);
		sa.assertAll();
	}

}

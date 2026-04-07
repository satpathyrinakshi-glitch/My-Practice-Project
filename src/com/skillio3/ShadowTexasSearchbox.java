package com.skillio3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ShadowTexasSearchbox {
	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://www.ti.com/");
		driver.manage().window().maximize();

		WebElement host = driver.findElement(By.xpath("//atomic-search-box[@id='headerSearchBox']"));

		SearchContext shadowRoot = host.getShadowRoot();

		WebElement searchBox = shadowRoot.findElement(By.cssSelector("input"));

		searchBox.sendKeys("LMKDB1120");
		searchBox.sendKeys(Keys.ENTER);	
	/*RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.ti.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//atomic-search-box[@id='headerSearchBox']")).sendKeys("LMKDB1120");
	SearchContext host=driver.findElement(By.xpath("//atomic-search-box[@id='headerSearchBox']")).getShadowRoot();
	host.findElement(By.cssSelector("submit-button")).click();
	}*/
}}

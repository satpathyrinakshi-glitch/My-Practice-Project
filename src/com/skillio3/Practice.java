package com.skillio3;
//Assert
	//If assert not written at last of code then the test case will get pass always
	import org.testng.Assert;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
//@Test
public class Practice {
		@Test
		@Parameters("M1")
		public  void m1(String M1) {
			//Thread.sleep(2000)
		System.out.println("I am the first test case");}	
		
		//if invocationCount=0 will not run
		@Test(invocationCount=1,successPercentage=0)//successp cant be 0
		public static void m2() throws InterruptedException{
			System.out.println("I am the second test case");
			//Thread.sleep(3000);
			String msg="Hi";
			Assert.assertEquals("Hi", msg);}
		//will fail as expected exceptions not matching
		@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
		public static void m3 ()throws InterruptedException{
			System.out.println("I am the Third test case");
			//String msg="Hello";
			//Assert.assertEquals("Hello", msg);
			throw new ArithmeticException();}
			//Assert.assertEquals("Hi", "Hi");}//-->Direct value passed here 
		

		public static void m4(){//Hard Assert-2 assert methods in this test case
			System.out.println("I am the fourth test case");
			//String msg="Hello";
			//Assert.assertEquals("Hi", msg);//As this line is first assert which is failed compiler will not go to second assert check.
			Assert.assertEquals("Hi", "Hi");//-->Direct value passed here 
		}
	}



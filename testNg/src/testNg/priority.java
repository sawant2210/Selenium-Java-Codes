package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priority 

{
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	
	
	
	
	@Test (priority=0)  /////if multiple @test, run in the alphabetical order
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=1)
	public void test()
	{
		System.out.println("test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}

}

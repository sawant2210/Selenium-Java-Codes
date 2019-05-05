 package BasicCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestAsserts 
{
	
	WebDriver driver;
	
	@BeforeTest
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
//  @Test
//  public void hard() 
//  {
//	  
//	  driver.get("https://www.google.co.in");
//	  System.out.println("verifying the hard asserts");
//	  String actual=driver.getTitle();
 //	  System.out.println(actual);
//	  String expected="Google1";
//	  Assert.assertEquals(expected, actual);
//	  System.out.println("Hard Assert works");
//	  
//  }
  
  @Test
  public void soft() 
  {
	  
	  driver.get("https://www.google.co.in");
	  System.out.println("verifying the soft asserts");
	  String actual=driver.getTitle();
	  System.out.println(actual);
	  String expected="Google1";
	  SoftAssert obj= new SoftAssert();
	  obj.assertEquals(expected, actual);
	  //Assert.assertTrue(actual.contains("gool"));
	  System.out.println("soft Assert works");
	  obj.assertAll();// It should be last statement
	    
   }
  
  @AfterTest
	public void close()
	{
		driver.quit();
			
	}
  
  
}

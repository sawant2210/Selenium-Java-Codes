package BasicCodes;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependency {
	
	static WebDriver driver;
  
	@BeforeTest
	public void initiateDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	       driver= new ChromeDriver();
		
	}

	@Test
	public void login()
	{       
		
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
       driver.get("http://opensource.demo.orangehrmlive.com/");
		}
	
	@Test(dependsOnMethods="login")// this will be skipped if login fails
	public void navigate()
	{
  
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	
	}
	
	@Test(dependsOnMethods="navigate")// this will be skipped if navigate fails
	public void logout() throws InterruptedException
	{
  
	   boolean status=driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).isDisplayed();
	   Assert.assertTrue(status);
	   driver.findElement(By.id("welcome")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	   
	}
	
	
	@AfterTest
	
	public void closebrowser()
	{
		driver.quit();
	}
	
}

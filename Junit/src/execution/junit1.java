package execution;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit1 {

	private WebDriver driver;
	@Before
	public void BeforeTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test()
	{
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.name("userName")).sendKeys("batman");
			driver.findElement(By.name("password")).sendKeys("batman");
	}
	
	@After
	public void AfterTest()
	{
		driver.close();
	}

}

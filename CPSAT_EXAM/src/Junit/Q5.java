package Junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  
public class Q5 {
	 private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test()
	{
		driver.get("http://www.qaagility.com/");
		driver.findElement(By.linkText("Testing Services")).click();
		driver.findElement(By.linkText("Managed Testing Services")).click();
		
	if(driver.getPageSource().contains("Onsite Offshore model"))
	{
		System.out.println("Onsite Offshore model text is present");
	}
	else
	{
		System.out.println("not present");
	}
	
	
	driver.findElement(By.linkText("Contact Us")).click();
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/section/article/div[3]/div[5]/div[2]/div[2]")).getAttribute("innerHTML"));

		
	}
	@After
	public void tearDown() throws Exception {
	}

	

}

package TetstNg;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MahatmaGandhi 
{		
	static WebDriver driver;

	@Before
	public void setUp() throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://www.google.cat/");
		driver.findElement(By.name("q")).sendKeys("mahatma Gandhi");
		driver.findElement(By.id("_fZl")).click();
		Thread.sleep(5000);
		
		//WebElement el1= driver.findElement(By.linkText("Mahatma Gandhi - Anti-War Activist - Biography.com"));
		
		if(driver.getPageSource().contains("Mahatma Gandhi - Anti-War Activist - Biography.com"))
		{
			driver.findElement(By.linkText("Mahatma Gandhi - Anti-War Activist - Biography.com")).click();
			//el1.click();
		}
		else
		{
			System.out.println("text not present");
		}
		
		String date=driver.findElement(By.xpath("//*[@id='lyra-wrapper']/div[2]/div[1]/section/div[2]/section[1]/article/div/aside[2]/dl[3]/dd/a[1]")).getText().toString();
		System.out.println(date);
		
	
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.close();
	}

	

}

package InitiateDriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Profx {
	private WebDriver driver;

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
		driver.get("http://www.profx.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/i/a/img")).click();
		Thread.sleep(3000);
		Actions obj=new Actions(driver);
		
		obj.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[3]/a"))).build().perform();
		Thread.sleep(1000);	
	}


	@After
	public void tearDown() throws Exception {
	}

	
}

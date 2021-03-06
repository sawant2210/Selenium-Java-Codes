package TetstNg;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class allmovie {

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
		driver.get("http://www.allmovie.com/");
		WebElement Search;
		Search=driver.findElement(By.name("term"));
		Search.sendKeys("gangs of new york");
		Thread.sleep(1000);
		Search.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		//Search.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		Search.sendKeys(Keys.ENTER);
		String rate=driver.findElement(By.xpath("//*[@id='cmn_wrap']/div[1]/div[2]/header/hgroup[2]/span[5]/span")).getText().toString();
		System.out.println(rate);
		Assert.assertEquals(rate, "R");  
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.close();
	}

	

}

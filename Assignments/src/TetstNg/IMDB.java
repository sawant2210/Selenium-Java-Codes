package TetstNg;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IMDB 
{
	static WebDriver driver;
	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Test
	public void test() 
	{
		driver.get("http://www.imdb.com/");
		driver.findElement(By.id("navbar-query")).sendKeys("Gangs of NewYork");
		driver.findElement(By.id("navbar-submit-button")).click();
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();;
		String runtime=driver.findElement(By.xpath("//*[@id='titleDetails']/div[13]/time")).getText().toString().trim();
		System.out.println(runtime);
		System.out.println(runtime.substring(0, 3));
		int runtime1=Integer.parseInt(runtime.substring(0, 3));
		Assert.assertTrue(runtime1<180);
		
		String Rating= driver.findElement(By.xpath("//*[@id='titleStoryLine']/div[5]/span[1]")).getText().trim();
		String R1[]= Rating.split(" ");
//		System.out.println(R1[1]);
		Assert.assertTrue(R1[1].equals("R"));
		
		
	}
		
	
	
	@After
	public void tearDown() throws Exception
	{
		driver.quit();
	}

}

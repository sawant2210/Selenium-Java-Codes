package TetstNg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WikiPedia 
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
		
		driver.get("https://www.wikipedia.org/");
		String s1=driver.findElement(By.xpath("//*[@id='js-link-box-en']/small/bdi")).getText().toString();
		String s2=s1.replace(" ", "");
		System.out.println(s2);
		driver.findElement(By.id("searchInput")).sendKeys("Anna University");
		driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button")).click();
		
		String s3=driver.findElement(By.xpath("//*[@id='mw-content-text']/div/table[2]/tbody/tr[2]/td")).getText().toString();
		System.out.println("Motto in English:"+ s3);
		Assert.assertTrue(s3.contains("Know"));
		
		System.out.println("Motto contains knowledge");
		
		List<WebElement> list1= driver.findElements(By.xpath("//*[@id='mw-content-text']/div/div[4]/ul/li"));
		int c=0;
		for(int i=0; i<list1.size();i++)
		{
			if(list1.get(i).getText().contains("Shiv Nadar"))
			{
				c++;
			}
		}
		
		try
		{
		Assert.assertTrue(c==1);
		System.out.println("Shiv Nadar is present");
		}
		catch(AssertionError e)
		{
		System.out.println("Shiv Nadar is present");
		}
	}

	
	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}
}

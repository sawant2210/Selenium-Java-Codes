package execution;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class JunitWindows 
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
	public void test() throws InterruptedException {
	
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String parentwin= driver.getWindowHandle();
		System.out.println(parentwin);
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		
		Set<String> allwin=driver.getWindowHandles();
		System.out.println(allwin);
		
		for(String temp :allwin)
		{
			if(!(parentwin.equals(temp)))
			{
				driver.switchTo().window(temp);
				Thread.sleep(3000);
				driver.close();
				
			}
			
		}
		
		driver.switchTo().window(parentwin);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}
	
	@After
	public void tearDown() throws Exception
	{
		
		//driver.close();
	}

}

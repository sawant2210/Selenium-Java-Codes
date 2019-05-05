package execution;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDate 
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
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		WebElement tbody=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody"));
		
		List<WebElement> trow=tbody.findElements(By.tagName("tr"));		

		for(int i=0;i<trow.size();i++)
		{
			List<WebElement> tcell=trow.get(i).findElements(By.tagName("td"));
			for(int j=0;j<tcell.size();j++)
			{
			
				if(tcell.get(j).getText().toString().equals("23"))
					tcell.get(j).click();
			}
		}
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
	
	}

	@After
	public void tearDown() throws Exception
	{
		driver.close();
	}

	

}

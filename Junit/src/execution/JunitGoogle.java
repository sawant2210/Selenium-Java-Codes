package execution;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitGoogle 
{
	private WebDriver driver;
	@Before
	public void setUp() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws IOException, InterruptedException, AWTException 
	{
		
		driver.get("https://www.google.com/maps");
		driver.findElement(By.name("q")).sendKeys("GR Tech Park");
		driver.findElement(By.id("searchbox-searchbutton")).click();
		Thread.sleep(5000);
		
		File binaryfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // taking screenshot as a binary image
		FileUtils.copyFile(binaryfile, new File("D:\\TestFile.jpeg"));// converting into jpeg/png file
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("GR Tech Park - Google Maps", title);
		
		driver.findElement(By.xpath("//*[@id='pane']/div/div[2]/div/div/div[1]/button[2]/div/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='sb_ifc51']/input")).sendKeys("L&T Infotech");
		

		Robot rob=new Robot();

		rob.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@id='pane']/div/div[2]/div/div/div[5]/div[2]/div[1]")).click();
		
				
	}
	
	@After
	public void tearDown() throws Exception 
	{
		//driver.close();
		
	}

}

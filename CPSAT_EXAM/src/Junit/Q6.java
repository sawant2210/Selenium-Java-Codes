package Junit;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6 {
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws AWTException, InterruptedException {
		

	/*	driver.get("http://www.allmovie.com/");
		driver.findElement(By.name("term")).sendKeys("gangs of new york");
		Thread.sleep(2000);
	
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		rob.keyPress(KeyEvent.VK_ENTER);*/
		
		
		
		driver.get("http://www.bookadda.com/");
		driver.findElement(By.name("searchkey")).sendKeys("cricket");
		Thread.sleep(1000);
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_ENTER);
		Select ob1=new Select(driver.findElement(By.name("sortBy")));
		Thread.sleep(1000);
		ob1.selectByIndex(1);
		
	}

	@After
	public void tearDown() throws Exception {
	}
;
	

}

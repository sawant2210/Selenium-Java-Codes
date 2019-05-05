package TestNg;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterTest;

public class Q2 {
  private WebDriver driver;

  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void f() throws AWTException 
  {
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  driver.findElement(By.name("search")).sendKeys("Crouching Tiger, Hidden Dragon");
	  Robot rob=new Robot();
	  rob.keyPress(KeyEvent.VK_ENTER);
	  
	  String time=driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[14]/td")).getText().toString();
	 
	  String time1=time.substring(0,11);
	  System.out.println(time1);
	  Assert.assertEquals("120 minutes", time1);
	  
	  String director=driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[4]/td/div/ul/li[3]")).getText().toString();
	  Assert.assertEquals("Ang Lee", director);
	  
	  for(int i=1;i<5;i++)
	  {
		System.out.println(driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[7]/td/div/ul/li["+i+"]/a")).getText().toString());
		
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
  }

}

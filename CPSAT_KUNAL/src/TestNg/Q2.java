package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Q2 {
  private WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	  //driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  @Test
  public void f() 
  {
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  driver.findElement(By.name("search")).sendKeys("Crouching Tiger, Hidden Dragon");
	  driver.findElement(By.name("go")).click();
	  
	  String expectedmin= driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[14]/td")).getText().toString();
	  System.out.println(expectedmin);
	  String expt=expectedmin.substring(0,11);
	  Assert.assertEquals(expt, "120 minutes");
	  
	  
	  String dirctname=driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[3]/td/a")).getText().toString();
	  Assert.assertEquals(dirctname, "Ang Lee");
	  
	  String boxoffc=driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[17]/td")).getText().toString();
	  Assert.assertEquals(boxoffc, "$17 million");
	  
	  for(int i=1;i<5;i++)
	  {
		  
	  System.out.println(driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[7]/td/div/ul/li["+i+"]/a")).getText().toString());
	  }
	  
	
	//*[@id="mw-content-text"]/table[1]/tbody/tr[7]/td/div/ul/li[2]/a
	  
	  
  }

  @AfterTest
  public void afterTest()
  {
  }

}

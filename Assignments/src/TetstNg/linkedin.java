package TetstNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class linkedin {
	static WebDriver driver;
	 @BeforeTest
	  public void beforeTest()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void f() throws InterruptedException
  {
	  driver.get("https://in.linkedin.com/");
	  driver.findElement(By.name("first")).sendKeys("kunal");
	  driver.findElement(By.name("last")).sendKeys("sawant");
	  driver.findElement(By.name("search")).click();
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,600)", "");
	  Thread.sleep(1000);
	  jse.executeScript("window.scrollBy(0,600)", "");
	  Thread.sleep(1000);
	  jse.executeScript("window.scrollBy(0,-600)", "");
	  Thread.sleep(1000);
	  jse.executeScript("window.scrollBy(0,-600)", "");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/ul/li[1]/div/button")).click();
	System.out.println(driver.getCurrentUrl());  
	  
  }
 

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}

package ListenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(ListenerDemo.TestNgListener.class)   // class level listener
public class ListenerClass 
{
	 
	
  @Test
  public void Verify_title() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.google.co.in");
	  String title=driver.getTitle();
	  System.out.println(title);
	  driver.quit();
	  
  }
  @Test
  public void check_failed()
  {
	  System.out.println("test listeners");
	  Assert.assertEquals(12, 13);
  }
  
}



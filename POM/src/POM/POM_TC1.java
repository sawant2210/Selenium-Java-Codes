package POM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_TC1
{
	
	WebDriver driver=SelectBrowser.SelectBrowser1("chrome");
	
//	@BeforeTest
//	public void initilizeDriver()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
//	       driver= new ChromeDriver();
//	       driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
//	}
	
	
  @Test
  public void f()
  {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	  
	  POM_Loginpge obj=new POM_Loginpge(driver);
//	  driver.findElement(obj.username).sendKeys("admin");
//	  driver.findElement(obj.password).sendKeys("admin");
//	  driver.findElement(obj.Login_button).click();  
	  obj.verifyLogin("admin","admin");
	  driver.quit();
	  
  }
  
}
  
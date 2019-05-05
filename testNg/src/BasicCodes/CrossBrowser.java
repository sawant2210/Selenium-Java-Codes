package BasicCodes;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


  
public class CrossBrowser {
	
	
	WebDriver driver;

	
	
  @Test
  @Parameters("browser")
  public void testAllBrowser(String browsername) 
  {
	  
	  if(browsername.equalsIgnoreCase("chrome"))
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		  driver= new ChromeDriver();
		  
	  }
	  else if (browsername.equalsIgnoreCase("firefox"))
	  {
		  
 		  System.setProperty("webdriver.gecko.driver", "D:\\selenium\\Jars\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  
	  
	  driver.get("https://www.google.co.in");
	  driver.quit();
  }
}

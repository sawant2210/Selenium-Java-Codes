package TetstNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Ebay {
	
	private WebDriver driver;
	Workbook wb;
	Sheet sh1;
	int numrow;
	
	
 
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	//  driver= new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.ebay.in/");
	  
  }
  
  @Test(dataProvider="testdata")
  public void test(String input) throws AWTException, InterruptedException 
  {
	  driver.findElement(By.id("gh-ac")).sendKeys(input);
	  
		Robot rob=new Robot();

		rob.keyPress(KeyEvent.VK_ENTER);
		
		Actions obj= new Actions(driver);
		
		obj.moveToElement(driver.findElement(By.xpath("//*[@id='DashSortByContainer']/ul[1]/li/a"))).build().perform();
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		
  }	
		@DataProvider(name="testdata")
		public int datafeed()
		{
			
			return 1;
		}
	
  

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}

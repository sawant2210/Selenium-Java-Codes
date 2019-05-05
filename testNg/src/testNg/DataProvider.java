package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProvider 
 {
	
	private WebDriver driver;
	@BeforeTest
    public void befoeTest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	
    @Test(dataProvider="testdata")
    public void test(String UN,String PSWD)
    {
    	driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PSWD);
    }
    
    
    @org.testng.annotations.DataProvider(name="testdata")
    public static Object[][] testdata()
    {
		return new Object[][]{{"admin","admin"},{"admin","admin"},{"admin","admin"}};
		
    }    
    
}





      
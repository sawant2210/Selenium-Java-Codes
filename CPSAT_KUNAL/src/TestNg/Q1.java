package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Q1 {
  private WebDriver driver;
  
  @BeforeTest
  public void beforeTest() 
  {		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  @Test
  public void f() throws IOException, AWTException, InterruptedException
  {
	   driver.get("http://www.ebay.in/");
	   File myfile=new File("C:\\Users\\kunal\\Downloads\\CP-SAT_Nimesh\\Resources Used\\Q1 excel.xls");
		FileInputStream mystream=new FileInputStream(myfile);
		HSSFWorkbook mybook= new HSSFWorkbook(mystream);
		
		Sheet mysheet=mybook.getSheet("Sheet1");
		Row myrow=null;
		Cell mycell=null;
		
		for(int i=mysheet.getFirstRowNum();i<= mysheet.getLastRowNum();i++)
		{
			myrow=mysheet.getRow(i);
			for(int j=myrow.getFirstCellNum();j< myrow.getLastCellNum();j++)
			{
				mycell=myrow.getCell(j);
				String Input=mycell.getStringCellValue();
				driver.findElement(By.id("gh-ac")).clear();
				
				driver.findElement(By.id("gh-ac")).sendKeys(Input);
				Robot rob=new Robot();
				rob.keyPress(KeyEvent.VK_ENTER);
				
				Actions obj=new Actions(driver);
				obj.moveToElement(driver.findElement(By.xpath("//*[@id='DashSortByContainer']/ul[1]/li/a"))).build().perform();
				Thread.sleep(1000);
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
				
				rob.keyPress(KeyEvent.VK_ENTER);
				
			
			}
			
		}	
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
 
package TestNg;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

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
	int numcol;
	
 
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  //driver= new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.ebay.in/");
	  

  }
  
  @Test
  public void test() throws AWTException, InterruptedException 
  {
	  
	  String[][] input= datafeed();
	  System.out.println(input.length);
	  for(int j=0;j<input.length;j++)
	  {
		  
		  driver.findElement(By.id("gh-ac")).clear();
	      driver.findElement(By.id("gh-ac")).sendKeys(input[j][0]);;
	 
	      driver.findElement(By.id("gh-btn")).click();
	      Robot rob=new Robot();

	//	rob.keyPress(KeyEvent.VK_ENTER);
		
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
		
  }	
		
		public String[][] datafeed()
		{
			
			try
			{
				wb=Workbook.getWorkbook(new File("D:\\selenium\\Q1 excel.xls"));
				sh1=wb.getSheet(0);
				numrow= sh1.getRows();
				numcol=sh1.getColumns();
				
				
				System.out.println(numrow);
				System.out.println(numcol);	
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			String [][] brandname= null;
			int ci=0;
			for(int i=0;i<= numrow;i++)
			{
				int cj=0;
				for(int j=0;j<numcol;j++,cj++)
					
				brandname[ci][cj]=sh1.getCell(i,j).getContents();
				System.out.println(brandname[ci][cj]);
				
			}
			return brandname;
			 
		}
		
		
	
  
 
  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}

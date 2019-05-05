package TetstNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class BookAdda {
  static WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
  }

  @Test
  public void f() throws IOException
  {
	  
	  driver.get("http://www.bookadda.com/");
	  File myfile=new File("path for excell");
	  FileInputStream mystream= new FileInputStream(myfile);
	  
 HSSFWorkbook mybook=new HSSFWorkbook(mystream);	 

Sheet mysheet=mybook.getSheet("Sheetname");
 Row myrow=mysheet.getRow(0);
 
 Cell mycell=null;
 
for(int i=myrow.getFirstCellNum();i<=myrow.getLastCellNum();i++)
 {
	mycell=myrow.getCell(i);
	String input= mycell.getStringCellValue();
	driver.findElement(By.name("searchkey")).sendKeys(input);
	driver.findElement(By.xpath("//*[@id='searchForm']/table/tbody/tr/td/table/tbody/tr/td[3]/input")).click();
	Select obj=new Select(driver.findElement(By.name("sortBy")));
	List<WebElement> list1=obj.getOptions();
	obj.selectByIndex(3);
	
	  
  }
  }
  @AfterTest
  public void afterTest() 
  {
  }

}

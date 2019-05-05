 package TetstNg;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AgileTestingAlliance {
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
	  driver.get("http://agiletestingalliance.org/");
	  String parentwin=driver.getWindowHandle();
	  System.out.println(parentwin);
	  driver.findElement(By.linkText("Preferred Corporate Partner")).click();
	  Thread.sleep(2000);
	  Set<String> allwin=driver.getWindowHandles();
	  System.out.println(allwin);
	  
	  for(String temp:allwin)
	  {
		  if(!(parentwin.equals(temp)))
		  {
			  driver.switchTo().window(temp);
		  System.out.println(driver.getCurrentUrl());
		  driver.close();
		  }
	  }
	  driver.switchTo().window(parentwin);
	System.out.println(driver.findElement(By.xpath("/html/body/footer/div/a[1]")).getAttribute("href"));
	System.out.println(driver.findElement(By.xpath("/html/body/footer/div/a[2]")).getAttribute("href"));
	System.out.println(driver.findElement(By.xpath("/html/body/footer/div/a[3]")).getAttribute("href"));
	
	  driver.findElement(By.linkText("Alliance")).click();
	System.out.println( driver.findElement(By.xpath("//*[@id='leftcolumn']/a[10]/span")).getText().toString());
	  
	
   /* WebElement tbody=driver.findElement(By.xpath("//*[@id='leftcolumn']"));
	List<WebElement> tdiv=tbody.findElements(By.xpath("//*[@id='leftcolumn']/div[2]"));
	for(int i=0;i <tdiv.size();i++)
	{
		System.out.println(tdiv.get(i).getText().toString());
	}*/
	
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[11]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[12]")).getText().toString());	
 	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[13]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[14]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[15]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[16]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[17]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[18]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[19]")).getText().toString());
	System.out.println(driver.findElement(By.xpath("//*[@id='leftcolumn']/a[20]")).getText().toString());
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}

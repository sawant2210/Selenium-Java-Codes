package BasicAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table4 
{
//	 table4(WebDriver driver)
	 public static void main(String args[])
	 {		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			driver.get("http://toolsqa.com/automation-practice-table/");
			 
			 WebElement tbody=driver.findElement(By.xpath("//*[@id='content']/table/tbody"));
			 
			 List<WebElement> trow=tbody.findElements(By.tagName("tr"));
			 
			 for(int i=0; i<trow.size();i++)
			 {
				 System.out.println(trow.get(i).getText());
			 }
			 
			 List<WebElement> tcell=trow.get(0).findElements(By.tagName("td"));
			 System.out.println(tcell.get(0).getText().toString());
			 
			 
	//		 
	//		 WebElement thead=driver.findElement(By.xpath("//*[@id='content']/table/thead"));
	//		 List<WebElement> trow=thead.findElements(By.tagName("tr"));
	//		 
	//		 List<WebElement> tcell=trow.get(0).findElements(By.tagName("th"));
			 
			 System.out.println(tcell.get(3).getText());
  		 
	 }
	

}
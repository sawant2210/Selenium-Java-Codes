package BasicAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker13 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		
		Thread.sleep(2000);
		
		WebElement tbody= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody"));
		
		List<WebElement>  trow= tbody.findElements(By.tagName("tr"));
		
		System.out.println(trow.size());
		
		for(int i=0; i<trow.size();i++)
		{
			List<WebElement> tcell= trow.get(i).findElements(By.tagName("td"));
			
			
			for(int j=0;j<tcell.size();j++)
			{
				if(tcell.get(j).getText().toString().equals("2"))
				{
					System.out.println("IF else");
					tcell.get(j).click();
				}
				
			}
		}
		
	}

 }

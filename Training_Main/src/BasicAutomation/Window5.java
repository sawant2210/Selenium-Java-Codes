package BasicAutomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window5 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String parentwin= driver.getWindowHandle();
		System.out.println(parentwin);
		driver.findElement(By.id("button1")).click();
		Set<String> allwin=driver.getWindowHandles();
		System.out.println(allwin);
		
		for(String temp: allwin)
		{
			if(!(parentwin.equals(temp)))
				
			{
				driver.switchTo().window(temp);
				Thread.sleep(5000);
   				driver.close();
   				
   				Thread.sleep(5000);
				
			}
		}
		
		
 		driver.switchTo().window(parentwin);
		Thread.sleep(2000);
		driver.close();

	}

}

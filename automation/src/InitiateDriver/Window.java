package InitiateDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Window {
	
	public void getWindow(WebDriver driver) throws InterruptedException
	{
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String parentwin=driver.getWindowHandle();
		System.out.println(parentwin);
		//driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();;
		Thread.sleep(6000);
		Set<String> allwin=driver.getWindowHandles();
		System.out.println(allwin);
		
		for(String temp :allwin)
		{
			if(!(parentwin.equals(temp)))
					{
				driver.switchTo().window(temp);
				driver.close();
				
					}
		}
		
		driver.switchTo().window(parentwin);
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
	
	

}

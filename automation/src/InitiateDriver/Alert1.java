package InitiateDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert1 {
	
	public void getAlert(WebDriver driver) throws InterruptedException
	{
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
				
		Alert alert=driver.switchTo().alert();
		//Thread.sleep(3000);
		//alert.accept();
		//alert.dismiss();
		
		Thread.sleep(3000);
		
		if(alert.getText().equals("A simple Alert"))
		{
			alert.accept();
		}
		else
		{
			alert.dismiss();
		} 
	}

}

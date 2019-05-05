package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register2
{
	void login(WebDriver driver)
	{
		driver.findElement(By.name("userName")).sendKeys("batman");
		//Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
		
		
	}

}

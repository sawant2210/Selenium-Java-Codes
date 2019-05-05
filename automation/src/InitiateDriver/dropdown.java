package InitiateDriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	
	public void getDropDown(WebDriver driver) throws InterruptedException
	{
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
		
		Select obj= new Select(driver.findElement(By.name("fromPort")));
		List<WebElement> list1=obj.getOptions();
		System.out.println(list1.size());
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getAttribute("value"));
			
		}
		
		obj.selectByIndex(8);
		Thread.sleep(3000);
		obj.selectByValue("Paris");
		Thread.sleep(3000);
		obj.selectByVisibleText("London");
		
		
	
	}
}

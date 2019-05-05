package BasicAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 
{

	
	Dropdown3(WebDriver driver) throws InterruptedException
	{
		
		
		Select ob4=new Select(driver.findElement(By.name("fromPort")));
		List<WebElement> list1=ob4.getOptions();
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getAttribute("value"));
		}
		
		ob4.selectByIndex(9);
		Thread.sleep(1500);
		ob4.selectByValue("London");
		Thread.sleep(1500);
		ob4.selectByVisibleText("Paris");
		
	}
}

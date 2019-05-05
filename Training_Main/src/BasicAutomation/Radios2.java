package BasicAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radios2 
{
	
	
	
	void getRadios(String Locator, String SelectRadio, WebDriver driver) throws InterruptedException
	{
		
		//selecting radio button using x path (radios has name-value pair)
		
		//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		// count of radio button		
		List<WebElement> list1= driver.findElements(By.name(Locator));
		System.out.println(list1.size());
		
		// printing name of radio button
		for(int i=0; i<list1.size();i++)
		{
   			System.out.println(list1.get(i).getAttribute("value"));
			
		}
		//
		for(int i=0; i<list1.size();i++)
	 	{
			if(list1.get(i).getAttribute("value").equals(SelectRadio));
			{
				list1.get(i).click();
			}
			
		}
		
		
		for(int i=0; i<list1.size();i++)
		{
	 		if(list1.get(i).isSelected())
			{
				
				System.out.println(list1.get(i).getAttribute("value"));
			}
			
		}
		
		System.out.println(driver.getTitle());
		
		
		
	}

}

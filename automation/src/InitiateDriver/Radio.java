package InitiateDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Radio {

	
	public void getRadios(String locator,String radiobutton, WebDriver driver)
	{
		//driver.get("http://newtours.demoaut.com/");
		List<WebElement> list1=driver.findElements(By.name(locator));
		System.out.print(list1.size()); // size
		
		for(int i=0;i<list1.size();i++) // display all radio buttons
		{
			System.out.println(list1.get(i).getAttribute("value"));
			
		}
		
		for(int i=0;i<list1.size();i++) //  click on radio buttons
		{
			if(list1.get(i).getAttribute("value").equals(radiobutton));
			{
				list1.get(i).click();
			}
			
		}
		
		for(int i=0;i<list1.size();i++) //  click on radio buttons
		{
			if(list1.get(i).isSelected())
			{
              System.out.println(list1.get(i).getAttribute("value"));			}
			
		}
		
		
		
		//driver.close();
		
	}
}

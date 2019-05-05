package InitiateDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class table {

	
	public void getTable(WebDriver driver)
	{
		driver.get("http://toolsqa.com/automation-practice-table/");
		/*WebElement tablehead=driver.findElement(By.xpath("//*[@id='content']/table/thead"));
		List<WebElement> tablerow=	tablehead.findElements(By.tagName("tr"));// all elements
		
		for(int i=0;i<tablerow.size();i++) 
		{
			System.out.println(tablerow.get(i).getText().toString());
		}
		
		 List<WebElement> tablecell=tablerow.get(0).findElements(By.tagName("th"));///to exctract individual element
		System.out.println(tablecell.get(0).getText().toString());  */
		
		WebElement tbody=driver.findElement(By.xpath("//*[@id='content']/table/tbody"));
		List<WebElement> trow=	tbody.findElements(By.tagName("tr"));// all elements
		
		for(int i=0;i<trow.size();i++)
		{
			System.out.println(trow.get(i).getText().toString());
		}
		
		 List<WebElement> tablecell=trow.get(0).findElements(By.tagName("td")); ///to extract individual element
		System.out.println(tablecell.get(0).getText().toString());  
		
		
		
		
		
		
		
		
		
	}
}

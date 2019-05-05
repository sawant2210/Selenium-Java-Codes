package InitiateDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Initiate {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//driver.get("http://newtours.demoaut.com/");
	
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	WebElement Search;
	Search=driver.findElement(By.name("search"));
	Search.sendKeys("tat");
	//Thread.sleep(1000);
	Search.sendKeys(Keys.DOWN);
	Search.sendKeys(Keys.DOWN);
	Search.sendKeys(Keys.DOWN);
	Search.sendKeys(Keys.DOWN);
	Search.sendKeys(Keys.ENTER);
		 
		/* driver.get("https://www.annauniv.edu/");
		 
		 Actions obj=new Actions(driver);
 
		  
		 obj.moveToElement(driver.findElement(By.id("link3"))).build().perform();
		 Thread.sleep(5000);
		 obj.moveToElement(driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]/span/div[2]/div/div/div[3]"))).build().perform();
		 Thread.sleep(5000);
		 obj.click().build().perform();
		 Thread.sleep(5000);
		 System.out.println("Passed");
		 
driver.close();*/
	
	/*driver.findElement(By.name("userName")).sendKeys("batman");
	driver.findElement(By.name("password")).sendKeys("batman");
	driver.findElement(By.name("login")).click();
	
	
      
     //Radios
    /* List<WebElement> list1=driver.findElements(By.name("tripType"));
     System.out.println(list1.size()); //size
     
     for(int i=0;i<list1.size();i++) // names
     {
    	 System.out.println(list1.get(i).getAttribute("value"));
    	 
     }
     

     driver.close();*/
		
		/*////// radio function 
		Radio ob1=new Radio();
		ob1.getRadios("tripType", "oneway", driver);*/
		
		//////table
		
		
	/*table ob2=new table();
	ob2.getTable(driver);*/
		
		
		/*dropdown ob1=new dropdown();
		ob1.getDropDown(driver);*/
		
		/////ALERT
	/*	Alert1 ob1 =new Alert1();
		ob1.getAlert(driver);*/
		
		////windows
		
	//	Window ob1=new Window();
		//ob1.getWindow(driver);
		
		//driver.close();
		
		
		
		
	}

}

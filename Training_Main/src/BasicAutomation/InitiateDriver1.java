package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class InitiateDriver1
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("http://newtours.demoaut.com/");
	
   	
	/*driver.findElement(By.name("userName")).sendKeys("batman");
	//Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("batman");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("PROFILE")).click();
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());*/
	
	
	/*Register ob1= new Register();
	
		ob1.login(driver);
		//driver.close();
		
		Radios ob2= new Radios();
		ob2.getRadios("tripType", "oneway", driver);
		
		Assert.assertEquals(driver.getTitle(), "Nishant");
		
		Dropdown ob3=new Dropdown(driver);*/
	
//	table4 ob4=new table4(driver);
		 
	
	
	
		
		
		
		

	}

}

package InitiateDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_keyboard 

{

	public static void main(String[] args) throws InterruptedException, AWTException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	      driver.get("http://newtours.demoaut.com/");
	      Actions ob1=new Actions(driver);
	     // ob1.contextClick(driver.findElement(By.linkText("REGISTER"))).build().perform();
	      ob1.clickAndHold().contextClick(driver.findElement(By.linkText("REGISTER"))).build().perform();
	      Thread.sleep(3000);
	      Robot r=new Robot();
	      
	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(1000);

	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(1000);

	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(1000);
	      
	      r.keyPress(KeyEvent.VK_ENTER);
	   
		
	 
		
	}

}

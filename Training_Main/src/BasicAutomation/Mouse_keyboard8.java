 package BasicAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_keyboard8 {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
		Actions obj=new Actions(driver);
		
		obj.contextClick(driver.findElement(By.linkText("REGISTER"))).build().perform();
		
		
		Thread.sleep(1000);
		
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		

		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);

		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		
	
	}
 
}

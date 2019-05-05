package BasicAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender14 {

	public static void main(String[] args) throws AWTException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/");
		
		WebElement calender= driver.findElement(By.name("bdaytime"));
		
		calender.sendKeys("22101993");
		
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_RIGHT);
		rob.keyRelease(KeyEvent.VK_RIGHT);
		
		calender.sendKeys("2210");
		
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		
	}

}

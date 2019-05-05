package InitiateDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FoxSports {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.foxsportsasia.com/?ref=usa");
		 
		 Actions obj=new Actions(driver);
		 obj.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/section/div[1]/div[1]/div/div/div/ul/li[4]/a"))).build().perform();
		 Thread.sleep(1000);
		 obj.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/section/div[1]/div[1]/div/div/div/ul/li[4]/ul/li[4]/a"))).build().perform();
		 Thread.sleep(1000);
		 obj.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/section/div[1]/div[1]/div/div/div/ul/li[4]/ul/li[4]/ul/li[2]/a"))).build().perform();
		 Thread.sleep(1000);
		 obj.click().build().perform();
		 
		 

	}

}

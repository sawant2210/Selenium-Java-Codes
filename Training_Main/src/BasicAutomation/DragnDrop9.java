package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop9 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://keenthemes.com/preview/metronic/theme/admin_1/ui_tree.html");
		
		
		Actions obj=new Actions(driver);
		
		obj.doubleClick(driver.findElement(By.xpath("//*[@id='j3_8_anchor']"))).build().perform();
		
		Thread.sleep(1000);
		
		obj.dragAndDrop(driver.findElement(By.id("j3_10_anchor")), driver.findElement(By.id("j3_1_anchor"))).build().perform();;
		
		
		
		
		
	}

}

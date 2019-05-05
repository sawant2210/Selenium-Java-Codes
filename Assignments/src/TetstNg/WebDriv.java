
package TetstNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class WebDriv {
		public WebDriver driver;
		
		@BeforeTest
		public void setp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours");
		}
		
		@Test
		//driver.wait(5000);
		public void Doit(){  
		driver.findElement(By.xpath("//a[@href='login.php']")).click();
		String s=driver.getTitle();
		System.out.print(s);
		WebDriverWait waitvar= new WebDriverWait(driver,10);
		waitvar.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName1")));
		driver.findElement(By.name("userName")).sendKeys("Shaktiman");
		}
		
		@AfterTest
		public void fin(){
		driver.close();
		driver.quit();
		}

}

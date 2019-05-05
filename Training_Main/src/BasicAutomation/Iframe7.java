package BasicAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe7 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	 	//driver.switchTo().frame(driver.findElement(By.id(id))); ---- web element
		//driver.switchTo().frame("IF1");--- ID
		//driver.switchTo().frame("IFrame"); ----  Name
		//driver.switchTo().frame(0);---- number
		
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		//int a=driver.findElements(By.tagName("iframe")).size(); ----- frame count
		//System.out.println(a);
		
		List<WebElement> list1=driver.findElements(By.tagName("a")); //---- a for links,  iframe for frames
		System.out.println(list1.size());
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getAttribute("href"));
		}
		
		
	}

}

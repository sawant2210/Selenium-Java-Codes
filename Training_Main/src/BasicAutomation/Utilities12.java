package BasicAutomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities12 {

	public static void main(String[] args) throws InterruptedException, IOException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Dimension obj=new Dimension(300,400);//-----Dimention
		driver.manage().window().setSize(obj);
		
		        
		JavascriptExecutor jse= (JavascriptExecutor)driver;//-----scroll
		jse.executeScript("window.scrollBy(0,300)","");
		
		
		File binaryfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(binaryfile, new File("D:\\selenium\\test.png"));
		
		
		
//		There are a number of ways to scroll a page using Selenium WebDriver in Java. Some of them are discussed below.
//
//		If you want to scroll the page vertically to perform some action, you can do it using the following JavaScript.
//		        ((JavascriptExecutor)driver).executeScript(�window.scrollTo(0,document.body.scrollHeight)�);
//
//		            Where �JavascriptExecutor� is an interface, which helps executing JavaScript through Selenium WebDriver. You can use the following code to import.
//
//		import org.openqa.selenium.JavascriptExecutor; 
//
//		2.      If you want to scroll at a particular element, you need to use the following JavaScript.
//
//		WebElement element =
//
//		driver.findElement(By.xpath(�//input [@id=�email�]�));
//
//		((JavascriptExecutor)driver).executeScript(�arguments[0].scrollIntoView();�, element);
//
//		Where �element� is the locator where you want to scroll.
//
//		3.      If you want to scroll at a particular coordinate, use the following JavaScript.  
//
//		((JavascriptExecutor)
//
//		driver).executeScript(�window.scrollBy(200,300)�);
//
//		Where �200,300� are the coordinates.
		
//
//		If you want to scroll up in a vertical direction, you can use the following JavaScript.
//		((JavascriptExecutor)
//
//		driver).executeScript(�window.scrollTo(document.body.scrollHeight,0)�);
//
//		If you want to scroll horizontally in the right direction, use the following JavaScript.
//		((JavascriptExecutor)
//
//		driver).executeScript(�window.scrollBy(2000,0)�);
//
//		If you want to scroll horizontally in the left direction, use the following JavaScript.
//		((JavascriptExecutor)
//
//		driver).executeScript(�window.scrollBy(-2000,0)�);



	} 

}

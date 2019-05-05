package mohsin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.crossword.in");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("search-input")).sendKeys("Cricket");
		driver.findElement(By.className("search-go")).click();
		driver.findElement(By.cssSelector("#search-results > div.search-summary.clearfix > div.search-sort.last > span.sort-type-list > a:nth-child(2)")).click();
		
		//WebDriverWait wt= new WebDriverWait(driver,20);
		//wt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#search-result-items > li:nth-child(1) > div > div.variant-desc > span.variant-title > a") ));
		while(true){
			Thread.sleep(5000);
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			//js.executeScript("window.scrollTo(0,300)","");
			if(driver.getPageSource().contains("End Of Search Results"))
				break;
			
		}
			
		List<WebElement> ele= driver.findElements(By.xpath("//*[@id='search-result-items']/li[1]/div/div[2]/span[3]/span[3]/span"));
		int count= ele.size(); 			//*[@id="search-result-items"]/li[61]/div/div[2]/span[3]/span[3]/span
		System.out.print(count);
		
		for(int j=0; j<count; j++)
		{
			System.out.println(ele.get(j).getText());
		}
		
	}
	
}





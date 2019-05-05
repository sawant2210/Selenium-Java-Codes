package TetstNg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PepperFry {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.pepperfry.com/");
		
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("webklipper-publisher-widget-container-notification-frame")));
		WebElement Ele;
        Ele=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
        System.out.println("frame is displayed");
		if(Ele.isDisplayed())
		{
		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		System.out.println("switched to frame");
    	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
    	driver.switchTo().defaultContent();
		}
      	Thread.sleep(2000);
		if(driver.findElement(By.xpath("//button[@class='No thanks']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		}
		Thread.sleep(2000);
        if(driver.findElement(By.xpath("//*[@id='signinupPopupBox']/a")).isDisplayed())
        {
        	driver.findElement(By.xpath("//*[@id='signinupPopupBox']/a")).click();
        }
        
        
        
        driver.findElement(By.name("q")).sendKeys("Bedsheet");
        driver.findElement(By.id("searchButton")).click();
       
        driver.findElement(By.id("curSortType")).click();
        Thread.sleep(1000);
        Actions obj= new Actions(driver);
        obj.moveToElement(driver.findElement(By.xpath("//*[@id='sortBY']/li[2]/a"))).perform();
        Thread.sleep(1000);
        obj .click().perform();
        Thread.sleep(2000);
        
        while(true)
        {
        	if(!(driver.findElement(By.id("load_more_button")).isDisplayed()))
        	{
        	 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        	}
        	else
        	{
        	
        		break;
        	}
        	 
         }
        
        
        
        System.out.println("Loaded completely");
        
        List<WebElement> obj2= driver.findElements(By.xpath("//div[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25']"));
        
        System.out.println(obj2.size());
        
        float a[]= new float[obj2.size()];
        String s[]=new String[obj2.size()];
//        
//        s[0]=driver.findElement(By.xpath("//*[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25'][1]/div/div[5]/div/span[1]")).getText().toString().trim().substring(3);
//        System.out.println(s[0]);
        for(int i=1;i<=obj2.size();i++)
        {
        	s[i-1]=driver.findElement(By.xpath("//*[@class='pf-col srchrslt-crd-10x11 srch-rslt-cards margin-bottom25']["+i+"]/div/div[5]/div/span[1]")).getText().toString().trim().substring(3);
        	a[i-1]=Float.parseFloat(s[i-1].trim().replace(",",""));
        }
        int c=0;
        for(int i=0; i<obj2.size()-1;i++)
        {
        	if (a[i]>a[i+1]) 
        	{
        		c++;
        	}
        }
        
        if(c>0)
        {
        	System.out.println("Values are not sorted ");
        }
        else
        {
        	System.out.println("Values are sorted ");
        }
        //((JavascriptExecutor)driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
        
//        driver.quit();
        
        
	
	
		
        
		
		

	}

}

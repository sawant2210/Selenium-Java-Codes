package WebDriverBacked;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class AnnaTable 
{
	private WebDriver driver;
	private Selenium selenium;
	private String baseUrl; 
	@Before
	public void setUp() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver ", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseUrl= "http://www.annauniv.edu/";
		selenium=new WebDriverBackedSelenium(driver, baseUrl);
		
	}

	@Test
	public void test() throws InterruptedException
	{
		selenium.open(baseUrl);
		selenium.waitForPageToLoad("30000");
		selenium.mouseOver("id=link3");
		Thread.sleep(3000);
		selenium.mouseOver("xpath=/html/body/table/tbody/tr[1]/td[1]/span/div[2]/div/div/div[3]");
		selenium.click("xpath=/html/body/table/tbody/tr[1]/td[1]/span/div[2]/div/div/div[3]");
		String Dean=selenium.getText("xpath=/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/div/b");
		System.out.println(Dean);
		String PhNo=selenium.getText("xpath=/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr[3]/td[3]/div");
		System.out.println(PhNo);
		assertEquals("22352642", selenium.getExpression(PhNo));
		

		selenium.type("id=searchInput", "selenium");

		//assertEquals("Selenium - Wikipedia, the free encyclopedia", selenium.getTitle());
		//verifyTrue(selenium.isTextPresent("Selenium"));

	//	assertEquals("Selenium", selenium.getText("css=span"));
		//assertEquals("Selenium - Wikipedia, the free encyclopedia", selenium.getTitle());
		driver.navigate().back(); 
	} 
	
	@After
	public void tearDown() throws Exception
	{
		selenium.stop();
	
	}

}

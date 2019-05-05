package WebDriverBacked;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class AnnaWebTableRc 
{
	private WebDriver driver;
	private Selenium selenium;
	private String baseUrl; 

	@Before
	public void setUp() throws Exception
	{
	
		baseUrl= "http://www.annauniv.edu/";
		//selenium =new DefaultSelenium("localhost", 4444, "chrome","http://www.annauniv.edu/");
		//selenium = Selenium.GetSeleniumWithJQueryStrategy("localhost", 4444, "chrome", "http://localhost:55023");
		
	}

	@Test
	public void test() throws InterruptedException 
	{selenium.open(baseUrl);
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


	}
	
	@After
	public void tearDown() throws Exception 
	{
		selenium.stop();
	}

}

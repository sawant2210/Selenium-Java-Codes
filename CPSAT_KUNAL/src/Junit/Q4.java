package Junit;

import static org.junit.Assert.*;

import org.apache.poi.util.SystemOutLogger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Q4 {

	
	private Selenium selenium; 
	private String baseurl;
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		baseurl="http://ata123456789123456789.appspot.com/";
		selenium=new WebDriverBackedSelenium(driver, baseurl);
		
	}

	
	

	@Test
	public void test() 
	{	
		selenium.open(baseurl);
		selenium.waitForPageToLoad("30000");
		selenium.type("id=ID_nameField1", "5");

		selenium.type("id=ID_nameField2", "2");
		selenium.click("id=gwt-uid-6");
		selenium.click("id=ID_calculator");
		String ans=selenium.getValue("id=ID_nameField3");
		System.out.println(ans);
		
		int ans1=Integer.parseInt(ans);
		
		int c=5+2;
		int d=(int)Math.pow(c, 2);
		System.out.println(d);   
		
		assertEquals(d, ans1);
		
	
		
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}

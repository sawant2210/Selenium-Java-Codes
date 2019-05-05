package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Q4 {
	
	private Selenium selenium;
   private  String baseUrl;
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		baseUrl="http://ata123456789123456789.appspot.com/";
		selenium=new WebDriverBackedSelenium(driver, baseUrl);
	}
	
	@Test
	public void test() {
		
		selenium.open(baseUrl);
		selenium.waitForPageToLoad("40000");
		selenium.type("id=ID_nameField1", "5");
		selenium.type("id=ID_nameField2", "2");
		selenium.click("id=gwt-uid-6");
		selenium.click("id=ID_calculator");
		String r1=selenium.getValue("id=ID_nameField3");
		int a=Integer.parseInt(r1);
		
		int b=2+5;
		int c=(int)Math.pow(b,2);
		
		assertEquals(c, a);
		
	}


	@After
	public void tearDown() throws Exception {
	}

	
}

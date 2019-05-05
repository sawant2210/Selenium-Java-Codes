package POM_TC;

import org.testng.annotations.Test;

import POM_Pages.POM_Login;


import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterTest;

public class POM_TC1 {
 
	static WebDriver driver;
	
  @BeforeTest
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver1.exe");
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://opensource.demo.orangehrmlive.com/");
  }
  
  @Test
  public void f() 
  {  
	  
//	  POM_Login obj=new POM_Login(driver); ///// unnecessary 
	  
	  POM_Login login_Page=PageFactory.initElements(driver, POM_Login.class);
	  
	  
	  login_Page.Username.sendKeys("admin");
	  login_Page.Password.sendKeys("admin");
	  login_Page.Loginbutton.submit();
	  
  }
  
  @AfterTest
  public void afterClass() 
  {
	  driver.quit();
  }

}
 
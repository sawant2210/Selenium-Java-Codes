 package StepDefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin
{
	
	
	static WebDriver driver;
	@Given("^Open Chrome Browser and reach FaceBook login page$")
	public void Open_Chrome_Browser_and_reach_FaceBook_login_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	    driver.get("https://www.facebook.com/");
		
		
	}

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_valid_Username_and_Password(String arg1, String arg2) throws Throwable 
	{
	  driver.findElement(By.id("email")).sendKeys(arg1);
	  driver.findElement(By.id("pass")).sendKeys(arg2);
	  Thread.sleep(2000);
	  
	 
	}
	

	@Then("^user logins to facebook successfully$")
	public void user_logins_to_facebook_successfully() throws Throwable 
	{
		
		Robot rob= new Robot();
		  rob.keyPress(KeyEvent.VK_ENTER);
		  rob.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
	     driver.close();  
	}

	
	
}

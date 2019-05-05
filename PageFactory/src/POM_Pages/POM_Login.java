package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_Login 
{
	
//	WebDriver driver;   /// unnecessary
//	public POM_Login(WebDriver driver2) 
//	{
//		this.driver=driver2;
//	}


	@FindBy(id="txtUsername") public WebElement Username;
	
	
	 @FindBy(id="txtPassword") public WebElement Password;
	
	@FindBy(how=How.ID, using="btnLogin") public WebElement Loginbutton;
	
	
	
	
	

}

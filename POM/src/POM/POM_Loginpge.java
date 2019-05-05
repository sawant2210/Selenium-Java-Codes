package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Loginpge 
{
	WebDriver driver;
	
	By username=By.xpath("//input[@id='txtUsern ame']");
	By password=By.xpath("//input[@id='txtPassword']");
	By Login_button= By.xpath("//input[@id='btnLogin' and @name='Submit']");
	
	public POM_Loginpge(WebDriver driver)
	{
		this.driver=driver;
	}
	
		public void verifyLogin(String UName, String pswd)
	{
		driver.findElement(username).sendKeys(UName);
		  driver.findElement(password).sendKeys(pswd);
		  driver.findElement(Login_button).click();
	} 
	

}
  
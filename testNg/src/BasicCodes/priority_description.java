package BasicCodes;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class priority_description 

{
  @Test (priority=0, description="login scenario") //Priority :comes after negative priority// description helps during reporting
  public void Login()
  {
	//  Assert.assertEquals(12, 13); // even one of the test tests failed execution continues with other @tests
	  System.out.println("Login works");
  }
  
  @Test (priority=1, description="navigate scenario") //lowest..comes after zero 
  public void navigate()
  {
	  System.out.println("navigate works");
  }
  
  @Test(priority= -3, description="logout scenario") // negative priority ..highest 
  public void Logout()
  {
	  System.out.println("logout works");
  }
  
  
}

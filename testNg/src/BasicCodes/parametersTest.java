 package BasicCodes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersTest 
{
  @Test
  @Parameters({"username", "password"})
  public void parameterCheck(String UN , String PWD ) 
  {		
	  System.out.println(UN);
	  System.out.println(PWD);
  }
}


//@Parameters({"username","password"})
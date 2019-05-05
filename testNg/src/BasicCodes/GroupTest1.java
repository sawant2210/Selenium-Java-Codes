package BasicCodes;

import org.testng.annotations.Test;

public class GroupTest1 
{

	@Test(groups={"c","b"})
	  public void f()
		{
			System.out.println("group c,b - test6-1");
	    }
		
		
		@Test(groups="b")
		  public void f1()
			{
				System.out.println("group b - test7-1");
		    }
		
		@Test(groups="c")
		  public void f2()
			{
				System.out.println("group c - test8-1");
		    }
		
		@Test(groups="a")
		  public void f3()
			{
				System.out.println("group a - test9-1");
		    }
		
		@Test(groups={"c"})
		  public void f4()
			{
				System.out.println("group c  - test10-1");
		    }
		
	

}

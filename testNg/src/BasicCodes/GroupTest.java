package BasicCodes;

import org.testng.annotations.Test;

public class GroupTest {
  
	
	@Test(groups={"a","b"})
  public void f()
	{
		System.out.println("group a - test0");
    }
	
	
	@Test(groups="b")
	  public void f1()
		{
			System.out.println("group b - test1");
	    }
	
	@Test(groups="c")
	  public void f2()
		{
			System.out.println("group c - test2");
	    }
	
	@Test(groups="b")
	  public void f3()
		{
			System.out.println("group b - test3");
	    }
	
	@Test(groups={"c","a"})
	  public void f4()
		{
			System.out.println("group c,a  - test4");
	    }
	
	
	
}

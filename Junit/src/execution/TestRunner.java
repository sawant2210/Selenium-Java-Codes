package execution;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args)
   {
      Result result = JUnitCore.runClasses(TestSuite.class);
      		
      int i=1;
      for (Failure failure : result.getFailures()) {
          System.out.println("Failed Result : "+i);
          i++;
       }
 		
  System.out.println("Suit Run");
   }
}  	
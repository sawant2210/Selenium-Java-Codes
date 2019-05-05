  package ListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("following Test started: "+ result.getName());
					
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("following Test finished successfully: "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("following Test failed: "+ result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("following Test skipped: "+ result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

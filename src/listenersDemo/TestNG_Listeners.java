package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// implementing Listeners 
public class TestNG_Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) // this is default method will
												// will execute every time
												// whenever your test case start
	{
		System.out.println("Test Case Started & Details are " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success & Details are " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed & Details are " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped & Details are " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}

package captureScreenshot;

import org.openqa.selenium.By;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import myUtilities.Common;

public class FailedTestCaseScreenshot {

	@Test(testName = "CaptureScreenshot")
	public void CaptureScreenshot() throws Exception {
		Common.LaunchFireFox("https://www.google.co.in");

		Common.driver.findElement(By.xpath("//a[@data-pid='23' and @class='gb_P']")).click();
		// wrong xpath given forcefully
		Thread.sleep(3000);

		Common.driver.findElement(By.xpath("//input[@id='identifier']")).sendKeys("himanshukhare@gmail.com");
	}

	// It will always execute whether your test case pass or fail
	@AfterMethod
	// this result(object) will keep all the information about the test case which we are executing
	public void failedTestCaseScreenshot(ITestResult result) 
	{
		//String testCaseName = result.getTestName();
		String testCaseName = result.getName(); // returns the name of method

		int testCaseStatus = result.getStatus(); // this will give value 2 if it is Fails or else 1 for Pass

		//System.out.println("testCaseName::::::::: " + testCaseName);
		System.out.println("testCaseStatus::::::::: " + testCaseStatus);
		System.out.println("Test Case Method Name::::::::: " + testCaseName);

		if (testCaseStatus == 2) // 2 means fail
		{
			System.out.println("Test Case Failed & Screenshot Captured !!!");
			Common.CaptureScreenshots(testCaseName);
		}
		Common.driver.quit();
	}

}

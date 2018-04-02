/*package advanceReporting;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import myUtilities.Common;

*//**
 * @author SONY
 * 
 * 	NOTE: 
 * 	This is newer version of Advance Reporting. So Syntaxes are different from previous one 
 *	It will works with <extentreports-2.05.jar>
 *  Add library to remove errors
 *//*

public class Version2_AdvanceReport 
{
	ExtentTest logger;
	ExtentReports reports;
	
@Test
public void verifyBlogTitle()
{	
	reports = new ExtentReports(".\\MyAdvanceReports\\Learn.html") ;
	logger =	reports.startTest("My 1st TestCase!");
	
	logger.log(LogStatus.INFO, "===Browser is Started===");
	Common.LaunchChrome("http://www.google.com/");
	logger.log(LogStatus.INFO, "===Application is Up & Running===");
	
	
	String title = Common.driver.getTitle();
	Assert.assertTrue(title.contains("Google"), "=== Assertion Failed ===");
	System.out.println("===Page Title Verified Successfully===");
	logger.log(LogStatus.PASS, "===Verification Pass===");
	
}

@AfterMethod
public void browserClose(ITestResult result)
{
	int status = result.getStatus();
	
	if (status == 2)  // 2 means for Failed  
	{
		Common.CaptureScreenshots(result.getName());
		logger.log(LogStatus.FAIL, "Title Verification Failed");
		
	}	
	reports.endTest(logger);
	reports.flush();
	Common.driver.get("file:///C:/Users/SONY/Desktop/MySeleneseWorkSpace/learnAutomationByMukesh/MyAdvanceReports/Learn.html");
	Common.driver.close();
	
}



}
*/
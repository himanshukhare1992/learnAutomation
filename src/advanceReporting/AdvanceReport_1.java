package advanceReporting;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import myUtilities.Common;
public class AdvanceReport_1 {

	
	/** NOTE: 
	 * 				This is an old version of Extent Report. So the syntaxes are different from the newer version
	 * 				It works with <extentreports-2.05.jar>
	 */
	
	@Test
	public void verifyTitle() 
	
{
		ExtentReports logger = ExtentReports.get(AdvanceReport_1.class);
		
		// init for initialize 
		logger.init(".\\MyAdvanceReports\\verifyTitle.html", true);  // if you say true it will replace the existing file while false will not override the existing file
		
		logger.startTest("===My Verification Test Chttp://learn-automation.com/ase===");
		Common.LaunchChrome("");
		logger.log(LogStatus.INFO, "===Application Lauch===");
		
		String title = Common.driver.getTitle();
		logger.log(LogStatus.INFO, "===Application Title Captured===");
		
		Assert.assertTrue(title.contains("Selenium"), "Failed Message:::::::Verification has been Failed");
		logger.log(LogStatus.PASS, "===PASS ! Application Title has been verified===");
		logger.log(LogStatus.INFO, "===INFO ! Application Title Verification Failed===");
		
		

		System.out.println("=========Verification Passed===========");

		logger.attachScreenshot("C:\\Users\\SONY\\Pictures\\vlcsnap.png");
		
		logger.endTest();
		
		Common.driver.close();
	}
	
	
	
	
	
	
}
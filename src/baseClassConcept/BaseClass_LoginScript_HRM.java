package baseClassConcept;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import myUtilities.Common;

/**
 * @author SONY -> Common Code or Repetative task will come under Base Class to
 *         avoid duplicacy -> Just extends this class wherever you want to use.
 */
public class BaseClass_LoginScript_HRM {

	// @BeforeMethod - Use this annotation only when you want to Open Browser
	// every time before every TestCase
	@BeforeClass // Use this when you want to open your Browser once during your
					// execution of overall Class
	public void setUpApplication() {
		Reporter.log("====Browser Session Started=====", true);
		Common.LaunchChrome("http://opensource.demo.orangehrmlive.com/");
		Reporter.log("====Application Started=====", true);
	}

	// @AfterMethod
	@AfterClass
	public void applicationClose() {
		Common.driver.close();
		Reporter.log("====Browser Session End=====", true);
	}

}

package dataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import myUtilities.Common;

public class WordPressLogin {

	// this Testcase is dependent on 1 DataProvider whose name
	// ="wordPressloginData"
	@Test(dataProvider = "wordPressloginData")
	public void loginToWordPress(String uName, String pwd) throws InterruptedException {
		Common.LaunchChrome("http://demosite.center/wordpress/wp-login.php");

		Common.driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(uName);

		Common.driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(pwd);

		Common.driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(5000);

		String loginTitle = Common.driver.getTitle();

		// System.out.println("\n\n<<<<<<<Page Title>>>>>> "+loginTitle);

		// Assert.assertEquals(loginTitle, "Dashboard ‹ WordPress Demo Install —
		// WordPress", "assertEquals FAILED !!!! ");

		Assert.assertTrue(loginTitle.contains("Dashboard"), "#########  assertEquals FAILED ########");

		/*
		 * NOTE: If the above Condition fails, then Selenium driver will not
		 * close the browser. So, in that condition we have to use TestNG
		 * annotation @AfterMethod which will execute after every testcase
		 * whether it Fails or Pass
		 */

		System.out.println("###### Page Title Verified  ########");

	}

	@AfterMethod
	public void closeBrowser() {
		Common.driver.close();
	}

	@DataProvider(name = "wordPressloginData")
	public Object[][] passData() {
		Object[][] myDataArray = new Object[3][2]; // create an array of 3Rows &
													// 2Columns

		// wrong credentials
		myDataArray[0][0] = "admin12345678";
		myDataArray[0][1] = "demo123";

		// correct credentials
		myDataArray[1][0] = "admin";
		myDataArray[1][1] = "demo123";

		// wrong credentials
		myDataArray[2][0] = "admin3";
		myDataArray[2][1] = "demo123";

		return myDataArray;

	}

}

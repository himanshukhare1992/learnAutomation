package dataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import myUtilities.Common;

public class WordPressLogin_UsingExcel {

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

		// System.out.println("\\n\\n<<<<<<<Page Title>>>>>> "+loginTitle);

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
		// provide the excel path location
		Common.readExcel(
				"C:\\Users\\SONY\\Desktop\\MySeleneseWorkSpace\\learnAutomationByMukesh\\TestData\\DataProviderSheet.xlsx");

		// provide sheetName so that it will return you total Row Count
		int rowCount = Common.getRowCount("DataProvider");

		System.out.println("###### Total RowCount = " + rowCount); // 4

		Object[][] myData = new Object[rowCount][2]; // here rowCount is 4

		for (int i = 0; i < rowCount; i++) {
			myData[i][0] = Common.getData("DataProvider", i, 0); // this is for
																	// getting
																	// Username
																	// from 0th
																	// Column

			myData[i][1] = Common.getData("DataProvider", i, 1); // this is for
																	// getting
																	// Password
																	// from 1th
																	// Column

		}
		return myData;

	}

}

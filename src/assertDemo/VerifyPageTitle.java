package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import myUtilities.Common;

public class VerifyPageTitle {

	// This is 1st way to verify PageTitle. In this Expected & Actual Text
	// contents should be exact otherwise it will fail

	@Test(enabled = false)
	void verifyApplicationPageTitle() {
		Common.driver.get("http://learn-automation.com/");

		String actualTitle = Common.driver.getTitle();

		String expectedTitle = "Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";

		Assert.assertEquals(actualTitle, expectedTitle, ":::::: Test Case Failed due to PageTitle Mismatch ::::::  ");

		System.out.println(":::::::: 1st Test Case Pass ::::::::::");

	}

	// This is the 2nd way to verify PageTitle. In this you can match the
	// partial text.
	@Test
	void verifyTitleFromPagesource() {
		Common.LaunchFireFox("http://learn-automation.com/");

		String actualPageSource = Common.driver.getPageSource();

		// System.out.println("Application Page Source ::::::
		// "+actualPageSource);

		Assert.assertTrue(actualPageSource.contains("Selenium"), "::::: Error Found in Test Case ::::");

		System.out.println(":::: 2nd Test Case Pass ::::");

	}

}

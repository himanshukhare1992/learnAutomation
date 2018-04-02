package assertDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import myUtilities.Common;

public class VerifyErrorMessage_2 {

	@Test
	public void myTest() throws InterruptedException {

		Common.LaunchFireFox("https://www.google.co.in/");

		// Gmail link
		Common.driver.findElement(By.xpath("//a[@data-pid='23' and @class='gb_P']")).click();

		Thread.sleep(2000);

		// Next Button
		Common.driver.findElement(By.xpath("//content[@class='CwaK9']/span")).click();

		Thread.sleep(2000);
		// Using getAtrribute
		String actualMsg = Common.driver.findElement(By.xpath("//div[text()='Enter an email or phone number']"))
				.getAttribute("innerHTML");

		Thread.sleep(2000);
		System.out.println(":::::::: Actual Error Message ::::::::" + actualMsg);

		String expectedMsg = "Enter an email or phone number";

		// Type 1
		Assert.assertEquals(actualMsg, expectedMsg, "TEST CASE FAIL ::::::: Type 1 Condition Failed");
		System.out.println(":::::::: TEST CASE PASS  :::::::: Type 1 Pass");

		// Type 2 for Partial text check
		Assert.assertTrue(actualMsg.contains("Enter an email"), "::::::::::Type 2 Condition Failed !!!!");
		System.out.println(":::::::: TEST CASE PASS  :::::::: Type 2 Pass");

	}

}

package assertDemo;

import org.openqa.selenium.By;
import org.testng.Assert;

import myUtilities.Common;

public class VerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {

		Common.LaunchFireFox("https://www.google.co.in/");

		// Gmail link
		Common.driver.findElement(By.xpath("//a[@data-pid='23' and @class='gb_P']")).click();

		Thread.sleep(2000);

		// Next Button
		Common.driver.findElement(By.xpath("//content[@class='CwaK9']/span")).click();

		Thread.sleep(2000);

		String actualMsg = Common.driver.findElement(By.xpath("//div[text()='Enter an email or phone number']"))
				.getText();

		Thread.sleep(2000);
		System.out.println("::::::::: Actual Error Message ::::::::" + actualMsg);

		String expectedMsg = "Enter an email or phone number";

		Assert.assertEquals(actualMsg, expectedMsg, "TEST CASE FAIL ::::::: Error Message is not same");

		System.out.println("::::::::: TEST CASE PASS  :::::::: Error Message is Same");

	}

}

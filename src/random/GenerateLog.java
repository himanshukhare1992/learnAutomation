package random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import myUtilities.Common;

public class GenerateLog {

	@Test
	public void GmailLoginWithLogger() throws InterruptedException {

		// Using Class "Logger" you need to call 1 static method -
		// "getLogger(String)" and store in a Logger Object - logObject
		Logger logObject = Logger.getLogger("GenerateLog");
		// Configure your Log4j.properties File
		PropertyConfigurator.configure("log4j.properties");

		Common.LaunchFireFox("https://www.google.co.in/");
		logObject.info(":::::Started Google Homepage:::::");

		Thread.sleep(2000);
		logObject.info(":::::Wait 2 sec:::::");

		// Gmail link
		Common.driver.findElement(By.xpath("//a[@data-pid='23' and @class='gb_P']")).click();
		logObject.info(":::::Found Gmail Link:::::");

		Thread.sleep(2000);
		logObject.info(":::::Wait 2 sec:::::");
		// Email input
		Common.driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("himanshukhare1992@gmail.com");
		logObject.info(":::::Entered Email Id in Email Box:::::::::");

		Thread.sleep(2000);
		logObject.info(":::::Wait 2 sec:::::");
		// Next Button
		Common.driver.findElement(By.xpath("//content[@class='CwaK9']/span")).click();
		logObject.info(":::::Clicked Next Button:::::");

		Thread.sleep(5000);
		logObject.info(":::::Wait 5 sec:::::");
		// Password input
		Common.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sdbce!((@*");
		logObject.info(":::::Entered Password in Password Box:::::");

		Thread.sleep(2000);
		logObject.info(":::::Wait 2 sec:::::");
		// Next Button Click
		Common.driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		logObject.info(":::::Clicked Next Button:::::");

		Thread.sleep(2000);
		logObject.info(":::::Wait 2 sec:::::");
		String pageTitle = Common.driver.getTitle();
		logObject.info(":::::Retrieving PageTitle:::::");

		System.out.println(":::::::::::::  Successfull Gmail Login  ::::::::::::::::: " + pageTitle);
		logObject.info(":::::PageTitle Retrieved Successfully:::::");

	}
}

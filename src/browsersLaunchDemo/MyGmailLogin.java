package browsersLaunchDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import myUtilities.Common;

public class MyGmailLogin {

	public static void main(String[] args) throws InterruptedException, IOException {

		Common.LaunchChrome("https://www.google.co.in/");
		Thread.sleep(2000);
		Common.CaptureScreenshots("Google Home Page");

		// Gmail link
		Common.driver.findElement(By.xpath("//a[@data-pid='23' and @class='gb_P']")).click();
		Thread.sleep(3000);

		// Email input
		Common.driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("himanshukhare1992@gmail.com");
		Common.CaptureScreenshots("Entered Gmail Id");

		Thread.sleep(2000);
		// Next Button
		Common.driver.findElement(By.xpath("//content[@class='CwaK9']/span")).click();

		Thread.sleep(5000);
		// Password input
		Common.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sdbce!((@*");
		Common.CaptureScreenshots("Entered Gmail Id Password");

		Thread.sleep(2000);
		// Next Button Click
		Common.driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		Thread.sleep(2000);
		String pageTitle = Common.driver.getTitle();
		Common.CaptureScreenshots("Gmail Page Title Taken");

		System.out.println(":::::::::::::  Successfull Gmail Login  ::::::::::::::::: " + pageTitle);

	}

}

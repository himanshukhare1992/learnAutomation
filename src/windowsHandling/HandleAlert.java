package windowsHandling;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import myUtilities.Common;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {

		Common.LaunchFireFox("http://softwaretesting-guru.blogspot.in/p/blog-page.html");
		Common.driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// code for accepting alert message
		Alert alt = Common.driver.switchTo().alert();
		Thread.sleep(2000);

		// code for verify alert message
		String actualMsg = Common.driver.switchTo().alert().getText();
		System.out.println(":::::::::::Actual Message:::::::::::" + actualMsg);
		assertEquals(actualMsg, "Clicked", ":::::::::::Failed ::::::::: Mismatch Error::::::::::");

		System.out.println(":::::::::Test Case Pass:::::::::::");
		alt.accept();

	}

}

package bootStrap;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import myUtilities.Common;

public class BootStrapLogin {

	@Test
	public void ModalWindow() {

		Common.LaunchFireFox("http://seleniumpractise.blogspot.in/2016");

		Common.driver.findElement(By.xpath("//a[text()='Handle BootStrap Model Dialog in Selenium Webdriver']"))
				.click();

		Common.driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();

		// Thread.sleep(2000);

		Common.driver.findElement(By.cssSelector("input[type='text']")).sendKeys("himanshu khare");

		Common.driver.findElement(By.cssSelector("input[type='password']")).sendKeys("987643120");

		// Common.driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.TAB);

		Common.driver.findElement(By.xpath("//button[text()='Close']")).click();

	}

}

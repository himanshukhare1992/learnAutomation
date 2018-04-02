package com.wordpress.TestCases;

import com.wordpress.pages.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginWordPress {

	@Test
	public void WordPressLogin() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");

		// calling Parameterized constructor with valid parameter to initialize
		// driver

		LoginPage obj = new LoginPage(driver);

		obj.loginToWordPress("admin", "demo123");

		/*
		 * obj.typeUserName(); obj.typeUserPassword(); obj.loginButtonClick();
		 */

		Thread.sleep(2000);

		driver.quit();

	}

}

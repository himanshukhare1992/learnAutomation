/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * @author SONY
 * 
 *         This class wil store all the Locators & Methods of Login Page.
 *
 */

public class LoginPage {

	// create local variable WebDriver which will help us to perform activity on
	// Webpages

	WebDriver driver;

	// list out all Web Elements on Login Page
	By userName = By.id("user_login");
	By userPassword = By.name("pwd");
	By loginButton = By.xpath(".//*[@id='wp-submit']");

	// make a parameterized Constructor
	public LoginPage(WebDriver localDriver) {
		// this will initialize our Local variable - driver
		this.driver = localDriver;
	}

	/* One Comon Method for Login into WordPress */

	public void loginToWordPress(String uName, String uPassword) {
		driver.findElement(userName).sendKeys(uName);
		driver.findElement(userPassword).sendKeys(uPassword);
		driver.findElement(userPassword).sendKeys(Keys.TAB);
		driver.findElement(loginButton).click();

	}

	/*
	 * public void typeUserName() {
	 * driver.findElement(userName).sendKeys("admin"); }
	 * 
	 * public void typeUserPassword() {
	 * driver.findElement(userPassword).sendKeys("demo123"); }
	 * 
	 * public void loginButtonClick() { driver.findElement(loginButton).click();
	 * }
	 */

}

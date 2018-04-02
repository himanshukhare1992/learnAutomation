package bootStrap;

import org.openqa.selenium.By;

import myUtilities.Common;

public class GoibiboSignUp {

	public static void main(String[] args) {

		Common.LaunchFireFox("https://www.goibibo.com/");

		Common.driver.findElement(By.xpath("//a[text()='Sign up']")).click();

		Common.driver.switchTo().frame("authiframe");

		Common.driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9168281259");

	}

}

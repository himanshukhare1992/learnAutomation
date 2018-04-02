package baseClassConcept;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import myUtilities.Common;

public class loginScript_HRM extends BaseClass_LoginScript_HRM {

	@Test(description = "This test will check Valid login ")
	public void ValidloginToApplication() throws InterruptedException {
		Common.driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Common.driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		Common.driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		Reporter.log("====Click on Login Button=====", true);

	}

	@Test(description = "This test will check Invalid login")
	public void InvalidloginToApplication() {
		Common.driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Common.driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("WrongPassword");
		Common.driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Reporter.log("====Click on Login Button=====", true);
	}

}

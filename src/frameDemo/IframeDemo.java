package frameDemo;

import org.openqa.selenium.By;

import myUtilities.Common;

public class IframeDemo {

	public static void main(String[] args) {

		Common.LaunchFireFox("file:///C:/Users/SONY/Desktop/myiFrame_DemoSite.html");

		Common.driver.switchTo().frame("Tutorialspoint");

		Common.driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/form/input[2]")).sendKeys("CSS");

		Common.driver.switchTo().parentFrame();

		Common.driver.findElement(By.xpath("")).sendKeys("CSS");
	}

}

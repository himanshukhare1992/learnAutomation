package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import myUtilities.Common;

public class HandleElementNotClickable {

	public static void main(String[] args) throws InterruptedException {

		Common.LaunchFireFox("https://login.yahoo.com/");

		Thread.sleep(2000);

		WebElement ele = Common.driver.findElement(By.xpath("//label[@for='persistent']"));

		// Common.driver.findElement(By.id("persistent")).click();
		// label[text()='Stay signed in']

		Actions obj = new Actions(Common.driver);

		// Since we are using more that 1 Operation so we need to call
		// .build().perform();
		// If it is 1 operation then you can use .perform();

		obj.moveToElement(ele).click().build().perform();

	}

}

package elementNotClickableCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import myUtilities.Common;

public class loginScript_HRM_Using_ActionClass {

	@Test
	public void loginToHRM() throws InterruptedException {
		Common.LaunchChrome("https://www.orangehrm.com/");
		// Common.LaunchIE("https://www.orangehrm.com/");
		// Common.LaunchFireFox("https://www.orangehrm.com/");

		Actions act = new Actions(Common.driver);

		WebElement ele = Common.driver.findElement(By.xpath("//a[@title='Close Banner']"));

		Common.HighlightElements(ele);

		Thread.sleep(2000);

		act.moveToElement(ele).click().perform();

	}

}

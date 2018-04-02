package elementNotClickableCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import myUtilities.Common;

public class loginScript_HRM {

	@Test
	public void loginToHRM() throws InterruptedException {
		Common.LaunchChrome("https://www.orangehrm.com/");

		WebElement cross = Common.driver.findElement(By.xpath("//a[@title='Close Banner']"));
		boolean b = Common.driver.findElement(By.xpath("//a[@title='Close Banner']")).isDisplayed();
		System.out.println("::::Before Clicking isDisplayed Value is :::  " + b);

		if (b == true) {
			Thread.sleep(2000);
			Common.HighlightElements(cross);
			Thread.sleep(2000);

			Common.driver.findElement(By.xpath("//a[@title='Close Banner']")).click();
			Thread.sleep(2000);

			boolean b1 = Common.driver.findElement(By.xpath("//a[@title='Close Banner']")).isDisplayed();
			System.out.println("::::After Clicking isDisplayed Value is :::  " + b1);
		} else {
			System.out.println("Cookies Element not Found !");
		}

	}

}

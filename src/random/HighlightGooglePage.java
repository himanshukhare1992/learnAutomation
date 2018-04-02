package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import myUtilities.Common;

public class HighlightGooglePage {

	@Test
	public void m1() {
		Common.LaunchFireFox("https://www.google.co.in/");

		WebElement google = Common.driver.findElement(By.xpath("//input[@id='gs_htif0']"));
		// Highlightening the element
		Common.HighlightElements(google);
		// Perform action
		Common.driver.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("Happy New Year Wishes");

		WebElement submitButton = Common.driver.findElement(By.xpath("//input[@value='Google Search']"));
		Common.HighlightElements(submitButton);
		Common.driver.findElement(By.xpath("//input[@value='Google Search']")).click();

	}

}

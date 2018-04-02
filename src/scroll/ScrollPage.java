package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import myUtilities.Common;

public class ScrollPage {

	@Test
	public void ScrollPageDown() throws InterruptedException {
		Common.LaunchChrome("https://jquery.com/");
		// Common.driver.get("https://jquery.com/");
		Thread.sleep(2000);

		JavascriptExecutor obj = (JavascriptExecutor) Common.driver;

		obj.executeScript("scroll(0, 1500)");
		Thread.sleep(2000);

		obj.executeScript("scroll(0, -1)");

	}

}

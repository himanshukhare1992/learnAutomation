package configurationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import myUtilities.Common;

public class ChromeTesting_2 {

	@Test
	public void testChrome() {
		Common.testConfig();

		System.setProperty("webdriver.chrome.driver", Common.getChromePath());

		WebDriver driver = new ChromeDriver();

		driver.get(Common.getApplicationURL());

		driver.close();

		/**
		 * ### NOTE ### By doing this you are achieving the feature of OOPs ie.
		 * Abstraction which means you are showing the essential features &
		 * hiding the background details. So here No one can see where is my
		 * ChromeDriver is located? What is the actual URL?
		 */

	}

}

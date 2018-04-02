package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import myUtilities.Common;

public class Scroll_into_View {

	@Test
	public void ScrollMYView() {
		Common.LaunchFireFox("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		;
		WebElement element = Common.driver.findElement(By.xpath("//div[@id='mCSB_3_container']/p[6]/input[1]"));

		// NOTE: Here we are using the Concept of DownCasting because we know
		// that We cannot create Object of Interface,
		// So We forcefully DownCasting WebDriver Object reference into
		// JavaScriptExecutor, So that we can use its method (executeScript)

		// Create the instance of JavascriptExecutor
		JavascriptExecutor JsObj = (JavascriptExecutor) Common.driver;

		// Now execute query which will actually scroll until that element is
		// not appeared on Page.
		JsObj.executeScript("arguments[0].scrollIntoView(true);", element);

		Common.driver.findElement(By.xpath("//div[@id='mCSB_3_container']/p[6]/input[1]")).clear();
		Common.driver.findElement(By.xpath("//div[@id='mCSB_3_container']/p[6]/input[1]")).sendKeys("himanshu khare");

	}

}

package dropdownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import myUtilities.Common;

public class SelectFacebookDropDown {

	@Test(enabled = false)
	public void staticDOB_Selection() {

		Common.LaunchChrome("https://www.facebook.com/");

		WebElement day = Common.driver.findElement(By.xpath("//Select[@id='day']"));
		WebElement month = Common.driver.findElement(By.xpath("//Select[@id='month']"));
		WebElement year = Common.driver.findElement(By.xpath("//Select[@id='year']"));

		Common.HighlightElements(day);
		Common.driver.findElement(By.xpath("//select[@id='day']//option[@value='30']")).click();

		Common.HighlightElements(month);
		Common.driver.findElement(By.xpath("//select[@id='month']//option[text()='Jul']")).click();

		Common.HighlightElements(year);
		Common.driver.findElement(By.xpath("//select[@id='year']//option[text()='1992']")).click();

	}

	@Test
	public void dynamicDOB_Selection() {
		Common.LaunchChrome("https://www.facebook.com/");

		// day Dropdown
		WebElement day = Common.driver.findElement(By.xpath("//Select[@id='day']"));
		WebElement month = Common.driver.findElement(By.xpath("//Select[@id='month']"));
		WebElement year = Common.driver.findElement(By.xpath("//Select[@id='year']"));

		Select date = new Select(day);
		Common.HighlightElements(day);
		date.selectByVisibleText("30");

		Select monthSelect = new Select(month);
		Common.HighlightElements(month);
		monthSelect.selectByVisibleText("Jul");

		Select yearSelect = new Select(year);
		Common.HighlightElements(year);
		yearSelect.selectByVisibleText("1992");

	}

}

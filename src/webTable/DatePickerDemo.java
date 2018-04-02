package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import myUtilities.Common;

public class DatePickerDemo {

	@Test
	public void RedBus_Calender_StaticWay() throws InterruptedException {

		Common.LaunchFireFox("https://www.redbus.in/");

		WebElement date = Common.driver.findElement(By.xpath("//label[text()='Onward Date']"));
		Common.HighlightElements(date);
		// Click Date of Journey Calender
		Common.driver.findElement(By.xpath("//label[text()='Onward Date']")).click();

		Thread.sleep(2000);

		WebElement datePick = Common.driver
				.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[5]"));
		Common.HighlightElements(datePick);
		// Click 28
		Thread.sleep(2000);
		Common.driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[5]")).click();
	}

}

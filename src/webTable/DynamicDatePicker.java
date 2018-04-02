package webTable;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import myUtilities.Common;

public class DynamicDatePicker {

	public static void main(String[] args) {

		Common.LaunchFireFox("https://www.redbus.in/");

		// it will store all the Web elements in List
		List<WebElement> allDates = Common.driver
				.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table[1]//td"));

		int totalNodes = allDates.size();
		System.out.println(":::::Total Nodes:::::" + totalNodes + "\n");

		for (int i = 0; i < totalNodes; i++) {
			String date = allDates.get(i).getText();

			System.out.println("::::: Date at index " + i + " is " + date);

			if (date.equalsIgnoreCase("25")) {
				allDates.get(i).click();
				break;
			}
		}

	}

}

package random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import myUtilities.Common;

public class WebElementSize {

	public static void main(String[] args) {

		Common.LaunchFireFox("https://www.google.co.in/");

		int size = Common.driver.findElements(By.xpath("//input[@id='gs_htif0']")).size();

		System.out.println("Total Elements :::: " + size);

		WebElement i = Common.driver.findElements(By.xpath("//input[@id='gs_htif0']")).get(0);

		i.sendKeys("dsfdijhfdhhgd");

		// driver.findElements(By.xpath("//button[text()='OK']")).get(ok_size-1).click();

	}

}

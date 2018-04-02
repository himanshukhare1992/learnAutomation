package random;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import myUtilities.Common;

public class MouseHover {

	public static void main(String[] args) {

		Common.LaunchFireFox(
				"http://www.seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		// JavascriptExecutor jsObj = (JavascriptExecutor)Common.driver;
		// jsObj.executeScript("scroll(0, 4000)");

		Actions act = new Actions(Common.driver);

		// this is the WebElement where I want to put my Mouse Hover
		WebElement myElement = Common.driver.findElement(By.xpath("//button[text()='Automation Tools']"));

		// If you have single statement like you can use perform() method, but
		// if you have series of Operations you can use .build()
		act.moveToElement(myElement).perform();

		// Common.driver.findElement(By.xpath("//a[text()='Selenium']")).click();

		// it will give all the achor links after Mouse Hover
		List<WebElement> getAllListCount = Common.driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));

		int totalCount = getAllListCount.size();

		System.out.println("::::::: Total List Count ::::::: " + totalCount);
		System.out.println();
		System.out.println();

		for (int i = 0; i < totalCount; i++) {
			WebElement element = getAllListCount.get(i);
			String linkName = element.getAttribute("innerHTML");
			System.out.println(":::::::::Link Name - ::::::::::: " + linkName);
		}

	}
}

package windowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import myUtilities.Common;

public class SwtichToWindow {

	public static void main(String[] args) throws InterruptedException {

		Common.LaunchFireFox("https://accounts.google.com/SignUp");

		JavascriptExecutor jsObj = (JavascriptExecutor) Common.driver;
		jsObj.executeScript("scroll(0,500)");

		Common.driver.findElement(By.xpath("//a[text()='Learn more']")).click();
		Thread.sleep(8000);

		String parentWindowId = Common.driver.getWindowHandle();
		System.out.println(":::::::::Parent Window Id ::::::::::: " + parentWindowId);
		System.out.println("Parent Window Page Title:::::::: " + Common.driver.getTitle());

		Set<String> allWindows = Common.driver.getWindowHandles();

		System.out.println(":::::::Total Windows Set:::::: " + allWindows);

		int totalCount = allWindows.size();

		System.out.println("::::::: Total Windows Count:::::::" + totalCount);

		for (String child : allWindows) {
			if (!parentWindowId.equals(child)) {
				// System.out.println("Child Windows Id ::::: "+child);
				Common.driver.switchTo().window(child);
				Thread.sleep(5000);

				System.out.println("Child Window Page Title:::::::: " + Common.driver.getTitle());
				Thread.sleep(5000);

				Common.driver.findElement(By.xpath("//a[text()='Google Privacy Policy']")).click();
				Thread.sleep(5000);

				Common.driver.close();
				Thread.sleep(5000);

			}

			Common.driver.switchTo().window(parentWindowId);

			System.out.println("Parent Window Title:::::::" + Common.driver.getTitle());
		}

	}

}

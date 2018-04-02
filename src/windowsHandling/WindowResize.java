package windowsHandling;

import org.openqa.selenium.Dimension;

import myUtilities.Common;

public class WindowResize {

	public static void main(String[] args) {

		Common.LaunchFireFox("https://www.naukri.com/");

		System.out.println("Before Resize Window Dimensions are ::::" + Common.driver.manage().window().getSize());

		Dimension obj = new Dimension(420, 600);

		Common.driver.manage().window().setSize(obj);

		System.out.println("After Resize Window Dimensions are ::::" + Common.driver.manage().window().getSize());

	}

}

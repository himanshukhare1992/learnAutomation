package windowsHandling;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import myUtilities.Common;

public class MultipleWindows_Or_Popups {

	@Test
	public void naukriDotCom() throws InterruptedException {

		Common.LaunchFireFox("https://www.naukri.com/");
		System.out.println("Before Closing Child Windows,  Title is :::: " + Common.driver.getTitle());
		// System.out.println("Parent Window Dimensions ::::
		// "+Common.driver.manage().window().getSize());
		System.out.println();

		Set<String> allWindows = Common.driver.getWindowHandles();
		System.out.println("Set of All Windows ::::::: " + allWindows);
		System.out.println();

		int Count = allWindows.size();
		System.out.println("Total Count of Open Windows:::::: " + Count);
		System.out.println();

		String parentWindowId = Common.driver.getWindowHandle();
		System.out.println("Parent Window Id :::: " + parentWindowId);
		System.out.println();

		for (String child : allWindows) {
			if (!parentWindowId.equals(child)) // 13=13 ; 13=27 ; 13=37;
			{
				Common.driver.switchTo().window(child);
				Thread.sleep(5000);

				System.out.println(
						"Before Resize:::: Child Window Dimensions :::: " + Common.driver.manage().window().getSize());

				Dimension newDim = new Dimension(1382, 744);
				Common.driver.manage().window().setSize(newDim);
				Thread.sleep(2000);
				System.out.println(
						"After Resize::::: Child Window Dimensions :::: " + Common.driver.manage().window().getSize());

				System.out.println("Child Window Title :::: " + Common.driver.getTitle());
				System.out.println();
				Thread.sleep(2000);
				Common.driver.close();
			}

		}

		Common.driver.switchTo().window(parentWindowId);
		System.out.println("After Closing Child Windows,  Title is :::: " + Common.driver.getTitle());

	}

}

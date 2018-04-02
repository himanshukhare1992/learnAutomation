package listenersDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import myUtilities.Common;

//@Listeners(listenersDemo.TestNG_Listeners.class )
public class My1stTestCase_UsingListerners {

	// We have bounded this testcase with our above mention Listener
	@Test
	public void A_GoogleTitleVerify() {
		Common.LaunchFireFox("https://www.google.com");
		System.out.println(Common.driver.getTitle());
		Common.driver.quit();
	}

	@Test
	public void B_ForcefullyFail() {
		Assert.assertTrue(false, "\n\n:::::::assertTrue also failed:::::::::");
		Assert.assertEquals(12, 13, ":::assertEquals Failed::::");

	}

}

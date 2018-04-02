package windowsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Firefox_UntrustedCertificateIssue {

	@Test
	public void certificateIssue() {

		// Common.LaunchFireFox("https://untrusted-root.badssl.com/");
		// whenever you getting any Untrusted cerificates, Accept & Continue

		/*
		 * DesiredCapabilities dsObject = new DesiredCapabilities();
		 * dsObject.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 * Common.InvokeFirefox4SiteCerificatesIssues(
		 * "https://untrusted-root.badssl.com/", dsObject);
		 */

		// System.setProperty("webdriver.gecko.driver", "F:\\PERSONAL\\VIDEO
		// TUTORIALS\\Testing\\Selenium\\Selenium
		// Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "F:\\PERSONAL\\VIDEO
		// TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\Chrome Driver
		// (32bits)\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\IE Driver (64 Bits)\\IEDriverServer.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("https://untrusted-root.badssl.com/");

	}

}

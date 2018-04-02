package autoIt;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import myUtilities.Common;

public class UploadFileUsingAutoIt {

	@Test(enabled = false)
	public void onFirefox() throws Exception {
		Common.LaunchFireFox("file:///C:/Users/SONY/Desktop/ResumeUpload.html");
		Common.driver.findElement(By.id("browseId")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\SONY\\Desktop\\AutoIt Files\\AutoIt_FileUpload.exe");
	}

	@Test
	public void onChrome() throws Exception {
		Common.LaunchChrome("file:///C:/Users/SONY/Desktop/ResumeUpload.html");
		Common.driver.findElement(By.id("browseId")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\SONY\\Desktop\\AutoIt Files\\AutoIt_FileUpload_Chrome.exe");
	}

}

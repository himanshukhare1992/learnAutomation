package browsersLaunchDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author SONY
 *
 */
public class ChromeLaunchDemo {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\Chrome Driver (32bits)\\chromedriver.exe");

		WebDriver o = new ChromeDriver();

		o.manage().window().maximize();

		o.get("https://www.google.com");

		TakesScreenshot ts = (TakesScreenshot) o;

		File source = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("./MyScreenShots/Chrome.png"));

	}
}

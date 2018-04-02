package browsersLaunchDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunchDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\IE Driver (64 Bits)\\IEDriverServer.exe");

		WebDriver obj = new InternetExplorerDriver();

		obj.manage().window().maximize();

		obj.get("https://www.google.com");

	}

}

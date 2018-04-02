package random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import myUtilities.Common;

public class HighlightElements {

	public static void main(String[] args) throws InterruptedException {

		Common.LaunchFireFox("https://www.facebook.com/");

		JavascriptExecutor jsObj = (JavascriptExecutor) Common.driver;

		WebElement email = Common.driver.findElement(By.xpath("//input[@id='email']"));
		jsObj.executeScript("arguments[0].setAttribute('style' , 'background: Yellow; border: 2px Solid Red;');",
				email);
		Thread.sleep(500);
		jsObj.executeScript("arguments[0].setAttribute('style' , ' border: 2px Solid White;');", email);
		Common.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("himanshukhare1992@gmail.com");

		WebElement password = Common.driver.findElement(By.xpath("//input[@id='pass']"));
		jsObj.executeScript("arguments[0].setAttribute('style' , 'background: Yellow; border: 2px Solid Red;');",
				password);

		Thread.sleep(500);
		jsObj.executeScript("arguments[0].setAttribute('style' , ' border: 2px Solid White;');", password);
		Common.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567890");

	}

}

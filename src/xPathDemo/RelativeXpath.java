
/* Using Single attribute  
Syntax:  // tagname[@attributeName=’value1’]
*/

package xPathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");

		WebDriver o = new FirefoxDriver();

		o.get("https://wordpress.com/log-in");

		// o.get("http://softwaretesting-guru.blogspot.in/p/main-page.html");

		o.findElement(By.xpath("//input [@type='text']")).sendKeys("himanshu");

		// Thread.sleep(2000);

		o.findElement(By.xpath("//a [@class='masterbar__item']")).click();

		Thread.sleep(2000);

		o.findElement(By.xpath("//input [@id='educate']")).click();

	}

}

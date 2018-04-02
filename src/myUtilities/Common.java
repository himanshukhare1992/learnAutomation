package myUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Common {

	public static WebDriver driver;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet1;
	public static Properties prop;

	public static void testConfig() {
		try {
			// specify where your file is located
			File locate = new File(".\\MyConfiguration\\Config.property");

			FileInputStream fis = new FileInputStream(locate);

			// create the object of Property Class
			prop = new Properties();

			// load the file
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("EXCEPTION REASON==>>>" + e.getMessage());
		}
	}

	public static String getChromePath() {
		String path = prop.getProperty("ChromeDriver");
		return path;
	}

	public static String getApplicationURL() {
		return prop.getProperty("URL"); // specify the key
	}

	public static void CaptureScreenshots(String screenShotName) {
		/*
		 * String local=screenShotName;
		 * 
		 * int parsing = Integer.parseInt(local);
		 * 
		 * System.out.println("Parsing value of String "+local+" is "+parsing);
		 * 
		 * 
		 * while(local!="" || local!=null) { int count=1; System.out.println(
		 * "Count value  "+count+ "  & local  = "+local); count++; }
		 * 
		 * System.out.println("Loop Break & local Value is - "+local);
		 * 
		 */

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		try {
			// for (int i = 0; i <5 ; i++)
			{
				FileUtils.copyFile(source, new File("./MyScreenShots/" + screenShotName + ".png"));
				// System.out.println(i+") ----Screenshot
				// Taken-----"+screenShotName);
			}

		} catch (Exception e) // here Exception is a base class. So it will
								// handle all type of Exception.
		{
			System.out.println(":::Exception while taking Screenshot:::: " + e.getMessage());
		}
	}

	public static void InvokeFirefox4SiteCerificatesIssues(String getURL, DesiredCapabilities getDsObject) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver(getDsObject);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.get(getURL);
	}

	public static void LaunchFireFox(String getURL) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(getURL);
	}

	public static void LaunchChrome(String getURL) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\Chrome Driver (32bits)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(getURL);
	}

	public static void LaunchIE(String getURL) {
		System.setProperty("webdriver.ie.driver",
				"F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\IE Driver (64 Bits)\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(getURL);
	}

	public static void HighlightElements(WebElement getElement) {
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;

		jsObj.executeScript("arguments[0].setAttribute('style' , 'background: yellow; border: 2px solid red;'); ",
				getElement);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		jsObj.executeScript("arguments[0].setAttribute('style', 'background: white;');", getElement);
	}

	public static void readExcel(String myexcelPath) {
		try {
			File myFile = new File(myexcelPath);
			FileInputStream fis = new FileInputStream(myFile);
			workBook = new XSSFWorkbook(fis);
			sheet1 = workBook.getSheet("MyData");
		}

		catch (Exception e) // Base Exception
		{
			System.out.println(":::::::  Exception Occured :::::::::::::" + e.getMessage());
		}
	}

	public static String getData(String sheetName, int row, int column) {
		sheet1 = workBook.getSheet(sheetName);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public static int getRowCount(String sheetName) {
		sheet1 = workBook.getSheet(sheetName);

		int rowCount = sheet1.getLastRowNum();

		return rowCount + 1; // because we need the total row count & Not the
								// index //4

	}

	/*
	 * public static void main(String[] args) { Common.readExcel(
	 * "C:\\Users\\SONY\\Desktop\\MySeleneseWorkSpace\\learnAutomationByMukesh\\TestData\\DataProviderSheet.xlsx"
	 * );
	 * 
	 * //Common.getRowCount("DataProvider");
	 * 
	 * int row = Common.getRowCount("DataProvider");
	 * 
	 * System.out.println(row); }
	 */

}

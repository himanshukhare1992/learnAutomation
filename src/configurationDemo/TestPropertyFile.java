package configurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;

public class TestPropertyFile {

	// create one method testConfig
	@Test
	public void testConfig() throws Exception {
		// specify where your file is located
		File locate = new File(".\\MyConfiguration\\Config.property");

		FileInputStream fis = new FileInputStream(locate);

		// create the object of Property Class
		Properties prop = new Properties();

		// load the file
		prop.load(fis);

		// now to read the ChromeDriver from property file.
		String chromePath = prop.getProperty("ChromeDriver"); // getProperty
																// will accept
																// the Key from
																// You & will
																// return the
																// value

		System.out.println("\n\n#####  Chrome Path is ==> " + chromePath + "\n\n");

	}
}

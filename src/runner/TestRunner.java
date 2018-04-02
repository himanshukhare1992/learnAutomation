package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {

		// create the object of TestNG Class
		TestNG runner = new TestNG();

		// create one List of String
		List<String> lst = new ArrayList<String>();

		// add the xml file which you want to execute
		lst.add("C:\\Users\\SONY\\Desktop\\MySeleneseWorkSpace\\learnAutomationByMukesh\\test-output\\SmokeTestScenario\\testng-failed.xml");

		// pass the above list to runner object
		runner.setTestSuites(lst);

		// run is the actual method which will Test
		runner.run();

	}

}

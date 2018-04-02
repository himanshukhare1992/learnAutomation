package testNG_Classes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_3 {

	@Test
	public void TwitterTest() {
		/*
		 * System.out.println("::::::------1st Case Started--------:::::");
		 * Assert.assertEquals(11, 11, "assertEqual Failed");
		 * System.out.println(":::::-------1st Case Completed------:::"
		 * +"\n\n\n");
		 */

		Assert.assertTrue(true, "::::::: assertTrue Failed::::::::");

		System.out.println("\n\n" + "Twitter is Working as Expected");
	}

}

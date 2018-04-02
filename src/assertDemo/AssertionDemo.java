package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	void TC1() {
		Assert.assertEquals(11, 22); // tesNg wil compare both actual & expected
										// values.
	}

	@Test
	void TC2() {
		Assert.assertEquals(13, 12, "This message will display only when your test fails");
	}

	@Test
	void TC3() {
		Assert.assertEquals("Himanshu", "himanshu", "This message will display only when test fails"); // Assert
																										// is
																										// a
																										// Case
																										// sensitive
	}

}

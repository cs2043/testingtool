package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concateTest {

	@Test
	void testConcatenate() {
		Junit test= new Junit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
	}
}

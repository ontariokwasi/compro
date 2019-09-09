package homework3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem5 {

	@Test
	void problem1test() {
		//fail("Not yet implemented");
		String expected = "ABCDEF";
		String actual = Problem1.sorted("ACE", "BDF");
		assertEquals(expected, actual);
	}
	@Test 
	void problem2test() {
		String expected = "A";
		String actual = Problem2.minChar("TEACHER");
		assertEquals(expected, actual);
	}

}

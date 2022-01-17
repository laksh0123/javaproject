package MyClass_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogic {

	@Test
	void testFindMax()
	{
		assertEquals(4, Calculation.findmax(new int[] {1,2,3,4}));
		assertEquals(0, Calculation.findmax(new int[] {-12,-2,-3,-4}));
	}

}

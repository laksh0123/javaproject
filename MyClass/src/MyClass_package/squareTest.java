package MyClass_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test()
	{
		junitTesting obj = new junitTesting();
		int result = obj.square(5);
		assertEquals(25, result);
	}

}

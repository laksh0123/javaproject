package MyClass_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void test()
	{
		MyJunitClass obj = new MyJunitClass();
		int result = obj.add(100,200);
		assertEquals(300, result);
	}

}

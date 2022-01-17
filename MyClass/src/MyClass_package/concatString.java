package MyClass_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concatString {

	@Test
	void testString()
	{
		MyJunitClass obj = new MyJunitClass();
		String result = obj.concat("Hello", "Java");
		assertEquals("HelloJava", result);
	
	}

}

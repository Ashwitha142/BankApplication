package cal.testing.Basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCountDigits {
	@Test
	void countTest() {
		CountDigits cd = new CountDigits();
		int result = cd.count(1234);
		assertEquals(4,result);
	}
}

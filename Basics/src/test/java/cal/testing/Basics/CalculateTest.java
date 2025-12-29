package cal.testing.Basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateTest {
	@Test
	
	void TestAdd() {
		Calculator cal = new Calculator();
		int result = cal.add(10, 30);
		assertEquals(40,result);
	}

}

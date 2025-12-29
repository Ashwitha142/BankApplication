package cal.testing.Basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseTest {
	@Test
	
	void revNumberTest() {
		Reverse r = new Reverse();
		int result = r.revNum(1234);
		assertEquals(4321,result);
	}

	
}

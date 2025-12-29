package cal.testing.Basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArmstrongNumberTest {
	@Test
	public void test() {
		ArmstrongNumber arm = new ArmstrongNumber();
		int result = arm.armstr(153);
		assertEquals(153,result);
	}
}

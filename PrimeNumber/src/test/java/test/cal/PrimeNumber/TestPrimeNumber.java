package test.cal.PrimeNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPrimeNumber {
	
	@Test
	void checkNumberIsPrimeNumberOrNot() {
		assertEquals("Not a PrimeNumber",PrimeNumberOrNot.checkNumber(10));
	}
	
}

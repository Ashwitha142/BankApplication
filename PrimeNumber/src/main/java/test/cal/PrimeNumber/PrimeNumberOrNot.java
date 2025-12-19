package test.cal.PrimeNumber;

public class PrimeNumberOrNot {
	static String checkNumber(int num) {
		if(num <= 1) {
			return "Not a PrimeNumber";
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return "Not a PrimeNumber";
			}
		}
		return "PrimeNumber";
	}
}

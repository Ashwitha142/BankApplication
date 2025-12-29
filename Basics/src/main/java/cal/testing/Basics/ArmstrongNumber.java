package cal.testing.Basics;

public class ArmstrongNumber {
public int armstr(int number) {
	int sum = 0;
		while(number != 0) {
			int digit = number % 10;
			 sum = sum + digit*digit*digit;
			number= number / 10;
		}
		return sum;
	}

}

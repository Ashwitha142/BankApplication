package cal.testing.Basics;

public class Reverse {
	public int revNum(int number) {
		int rev = 0;
		while(number != 0) {
			int digit = number % 10;
			rev = rev*10 + digit;
			number = number / 10;
		}
		return rev;
		
	}

}

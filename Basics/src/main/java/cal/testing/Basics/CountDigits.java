package cal.testing.Basics;

public class CountDigits {
	public int count(int num) {
		int count = 0;
		while(num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

}


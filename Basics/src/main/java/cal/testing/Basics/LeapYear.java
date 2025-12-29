package cal.testing.Basics;

public class LeapYear {
	public boolean Leap(int year) {
		boolean isLeapYear = true;
		if((year%400==0) || (year%4==0) && (year%100!=0)) {
			isLeapYear = true;	
		}else {
			isLeapYear = false;
		}
		return isLeapYear;
	}
	public static void main(String[] args) {
		LeapYear lp = new LeapYear();
		boolean b = lp.Leap(2016);
		if(b) {
			System.out.println("Is a LeapYear");
		}else {
			System.out.println("Not a LeapYear");
		}
	}

}

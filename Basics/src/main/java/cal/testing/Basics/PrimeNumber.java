package cal.testing.Basics;

public class PrimeNumber {
	/*public static void main(String[] args) {
		int number = 11;
		boolean isPrime = true;
		if(number <=  1) {
			isPrime = false;
		}
		else {
			for(int i = 2; i<=Math.sqrt(number); i++) {
				if(number%i==0) {
					isPrime = false;
				}
			}
			
		}
		if(isPrime) {
		System.out.println("Its is a prime Number");
		}
	}*/
	public boolean primenum(int number) {
		boolean isPrime = true;
		if(number<=1) {
			isPrime=false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		return isPrime;
	}
public static void main(String[] args) {
	PrimeNumber pn = new PrimeNumber();
	boolean b = pn.primenum(11);
	if(b) {
		System.out.println("Is a Prime Number");
	}else {
		System.out.println("Not a PrimeNumber");
	}
}
}

package test.cal.bankapp;

public class BankTransfer {
	String name;
	int balance;
	BankTransfer(String name, int balance){
		this.name = name;
		this.balance = balance;
	}
	void transfer(BankTransfer receiver, int amount) {
		this.balance -= amount;
		receiver.balance += amount;
		
	}
}

	
	
	
	
	







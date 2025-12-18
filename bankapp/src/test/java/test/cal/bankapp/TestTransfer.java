package test.cal.bankapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTransfer {
	@Test
	void TestTransferingAmount() {
				BankTransfer sender = new BankTransfer("Ashwitha",1230);
				BankTransfer receiver = new BankTransfer("Sri",500);
				sender.transfer(receiver,230);
				assertEquals(1000,sender.balance);
				assertEquals(730,receiver.balance);
	}

}


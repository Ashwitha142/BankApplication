package com.test.cal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAppTest {

    @Test
    void testDeposit() {
        BankApp bank = new BankApp(1000);
        bank.deposit(500);
        assertEquals(1500, bank.getBalance());
    }

    @Test
    void testWithdrawal() {
        BankApp bank = new BankApp(1000);
        bank.withdrawal(300);
        assertEquals(700, bank.getBalance());
    }

    @Test
    void testInvalidWithdrawal() {
        BankApp bank = new BankApp(500);
        bank.withdrawal(1000);
        assertEquals(500, bank.getBalance());
    }
}
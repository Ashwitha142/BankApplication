package com.test.cal;

public class BankApp {

    private double balance;

    public BankApp(double iBal) {
        this.balance = iBal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
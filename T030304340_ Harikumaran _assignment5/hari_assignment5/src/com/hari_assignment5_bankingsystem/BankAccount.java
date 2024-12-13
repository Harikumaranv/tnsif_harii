package com.hari_assignment5_bankingsystem;

class BankAccount {
    private int accountNumber;
    private double balance;

   
     
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount for deposit: " + amount);
        }
        balance += amount;
    }


     
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount for withdrawal: " + amount);
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal: " + amount);
        }
        balance -= amount;
    }

    
     
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}
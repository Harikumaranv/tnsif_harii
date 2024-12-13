package com.hari_assignment5_bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 1000.0);

        try {
            account.deposit(500.0);
            account.withdraw(2000.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
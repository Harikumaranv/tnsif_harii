package com.hari_assignment_6_banking;

public class Main {
    public static void main(String[] args) {
        // Creating a shared BankAccount object with an initial balance of 1000
        BankAccount account = new BankAccount(1000);

        // Creating transactions
        Thread t1 = new Thread(new BankTransaction(account, true, 500, "Thread 1")); // Withdrawal
        Thread t2 = new Thread(new BankTransaction(account, false, 700, "Thread 2")); // Deposit
        Thread t3 = new Thread(new BankTransaction(account, true, 300, "Thread 3")); // Withdrawal
        Thread t4 = new Thread(new BankTransaction(account, false, 400, "Thread 4")); // Deposit

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Waiting for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display final balance
        System.out.println("Final account balance: " + account.getBalance());
    }
}

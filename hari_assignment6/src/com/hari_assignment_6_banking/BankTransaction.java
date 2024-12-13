package com.hari_assignment_6_banking;

public class BankTransaction implements Runnable {
    private BankAccount account;
    private boolean isWithdrawal;
    private int amount;
    private String threadName;

    public BankTransaction(BankAccount account, boolean isWithdrawal, int amount, String threadName) {
        this.account = account;
        this.isWithdrawal = isWithdrawal;
        this.amount = amount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if (isWithdrawal) {
            account.withdraw(amount, threadName);
        } else {
            account.deposit(amount, threadName);
        }
    }
}

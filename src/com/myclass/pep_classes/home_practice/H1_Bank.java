package com.myclass.pep_classes.home_practice;

class Bank{
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public Bank(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
        } else {
            System.out.println("Not sufficient amount");
        }
    }

    public void display() {
        System.out.println("Account holder name: " + this.accountHolderName);
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }
}

public class H1_Bank {

    public static void run() {
        Bank bank = new Bank("1234567890", 1000, "Xander Billa");
        bank.display();
        bank.deposit(500);
        bank.display();
        bank.withdraw(200);
        bank.display();
    }
}

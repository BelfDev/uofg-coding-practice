package compsci4039.week2.bank_account;

/*
 * Programming IT, Laboratory Exercises
 * 2 Bank Account
 * Parts 1 - 10
 * https://docs.google.com/document/d/13s7-_-iO2AV9_5gIA4YoxljJzs8TKGVcJHWeYaULihY
 */

import compsci4039.week2.people.Person;

public class BankAccount {

    private Person person;
    private int accountNumber;
    private double balance;

    private static int nextAccountNumber = 0;

    public BankAccount(Person person) {
        this.person = person;
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    };

    public void printAccountNumber() {
        System.out.printf("\n%s's account number: %d", this.person.getName(), this.accountNumber);
    }

    public void depositFunds(double amount) {
        this.balance += amount;
    }

    public void withdrawFunds(double amount) {
        this.balance -= amount;
    }

    public void transferFunds(double amount, BankAccount destinationBankAcount) {
        if (this.balance >= amount) {
            destinationBankAcount.depositFunds(amount);
            withdrawFunds(amount);
        } else {
            System.out.println("Insufficient funds... Try the lottery!");
        }
    }

    @Override
    public String toString() {
        return String.format("\n\nACCOUNT NAME: %s\nACCOUNT NUMBER: %d\nACCOUNT BALANCE: GBP %.2f", this.person.getName(), this.accountNumber, this.balance);
    }
}

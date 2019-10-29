package compsci4039.week4.exceptions;

public class Lab8BankAccount {

    private Lab8Person person;
    private int accountNumber;
    private double balance;

    private static int nextAccountNumber = 0;

    public Lab8BankAccount(Lab8Person person) {
        this.person = person;
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printAccountNumber() {
        System.out.printf("\n%s's account number: %d", this.person.getName(), this.accountNumber);
    }

    public void depositFunds(double amount) {
        this.balance += amount;
    }

    public void withdrawFunds(double amount) throws OverdrawnException {
        if (this.balance - amount < 0) {
            throw new OverdrawnException("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public void transferFunds(double amount, Lab8BankAccount destinationBankAcount) {
        try {
            double transferredAmount = this.balance;
            withdrawFunds(amount);
            destinationBankAcount.depositFunds(transferredAmount);
        } catch (OverdrawnException error) {
            error.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return String.format("\n\nACCOUNT NAME: %s\nACCOUNT NUMBER: %d\nACCOUNT BALANCE: GBP %.2f", this.person.getName(), this.accountNumber, this.balance);
    }

}

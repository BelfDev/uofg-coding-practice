package compsci4039.week2.inheritance.bank_account;

import compsci4039.week2.bank_account.BankAccount;
import compsci4039.week2.people.Person;

public class ModernBankAccount extends BankAccount {

    private double interestRate;

    public ModernBankAccount(Person person, double interestRate) {
        super(person);
        this.interestRate = interestRate;
    }

    @Override
    public void withdrawFunds(double amount) {
        if (amount <= super.getBalance()) {
            super.withdrawFunds(amount);
        } else {
            System.out.println("Insufficient funds... Try the lottery!");
        }

    }

    public void incurInterest() {
        double currentBalance = getBalance();
        currentBalance *= (1.0 + this.interestRate/100);
        setBalance(currentBalance);
    }
}

package compsci4039.week4.exceptions;

public class Lab8SavingsAccount extends Lab8BankAccount {

    private double interestRate;

    public Lab8SavingsAccount(Lab8Person person, double interestRate) {
        super(person);
        this.interestRate = interestRate;
    }

    @Override
    public void withdrawFunds(double amount) throws OverdrawnException {
        super.withdrawFunds(amount);
    }

    public void incurInterest() {
        double currentBalance = getBalance();
        currentBalance *= (1.0 + this.interestRate / 100);
        setBalance(currentBalance);
    }

}

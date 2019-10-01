package compsci4039.week2.inheritance.bank_account;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

public class Lab6Ex4 {

    public static void main(String[] args) {

        Person pedro = new Person("Pedro", 25, Gender.MALE);
        ModernBankAccount modernAccount = new ModernBankAccount(pedro, 5.4);

        modernAccount.depositFunds(1000);
        modernAccount.incurInterest();
        System.out.println("My current balance is: " + modernAccount.getBalance());
    }
}

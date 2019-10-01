package compsci4039.week2.inheritance.bank_account;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

/*
 * Programming IT, Laboratory Exercises
 * 4 Inheritance with Bank Account
 * Parts 1 - 4
 * https://docs.google.com/document/d/13s7-_-iO2AV9_5gIA4YoxljJzs8TKGVcJHWeYaULihY
 */

public class Lab6Ex4 {

    public static void main(String[] args) {

        Person pedro = new Person("Pedro", 25, Gender.MALE);
        ModernBankAccount modernAccount = new ModernBankAccount(pedro, 5.4);

        modernAccount.depositFunds(1000);
        modernAccount.incurInterest();
        System.out.println("My current balance is: " + modernAccount.getBalance());
    }
}

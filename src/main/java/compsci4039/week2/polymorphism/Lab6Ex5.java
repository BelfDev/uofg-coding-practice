package compsci4039.week2.polymorphism;

import compsci4039.week2.bank_account.BankAccount;
import compsci4039.week2.inheritance.bank_account.ModernBankAccount;
import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;


/*
 * Programming IT, Laboratory Exercises
 * 4 Polymorphism
 * Parts 1 - 4
 * https://docs.google.com/document/d/13s7-_-iO2AV9_5gIA4YoxljJzs8TKGVcJHWeYaULihY
 */

public class Lab6Ex5 {

    public static void main(String[] args) {
        Person randomPerson = new Person("Random", 22, Gender.FEMALE);
        BankAccount regularAccount = new ModernBankAccount(randomPerson, 5.4);
        System.out.println(regularAccount.toString());
    }

}

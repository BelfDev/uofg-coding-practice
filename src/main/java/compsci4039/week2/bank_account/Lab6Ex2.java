package compsci4039.week2.bank_account;

/*
 * Programming IT, Laboratory Exercises
 * 2 Bank Account
 * Parts 1 - 10
 * https://docs.google.com/document/d/13s7-_-iO2AV9_5gIA4YoxljJzs8TKGVcJHWeYaULihY
 */

import compsci4039.week2.people.Person;

import static compsci4039.week2.people.Gender.MALE;

public class Lab6Ex2 {

    public static void main(String[] args) {
        executePartsOneToSix();
        executePartsSevenToTen();
    }

    private static void depositLotteryPrize(BankAccount luckyBankAccount) {
        luckyBankAccount.depositFunds(5000000);
    }

    private static void forceDonationToEllonMusk(BankAccount unluckyBankAccount) {
        unluckyBankAccount.withdrawFunds(1000000);
    }

    private static void executePartsOneToSix() {
        Person pedro = new Person("Pedro", 25, MALE);
        Person anton = new Person("Anton", 31, MALE);

        BankAccount pedrosAccount = new BankAccount(pedro);
        BankAccount antonsAccount = new BankAccount(anton);

        pedrosAccount.printAccountNumber();
        antonsAccount.printAccountNumber();

        depositLotteryPrize(antonsAccount);
        forceDonationToEllonMusk(antonsAccount);

        String result = antonsAccount.toString();
        System.out.println(result);
    }

    private static void executePartsSevenToTen() {
        Person gareth = new Person("Gareth", 30, MALE);

        BankAccount firstBankAccount = new BankAccount(gareth);
        BankAccount secondBankAccount = new BankAccount(gareth);

        System.out.println(firstBankAccount.toString());
        System.out.println(secondBankAccount.toString());


        depositLotteryPrize(firstBankAccount);
        firstBankAccount.transferFunds(1000000, secondBankAccount);

        System.out.println(firstBankAccount.toString());
        System.out.println(secondBankAccount.toString());
    }

}

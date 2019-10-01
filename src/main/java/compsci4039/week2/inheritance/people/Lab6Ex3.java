package compsci4039.week2.inheritance.people;

import compsci4039.week2.people.Gender;

public class Lab6Ex3 {


    /*
     * Programming IT, Laboratory Exercises
     * 3 Inheritance with People
     * Parts 1 - 3
     * https://docs.google.com/document/d/13s7-_-iO2AV9_5gIA4YoxljJzs8TKGVcJHWeYaULihY
     */


    public static void main(String[] args) {
        Student pedro = new Student("Pedro", 25, Gender.MALE);
        pedro.setGpa(3.8);
        System.out.println(pedro.toString());

        Lecturer simon = new Lecturer("Simon", 36, Gender.MALE);
        simon.setSalary(40000);
        System.out.println("My salary is... GBP " + simon.getSalary());
    }

}

package compsci4039.week2.inheritance.people;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

public class Lecturer extends Person {

    private double salary;

    public Lecturer(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

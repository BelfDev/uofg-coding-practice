package compsci4039.week2.inheritance.people;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

public class Student extends Person {

    private double gpa;

    public Student(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("\nI AM A STUDENT! GPA: %.2f\n%s", this.gpa, super.toString());
    }
}

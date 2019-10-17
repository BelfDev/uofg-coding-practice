package compsci4039.week3.arrays_of_objects;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

/*
 * Programming IT, Laboratory Exercises
 * 3 Arrays of objects
 * Parts 1 - 5
 * https://docs.google.com/document/d/1A-rlXlmnchQN-3oM4X1lTSsz6Qs44Nl4uxaGfHAkNkE
 */
public class Lab7Ex3 {

    public static void main(String[] args) {
        // executeInstructionOne();
        // finished with non-zero exit value 1

        executeInstructionTwo();
        showcaseTheAdditionOfDependents();
        showcaseAdditionOfUnlimitedChildren();
    }

    // Part 1
    public static void executeInstructionOne() {
        Person[] people = new Person[4];
        System.out.println(people[0].getAge());
    }

    // Part 2
    public static Person[] createPeopleArray() {
        Person personOne = new Person("Pedro", 25, Gender.MALE);
        Person personTwo = new Person("Gareth", 30, Gender.MALE);
        Person personThree = new Person("Anton", 30, Gender.MALE);
        Person personFour = new Person("Kate", 23, Gender.FEMALE);

        Person[] people = new Person[4];
        people[0] = personOne;
        people[1] = personTwo;
        people[2] = personThree;
        people[3] = personFour;

        return people;
    }

    public static void executeInstructionTwo() {
        Person[] people = createPeopleArray();
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    // Part 3
    public static int computeTotalAge(Person[] people) {
        int sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        return sum;
    }

    // Part 4
    public static void showcaseTheAdditionOfDependents() {
        Person childOne = new Person("John", 8, Gender.MALE);
        Person childTwo = new Person("Mary", 9, Gender.FEMALE);
        Person childThree = new Person("Alice", 12, Gender.FEMALE);

        Lab7Person mom = new Lab7Person("Sandra", 55, Gender.FEMALE);
        mom.addChild(childOne);
        mom.addChild(childTwo);
        mom.addChild(childThree);

        for (Person child : mom.getDependents()) {
            System.out.println(child.getName());
        }
    }

    // Part 5
    public static void showcaseAdditionOfUnlimitedChildren() {
        Person[] kindergarten = {
                new Person("John", 8, Gender.MALE),
                new Person("Mary", 9, Gender.FEMALE),
                new Person("Alice", 12, Gender.FEMALE),
                new Person("Clara", 8, Gender.FEMALE),
                new Person("Andre", 9, Gender.MALE),
                new Person("Pedrinho", 12, Gender.MALE),
        };

        Lab7Person richMom = new Lab7Person("Gaga", 36, Gender.FEMALE);
        for (Person child: kindergarten) {
            richMom.addUnlimitedChildren(child);
        }
        richMom.printUnlimitedChildren();
    }

}

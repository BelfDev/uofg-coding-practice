package compsci4039.week3.arrays_of_objects;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

/*
 * Programming IT, Laboratory Exercises
 * 3 Arrays of objects
 * Parts 4 - 5
 * https://docs.google.com/document/d/1A-rlXlmnchQN-3oM4X1lTSsz6Qs44Nl4uxaGfHAkNkE
 */
public class Lab7Person extends Person {

    Person[] dependents = new Person[3];
    Person[] unlimitedDependents = new Person[0];

    public Lab7Person(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public Person[] getDependents() {
        return dependents;
    }

    public Person[] getUnlimitedDependents() {
        return unlimitedDependents;
    }

    // Part 4
    public void addChild(Person child) {
        int lastIndex = 0;
        for (int i = 0; i < dependents.length; i++) {
            lastIndex = i;
            if (dependents[i] == null) break;
        }
        dependents[lastIndex] = child;
    }

    @Override
    public String toString() {
        String firstMessage = super.toString();
        String secondMessage = String.format("And these are my dependents:\n%s\t%s\t%s", dependents[0], dependents[1], dependents[2]);
        return firstMessage + "\n" + secondMessage;
    }

    // Part 5
    public void addUnlimitedChildren(Person child) {
        Person expandedDependents[] = new Person[unlimitedDependents.length + 1];
        for (int i = 0; i < unlimitedDependents.length; i++) {
            expandedDependents[i] = unlimitedDependents[i];
        }
        expandedDependents[unlimitedDependents.length] = child;
        unlimitedDependents = expandedDependents;
    }

    public void printUnlimitedChildren() {
        for (Person child: unlimitedDependents) {
            System.out.println(child.getName());
        }
    }

}

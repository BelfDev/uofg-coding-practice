package compsci4039.week3.arrays_of_objects;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab7PersonTest {

    private Lab7Person mom;

    @Before
    public void setUpMom() {
        mom = new Lab7Person("Gloria", 38, Gender.FEMALE);
    }

    @Test
    public void addChild_Person_ArrayWithPersonAsTheLastElement() {
        Person child = new Person("Clara", 6, Gender.FEMALE);
        Person[] dependents = new Person[3];

        dependents[0] = child;
        mom.addChild(child);

        Assert.assertArrayEquals("Dependents should contain new child", dependents, mom.getDependents());
    }

    @Test
    public void addUnlimitedChildren_Person_ExpandedArrayWithChild() {
        Person[] kindergarten = {
                new Person("Josh", 12, Gender.MALE),
                new Person("Louis", 11, Gender.MALE),
                new Person("Michael", 12, Gender.MALE),
                new Person("Ella", 10, Gender.FEMALE),
        };

        for (Person child : kindergarten) {
            mom.addUnlimitedChildren(child);
        }

        Assert.assertArrayEquals("Should add unlimited amount of dependents", kindergarten, mom.getUnlimitedDependents());
    }


}

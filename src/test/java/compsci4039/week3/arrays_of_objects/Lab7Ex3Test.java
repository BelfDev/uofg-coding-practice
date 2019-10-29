package compsci4039.week3.arrays_of_objects;

import compsci4039.week2.people.Gender;
import compsci4039.week2.people.Person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab7Ex3Test {


    @Test
    public void createPeopleArray_GeneratePersonArrayWithFourNonNullElements() {
        Person[] people = Lab7Ex3.createPeopleArray();
        for (Person person : people) {
            Assert.assertNotNull(person);
        }
        Assert.assertEquals("Should generate Person array with 4 people", 4, people.length);
    }

    @Test
    public void computeTotalAge_PersonArray_SumOfPeopleAges() {
        Person[] people = {
                new Person("One", 20, Gender.MALE),
                new Person("Two", 30, Gender.FEMALE),
                new Person("Three", 40, Gender.FEMALE)
        };
        int result = Lab7Ex3.computeTotalAge(people);
        Assert.assertEquals("Should compute a total age of 90 years", 90, result);
    }

}

package compsci4039.week2.people;

/*
 * Programming IT, Laboratory Exercises
 * 1 People
 * Parts 1 - 3
 * https://docs.google.com/document/d/13s7-_-iO2AV9_5gIA4YoxljJzs8TKGVcJHWeYaULihY
 */

public class Person {

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.setGender(gender);
    }

    public void sayHello() {
        System.out.printf("Hi, I'm  %s and I am %d years old.", name, age);
    }

    public void reportProfile() {
        System.out.printf("Hello, very nice to meet you!\nFor those who want to know, my name is %s.\nI am %s years old and identify my gender as being %s", this.name, this.age, this.gender);
    }

    @Override
    public String toString() {
        return String.format("NAME: %s, AGE: %s, GENDER, %s", this.name, this.age, this.gender);
    }
}

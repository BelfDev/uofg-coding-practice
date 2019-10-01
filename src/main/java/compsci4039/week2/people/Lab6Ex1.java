package compsci4039.week2.people;
import static compsci4039.week2.people.Gender.MALE;

/*
 * Programming IT, Laboratory Exercises
 * 1 People
 * Parts 1 - 3
 * https://docs.google.com/document/d/13s7-_-iO2AV9_5gIA4YoxljJzs8TKGVcJHWeYaULihY
 */

public class Lab6Ex1 {

    public static void main(String args[]) {
        Person pedro = new Person("Pedro", 25, MALE);
        Person anton = new Person("Anton", 31, MALE);

        pedro.reportProfile();
        anton.reportProfile();

        System.out.printf("\n\n%s's description:\n%s", pedro.getName(), pedro.toString());
        System.out.printf("\n\n%s's description:\n%s", anton.getName(), pedro.toString());
    }
}

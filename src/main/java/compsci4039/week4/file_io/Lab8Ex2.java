package compsci4039.week4.file_io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Programming IT, Laboratory Exercises
 * 2 File IO
 * Parts 1 - 3
 * https://docs.google.com/document/d/1T1NmSZc0zJyHkJObpQz9PzRXvIv8aqZHQ659ZwhiFLc
 */
public class Lab8Ex2 {

    public static void main(String[] args) {
        printDolphin();
        printFileSum();
        writeMotivationalQuote();
    }

    // Part 1
    public static void printDolphin() {
        try {
            FileReader fr = new FileReader("src/main/resources/dolphin.txt");
            Scanner content = new Scanner(fr);

            while(content.hasNextLine()) {
                System.out.println(content.nextLine());
            }

            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Part 2
    public static void printFileSum() {
        try {
            FileReader fr = new FileReader("src/main/resources/sums.txt");
            Scanner content = new Scanner(fr);

            int sum = 0;
            while(content.hasNextLine()) {
                String line = content.nextLine();
                String[] inputs = line.split("\\s+");
                int firstInput = Integer.parseInt(inputs[0]);
                int secondInput = Integer.parseInt(inputs[2]);

                if (inputs[1].equals("+")) {
                    sum += firstInput + secondInput;;
                } else if (inputs[1].equals("-")) {
                    sum += firstInput - secondInput;
                }
            }

            System.out.printf("The total sum is: %d\n", sum);

            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Part 3
    public static void writeMotivationalQuote() {
        String backwardsContent = readBackwardsFile();
        String motivationalQuote = reverseStringOrder(backwardsContent);

        try {
            FileWriter fw = new FileWriter("src/main/resources/motivationalQuote.txt");
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(motivationalQuote);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readBackwardsFile() {
        try {
            FileReader fr = new FileReader("src/main/resources/backwards.txt");
            Scanner content = new Scanner(fr);
            return content.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String reverseStringOrder(String backwardsString) {
        char[] chars = backwardsString.toCharArray();
        String output= "";

        for (int i = chars.length - 1; i >= 0; i--) {
            String stringValue = String.valueOf(chars[i]);
            output += stringValue;
        }

        return output;
    }
}

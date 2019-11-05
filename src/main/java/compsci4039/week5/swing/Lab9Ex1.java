package compsci4039.week5.swing;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Programming IT, Laboratory Exercises
 * Java Swing 1
 * Part 1
 * https://docs.google.com/document/d/1ydXgjYnBbTwr8rmIJviaZX7-R43aifLVCzuPf3GJdaU
 */
public class Lab9Ex1 extends JFrame {

    public Lab9Ex1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(100, 100);
        setTitle("Just a JFrame");
    }


    public static void main(String[] args) {
//        Lab9Ex1 frame = new Lab9Ex1();
//        frame.setVisible(true);
        executeInstructionOne();
    }

    // Part 1
    private static void executeInstructionOne() {
        Lab9Ex1 frame = new Lab9Ex1();
        frame.setSize(400, 400);
        frame.setTitle("Border layout for JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        List<JLabel> labels = Arrays.asList(
                new JLabel(BorderLayout.NORTH),
                new JLabel(BorderLayout.SOUTH),
                new JLabel(BorderLayout.WEST),
                new JLabel(BorderLayout.EAST),
                new JLabel(BorderLayout.CENTER)
        );

        labels.forEach(label -> frame.add(label, label.getText()));

        frame.setVisible(true);
    }

}

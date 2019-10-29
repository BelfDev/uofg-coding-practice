package compsci4039.week5.swing1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Programming IT, Laboratory Exercises
 * Java Swing 1
 * Part 2
 * https://docs.google.com/document/d/1ydXgjYnBbTwr8rmIJviaZX7-R43aifLVCzuPf3GJdaU
 */
public class Lab9Ex2 extends JFrame {

    public Lab9Ex2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);
        setTitle("Border layout for JFrame");
    }

    // Part 2
    public static void main(String[] args) {
        Lab9Ex2 frame = new Lab9Ex2();

        JPanel topPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        JLabel northLabel = new JLabel(BorderLayout.NORTH);
        JLabel westLabel = new JLabel(BorderLayout.WEST);
        JLabel eastLabel = new JLabel(BorderLayout.EAST);
        JLabel southLabel = new JLabel(BorderLayout.SOUTH);
        JLabel centerLabel = new JLabel(BorderLayout.CENTER);

        topPanel.add(northLabel);
        rightPanel.add(eastLabel);
        leftPanel.add(westLabel);
        bottomPanel.add(southLabel);
        centerPanel.add(centerLabel);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}

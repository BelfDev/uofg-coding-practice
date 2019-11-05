package compsci4039.week5.swing;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lab9Ex3 extends JFrame {

    public Lab9Ex3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);
        setTitle("Border layout for JFrame");
    }

    // Part 3
    public static void main(String[] args) {
        Lab9Ex3 frame = new Lab9Ex3();
        populateFrame(frame);
        frame.setVisible(true);
    }

    private static void populateFrame(JFrame frame) {
        JPanel topPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        leftPanel.setLayout(new GridBagLayout());
        centerPanel.setLayout(new GridBagLayout());
        rightPanel.setLayout(new GridBagLayout());

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
    }

}

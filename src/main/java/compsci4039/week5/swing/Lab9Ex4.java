package compsci4039.week5.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Lab9Ex4 extends JFrame {

    public JPanel topPanel;
    public JPanel rightPanel;
    public JPanel bottomPanel;
    public JPanel leftPanel;
    public JPanel centerPanel;

    public Border blackLine;

    public Lab9Ex4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);
        setTitle("Border layout for JFrame");

        this.topPanel = new JPanel();
        this.rightPanel = new JPanel();
        this.bottomPanel = new JPanel();
        this.leftPanel = new JPanel();
        this.centerPanel = new JPanel();

        this.blackLine = BorderFactory.createLineBorder(Color.black);
    }

    public static void main(String[] args) {
        Lab9Ex4 frame = new Lab9Ex4();
        frame.populateFrame();
        frame.setVisible(true);
    }

    // Part 4
    private void populateFrame() {

        // Panel border setup
        topPanel.setBorder(blackLine);
        leftPanel.setBorder(blackLine);
        bottomPanel.setBorder(blackLine);
        centerPanel.setBorder(blackLine);
        rightPanel.setBorder(blackLine);

        // Panel layout setup
        leftPanel.setLayout(new GridBagLayout());
        centerPanel.setLayout(new GridBagLayout());
        rightPanel.setLayout(new GridBagLayout());

        // Label creation
        JLabel northLabel = new JLabel(BorderLayout.NORTH);
        JLabel westLabel = new JLabel(BorderLayout.WEST);
        JLabel eastLabel = new JLabel(BorderLayout.EAST);
        JLabel southLabel = new JLabel(BorderLayout.SOUTH);
        JLabel centerLabel = new JLabel(BorderLayout.CENTER);

        // Label addition
        topPanel.add(northLabel);
        rightPanel.add(eastLabel);
        leftPanel.add(westLabel);
        bottomPanel.add(southLabel);
        centerPanel.add(centerLabel);

        // Panel addition
        this.add(topPanel, BorderLayout.NORTH);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);
    }

}

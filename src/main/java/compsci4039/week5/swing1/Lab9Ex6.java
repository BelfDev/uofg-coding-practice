package compsci4039.week5.swing1;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class Lab9Ex6 extends Lab9Ex5 {

    public Lab9Ex6() {
        super();
    }

    public static void main(String[] args) {
        Lab9Ex6 frame = new Lab9Ex6();
        frame.populateFrame();
        frame.setVisible(true);
    }

    // Part 6
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
        JLabel westLabel = new JLabel("<html> &nbsp W &nbsp <br> &nbsp E " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
        JLabel eastLabel = new JLabel("<html> &nbsp E &nbsp <br> &nbsp A " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
        JLabel southLabel = new JLabel(BorderLayout.SOUTH);
        JLabel centerLabel = new JLabel(BorderLayout.CENTER);

        // Label font setup
        northLabel.setFont(font);
        westLabel.setFont(font);
        eastLabel.setFont(font);
        southLabel.setFont(font);
        centerLabel.setFont(font);

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

package compsci4039.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleFrame1 extends JFrame {
    private JButton button1;
    private JLabel label1;
    private JTextField textField1;

    public SimpleFrame1() {
        final int HEIGHT = 300;
        final int WIDTH = HEIGHT * 2;
        this.setTitle("A Simple GUI");
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel(new FlowLayout());
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel eastPanel = new JPanel(new FlowLayout());
        JPanel westPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        northPanel.setBackground(Color.white);
        label1 = new JLabel(" Click the Button");
        button1 = new JButton("Click");
        northPanel.add(label1);
        northPanel.add(button1);

        textField1 = new JTextField(30);
        southPanel.add(textField1);
        southPanel.setBackground(Color.green);

        eastPanel.setBackground(Color.yellow);
        westPanel.setBackground(Color.blue);
        centerPanel.setBackground(Color.black);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(eastPanel, BorderLayout.EAST);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);
    }

    /*
     * Main method -- creates the SimpleFrame object
     */
    public static void main(String[] args) {
        SimpleFrame1 gui = new SimpleFrame1();
        gui.setVisible(true);
    }
}

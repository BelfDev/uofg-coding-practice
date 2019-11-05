package compsci4039.example;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
    private JButton button1, button2;

    public BorderLayoutDemo() {
        this.setTitle("Button Frame");
        this.setSize(200, 200);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Press me");
        button2 = new JButton("Press me too");

        this.setLayout(new BorderLayout());
        this.add(button1, BorderLayout.CENTER);
        this.add(button2, BorderLayout.SOUTH);


    }

    /*
     * Main method -- creates the SimpleFrame object
     */
    public static void main(String[] args) {

        BorderLayoutDemo gui = new BorderLayoutDemo();
        gui.setVisible(true);
    }
}

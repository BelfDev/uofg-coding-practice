package compsci4039.example;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutDemo extends JFrame {
    private JButton button1, button2;
    private JTextField textField1;
    private JLabel label1;

    //add instance variables


    public FlowLayoutDemo() {
        this.setTitle("Flow layout");
        this.setSize(500, 100);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Ok");
        button2 = new JButton("Quit");
        textField1 = new JTextField("initial Text", 15);
        label1 = new JLabel("Click a button");


        //this.getContentPane().add(button1);
        //equivalent to:
        this.setLayout(new FlowLayout());
        this.add(button1);
        this.add(button2);
        this.add(label1);
        this.add(textField1);
        //this.pack();

    }

    /*
     * Main method -- creates the SimpleFrame object
     */
    public static void main(String[] args) {

        FlowLayoutDemo gui = new FlowLayoutDemo();
        gui.setVisible(true);
    }
}

package compsci4039.example;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonFrame extends JFrame {
    private JButton button1, button2;
    private JTextField textField1;
    private JLabel label1;

    //add instance variables


    public ButtonFrame() {
        this.setTitle("JFrame with some components");
        this.setSize(450, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Ok");
        button2 = new JButton("Quit");
        textField1 = new JTextField("initial Text", 15);
        label1 = new JLabel("Click a button");

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));
        JPanel myPanel1 = new JPanel(new FlowLayout());
        myPanel1.add(button1);
        myPanel1.add(button2);

        mainPanel.add(myPanel1);
        JPanel myPanel2 = new JPanel(new FlowLayout());
        myPanel2.add(label1);
        myPanel2.add(textField1);
        mainPanel.add(myPanel2);

        this.add(mainPanel);

    }

    /*
     * Main method -- creates the SimpleFrame object
     */
    public static void main(String[] args) {

        ButtonFrame gui = new ButtonFrame();
        gui.setVisible(true);
    }
}

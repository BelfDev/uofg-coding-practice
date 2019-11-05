package compsci4039.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NestedFrameDemo extends JFrame {
    public NestedFrameDemo() {


        // Standard JFrame things...
        final int HEIGHT = 300;
        final int WIDTH = HEIGHT * 2;
        this.setTitle("A Simple GUI showing nested layout");
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        final int NORTH_HEIGHT = HEIGHT / 6;
        final int SOUTH_HEIGHT = HEIGHT / 7;
        final int EAST_WIDTH = WIDTH / 15;
        final int WEST_WIDTH = WIDTH / 15;
        JPanel northPanel = new JPanel(new FlowLayout());
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel eastPanel = new JPanel(new FlowLayout());
        JPanel westPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());
        //northPanel.setPreferredSize(new Dimension(WIDTH, NORTH_HEIGHT));
        //southPanel.setPreferredSize(new Dimension(WIDTH, SOUTH_HEIGHT));
        northPanel.setBackground(Color.red);
        eastPanel.setBackground(Color.blue);
        westPanel.setBackground(Color.yellow);
        southPanel.setBackground(Color.green);

        JLabel myLabel = new JLabel("Click the Button");
        //Font font = new Font("Dialog", Font.BOLD,14);
        //myLabel.setFont(font);

        //System.out.println("The label font is: " + myLabel.getFont());


        JButton myButton = new JButton("Click");
        //myButton.setFont(font);
        northPanel.add(myLabel);
        northPanel.add(myButton);

        TextField myTextField = new TextField(30);
        //myTextField.setPreferredSize(new Dimension(WIDTH/2, HEIGHT/6));
        southPanel.add(myTextField);

        centerPanel.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.add(new JLabel("Grid of buttons below"));
        centerPanel.add(top, BorderLayout.NORTH);
        JPanel middle = new JPanel(new GridLayout(2, 3));
        middle.add(new JButton("(1,1)"));
        middle.add(new JButton("(1,2)"));
        middle.add(new JButton("(1,3)"));
        middle.add(new JButton("(2,1)"));
        middle.add(new JButton("(2,2)"));
        middle.add(new JButton("(2,3)"));
        centerPanel.add(middle, BorderLayout.CENTER);


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


        NestedFrameDemo gui = new NestedFrameDemo();
        gui.setVisible(true);
    }
}

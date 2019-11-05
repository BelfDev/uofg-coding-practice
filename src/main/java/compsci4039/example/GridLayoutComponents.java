package compsci4039.example;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutComponents extends JFrame {
    JLabel label1, label2, label3, label4, label5, label6;
    JLabel label7, label8, label9, label10, label11, label12;

    public GridLayoutComponents() {
        this.setTitle("JFrame with Grid Layout");
        this.setLocation(20, 20);
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 3));// 2 columns and as many rows as we need

        label1 = new JLabel("This is cell 1,1");
        label2 = new JLabel("This is cell 1,2");
        label3 = new JLabel("This is cell 1,3");
        label4 = new JLabel("This is cell 2,1");
        label5 = new JLabel("This is cell 2,2");
        label6 = new JLabel("This is cell 2,3");
        label7 = new JLabel("This is cell 3,1");
        label8 = new JLabel("This is cell 3,2");
        label9 = new JLabel("This is cell 3,3");
        label10 = new JLabel("This is cell 4,1");
        label11 = new JLabel("This is cell 4,2");
        label12 = new JLabel("This is cell 4,3");

        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label8);
        this.add(label9);
        this.add(label10);
        this.add(label11);
        this.add(label12);

    }

    public static void main(String[] args) {
        GridLayoutComponents gui = new GridLayoutComponents();
        gui.setVisible(true);
    }

}

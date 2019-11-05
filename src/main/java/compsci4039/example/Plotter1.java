package compsci4039.example;

import javax.swing.JFrame;

public class Plotter1 extends JFrame {
    public Plotter1() {
        // Standard JFrame things...
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    /*
     * Main method -- creates the Plotter object
     */
    public static void main(String[] args) {
        new Plotter1();
    }
}

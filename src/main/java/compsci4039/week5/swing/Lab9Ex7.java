package compsci4039.week5.swing;

import javax.swing.JFrame;

public class Lab9Ex7 extends JFrame {

    public Lab9Ex7() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(100, 100);
        setTitle("Border layout for JFrame");

        BorderPanel myPanel = new BorderPanel();
        this.add(myPanel);
    }

    public static void main(String[] args) {
        Lab9Ex7 frame = new Lab9Ex7();
        frame.setVisible(true);
    }

}

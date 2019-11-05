package compsci4039.example;

import javax.swing.JFrame;

public class JustShowFrame extends JFrame {
    public JustShowFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(100, 100);
        setTitle("Just a JFrame");
    }


    public static void main(String[] args) {
        JustShowFrame frame = new JustShowFrame();
        frame.setVisible(true);
    }
}


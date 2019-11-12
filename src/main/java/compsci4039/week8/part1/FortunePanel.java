package compsci4039.week8.part1;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class FortunePanel extends JPanel {
    private JButton button1;
    private JLabel label;

    public FortunePanel() {
        this.setLayout(new BorderLayout());
        Border containerMargin = BorderFactory.createEmptyBorder(10,10,10,10);
        this.setBorder(containerMargin);
        button1 = new JButton("Tell me my fortune!");
        label = new JLabel("Click the button to find your fortune", SwingConstants.CENTER);
        this.add(button1, BorderLayout.CENTER);
        this.add(label, BorderLayout.SOUTH);
    }

    public void updateText(String s) {
        label.setText(s);
    }

    public void setButtonListener(ActionListener listener) {
        button1.addActionListener(listener);
    }

}

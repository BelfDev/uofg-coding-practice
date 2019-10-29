package compsci4039.week5.swing1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BorderPanel extends JPanel {

    public JPanel top;
    public JPanel right;
    public JPanel bottom;
    public JPanel left;
    public JPanel center;

    public BorderPanel() {
        this.setLayout(new BorderLayout());

        this.top = new JPanel();
        this.right = new JPanel();
        this.bottom = new JPanel();
        this.left = new JPanel();
        this.center = new JPanel();

        // Panel border setup
        Border blackLine = BorderFactory.createLineBorder(Color.black);
        top.setBorder(blackLine);
        left.setBorder(blackLine);
        bottom.setBorder(blackLine);
        center.setBorder(blackLine);
        right.setBorder(blackLine);

        // Panel layout setup
        left.setLayout(new GridBagLayout());
        center.setLayout(new GridBagLayout());
        right.setLayout(new GridBagLayout());

        // Label creation
        JLabel northLabel = new JLabel(BorderLayout.NORTH);
        JLabel westLabel = new JLabel("<html> &nbsp W &nbsp <br> &nbsp E " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
        JLabel eastLabel = new JLabel("<html> &nbsp E &nbsp <br> &nbsp A " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
        JLabel southLabel = new JLabel(BorderLayout.SOUTH);
        JLabel centerLabel = new JLabel(BorderLayout.CENTER);

        // Label font setup
        Font font = new Font("Time Roman", Font.PLAIN, 24);
        northLabel.setFont(font);
        westLabel.setFont(font);
        eastLabel.setFont(font);
        southLabel.setFont(font);
        centerLabel.setFont(font);

        // Label addition
        top.add(northLabel);
        right.add(eastLabel);
        left.add(westLabel);
        bottom.add(southLabel);
        center.add(centerLabel);

        // Panel addition
        this.add(top, BorderLayout.NORTH);
        this.add(right, BorderLayout.EAST);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(left, BorderLayout.WEST);
        this.add(center, BorderLayout.CENTER);
    }


}

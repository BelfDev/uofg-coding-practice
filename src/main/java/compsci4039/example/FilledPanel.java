package compsci4039.example;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FilledPanel extends JPanel {

    public FilledPanel(int nBorder, int wBorder, int sBorder, int eBorder, Color borderColor, Color fillColor) {
        this.setLayout(new BorderLayout());
        this.setBackground(borderColor);
        Border emptyBorder = BorderFactory.createEmptyBorder(nBorder, wBorder, sBorder, eBorder);

        this.setBorder(emptyBorder);
        JPanel innerPanel = new JPanel();
        innerPanel.setBackground(fillColor);
        this.add(innerPanel);
    }

}

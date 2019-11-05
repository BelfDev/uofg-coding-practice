package compsci4039.example;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FilledPanelWithLine extends JPanel {

    public FilledPanelWithLine(int nBorder, int wBorder, int sBorder, int eBorder, Color borderColor, Color fillColor) {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        this.setLayout(new BorderLayout());
        this.setBorder(blackline);

        // can't have more than one border, so need another panel for the inner border
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(borderColor);
        Border emptyBorder = BorderFactory.createEmptyBorder(nBorder, wBorder, sBorder, eBorder);
        mainPanel.setBorder(emptyBorder);
        JPanel innerPanel = new JPanel();
        innerPanel.setBackground(fillColor);
        mainPanel.add(innerPanel);
        // attach the new panel to the container
        this.add(mainPanel);
    }

}

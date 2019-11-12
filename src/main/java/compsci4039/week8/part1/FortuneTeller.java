package compsci4039.week8.part1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class FortuneTeller extends JFrame implements ActionListener {
    private FortunePanel mainPanel;

    private ArrayList<String> mFortunes = new ArrayList<>();

    public FortuneTeller() {
        setSize(300, 300);
        setLocation(20, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new FortunePanel();
        mainPanel.setButtonListener(this);
        add(mainPanel);

        populateFortunes();
    }

    public static void main(String[] args) {
        FortuneTeller gui = new FortuneTeller();
        gui.setVisible(true);
    }

    private void populateFortunes() {
        try {
            FileReader fr = new FileReader("src/main/resources/fortunes.txt");
            BufferedReader br = new BufferedReader(fr);
            String fortune;
            while ((fortune = br.readLine()) != null) {
                mFortunes.add(fortune);
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFortunes.size());
        String fortune = mFortunes.get(randomNumber);
        mainPanel.updateText(fortune);
    }
}

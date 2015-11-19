package Chapter_9_Interfaces_and_Polymorphism;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

/**
 * Solution to exercise P9.27
 *
 * @author ChrisBerryman
 */
public class P9_27 {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 80;
    private static final int STARTING_POPULATION = 2;
    private static int count = STARTING_POPULATION;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Roach population multiplier");
        JPanel panel = new JPanel();
        JButton button = new JButton("Increase roach population");
        JLabel label = new JLabel();
        label.setText("Current population: " + count);
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        class AddRoachListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                count += 2;
                label.setText("Current population: " + count);
            }

        }

        ActionListener listener = new AddRoachListener();
        button.addActionListener(listener);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

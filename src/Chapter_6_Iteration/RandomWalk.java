package Chapter_6_Iteration;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Solution to exercise P6.15
 *
 * @author ChrisBerryman
 */
public class RandomWalk {

    public static int countdown = 100;
    public static RandomWalkComponent component = new RandomWalkComponent();
    public static Timer t = new Timer(1000, new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            component.repaint();
            countdown--;
            if (countdown <= 0) {
                t.stop();
            }
        }
    });

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Random walk");
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 440);
        frame.setResizable(false);
        frame.setVisible(true);
        t.start();
    }
}

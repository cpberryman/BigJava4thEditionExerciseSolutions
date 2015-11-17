package Chapter_9_Interfaces_and_Polymorphism;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

/**
 * Solution to exercise P9.19, P9.20, P9.21, P9.22, P9.23 and P9.24
 *
 * @author ChrisBerryman
 */
public class ButtonViewer {

    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1, 2));
        JButton button = new JButton("A");
        JButton button2 = new JButton("B");
        frame.add(button);
        frame.add(button2);
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

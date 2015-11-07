package Chapter_5_Decisions;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * Solution to exercise P5.20
 *
 * @author ChrisBerryman
 */
public class CircleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(600, 600);
        frame.setTitle("Circle Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        

        String input1 = JOptionPane.showInputDialog("Enter the circle's X axis: ");
        double x = Double.parseDouble(input1);
        
        System.out.println(x);

        String input2 = JOptionPane.showInputDialog("Enter the circle's Y axis: ");
        double y = Double.parseDouble(input2);
        
        System.out.println(y);

        CircleComponent component = new CircleComponent(x, y);
        component.checkPosition();
        frame.add(component);

        frame.setVisible(true);
    }

}

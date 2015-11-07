package Chapter_5_Decisions;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Solution to exercise P5.20
 *
 * @author ChrisBerryman
 */
public class IntersectionTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(600, 600);
        frame.setTitle("Intersection Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        String input1 = JOptionPane.showInputDialog("Enter the first circle's radius: ");
        double x = Double.parseDouble(input1);
        
        System.out.println(x);

        String input2 = JOptionPane.showInputDialog("Enter the second circle's radius: ");
        double y = Double.parseDouble(input2);
        
        CircleComponent component = new CircleComponent(x , y);
        component.checkPosition();
        frame.add(component);

        frame.setVisible(true);
    }
    
}

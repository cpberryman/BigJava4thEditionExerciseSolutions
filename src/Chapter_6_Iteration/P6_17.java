package Chapter_6_Iteration;

import javax.swing.JFrame;

/**
 * Solution to exercise P6.17
 * 
 * @author ChrisBerryman
 */
public class P6_17 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        P6_17Component component = new P6_17Component();
        frame.setTitle("Checker Board");
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(175, 200);
        frame.setVisible(true);
    }
    
}

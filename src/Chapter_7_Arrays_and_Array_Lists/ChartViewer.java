package Chapter_7_Arrays_and_Array_Lists;

import javax.swing.JFrame;

/**
 * Solution to exercise P7.19
 *
 * @author ChrisBerryman
 */
public class ChartViewer {    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
    JFrame frame = new JFrame("Chart Viewer");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        Chart c = new Chart();
        c.add(130);
        c.add(100);
        c.add(120);
        c.add(80);
        c.add(70);
        c.add(110);
        c.add(120);        
        ChartComponent component = new ChartComponent(c);
        frame.add(component);
        frame.setVisible(true);              
    }
    
}

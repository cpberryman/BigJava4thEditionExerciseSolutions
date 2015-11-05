package Chapter_1_Introduction;

import javax.swing.JOptionPane;

/**
 * Answer to Big Java programming exercise P1.9
 *
 * @author ChrisBerryman
 */
public class P1_9 {
    
    /**
     * Displays an option pane and prints “Hello, name!” to the console.
     */
    public void showDialog() {        
        JOptionPane.showMessageDialog(null, "Hello, Chris!");
        System.exit(0);
    }
    
}

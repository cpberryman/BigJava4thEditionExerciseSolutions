/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_1_Introduction;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Answer to Big Java programming exercise P1.11
 *
 * @author ChrisBerryman
 */
public class P1_11 {

    public void displayGreetingImage() throws Exception {
        
        URL imageLocation = new URL(
                "http://www.gravatar.com/avatar/a1ab0af4997654345d7a949877f8037e?s=128&d=identicon&r=PG");
        
        JOptionPane.showMessageDialog(null, "Hello :)", "Hello World!",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        System.exit(0);
    }

}

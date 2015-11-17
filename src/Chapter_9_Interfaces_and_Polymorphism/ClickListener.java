package Chapter_9_Interfaces_and_Polymorphism;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
/**
 * Solution to exercise P9.19, P9.20, P9.21, P9.22, P9.23 and P9.24
 *
 * @author ChrisBerryman
 */
public class ClickListener implements ActionListener {

    int aClicks;
    int bClicks;
    GregorianCalendar c = new GregorianCalendar();

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("A")) {
            aClicks++;
            if (aClicks == 1) {
                System.out.println("Button " + event.getActionCommand() + " was clicked " + aClicks + " time at " + c.getTime());
            } else {
                System.out.println("Button " + event.getActionCommand() + " was clicked " + aClicks + " times at " + c.getTime());
            }
        } else {
            bClicks++;
            if (bClicks == 1) {
                System.out.println("Button " + event.getActionCommand() + " was clicked " + bClicks + " time at " + c.getTime());
            } else {
                System.out.println("Button " + event.getActionCommand() + " was clicked " + bClicks + " times at " + c.getTime());
            }
        }
    }

}

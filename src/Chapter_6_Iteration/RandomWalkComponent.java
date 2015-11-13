package Chapter_6_Iteration;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P6.15
 *
 * @author ChrisBerryman
 */
public class RandomWalkComponent extends JComponent {

    private final Grid grid = new Grid();
    private final Drunkard drunkard = new Drunkard();

    /**
     * Paints the component.
     *
     * @param g the graphics context.
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        grid.draw(g2);
        drunkard.move();
        drunkard.draw(g2);
    }

    /**
     * Returns the number of moves the dot has made.
     *
     * @return the number of moves.
     */
    public int getMoves() {
        return drunkard.getMoveCount();
    }
}

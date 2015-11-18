package Chapter_6_Iteration;

import java.awt.Graphics2D;

/**
 * Solution to exercise P6.19
 *
 * @author ChrisBerryman
 */
public class Spiral {

    private int x, y, toX, toY;
    private final int lines;
    private final static int RIGHT = 1;
    private final static int UP = 2;
    private final static int LEFT = 3;
    private final static int DOWN = 0;

    public Spiral(int startX, int startY, int lines) {
        x = startX;
        y = startY;
        this.lines = lines;
    }

    /**
     * Draws the spiral.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {
        int length = 0;
        int direction = 0;
        for (int i = 0; i < lines; i++) {
            if (i % 2 == 0) {
                length += 20;
            }
            direction = (direction + 1) % 4;
            if (direction == RIGHT) {
                if (i > 1) {
                    y = toY;
                }
                toX = x + length;
                toY = y;
                g2.drawLine(x, y, toX, toY);
            } else if (direction == UP) {
                x = toX;
                y = toY;
                toY = y - length;
                g2.drawLine(x, y, toX, toY);
            } else if (direction == LEFT) {
                x = toX;
                y = toY;
                toX = x - length;
                toY = y;
                g2.drawLine(x, y, toX, toY);
            } else if (direction == DOWN) {
                x = toX;
                y = toY;
                toX = x;
                toY = y + length;
                g2.drawLine(x, y, toX, toY);
            }
        }
    }

}

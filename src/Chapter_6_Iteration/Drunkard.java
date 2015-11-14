package Chapter_6_Iteration;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Solution to exercise P6.15
 *
 * @author ChrisBerryman
 */
public class Drunkard {

    private static final int MAX = 4;
    private static final int MIN = 1;
    private static final int START_X_POSITION = 206;
    private static final int START_Y_POSITION = 204;
    private int moveCount;
    private int currentXposition;
    private int currentYposition;

    /**
     * Returns the direction of the drunkard.
     *
     * @return the direction.
     */
    public int getDirection() {
        return MIN + (int) (Math.random() * ((MAX - MIN) + 1));
    }

    /**
     * Moves the dot up, right, left or down.
     */
    public void move() {
        if(moveCount == 0) {
            currentXposition = START_X_POSITION;
            currentYposition = START_Y_POSITION;
        }
        switch (getDirection()) {
            case 1:
                if(currentXposition + 20 >= 200){
                    currentXposition -= 20;
                } else {
                    currentXposition += 20;
                } 
                break;
            case 2:
                if(currentYposition + 20 >= 200) {
                    currentYposition -= 20;
                } else {
                    currentYposition += 20;
                }  
                break;
            case 3:
                if(currentXposition - 20 <= 0) {
                    currentXposition += 20;
                } else {
                    currentXposition -= 20;
                }
                break;
            case 4:
                if(currentYposition - 20 <= 0) {
                    currentYposition += 20;
                } else {
                   currentYposition -= 20; 
                }
                break;
        }
        moveCount++;
    }

    /**
     * Returns the number of times the dot has moved.
     *
     * @return the move count.
     */
    public int getMoveCount() {
        return moveCount;
    }

    /**
     * Draws the drunkard.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {       
        Ellipse2D.Double e = new Ellipse2D.Double(currentXposition, currentYposition, 10, 10);
        g2.setColor(Color.RED);
        g2.fill(e);
        g2.draw(e);
    }

}

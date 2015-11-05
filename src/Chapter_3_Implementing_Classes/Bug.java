package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.11
 *
 * Models a bug moving along a horizontal line. The bug moves
 * either to the right or left. The first move is to the right
 * 
 * @author ChrisBerryman
 */
public class Bug {

    private int position;
    boolean facingRight = true;
    boolean facingLeft;


    /**
     * Constructs a bug with a starting position
     * @param initialPosition the starting position
     */
    public Bug(int initialPosition) {
        this.position = initialPosition;

    }

    /**
     * Changes the direction of the bug
     */
    public void turn() {
        if (facingRight) {
            facingLeft = true;
            facingRight = false;
        } else {
            facingRight = true;
        }
    }

    /**
     * Changes the position of the bug by one unit
     */
    public void move() {
        if(facingRight) {
            position ++;
        } else {
            position --;
        }
    }

    /**
     * Returns the current position of the bug
     * @return the bug's position
     */
    public int getPosition() {
        return position;
    }
}

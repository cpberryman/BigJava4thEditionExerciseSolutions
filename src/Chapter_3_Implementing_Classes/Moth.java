package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.12
 *
 *  Models a flyig moth that flies along a straight line.
 * 
 * @author ChrisBerryman
 */
public class Moth {

    private double position;

    /**
     * Constructs a moth with a starting position
     * @param initialPosition the starting position
     */
    public Moth(double initialPosition) {
        this.position = initialPosition;
    }

    /**
     * Moves the moth along the straight line to the new light source
     * @param lightPosition the position of the new light source
     */
    public void moveToLight(double lightPosition) {
        if(lightPosition >= position) {
            position = (position + lightPosition) / 2;
        } else {
            position = (position - lightPosition) / 2; 
        }
    }

     /**
     * Returns the current position of the moth
     * @return the moth's position
     */
    public double getPosition() {
        return position;
    }

}

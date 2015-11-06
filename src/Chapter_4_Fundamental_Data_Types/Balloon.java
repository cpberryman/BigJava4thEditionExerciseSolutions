package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.10
 * 
 * A Balloon models a spherical balloon that is filled with are and computes
 * it's volume, surface area and radius.
 * 
 * @author ChrisBerryman
 */
public class Balloon {

    private double air;

    /**
     * Constructs an empty balloon with no air in it.
     */
    public Balloon() {
        air = 0;
    }

    /**
     * Adds the given amount of air to the balloon.
     *
     * @param amount the air to be added in cm cubed
     */
    void addAir(double amount) {
        air += amount;        
    }

    /**
     * Returns the current volume of the balloon.
     *
     * @return the volume
     */
    public double getVolume() {        
        return air;
    }

    /**
     * Returns the current surface area of the balloon.
     *
     * @return the surface area
     */
    public double getSurfaceArea() { 
        double surfaceArea = 4 * Math.PI * (getRadius() * getRadius());
        return surfaceArea;
    }

    /**
     * Returns the current radius of the balloon.
     *
     * @return the radius
     */
    public double getRadius() {        
        double volume = air;
        double radius = Math.pow(((volume / Math.PI) * (3.0 / 4.0)), (1.0 / 3.0));
        return radius;
    }

}

package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.9 
 * 
 * Computes the volume or surface area of a soda can.
 *
 * @author ChrisBerryman.
 */
public class SodaCan {

    private final double height;
    private final double diameter;

    /**
     * Constructs a soda can with a given height and diameter.
     *
     * @param height the height of the can
     * @param diameter the diameter of the can
     */
    public SodaCan(double height, double diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    /**
     * Returns the volume of the can.
     *
     * @return the volume
     */
    public double getVolume() {
        double radius = diameter / 2;
        return Math.PI * (radius * radius) * height;
    }

    /**
     * Returns the surface area of the can.
     *
     * @return the surface area
     */
    public double getSurfaceArea() {
        double radius = diameter / 2;
        return (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius));
    }

}

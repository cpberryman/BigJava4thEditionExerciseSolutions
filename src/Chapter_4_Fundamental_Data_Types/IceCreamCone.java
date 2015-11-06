package Chapter_4_Fundamental_Data_Types;

/*
 * Solution to exercise P4.5

 * Computes the surface area and volume of a given cone.

 * @author ChrisBerryman.
 */
public class IceCreamCone {

    private final double height;
    private final double radius;

    /**
     * Constructs an ice cream cone with a given height and radius.
     *
     * @param height the height of the cone
     * @param radius the width of the cone
     */
    public IceCreamCone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    /**
     * Returns the surface area of the cone.
     *
     * @return the surface area
     */
    public double getSurfaceArea() {
        double surfaceArea = Math.PI * radius * (Math.sqrt(height * height + radius * radius));
        return surfaceArea;
    }

    /**
     * Returns the volume of the cone.
     *
     * @return the volume
     */
    public double getVolume() {
        double volume = (1.0 / 3.0) * Math.PI * (radius * radius) * height;
        return volume;
    }

}

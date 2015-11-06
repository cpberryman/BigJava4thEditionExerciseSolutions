package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.7
 *
 * Converts a measurement in meters into miles, feet, and inches.
 *
 * @author ChrisBerryman
 */
public class Converter {

    private static final double MILES_PER_METRE = 0.00062137;
    private static final double FEET_PER_METRE = 3.2808399;
    private static final double INCHES_PER_METRE = 39.3700787;

    /**
     * Converts a given number of metres to miles
     *
     * @param metres the number of metres to convert to miles
     * @return the number of miles
     */
    public double getMiles(double metres) {
        return metres * MILES_PER_METRE;
    }

    /**
     * Converts a given number of metres to feet
     *
     * @param metres the number of metres to convert to feet.
     * @return the number of feet
     */
    public double getFeet(double metres) {
        return metres * FEET_PER_METRE;
    }

    /**
     * Converts a given number of metres to inches
     *
     * @param metres the number of metres to convert to inches
     * @return the number of inches
     */
    public double getInches(double metres) {
        return metres * INCHES_PER_METRE;
    }

}

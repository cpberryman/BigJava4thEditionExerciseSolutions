package Chapter_5_Decisions;

/**
 * Solution to exercise P5.17
 *
 * @author ChrisBerryman
 */
public class UnitConversion {

    private final String unit;

    public static final double INCHES_TO_METRES = 0.0254;
    public static final double FEET_TO_METRES = 0.000189;
    public static final double MILES_TO_METRES = 1609.344;

    public static final double INCHES_TO_FEET = 0.083333;
    public static final double INCHES_TO_MILLIMETERS = 0.039370;
    public static final double MILLIMETERS_TO_CENTIMETERS = 10;
    public static final double MILLIMETERS_TO_METRES = 1000;
    public static final double MILLIMETERS_TO_KILOMETRES = 1000000;
    public static final double CENTIMETERS_TO_METRES = 100;
    public static final double CENTIMETERS_TO_KILOMETRES = 100000;
    public static final double METERS_TO_KILOMETRES = 1000;
    public static final double FEET_TO_MILES = 0.00018939;
    public static final double INCHES_TO_MILES = 63360;
    public static final double FEET_TO_MILLIMETERS = 0.0032808;
    public static final double MILES_TO_MILLIMETERS = 1609344;
    public static final double MILLIMETERS_TO_MILES = 0.0000006214;

    /**
     * Constructs a unit conversion object
     *
     * @param unit the unit to convert to or from.
     */
    public UnitConversion(String unit) {
        this.unit = unit;
    }

    /**
     * Converts this unit conversions unit to metres.
     *
     * @param value the number of units to convert from.
     * @return the value of the conversion.
     */
    public double toMeters(double value) {
        double metres = 0;
        switch (unit) {
            case "in":
                metres = value * INCHES_TO_METRES;
                break;
            case "ft":
                metres = value * FEET_TO_METRES;
                break;
            case "mi":
                metres = value * MILES_TO_METRES;
                break;
        }
        return metres;
    }

    /**
     * Converts this unit conversions unit from metres.
     *
     * @param metres the number of metres to convert from.
     * @return the value of the conversion.
     */
    public double fromMeters(double metres) {
        double result = 0;
        switch (unit) {
            case "mm":
                result = metres * 1000;
                break;
            case "cm":
                result = metres * 100;
                break;
            case "m":
                result = metres;
                break;
            case "km":
                result = metres /1000;
                break;
        }
        return result;
    }
}

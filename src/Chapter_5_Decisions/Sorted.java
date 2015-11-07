package Chapter_5_Decisions;

/**
 * Solution to exercise 5.3
 * 
 *  A sorted prints floating-point numbers entered as input in a sorted order.
 * 
 * @author ChrisBerryman
 */
public class Sorted {

    private final double valueOne, valueTwo, valueThree;

    /**
     * Constructs a sorted with three given values.
     *
     * @param valueOne the first value entered
     * @param valueTwo the second value entered
     * @param valueThree the third value entered
     */
    public Sorted(double valueOne, double valueTwo, double valueThree) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.valueThree = valueThree;
    }

    /**
     * Returns a string with the values in order.
     *
     * @return the ordered values
     */
    public String sort() {
        String s = "The inputs in sorted order are: \n";
        if (valueOne > valueTwo && valueTwo > valueThree) {
            s += valueThree
                    + "\n"
                    + valueTwo
                    + "\n"
                    + valueOne;
        } else if (valueOne > valueTwo && valueTwo < valueThree) {
            if (valueOne < valueThree) {
                 s += valueTwo
                    + "\n"
                    + valueOne
                    + "\n"
                    + valueThree;
            } else {
                 s += valueTwo
                    + "\n"
                    + valueThree
                    + "\n"
                    + valueOne;
            }           
        } else if (valueOne < valueTwo && valueTwo < valueThree) {
            s += valueOne
                    + "\n"
                    + valueTwo
                    + "\n"
                    + valueThree;
        } else if (valueThree > valueTwo && valueTwo > valueOne) {
            s += valueThree
                    + "\n"
                    + valueTwo
                    + "\n"
                    + valueOne;
        } else if (valueOne < valueTwo && valueTwo > valueThree) {
            if (valueOne < valueThree) {
                s += valueOne
                        + "\n"
                        + valueThree
                        + "\n"
                        + valueTwo;
            } else {
                s += valueThree
                        + "\n"
                        + valueOne
                        + "\n"
                        + valueTwo;
            }
        } else {
            s = "Error";
        }
        return s;
    }

}

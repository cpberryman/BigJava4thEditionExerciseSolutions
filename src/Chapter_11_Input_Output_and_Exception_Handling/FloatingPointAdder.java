package Chapter_11_Input_Output_and_Exception_Handling;

/**
 * This class calculates the total of a set of floating point numbers and
 * returns the total sum.
 *
 * @author ChrisBerryman
 */
public class FloatingPointAdder {

    private int total;

    /**
     * Adds a value to the total.
     * @param value the number to add.
     */
    public void addValue(double value) {
        total += value;
    }

    /**
     * Returns the total sum.
     * @return the total.
     */
    public double getTotal() {
        return total;
    }
}

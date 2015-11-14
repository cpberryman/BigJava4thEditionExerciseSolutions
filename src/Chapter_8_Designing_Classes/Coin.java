package Chapter_8_Designing_Classes;

/**
 * Solution to exercise P8.1
 *
 * @author ChrisBerryman
 */
public class Coin implements Comparable {

    private String name;
    private double value;

    /**
     * Constructs a coin with a given name and value.
     *
     * @param name the coin's name
     * @param value the coin's value
     */
    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Returns the name of the coin.
     *
     * @return the coin's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the value of the coin.
     *
     * @return the coin's value
     */
    public double getValue() {
        return value;
    }

    /**
     * Compares this coin with another
     *
     * @param anObject the coin to be compared
     * @return a negative integer, zero, or a positive integer if this coin is
     * less than, equal to, or greater than, other
     */
    @Override
    public int compareTo(Object anObject) {
        Coin coin = (Coin) anObject;
        if (this.value > coin.value) {
            return 1;
        } else if (this.value == coin.value) {
            return 0;
        } else {
           return -1;
        }
    }

}

package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.6
 * Computes the sum, average, largest and smallest of a sequence of integers
 * @author ChrisBerryman
 */
public class DataSet {

    private int sum;
    private int count;
    private int largest = Integer.MIN_VALUE;
    private int smallest = Integer.MAX_VALUE;
    

    /**
     * Adds an integer to the sequence.
     *
     * @param x an integer
     */
    public void addValue(int x) {
        largest = Math.max(x, largest);
        smallest = Math.min(x, smallest);
        sum += x;
        count ++;
    }

    /**
     * Returns the sum of the sequence.
     *
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * Returns the average of the sequence.
     *
     * @return the average
     */
    public double getAverage() {
        return sum / count;
    }

    /**
     * Returns the largest value in the sequence
     * @return the largest value
     */
    public int getLargest() {        
        return largest;        
    }

    /**
     * Returns the smallest value in the sequence
     * @return the smallest value
     */
    public int getSmallest() {        
        return smallest;        
    }
    
}

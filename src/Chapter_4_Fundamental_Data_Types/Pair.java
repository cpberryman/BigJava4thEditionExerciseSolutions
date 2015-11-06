package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.4
 *
 * Computes the sum, difference, product, average, distance, maximum or minimum
 * of a given pair.
 * 
 * @author ChrisBerryman.
 */
public class Pair {

    double firstValue;
    double secondValue;
    
    /**
     * Constructs a pair.
     *
     * @param aFirst the first value of the pair
     * @param aSecond the second value of the pair
     */
    public Pair(double aFirst, double aSecond) {        
        this.firstValue = aFirst;
        this.secondValue = aSecond;
    }

    /**
     * Computes the sum of the values of this pair.
     *
     * @return the sum of the first and second values
     */
    public double getSum() {        
        return firstValue + secondValue;
    }
    
     /**
     * Computes the difference between the values of this pair.
     *
     * @return the difference between the first and second values
     */
    public double getDifference() {        
        double differrence;
        
        if (firstValue > secondValue) {
            differrence = firstValue - secondValue;
        } else if (secondValue > firstValue) {
            differrence = secondValue - firstValue;
        } else {
            differrence = 0;
        }        
        return differrence;        
    }
    
    /**
     * Computes the product of the values of this pair.
     *
     * @return the product of the first and second values
     */
    public double getProduct() {        
        return firstValue * secondValue;        
    }
    
     /**
     * Computes the average of the values of this pair.
     *
     * @return the average of the first and second values
     */
    public double getAverage() {        
        return (firstValue + secondValue) / 2;        
    }
    
     /**
     * Computes the distance between the values of this pair.
     *
     * @return the distance between the first and second values
     */
    public double getDistance() {        
        return Math.abs(this.getDifference());        
    }
    
     /**
     * Computes the maximum value of this pair.
     *
     * @return the maximum of the first and second values
     */
    public double getMaximum() {        
        return Math.max(firstValue, secondValue);        
    }
    
     /**
     * Computes the minimum value of this pair.
     *
     * @return the minimum of the first and second values
     */
    public double getMinimum() {        
        return Math.min(firstValue, secondValue);        
    }

}

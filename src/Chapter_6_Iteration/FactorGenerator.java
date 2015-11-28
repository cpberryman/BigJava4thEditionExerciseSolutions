package Chapter_6_Iteration;

/**
 * Solution to exercise P6.8
 *
 * @author ChrisBerryman
 */
public class FactorGenerator {

    private int numberToFactor;
    private int factor = 2;

    /**
     * Constructs a FactorPrinter
     *
     * @param numberToFactor the number to factor
     */
    FactorGenerator(int numberToFactor) {
        this.numberToFactor = numberToFactor;
    }

    /**
     * Returns the next factor
     *
     * @return the next factor in the series.
     */
    public int nextFactor() {
        if(numberToFactor % factor == 0) {
            numberToFactor = numberToFactor / factor;
        } else {
            while(!(numberToFactor % factor == 0)) {
                factor ++;                
            }
            numberToFactor = numberToFactor / factor;
        }                
        return factor;
    }

    /**
     * Denotes whether there are more factors in the series.
     *
     * @return true if there are more factors, false otherwise.
     */
    public boolean hasMoreFactors() {
        return numberToFactor > 1;
    }

}

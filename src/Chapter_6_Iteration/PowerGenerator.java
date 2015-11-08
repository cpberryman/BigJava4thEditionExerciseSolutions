package Chapter_6_Iteration;

/**
 * Solution to exercise P6.5

 * @author ChrisBerryman
 */
public class PowerGenerator {

    private double factor;
    private double iteration;

    /**
     * Constructs a power generator.
     *
     * @param aFactor the number that will be multiplied by itself
     */
    public PowerGenerator(double aFactor) {
        this.factor = aFactor;
        iteration = 0;
    }

    /**
     * Computes the next power.
     *
     * @return the next power.
     */
    public double nextPower() {
        double temp = 1;
        for (int i = 0; i < iteration; i++) {
            temp = temp * factor;
        }
        iteration++;
        return temp;
    }
}

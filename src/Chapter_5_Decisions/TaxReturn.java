package Chapter_5_Decisions;

/**
 * Solution to exercise P5.7
 *
 * A tax return of a taxpayer in 2008.
 */
public class TaxReturn {

    public static final int SINGLE = 1;
    public static final int MARRIED = 2;

    private static final double RATE1 = 0.10;
    private static final double RATE2 = 0.25;
    private static final double RATE1_SINGLE_LIMIT = 32000;
    private static final double RATE1_MARRIED_LIMIT = 64000;

    private final double income;
    private final int status;

    /**
     * Constructs a TaxReturn object for a given income and marital status.
     *
     * @param anIncome the taxpayer income
     * @param aStatus either SINGLE or MARRIED
     */
    public TaxReturn(double anIncome, int aStatus) {
        this.income = anIncome;
        this.status = aStatus;
    }

    /**
     * Computes tax based on marital status, income and limit.
     * 
     * Solution to exercise P5.7
     *
     * @return the tax.
     */
    public double getTax() {
        double tax = 0;
        double rate1Limit;

        if (status == SINGLE) {
            rate1Limit = RATE1_SINGLE_LIMIT;
        } else {
            rate1Limit = RATE1_MARRIED_LIMIT;            
        }
        if (income <= rate1Limit) {
                tax = RATE1 * income;
            } else {
                tax = ((RATE1 * rate1Limit) + (RATE2 * (income - rate1Limit)));
            }        
        return tax;
    }
}

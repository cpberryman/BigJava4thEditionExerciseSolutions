package Chapter_5_Decisions;

/**
 * Solution to exercise P5.8
 * 
 * A tax return calculates the percentage of tax due based on a given income
 * according to the rules of U.S. income tax in 1913.
 *
 * @author ChrisBerryman
 */
public class TaxReturn1913 {

    private final double income;

    public static final double FIRST_BRACKET_AMOUNT = 50000;
    public static final double SECOND_BRACKET_AMOUNT = 75000;
    public static final double THIRD_BRACKET_AMOUNT = 100000;
    public static final double FORTH_BRACKET_AMOUNT = 250000;
    public static final double FIFTH_BRACKET_AMOUNT = 500000;

    public static final double BELOW_BRACKET_PERCENTAGE = 1;
    public static final double FIRST_BRACKET_PERCENTAGE = 2;
    public static final double SECOND_BRACKET_PERCENTAGE = 3;
    public static final double THIRD_BRACKET_PERCENTAGE = 4;
    public static final double FORTH_BRACKET_PERCENTAGE = 5;
    public static final double FIFTH_BRACKET_PERCENTAGE = 6;

    public static final double FIRST_BRACKET_FULL_TAX = (BELOW_BRACKET_PERCENTAGE / 100) * FIRST_BRACKET_AMOUNT;
    public static final double SECOND_BRACKET_FULL_TAX = (FIRST_BRACKET_PERCENTAGE / 100) * (SECOND_BRACKET_AMOUNT - FIRST_BRACKET_AMOUNT);
    public static final double THIRD_BRACKET_FULL_TAX = (SECOND_BRACKET_PERCENTAGE / 100) * (THIRD_BRACKET_AMOUNT - SECOND_BRACKET_AMOUNT);
    public static final double FORTH_BRACKET_FULL_TAX = (THIRD_BRACKET_PERCENTAGE / 100) * (FORTH_BRACKET_AMOUNT - THIRD_BRACKET_AMOUNT);
    public static final double FIFTH_BRACKET_FULL_TAX = (FORTH_BRACKET_PERCENTAGE / 100) * (FIFTH_BRACKET_AMOUNT - FORTH_BRACKET_AMOUNT);

    /**
     * Constructs a tax return object with a given income.
     *
     * @param income the taxpayer income
     */
    public TaxReturn1913(double income) {
        this.income = income;
    }

    /**
     * Returns the amount of tax due based on the brackets in 1913.
     *
     * @return the tax due for this tax return.
     */
    public double getTax() {
        double secondAmountTax = 0;
        double thirdAmountTax = 0;
        double forthAmountTax = 0;
        double fifthAmountTax = 0;
        double sixthAmountTax = 0;
        double tax = 0;

        if (income < FIRST_BRACKET_AMOUNT) {
            tax += (BELOW_BRACKET_PERCENTAGE / 100) * income;
        } else if (income < SECOND_BRACKET_AMOUNT) {
            double remainingAmountTax = income - FIRST_BRACKET_AMOUNT;
            secondAmountTax += (FIRST_BRACKET_PERCENTAGE / 100) * remainingAmountTax;
            tax += FIRST_BRACKET_FULL_TAX + secondAmountTax;
        } else if (income < THIRD_BRACKET_AMOUNT) {
            double remainingAmountTax = income - SECOND_BRACKET_AMOUNT;
            thirdAmountTax += (SECOND_BRACKET_PERCENTAGE / 100) * remainingAmountTax;
            tax += FIRST_BRACKET_FULL_TAX + SECOND_BRACKET_FULL_TAX + thirdAmountTax;
        } else if (income < FORTH_BRACKET_AMOUNT) {
            double remainingAmountTax = income - THIRD_BRACKET_AMOUNT;
            forthAmountTax += (THIRD_BRACKET_PERCENTAGE / 100) * remainingAmountTax;
            tax += FIRST_BRACKET_FULL_TAX + SECOND_BRACKET_FULL_TAX + THIRD_BRACKET_FULL_TAX + forthAmountTax;
        } else if (income < FIFTH_BRACKET_AMOUNT) {
            double remainingAmountTax = income - FORTH_BRACKET_AMOUNT;
            fifthAmountTax += (FORTH_BRACKET_PERCENTAGE / 100) * remainingAmountTax;
            tax += FIRST_BRACKET_FULL_TAX + SECOND_BRACKET_FULL_TAX + THIRD_BRACKET_FULL_TAX + FORTH_BRACKET_FULL_TAX + fifthAmountTax;
        } else {
            double remainingAmountTax = (income - FIFTH_BRACKET_AMOUNT);
            sixthAmountTax += (FIFTH_BRACKET_PERCENTAGE / 100) * remainingAmountTax;
            tax += FIRST_BRACKET_FULL_TAX + SECOND_BRACKET_FULL_TAX + THIRD_BRACKET_FULL_TAX + FORTH_BRACKET_FULL_TAX + FIFTH_BRACKET_FULL_TAX + sixthAmountTax;
        }
        return tax;
    }

}

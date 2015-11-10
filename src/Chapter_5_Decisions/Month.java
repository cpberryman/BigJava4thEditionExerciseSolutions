package Chapter_5_Decisions;

/**
 * Solution to exercise P5.13
 *
 * @author ChrisBerryman
 */
public class Month {

    /**
     * Returns the number of days in a given month .
     *
     * @param month the month as an integer.
     * @return the number of days in the month.
     */
    public int getDays(int month) {

        int days = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 28;
        }
        return days;
    }

}

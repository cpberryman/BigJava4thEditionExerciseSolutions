package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.18 
 * 
 * Displays a month's name based on it's number.
 *
 * @author ChrisBerryman
 */
public class Month {

    private final int monthNumber;
    private final String months = "January   February  March     April     May"
            + "       June      "
            + "July      August    September October   November  December  ";

    /**
     * Constructs a month.
     *
     * @param monthNumber the number of the month assuming January is equal to 1
     */
    public Month(int monthNumber) {
        this.monthNumber = monthNumber - 1;
    }

    /**
     * Returns the name of a month.
     *
     * @return the name of the month as a string
     */
    public String getName() {
        return months.substring(monthNumber * 10, monthNumber * 10 + 10);
    }

}

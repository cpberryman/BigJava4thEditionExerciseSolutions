package Chapter_5_Decisions;

/** 
 * Solution to exercise P5.12
 *
 * A year determines whether a given year is a leap year based on the rules
 * of the Gregorian calendar.
 * 
 * @author ChrisBerryman
 */
public class Year {
    
    private final int year;
    
    /**
     * Constructs a year object from a given value.
     * @param year the year to be tested
     */
    public Year(int year) {        
        this.year = year;        
    }
    /**
     * Tests a year to determine if it is a leap year or not.
     * @return true if year is a leap year false otherwise 
     */
    public boolean isLeapYear() {        
        return year % 400 == 0;         
    }
    
}

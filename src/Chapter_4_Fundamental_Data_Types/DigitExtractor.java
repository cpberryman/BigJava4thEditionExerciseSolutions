package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.13
 * 
 * A digit extractor reads an integer of less than or equal to five digits, 
 * breaks it into a sequence of individual digits so it can be displayed in 
 * reverse order.
 * 
 * @author ChrisBerryman
 */
public class DigitExtractor {

    private int theInteger;
    
    /**
     * Constructs a digit extractor that gets the digits of an integer in
     * reverse order.
     *
     * @param anInteger the integer to break up into digits
     */
    public DigitExtractor(int anInteger) {        
        this.theInteger = anInteger;        
    }

    /**
     * Returns the next digit to be extracted.
     *
     * @return the next digit
     */
    public int nextDigit() {        
        int digit = theInteger % 10;
        theInteger = theInteger / 10;
        return digit;        
    }
}

package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.13
 *
 * @author ChrisBerryman
 */
public class DigitPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DigitExtractor extractor = new DigitExtractor(16384);
        System.out.println(extractor.nextDigit());
        System.out.println("Expected: 4");
        System.out.println(extractor.nextDigit());
        System.out.println("Expected: 8");
        System.out.println(extractor.nextDigit());
        System.out.println("Expected: 3");
        System.out.println(extractor.nextDigit());
        System.out.println("Expected: 6");
        System.out.println(extractor.nextDigit());
        System.out.println("Expected: 1");
    }

}

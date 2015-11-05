package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.10
 *
 * @author ChrisBerryman
 */
public class LetterPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Letter l = new Letter("Test1", "Test2");
        l.addLine("I am sorry we must part.");
        l.addLine("I wish you all the best.");
        String letter = l.getText();
        System.out.println(letter);
    }

}

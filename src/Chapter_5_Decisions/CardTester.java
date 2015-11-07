package Chapter_5_Decisions;

/**
 * Solution to exercise 5.2
 * 
 * @author ChrisBerryman
 */
public class CardTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card c = new Card("9s");
        System.out.println(c.getDescription());
        System.out.println("Expected: Nine of Spades");
    }
    
}

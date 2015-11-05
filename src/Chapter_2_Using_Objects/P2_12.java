package Chapter_2_Using_Objects;

/**
 * ReplaceTester for exercise P2.12
 *
 * @author ChrisBerryman
 */
public class P2_12 {

    /**
     * Replaces letters "i" as "!" and "s" as "$" in the string "Mississippi".
     */
    public void replaceLetters() {        
        String m = "Mississippi";
        m = m.replace("i", "!");
        m = m.replace("s", "$");
        System.out.println("Expected result: M!$$!$$!pp!");
        System.out.println("Actual result: " + m);        
    }

}

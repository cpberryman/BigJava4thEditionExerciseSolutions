package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.8
 *
 * @author ChrisBerryman.
 */
public class SquareTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(s.getArea());
        System.out.println("Expected: 25");
        
        System.out.println(s.getPerimeter());
        System.out.println("Expected: 20");
        
        System.out.println(s.getDiagonal());
        System.out.println("Expected: 3.16");
    }
    
}

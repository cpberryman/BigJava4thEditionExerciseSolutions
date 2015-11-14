package Chapter_7_Arrays_and_Array_Lists;

/**
 * Solution to exercise P7.7
 *
 * @author ChrisBerryman
 */
public class P7_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        AlternatingSum sum  =  new AlternatingSum(numbers);
        System.out.println("" + sum.getSum());        
    }
}

package Chapter_6_Iteration;

import java.util.Scanner;

/**
 * Solution to exercise P6.1
 *
 * @author ChrisBerryman
 */
public class P6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter temperatures: ");
        double highestValue = in.nextDouble();
        int highestMonth = 1;
        for (int currentMonth = 2; currentMonth <= 12; currentMonth++) {
            double nextValue = in.nextDouble();
            if (nextValue > highestValue) {
                highestValue = nextValue;
                highestMonth = currentMonth;
            }
        }
        System.out.println("Month with highest temperature: " + highestMonth);
    }

}

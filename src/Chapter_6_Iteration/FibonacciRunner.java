package Chapter_6_Iteration;

import java.util.Scanner;

/**
 * Solution to exercise 6.6
 *
 * @author ChrisBerryman
 */
public class FibonacciRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        FibonacciGenerator fg = new FibonacciGenerator();

        for (int i = 1; i <= n; i++) {
            System.out.println(fg.nextNumber());
        }
    }
}

package Chapter_6_Iteration;

import java.util.Scanner;

/**
 * Solution to exercise 6.7
 *
 * @author ChrisBerryman
 */
public class DataSetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSet set = new DataSet();
        boolean done = false;
        while (!done) {
            System.out.println("Enter a data value, q to quit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("q")) {
                done = true;
            } else {
                double value = Double.parseDouble(input);
                set.addValue(value);
            }
        }
        System.out.println("Value count: " + set.getValueCount());
        System.out.println("Mean: " + set.getMean());
        System.out.println("Standard deviation: " + set.getStandardDeviation());
    }
}

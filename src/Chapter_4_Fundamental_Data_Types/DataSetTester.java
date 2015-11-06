package Chapter_4_Fundamental_Data_Types;

import java.util.Scanner;

/**
 * Solution to exercise P4.6
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

        System.out.println("Enter a value: ");
        int firstValue = in.nextInt();
        set.addValue(firstValue);

        System.out.println("Enter a value: ");
        int secondValue = in.nextInt();
        set.addValue(secondValue);

        System.out.println("Enter a value: ");
        int thirdValue = in.nextInt();
        set.addValue(thirdValue);

        System.out.println("Enter a value: ");
        int forthValue = in.nextInt();
        set.addValue(forthValue);

        System.out.println("Sum: " + set.getSum());
        System.out.println("Average: " + set.getAverage());

        System.out.println("Largest: " + set.getLargest());
        System.out.println("Smallest: " + set.getSmallest());

    }

}

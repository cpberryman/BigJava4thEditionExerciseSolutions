package Chapter_4_Fundamental_Data_Types;

import java.util.Scanner;

/**
 * Solution to exercise P4.15
 *
 * @author ChrisBerryman
 */
public class TimeIntervalTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int first = in.nextInt();
        System.out.println();
        System.out.print("Please enter the second time: ");
        int second = in.nextInt();

        TimeInterval interval = new TimeInterval(first, second);
        System.out.print("Differrence: " + interval.getHours() + " hours "
                + interval.getMinutes() + " minutes");
    }

}

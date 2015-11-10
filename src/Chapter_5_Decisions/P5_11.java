package Chapter_5_Decisions;

import java.util.Scanner;

/**
 * Solution to exercise P5.11
 *
 * @author ChrisBerryman
 */
public class P5_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter month and day: ");

        int month = in.nextInt();
        int day = in.nextInt();

        String season = "";

        if (month == 1 || month == 2 || month == 3) {
            season += "Winter";
        } else if (month == 4 || month == 5 || month == 6) {
            season += "Spring";
        } else if (month == 7 || month == 8 || month == 9) {
            season += "Summer";
        } else if (month == 10 || month == 11 || month == 12) {
            season += "Fall";
        }

        if (month % 3 == 0 && day >= 21) {
            if (season.equalsIgnoreCase("Winter")) {
                season = "Spring";
            } else if (season.equalsIgnoreCase("Spring")) {
                season = "Summer";
            } else if (season.equalsIgnoreCase("Summer")) {
                season = "Fall";
            } else {
                season = "Winter";
            }
        }
        System.out.println("The season is " + season);
    }

}

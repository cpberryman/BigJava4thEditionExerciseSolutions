package Chapter_6_Iteration;

import java.util.Scanner;

/**
 * Solution to exercise P6.2
 *
 * @author ChrisBerryman
 */
public class P6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        String secondNumberConcat = "";
        String total = "";
        System.out.println("Please enter your eight digit credit card number: ");
        String creditCardNo = in.nextLine();
        int checkDigit = Character.getNumericValue(creditCardNo.charAt(creditCardNo.length() - 1));
        int[] firstNumbers = new int[4];
        firstNumbers[3] = Character.getNumericValue(checkDigit);
        //System.out.println(firstNumbers[3]);

        for (int i = creditCardNo.length() - 1; i > 0; i -= 2) {
            char c = creditCardNo.charAt(i);
            if (!Character.isDigit(c)) {
                c = creditCardNo.charAt(i - 1);
                i--;
                //System.out.println(i - 1);
                firstNumbers[i - 1] = Character.getNumericValue(c);
            }
            int number = Character.getNumericValue(c);
            sum1 += number;
            if (i < creditCardNo.length() - 1) {
                //System.out.println(i/2);
                firstNumbers[i / 2] = Character.getNumericValue(c);
            }

            //firstNumbers[]
            char c2 = creditCardNo.charAt(i - 1);
            int secondNumber = Character.getNumericValue(c2);
            int secondNumberDoubled = secondNumber * 2;
            secondNumberConcat += secondNumberDoubled;
        }

        for (int i = 0; i < secondNumberConcat.length(); i++) {
            char c = secondNumberConcat.charAt(i);
            int number = Character.getNumericValue(c);
            sum2 += number;
        }
//System.out.println(sum2);
        total += (sum1 + sum2);
        if (Character.getNumericValue(total.charAt(total.length() - 1)) == 0) {
            System.out.println("Card is valid.");
        } else {
            int sum = Integer.parseInt(total) % 10;
            if (sum > checkDigit) {
                checkDigit = (sum - checkDigit);
            } else {
                checkDigit -= sum;
            }
            System.out.println("Card is not valid: ");
            System.out.println("the check digit: " + checkDigit + " would make it valid.");
        }
    }

}

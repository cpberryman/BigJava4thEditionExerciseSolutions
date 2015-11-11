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
        
        //Computes sum starting with right most digit.
        for (int i = creditCardNo.length() - 1; i > 0; i -= 2) {
            char c = creditCardNo.charAt(i);
            //decrements index by one if the character is a space etc.
            if (!Character.isDigit(c)) {
                c = creditCardNo.charAt(i - 1);
                i--;
            }
            sum1 += Character.getNumericValue(c);
            char c2 = creditCardNo.charAt(i - 1);
            secondNumberConcat += Character.getNumericValue(c2) * 2;
        }
        //Computes sum for digits not included in previous step.
        for (int i = 0; i < secondNumberConcat.length(); i++) {
            sum2 += Character.getNumericValue(secondNumberConcat.charAt(i));
        }
        //adds the sums of the preceeding steps
        total += (sum1 + sum2);
        
        //prints whther the credit card is valid or not to the console.
        //if it is not valid the correct check digit is also printed.
        if (Character.getNumericValue(total.charAt(total.length() - 1)) == 0) {
            System.out.println("Card is valid.");
        } else {
            if (Integer.parseInt(total) % 10 != 0) {
                checkDigit = ((Integer.parseInt(creditCardNo) - Integer.parseInt(total) + 10) % 10);
            }
            System.out.println("Card is not valid: ");
            System.out.println("the check digit: " + checkDigit + " would make it valid.");
        }
    }

}

package Chapter_11_Input_Output_and_Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Solution to exercise P11.14
 * 
 * @author ChrisBerryman
 */
public class P11_14 {

    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FloatingPointAdder adder = new FloatingPointAdder();
        boolean done = false;
        while (!done) {
            try {
                System.out.println("Please enter a number, space bar to quit:");
                String value = in.readLine();
                if (value.equalsIgnoreCase(" ")) {
                    done = true;
                } else {
                    double number = Double.parseDouble(value);
                    adder.addValue(number);
                }
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a number: " + exception.getMessage() + "\n");
            } catch (IOException exception) {
                System.out.println(Arrays.toString(exception.getStackTrace()));
            }
        }
        System.out.println("Total: " + adder.getTotal());
    }
}



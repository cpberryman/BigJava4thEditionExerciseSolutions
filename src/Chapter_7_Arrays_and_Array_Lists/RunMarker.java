package Chapter_7_Arrays_and_Array_Lists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Solution to exercise P7.9
 * 
 * A run marker simulates twenty random die tosses in order to establish if
 * there are any sequences of runs.
 *
 *
 * @author ChrisBerryman
 */
public class RunMarker {
    
    /**
     * Returns an ArrayList with a sequence of random numbers between
     * one and six.
     *
     * @return the ArrayList with twenty elements containing random
     * integers between one and six
     */
    public ArrayList nextSequence() {
        ArrayList<Integer> sequence = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 20; i++) {
            int diceRoll = generator.nextInt(6) + 1;
            sequence.add(diceRoll);
        }
        return sequence;
    }

    /**
     * Returns the sequence of numbers with runs delimited by brackets i.e. ().
     *
     * @return a String with the sequence of numbers with runs delimited
     * by brackets
     */
    public String delimitRuns() {
        String s = "";
        boolean inRun = false;
        ArrayList<Integer> sequence = nextSequence();
        int previous = sequence.get(0);

        for (int i = 0; i < sequence.size() - 1; i++) {
            if (inRun) {
                if (!sequence.get(i).equals(previous)) {
                    s += ")";
                    inRun = false;
                }
            } else {
                if (sequence.get(i).equals(sequence.get(i + 1))) {
                    s += "(";
                    inRun = true;
                }
            }
            previous = sequence.get(i);
            s += sequence.get(i) + " ";
        }
        if (inRun && sequence.get(sequence.size() - 1).equals(previous)) {
            s += sequence.get(sequence.size() - 1) + ")";
        } else if (inRun && !sequence.get(sequence.size() - 1).equals(previous)) {
            s += ") " + sequence.get(sequence.size() - 1);
        } else {
            s += sequence.get(sequence.size() - 1);
        }
        return s;
    }

}

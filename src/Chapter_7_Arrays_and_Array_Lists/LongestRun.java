package Chapter_7_Arrays_and_Array_Lists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Solution to exercise P7.10
 *
 * A run marker simulates twenty random die tosses in order to establish if
 * there are any sequences of runs.
 *
 *
 * @author ChrisBerryman
 */
public class LongestRun {

    /**
     * Returns an ArrayList with a sequence of random numbers between one and
     * six.
     *
     * @return the ArrayList with twenty elements containing random integers
     * between one and six
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
     *
     * @return
     */
    public String getLongestRun() {
        boolean inRun = false;
        ArrayList<Integer> sequence = nextSequence();
        int previous = sequence.get(0), currentRun = 0,
                currentRunStartIndex = 0, maxRun = 0, maxRunStartIndex = 0;

        for (int i = 0; i < sequence.size() - 1; i++) {
            if (inRun) {
                if (!sequence.get(i).equals(previous)) {
                    inRun = false;
                    if (currentRun > maxRun) {
                        maxRun = currentRun;
                        maxRunStartIndex = currentRunStartIndex;
                    }
                    currentRun = 0;
                } else {
                    currentRun++;
                }
            } else {
                if (sequence.get(i).equals(sequence.get(i + 1))) {
                    currentRunStartIndex = i;
                    currentRun++;
                    inRun = true;
                }
            }
            previous = sequence.get(i);
        }
        if (inRun && sequence.get(sequence.size() - 1).equals(previous)) {
            currentRun += 1;
        }
        if (currentRun > maxRun) {
            maxRun = currentRun;
            maxRunStartIndex = currentRunStartIndex;
        }
        return delimitLongestRun(sequence, maxRunStartIndex, maxRun);
    }

    /**
     *
     * @param sequence
     * @param startIndex
     * @param runLength
     * @return
     */
    public String delimitLongestRun(ArrayList sequence, int startIndex, int runLength) {
        String s = "";
        if (startIndex == 0 && runLength >= 2) {
            s += "(";
        }
        for (int i = 0; i < sequence.size(); i++) {
            s += sequence.get(i) + " ";
            if ((i + 1) == startIndex) {
                s += "(";
            }
            if (i == ((startIndex + runLength) - 1)) {
                s += ")";
            }
        }
        return s;
    }

}

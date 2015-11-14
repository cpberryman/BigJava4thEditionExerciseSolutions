package Chapter_7_Arrays_and_Array_Lists;

import java.util.Arrays;
import java.util.Random;

/**
  * Solution to exercise P7.8
  *
  * Produces random permutations of the numbers 1 to 10.
  *
  * @author ChrisBerryman
  */
public class PermutationGenerator {

    int[] oneToTen;

    /**
     * Constructs a permutation generator object with an array containing the
     * values required to form random permutations.
     */
    public PermutationGenerator() {
        this.oneToTen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    /**
     * Returns an array containing the numbers 1 to 10 in a random order.
     *
     * @return an array with a random permutation of the numbers 1 to 10.
     */
    public int[] nextPermutation() {
        Random numberGenerator = new Random();
        int[] permutationArray = new int[10];
        int permutationArraySize = 0;
        int oneToTenSize = oneToTen.length - 1; //9
        int elementToRemove;
        int iteration = 1;
        int oneToTenStartLength = 10;

        while (permutationArraySize < permutationArray.length) {
            int randomElement = numberGenerator.nextInt(10) + 1;
            for (int i = 0; i <= oneToTenSize; i++) {
                if (oneToTen[i] == randomElement) {
                    elementToRemove = oneToTen[i];
                    for (int j = i; j < oneToTenSize; j++) {
                        oneToTen[j] = oneToTen[j + 1];
                    }
                    oneToTenSize--;
                    int[] temp = new int[oneToTenStartLength - iteration];

                    for (int k = 0; k <= temp.length - 1; k++) {
                        temp[k] = oneToTen[k];
                    }

                    oneToTen = temp;
                    for (int n = 0; n < iteration; n++) {
                        if (permutationArray[n] == 0)
                            permutationArray[n] = elementToRemove;
                    }
                    iteration++;
                    permutationArraySize++;
                }
            }
        }
        return permutationArray;
    }

    @Override
    public String toString() {
        String s = "";
        return s + Arrays.toString(nextPermutation());
    }

}

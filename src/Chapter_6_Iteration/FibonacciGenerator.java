package Chapter_6_Iteration;

/**
  * Solution to exercise 6.6
  *
  * Simulates the first n terms in the Fibonacci sequence
  *
  * @author ChrisBerryman
  */
public class FibonacciGenerator {

    int fold1 = 1;
    int fold2 = 1;
    int fnew = 0;
    int n = 1;

    /**
     * Computes the next number in the sequence.
     *
     * @return the next number
     */
    public int nextNumber() {
        if (n <= 2) {
            fnew = fold1;
        } else {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
        }
        n++;
        return fnew;
    }
}

package Chapter_7_Arrays_and_Array_Lists;

/**
 * Solution to exercise P7.7
 *
 * @author ChrisBerryman
 */
public class AlternatingSum {

    private int[] numbers;

    public AlternatingSum(int... numbers) {
        this.numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = numbers[i];
        }
    }

    public int getSum() {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < numbers.length - 1; i += 2) {
            sum += numbers[i] - (numbers[i + 1]);
        }

        if (numbers.length % 2 != 0) {
            total = sum + numbers[numbers.length - 1];
        } else {
            total = sum;
        }
        return total;
    }

}

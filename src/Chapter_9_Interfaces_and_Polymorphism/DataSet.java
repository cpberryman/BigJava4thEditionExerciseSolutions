package Chapter_9_Interfaces_and_Polymorphism;

public class DataSet {

    private double sum;
    private Measurable maximum;
    private Measurable minimum;
    private int count;
    private Comparable maximumComparable;
    private Comparable minimumComparable;

    public void addComparable(Comparable c) {
        if (count == 0 || maximumComparable.compareTo(c) > 0 || maximumComparable.compareTo(c) < 0) {
            maximumComparable = c;
        }
        if (count == 0 || minimumComparable.compareTo(c) > 0) {
            minimumComparable = c;
        }
        count++;
    }

    public void add(Measurable x) {
        sum = sum + x.getMeasure();
        if (count == 0 || maximum.getMeasure() < x.getMeasure()) {
            maximum = x;
        }
        if (count == 0 || minimum.getMeasure() > x.getMeasure()) {
            minimum = x;
        }
        count++;
    }

    public Measurable getMaximum() {
        return maximum;
    }

    public Measurable getMinimum() {
        return minimum;
    }

    public Comparable getMaximumComparable() {
        return maximumComparable;
    }

    public Comparable getMinimumComparable() {
        return minimumComparable;
    }

    public double getAverage() {
        return sum / count;
    }

}

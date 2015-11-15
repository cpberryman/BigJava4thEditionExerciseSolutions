package Chapter_9_Interfaces_and_Polymorphism;

/**
 * Describes any class that returns it's measure or description. *
 */
public interface Measurable {

    /**
     * Returns the measure of an object of the type measurable
     *
     * @return the objects's measure
     */
    double getMeasure();

    /**
     * Returns the description of an object of the type measurable
     *
     * @return the objects's description
     */
    String getDescription();

}

package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.13
 *
 * Simulates the growth of a roach population.
 * 
 * @author ChrisBerryman
 */
public class RoachPopulation {

    private int population;
    /**
     * Constructs a roach population with an initial population.
     * @param initialPopulation
     */
    public RoachPopulation(int initialPopulation) {
        this.population = initialPopulation;
    }

    /**
     * Simulates a period when the roaches breed, which doubles
     * their population.
     */
    public void breed() {
        population += population;
    }

    /**
     * Simulates spraying insecticide which reduces population by 10%.
     */
    public void spray () {
        int reduction = population / 10;
        population -= reduction;
    }

    /**
     * Gets the current roach population.
     * @return the current roach population
     */
    public int getRoaches () {
        return population;
    }

}

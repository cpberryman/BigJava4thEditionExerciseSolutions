package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.7
 *
 *  Simulates the fuel consumption of a given car based on distance and mpg
 * 
 * @author ChrisBerryman
 */
public class Car {
    
    private final double mpg;
    private double gas;
    private double distanceTravelled;
    
    /**
     * Constructs a car with a given mpg with no fuel in it
     * @param mpg the miles per gallon of the car
     */
    public Car(double mpg) {       
        this.mpg = mpg;        
    }
    
    /**
     * Adds petrol to the fuel tank
     * @param gasAmount the amount of petrol to be added
     */
    public void addGas(double gasAmount) {        
        gas += gasAmount;        
    }
    
    /**
     * Drives the car a distance in miles
     * @param miles the distance to travel
     */
    public void drive(double miles) {        
        distanceTravelled += miles;        
    }
    
    /**
     * Returns the amount of gas remaining in the fuel tank
     * @return the amount of gas left in the fuel tank
     */
    public double getGasInTank() {        
        double fuelUsed = distanceTravelled / mpg;
        return gas - fuelUsed;        
    }
    
}

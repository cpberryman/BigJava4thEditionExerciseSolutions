package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.6.
 * 
 * An employee stores an employee's name and salary and raises an employee's 
 * salary by a percentage.
 * 
 * @author ChrisBerryman
 */
public class Employee {
    
    private String employeeName;
    private double currentSalary;

    /**
     * Constructs an employee with their name and salary
     *
     * @param employeeName the employee's name
     * @param currentSalary the employee's salary
     */
    public Employee(String employeeName, double currentSalary) {        
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }

    /**
     * Returns the name of an employee
     *
     * @return then name of an employee
     */
    public String getName() {        
        return employeeName;
    }
    
    /**
     * Returns an employee's salary
     * @return the employee's salary
     */
    public double getSalary() {        
        return currentSalary;
    }

    
    /**
     * Raises an employee's salary by a percentage
     * @param byPercent the percentage to raise the 
     * employee's salary by
     */
    public void raiseSalary(double byPercent) {        
        double increase = currentSalary * byPercent / 100;
        currentSalary += increase;
    }
    
}

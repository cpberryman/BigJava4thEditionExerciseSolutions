package Chapter_5_Decisions;

/**
 * Solution to exercise P5.16
 *
 * @author ChrisBerryman
 */
public class PayCheck {

    /**
     * Computes the weekly pay for a given amount of hours.
     *
     * @param hourlyRate the hourly rate of the employee.
     * @param hours the hours worked.
     * @return the total pay for the week based on the hourly rate and hours
     * worked.
     */
    public double getWeeklyPay(double hourlyRate, double hours) {
        
        double weeksPay = 0;
        if (hours > 40) {
            double extraHours = hours - 40;
            double overTimePay = extraHours * ((hourlyRate / 2) + hourlyRate);
            weeksPay = 40 * hourlyRate + overTimePay;
        } else {
            weeksPay = hours * hourlyRate;
        }
        return weeksPay;
    }

}

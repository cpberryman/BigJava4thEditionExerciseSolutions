package Chapter_3_Implementing_Classes;

/**
 * EmployeeTester for exercise P3.6.
 *
 * @author ChrisBerryman
 */
public class EmployeeTester {

    /**
     * Tests the results for exercise P3.6.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee harry = new Employee("Hacker, Harry", 50000);
        String name = harry.getName();
        System.out.println("Name: " + name);
        System.out.println("Expected: Hacker, Harry");
        double salary = harry.getSalary();
        System.out.println("Salary: " + salary);
        System.out.println("Expected: 50000");
        harry.raiseSalary(10);
        System.out.println("Raised salary: " + harry.getSalary());
        System.out.println("Expected: 55000.0");
    }

}

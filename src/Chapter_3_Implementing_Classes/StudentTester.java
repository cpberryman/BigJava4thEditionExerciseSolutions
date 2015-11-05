package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.8
 *
 * @author ChrisBerryman
 */
public class StudentTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student("Test");
        s.addQuiz(75);
        s.addQuiz(100);
        s.addQuiz(50);

        String name = s.getName();
        System.out.println(name);
        System.out.println("Expected: Test");

        int total = s.getTotalScore();
        System.out.println(total);
        System.out.println("Expected: 225");

        double average = s.getAverageScore();
        System.out.println(average);
        System.out.println("Expected: 75.0");
    }

}

package Chapter_5_Decisions;

import java.util.Scanner;
/**
 * Solution to exercise 5.4 and 5.5
 * 
 * @author ChrisBerryman
 */
public class GradeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grade g = new Grade();        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String grade = in.next();
        System.out.println(g.getNumericGrade(grade));
        
        System.out.println("Enter a numeric grade: ");
        double numericGrade = in.nextDouble();
        System.out.println(g.getLetterGrade(numericGrade));
        
                
    }
    
}

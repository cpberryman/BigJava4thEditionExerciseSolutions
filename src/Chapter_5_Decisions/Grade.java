package Chapter_5_Decisions;

/**
 * Solution to exercise 5.4 and 5.5
 *
 *  A grade provides a numeric value for a given grade.
 *
 * @author ChrisBerryman
 */
public class Grade {

    /**
     * Returns a grade as a numeric value.
     * @param grade the grade as a letter with possible plus or minus symbol
     * @return the numeric representation of the grade
     */
    public String getNumericGrade(String grade) {
        String s = "Numeric Value: ";
        if (grade.equalsIgnoreCase("A")) {
            s += "4";
        } else if (grade.equalsIgnoreCase("A+")) {
            s += "4.3";
        } else if (grade.equalsIgnoreCase("A-")) {
            s += "3.7";
        } else if (grade.equalsIgnoreCase("B")) {
            s += "3";
        } else if (grade.equalsIgnoreCase("B+")) {
            s += "3.3";
        } else if (grade.equalsIgnoreCase("B-")) {
            s += "2.7";
        } else if (grade.equalsIgnoreCase("C")) {
            s += "2";
        } else if (grade.equalsIgnoreCase("C+")) {
            s += "2.3";
        } else if (grade.equalsIgnoreCase("C-")) {
            s += "1.7";
        } else if (grade.equalsIgnoreCase("D")) {
            s += "1";
        } else if (grade.equalsIgnoreCase("D+")) {
            s += "1.3";
        } else if (grade.equalsIgnoreCase("D-")) {
            s += "0.7";
        } else if (grade.equalsIgnoreCase("F")) {
            s += "0";
        } else {
            s += "Wrong input";
        }
        return s;
    }

    /**
     * Returns a numeric value as a letter grade.
     * @param grade the grade as a number
     * @return the letter grade
     */
    public String getLetterGrade(double grade) {
        String s = "";
        if (grade >= 4.15) {
            s += "A+";
        } else if(grade >= 3.85) {
            s += "A";
        } else if(grade >= 3.8) {
            s += "A-";
        } else if(grade >= 3.15) {
            s += "B+";
        } else if(grade >= 2.85) {
            s += "B";
        } else if(grade >= 2.8) {
            s += "B-";
        } else if(grade >= 2.15) {
            s += "C+";
        } else if(grade >= 1.85) {
            s += "C";
        } else if(grade >= 1.8) {
            s += "C-";
        } else if(grade >= 1.15) {
            s += "D+";
        } else if(grade >= 0.85) {
            s += "D";
        } else if(grade >= 0.5) {
            s += "D-";
        } else if(grade >= 0) {
            s += "F";
        }
        return s;
    }

}

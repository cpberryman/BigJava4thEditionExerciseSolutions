package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.8
 *
 * Keeps track of a student's quiz scores, their total quiz score and their
 * average quiz score.
 *
 * @author ChrisBerryman
 */
public class Student {

    private final String name;
    private int totalScore;
    private int numberOfQuizzes;

    /**
     * Constructs a student and stores their name
     *
     * @param name the name of the student
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Returns the student's name
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a quiz score
     *
     * @param score the quiz score
     */
    public void addQuiz(int score) {
        totalScore += score;
        numberOfQuizzes++;
    }

    /**
     * Returns the total score of all quizzes
     *
     * @return the total score
     */
    public int getTotalScore() {
        return totalScore;
    }

    /**
     * Returns the average score of all quizzes
     *
     * @return the average score
     */
    public double getAverageScore() {
        return totalScore / numberOfQuizzes;
    }

}

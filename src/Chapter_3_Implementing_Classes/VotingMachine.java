package Chapter_3_Implementing_Classes;

import java.util.GregorianCalendar;

/**
 * Solution to exercise P3.14
 *
 * Simulates voting for two political parties and displaying the results
 * of an election.
 * 
 * @author ChrisBerryman
 */
public class VotingMachine {

    private int democratVote;
    private int republicanVote;

    /**
     * Adds a vote for the Democrats.
     */
    public void voteDemocrat() {
        democratVote++;
    }

    /**
     * Adds a vote for the Republicans.
     */
    public void voteRepublican() {
        republicanVote++;
    }

    /**
     * Resets the tallies for both parties to zero.
     */
    public void clearMachine() {
        democratVote = 0;
        republicanVote = 0;
    }

    /**
     * Returns the results of the election. If the votes are counted
     * after 8 P.M. on the first Tuesday in November, the Democrats win.
     *
     * @return the result of the election
     */
    public String getResults() {

        GregorianCalendar c = new GregorianCalendar(2014, 10, 4);
        GregorianCalendar c2 = new GregorianCalendar();
        String s = "";
        if (c2.after(c)) {
            s = s + "The results are: \n \nDemocrats: "
                    + democratVote
                    + "\n"
                    + "Republicans: "
                    + republicanVote
                    + "\n"
                    + "The Democrats won as votes were counted after "
                    + "8 P.M. on the first Tuesday in November.";
        } else {
            if (democratVote > republicanVote) {
                s = s + "The Democrats won!\n"
                        + "The results are: \n \nDemocrats: "
                        + democratVote
                        + "\n"
                        + "Republicans: "
                        + republicanVote;
            } else {
                s = s + "The Republicans won!\n"
                        + "The results are: \n \nDemocrats: "
                        + democratVote
                        + "\n"
                        + "Republicans: "
                        + republicanVote;
            }
        }

        return s;

    }

}

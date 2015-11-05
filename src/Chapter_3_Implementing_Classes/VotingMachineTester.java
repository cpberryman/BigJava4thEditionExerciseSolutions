package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.14
 *
 * @author ChrisBerryman
 */
public class VotingMachineTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VotingMachine m = new VotingMachine();
        m.voteDemocrat();
        m.voteRepublican();
        m.voteRepublican();
        System.out.println(m.getResults());
    }

}

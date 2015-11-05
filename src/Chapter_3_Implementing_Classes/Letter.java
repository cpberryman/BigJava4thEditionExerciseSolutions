package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.10
 *
 *  Authors a simple letter.
 * 
 * @author ChrisBerryman
 */
public class Letter {

    final private String sender;
    final private String recipient;
    private String body;

    /**
     * Constructs a letter with the sender and the recipient
     *
     * @param from the sender
     * @param to the recipient
     */
    public Letter(String from, String to) {
        this.body = "";
        this.sender = from;
        this.recipient = to;
    }

    /**
     * Adds a line to the body of the letter
     *
     * @param line the line to add
     */
    public void addLine(String line) {
        body = body.concat(line).concat("\n");
    }

    /**
     * Returns the entire text of the letter
     *
     * @return the letter
     */
    public String getText() {
        String letter = "";
        letter = letter.concat("Dear " + recipient).concat("\n").concat("\n").concat(body)
                .concat("\n").concat("\n").concat("Sincerely," + "\n" + "\n" + sender);
        return letter;
    }

}

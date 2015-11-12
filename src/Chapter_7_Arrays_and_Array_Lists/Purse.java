
package purserunner;

import java.util.ArrayList;

/**
 * Solution to exercise P7.1, P7.2, P7.3, P7.4, P7.5
 *
 * A purse object stores a collection of coin names.
 *
 * @author ChrisBerryman
 */
public class Purse {

    private ArrayList<String> coins;

    /**
     * Constructs a purse object initialised with a zero length array list.
     */
    public Purse() {

        coins = new ArrayList<>();

    }

    /**
     * Adds a coin to the purse.
     *
     * @param coinName the coin name to be appended to the array list
     */
    public void addCoin(String coinName) {

        coins.add(coinName);

    }

    /**
     * Reverses the sequence of coins in a purse.
     */
    public void reverse() {

        ArrayList<String> temp = new ArrayList<>();
        int j = 0;
        for (int i = coins.size() - 1; i >= 0; i--) {

            String coin = coins.get(i);
            temp.add(j, coin);

            j++;
        }
        coins = temp;
    }

    /**
     * Transfers the contents of one purse object into another.
     *
     * @param other the purse object from which to transfer
     */
    public void transfer(Purse other) {

        for (String coin : other.coins) {
            this.addCoin(coin);
        }

    }

    /**
     * Returns a boolean value based on whether the contents of this purse
     * object are the same and in the same order as a given other.
     *
     * @param other the purse object to compare
     * @return true if the contents are the same and in the same order, false
     * otherwise
     */
    public boolean sameContents(Purse other) {

        int matches = 0;
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).equals(other.coins.get(i))) {
                matches++;
            }
        }
        return matches == coins.size();
    }

    /**
     * Returns a boolean value based on whether the contents of this purse
     * object are the same as a given other regardless of order.
     *
     * @param other the purse object to compare
     * @return true if the contents are the same regardless of order, false
     * otherwise
     */
    public boolean sameCoins(Purse other) {

      ArrayList<String> temp = new ArrayList<>(coins);
      ArrayList<String> tempOther = new ArrayList<>(other.coins);

        if (temp.size() != tempOther.size()) {
            return false;
        }

         for (String coin : temp) {
            tempOther.remove(coin);
            System.out.println("Coins: " + coin);
            System.out.println("tempOther: " + tempOther);
        }

        /*for (int i = 0; i < temp.size(); i++) {
            String coin = temp.get(i);
            tempOther.remove(coin);
        }*/

        return tempOther.isEmpty();

    }

    /**
     * Checks all elements in the coins array of this object for a match with a
     * given coin.
     *
     * @param coin the coin to search for
     * @return the number of matches
     */
    public int find(String coin) {

        int matches = 0;
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).equals(coin)) {
                matches++;
            }
        }
        return matches;
    }

    /**
     * Returns the coins added to the purse as a string.
     *
     * @return the array list of coins as a string
     */
    @Override
    public String toString() {

        String s = "Purse";

        return s + coins.toString();

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5_Decisions;

/**
 * Solution to exercise 5.2
 * 
 * A card provides a description of a playing card based on a set of notations.
 *
 * @author ChrisBerryman
 */
public class Card {

    private String notation;

    /**
     * Constructs a card with a given notation.
     *
     * @param notation the cards description represented in notation
     */
    public Card(String notation) {
        this.notation = notation;
    }

    /**
     * Returns the full description of the card.
     *
     * @return the description
     */
    public String getDescription() {
        String s = "";
        if(notation.equalsIgnoreCase("AD")) {            
            s += "Ace of Diamonds";
        } else if (notation.equalsIgnoreCase("AH")) {
            s += "Ace of Hearts";
        } else if (notation.equalsIgnoreCase("AS")) {
            s += "Ace of Spades";
        } else if (notation.equalsIgnoreCase("AC")) {
            s += "Ace of Clubs";
        } else if (notation.equalsIgnoreCase("JD")) {
            s += "Jack of Diamonds";
        } else if (notation.equalsIgnoreCase("JH")) {
            s += "Jack of Hearts";
        } else if (notation.equalsIgnoreCase("JS")) {
            s += "Jack of Spades";
        } else if (notation.equalsIgnoreCase("JC")) { 
            s += "Jack of Clubs";
        } else if (notation.equalsIgnoreCase("QD")) {
            s += "Queen of Diamonds";
        } else if (notation.equalsIgnoreCase("QH")) {
            s += "Queen of Hearts";
        } else if (notation.equalsIgnoreCase("QS")) {
            s += "Queen of Spades";
        } else if (notation.equalsIgnoreCase("QC")) {
            s += "Queen of Clubs";
        } else if (notation.equalsIgnoreCase("KD")) {
            s += "King of Diamonds";
        } else if (notation.equalsIgnoreCase("KH")) {
            s += "King of Hearts";
        } else if (notation.equalsIgnoreCase("KS")) {
            s += "King of Spades";
        } else if (notation.equalsIgnoreCase("KC")) {
            s += "King of Clubs";
        } else if (notation.equalsIgnoreCase("2D")) {
            s += "Two of Diamonds";
        } else if (notation.equalsIgnoreCase("2H")) {
            s += "Two of Hearts";
        } else if (notation.equalsIgnoreCase("2S")) {
            s += "Two of Spades";
        } else if (notation.equalsIgnoreCase("2C")) {
            s += "Two of Clubs";
        } else if (notation.equalsIgnoreCase("3D")) {
            s += "Three of Diamonds";
        } else if (notation.equalsIgnoreCase("3H")) {
            s += "Three of Hearts";
        } else if (notation.equalsIgnoreCase("3S")) {
            s += "Three of Spades";
        } else if (notation.equalsIgnoreCase("3C")) {
            s += "Three of Clubs";
        } else if (notation.equalsIgnoreCase("4D")) {
            s += "Four of Diamonds";
        } else if (notation.equalsIgnoreCase("4H")) {
            s += "Four of Hearts";
        } else if (notation.equalsIgnoreCase("4S")) {
            s += "Four of Spades";
        } else if (notation.equalsIgnoreCase("4C")) {
            s += "Four of Clubs";
        } else if (notation.equalsIgnoreCase("5D")) {
            s += "Five of Diamonds";
        } else if (notation.equalsIgnoreCase("5H")) {
            s += "Five of Hearts";
        } else if (notation.equalsIgnoreCase("5S")) {
            s += "Five of Spades";
        } else if (notation.equalsIgnoreCase("5C")) {
            s += "Five of Clubs";
        } else if (notation.equalsIgnoreCase("6D")) {
            s += "Six of Diamonds";
        } else if (notation.equalsIgnoreCase("6H")) {
            s += "six of Hearts";
        } else if (notation.equalsIgnoreCase("6S")) {
            s += "Six of Spades";
        } else if (notation.equalsIgnoreCase("6C")) {
            s += "Six of Clubs";
        } else if (notation.equalsIgnoreCase("7D")) {
            s += "Seven of Diamonds";
        } else if (notation.equalsIgnoreCase("7H")) {
            s += "Seven of Hearts";
        } else if (notation.equalsIgnoreCase("7S")) {
            s += "Seven of Spades";
        } else if (notation.equalsIgnoreCase("7C")) {
            s += "Seven of Clubs";
        } else if (notation.equalsIgnoreCase("8D")) {
            s += "Eight of Diamonds";
        } else if (notation.equalsIgnoreCase("8H")) {
            s += "Eight of Hearts";
        } else if (notation.equalsIgnoreCase("8S")) {
            s += "Eight of Spades";
        } else if (notation.equalsIgnoreCase("8C")) {
            s += "Eight of Clubs";
        } else if (notation.equalsIgnoreCase("9D")) {
            s += "Nine of Diamonds";
        } else if (notation.equalsIgnoreCase("9H")) {
            s += "Nine of Hearts";
        } else if (notation.equalsIgnoreCase("9S")) {
            s += "Nine of Spades";
        } else if (notation.equalsIgnoreCase("9C")) {
            s += "Nine of Clubs";
        } else if (notation.equalsIgnoreCase("10D")) {
            s += "Ten of Diamonds";
        } else if (notation.equalsIgnoreCase("10H")) {
            s += "Ten of Hearts";
        } else if (notation.equalsIgnoreCase("10S")) {
            s += "Ten of Spades";
        } else if (notation.equalsIgnoreCase("10C")) {
            s += "Ten of Clubs";
        } else {
            s += "Unknown";
        }        
        return s;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;
    
    public Card (String s, int v){
        suit = s;
        value = v;
        
        if (s.equals("Hearts") || s.equals("Spades") || s.equals ("Clubs") || s.equals("Diamonds"))
            System.out.println ("The suit parameter is valid");
        else
            System.out.println ("The suit parameter is not valid");
        
        if (v >= 1 && v <= 13)
            System.out.println ("The card value is valid");
        else 
            System.out.println ("The card value is not valid");
        
        System.out.println ("hello this is for commit2");
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}

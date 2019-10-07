/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colin
 */
public class Card {

    int cardValue;
    int cardSuit;
    String values[] = {" ","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    char suits[]    = {' ', '\u2666', '\u2663','\u2665', '\u2660'};   // {' ', '♦', '♣','♥', '♠'}
    boolean isFaceUp;
    
    public Card(int value, int suit) { // 1-13, 1-4
        
        cardValue = value;
        cardSuit = suit;
       
    }
    
    public int getValue() {
        return cardValue;
    }
    public int getSuit() {
        return cardSuit;
    }
    public void setValue(int i) {
        cardValue = i;
    }
    public void setSuit(int i) {
        cardSuit = i;
    }
    public boolean isFaceUp() {
        return isFaceUp;
    }
    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }
    public boolean isRed() {
        if (getSuit() == 1 || getSuit() == 3) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        if (isFaceUp() == false) {
            return "[XX]";
        } else {
            return "[" + values[getValue()] + suits[getSuit()] + "]";
        }
    }
}

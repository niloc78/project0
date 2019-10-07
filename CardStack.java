
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colin
 */
public class CardStack extends Stack {
   
    Stack<Card> cardStack = new Stack();
    char type; // types s, t, f, w
    
    public CardStack(char stackType) {
        type = stackType;
    }
    
    public char getType() {
        return type;
    }
    public void push(Card newCard) {
        if (getType() == 'f') {
            if (this.isEmpty() == true && newCard.getValue() == 1) { // is ace
                cardStack.push(newCard);
            } else if (this.isEmpty() == false && (cardStack.peek().getSuit() == newCard.getSuit()) && (cardStack.peek().getValue() == newCard.getValue() - 1)) { // matches suit and rank is one more
                cardStack.push(newCard);
            } else {
                System.out.print("This move is not allowed");
            }
        } else {
            cardStack.push(newCard);
        }
    }
    public Card peek() {
        return cardStack.peek();
    }
    public Card pop() {
        return cardStack.pop();
    }
    public boolean isEmpty() {
        if (cardStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int size() {
        return cardStack.size();
    }
    public void printStack(char type) {
        if (type == 's') {
            if (cardStack.isEmpty() == false) {
                System.out.print(cardStack.peek().toString() + " " + cardStack.size()); // the deck used for drawing.
            } else {
                System.out.print("[  ]" + cardStack.size());
            }
        } else if (type == 'w') {
            if (cardStack.isEmpty() == false) {
                cardStack.peek().setFaceUp(true);
                System.out.print("W1 " + cardStack.peek().toString()); 
            } else {
                System.out.print("W1 [  ]");
            }
        } else if (type == 'f') {
            if (cardStack.isEmpty() == false) {
                cardStack.peek().setFaceUp(true);
                System.out.print(cardStack.peek().toString()); 
            } else {
                System.out.print("[FF]");
            }
        } else if (type == 't') {
            if (cardStack.isEmpty() == false) {
                cardStack.peek().setFaceUp(true);
                for (int i = 0; i < cardStack.size(); i++) {
                    System.out.print(cardStack.get(i).toString());
                }
            } else {
                
            }
        }
    }
}

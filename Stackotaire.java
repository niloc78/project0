
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colin
 */
public class Stackotaire {
  static ArrayList<Card> deck = new ArrayList(); // 52 cards
  static CardStack[] tableauStacks = new CardStack[8];// there are seven
  static CardStack T1 = new CardStack('t');
  static CardStack T2 = new CardStack('t');
  static CardStack T3 = new CardStack('t');
  static CardStack T4 = new CardStack('t');
  static CardStack T5 = new CardStack('t');
  static CardStack T6 = new CardStack('t');
  static CardStack T7 = new CardStack('t');
  static CardStack[] foundationStacks = new CardStack[5]; // there are four
  static CardStack F1 = new CardStack('f');
  static CardStack F2 = new CardStack('f');
  static CardStack F3 = new CardStack('f');
  static CardStack F4 = new CardStack('f');
  static CardStack stockStack = new CardStack('s');
  static CardStack wasteStack = new CardStack('w');
  
   public static void main(String[] args) {
   int k = 0;
       initialize();
       while (k == 0) {
       displayGameBoard();
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a command: ");
       String token1 = input.next();
       
       
       if (token1.equalsIgnoreCase("draw")) {
           if (!stockStack.isEmpty()) {
            wasteStack.push(stockStack.pop());
            wasteStack.peek().setFaceUp(true);
           } else if (stockStack.isEmpty() && !wasteStack.isEmpty()) {
               while (!wasteStack.isEmpty()) {
                   stockStack.push(wasteStack.pop());
                   stockStack.peek().setFaceUp(false);
               }
               wasteStack.push(stockStack.pop());
               wasteStack.peek().setFaceUp(true);
               
           } else if (stockStack.isEmpty() && wasteStack.isEmpty()) {
               System.out.println("No more cards in the stock");
           }
       } else if (token1.equalsIgnoreCase("move")) {
           String token2 = input.next();
           String token3 = input.next();
           if (token2.equalsIgnoreCase("W1")) { // T1-T7 and F1-F4
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty()) {
                       if (wasteStack.peek().getValue() == 13) {
                            T1.push(wasteStack.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if ((T1.peek().getValue() == wasteStack.peek().getValue() + 1) && T1.peek().isRed() != wasteStack.peek().isRed()) {
                       T1.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty()) {
                       if (wasteStack.peek().getValue() == 13) {
                            T2.push(wasteStack.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if ((T2.peek().getValue() == wasteStack.peek().getValue() + 1) && T2.peek().isRed() != wasteStack.peek().isRed()) {
                       T2.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty()) {
                       if (wasteStack.peek().getValue() == 13) {
                            T3.push(wasteStack.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if ((T3.peek().getValue() == wasteStack.peek().getValue() + 1) && T3.peek().isRed() != wasteStack.peek().isRed()) {
                       T3.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty()) {
                       if (wasteStack.peek().getValue() == 13) {
                            T4.push(wasteStack.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if ((T4.peek().getValue() == wasteStack.peek().getValue() + 1) && T4.peek().isRed() != wasteStack.peek().isRed()) {
                       T4.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty()) {
                       if (wasteStack.peek().getValue() == 13) {
                            T5.push(wasteStack.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if ((T5.peek().getValue() == wasteStack.peek().getValue() + 1) && T5.peek().isRed() != wasteStack.peek().isRed()) {
                       T5.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty()) {
                       if (wasteStack.peek().getValue() == 13) {
                            T6.push(wasteStack.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if ((T6.peek().getValue() == wasteStack.peek().getValue() + 1) && T6.peek().isRed() != wasteStack.peek().isRed()) {
                       T6.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty()) {
                       if (wasteStack.peek().getValue() == 13) {
                            T7.push(wasteStack.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if ((T7.peek().getValue() == wasteStack.peek().getValue() + 1) && T7.peek().isRed() != wasteStack.peek().isRed()) {
                       T7.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && wasteStack.peek().getValue() == 1) {
                       F1.push(wasteStack.pop());
                   } else if (!F1.isEmpty() && (F1.peek().getSuit() == wasteStack.peek().getSuit()) && (F1.peek().getValue() == wasteStack.peek().getValue() - 1)) {
                       F1.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && wasteStack.peek().getValue() == 1) {
                       F2.push(wasteStack.pop());
                   } else if (!F2.isEmpty() && (F2.peek().getSuit() == wasteStack.peek().getSuit()) && (F2.peek().getValue() == wasteStack.peek().getValue() - 1)) {
                       F2.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && wasteStack.peek().getValue() == 1) {
                       F3.push(wasteStack.pop());
                   } else if (!F3.isEmpty() && (F3.peek().getSuit() == wasteStack.peek().getSuit()) && (F3.peek().getValue() == wasteStack.peek().getValue() - 1)) {
                       F3.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && wasteStack.peek().getValue() == 1) {
                       F4.push(wasteStack.pop());
                   } else if (!F4.isEmpty() && (F4.peek().getSuit() == wasteStack.peek().getSuit()) && (F4.peek().getValue() == wasteStack.peek().getValue() - 1)) {
                       F4.push(wasteStack.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
               
           } else if (token2.equalsIgnoreCase("F1")) { // T1-T7
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty()) {
                       if (F1.peek().getValue() == 13) {
                            T1.push(F1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F1.isEmpty() && (T1.peek().getValue() == F1.peek().getValue() + 1) && (T1.peek().isRed() != F1.peek().isRed())) {
                       T1.push(F1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty()) {
                       if (F1.peek().getValue() == 13) {
                            T2.push(F1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F1.isEmpty() && (T2.peek().getValue() == F1.peek().getValue() + 1) && (T2.peek().isRed() != F1.peek().isRed())) {
                       T2.push(F1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty()) {
                       if (F1.peek().getValue() == 13) {
                            T3.push(F1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F1.isEmpty() && (T3.peek().getValue() == F1.peek().getValue() + 1) && (T3.peek().isRed() != F1.peek().isRed())) {
                       T3.push(F1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty()) {
                       if (F1.peek().getValue() == 13) {
                            T4.push(F1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F1.isEmpty() && (T4.peek().getValue() == F1.peek().getValue() + 1) && (T4.peek().isRed() != F1.peek().isRed())) {
                       T4.push(F1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty()) {
                       if (F1.peek().getValue() == 13) {
                            T5.push(F1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F1.isEmpty() && (T5.peek().getValue() == F1.peek().getValue() + 1) && (T5.peek().isRed() != F1.peek().isRed())) {
                       T5.push(F1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty()) {
                       if (F1.peek().getValue() == 13) {
                            T6.push(F1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F1.isEmpty() && (T6.peek().getValue() == F1.peek().getValue() + 1) && (T6.peek().isRed() != F1.peek().isRed())) {
                       T6.push(F1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty()) {
                       if (F1.peek().getValue() == 13) {
                            T7.push(F1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F1.isEmpty() && (T7.peek().getValue() == F1.peek().getValue() + 1) && (T7.peek().isRed() != F1.peek().isRed())) {
                       T7.push(F1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("F2")) { // T1-T7
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty()) {
                       if (F2.peek().getValue() == 13) {
                            T1.push(F2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F2.isEmpty() && (T1.peek().getValue() == F2.peek().getValue() + 1) && (T1.peek().isRed() != F2.peek().isRed())) {
                       T1.push(F2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty()) {
                       if (F2.peek().getValue() == 13) {
                            T2.push(F2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F2.isEmpty() && (T2.peek().getValue() == F2.peek().getValue() + 1) && (T2.peek().isRed() != F2.peek().isRed())) {
                       T2.push(F2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty()) {
                       if (F2.peek().getValue() == 13) {
                            T3.push(F2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F2.isEmpty() && (T3.peek().getValue() == F2.peek().getValue() + 1) && (T3.peek().isRed() != F2.peek().isRed())) {
                       T3.push(F2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty()) {
                       if (F2.peek().getValue() == 13) {
                            T4.push(F2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F2.isEmpty() && (T4.peek().getValue() == F2.peek().getValue() + 1) && (T4.peek().isRed() != F2.peek().isRed())) {
                       T4.push(F2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty()) {
                       if (F2.peek().getValue() == 13) {
                            T5.push(F2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F2.isEmpty() && (T5.peek().getValue() == F2.peek().getValue() + 1) && (T5.peek().isRed() != F2.peek().isRed())) {
                       T5.push(F2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty()) {
                       if (F2.peek().getValue() == 13) {
                            T6.push(F2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F2.isEmpty() && (T6.peek().getValue() == F2.peek().getValue() + 1) && (T6.peek().isRed() != F2.peek().isRed())) {
                       T6.push(F2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty()) {
                       if (F2.peek().getValue() == 13) {
                            T7.push(F2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F2.isEmpty() && (T7.peek().getValue() == F2.peek().getValue() + 1) && (T7.peek().isRed() != F2.peek().isRed())) {
                       T7.push(F2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("F3")) { // T1-T7
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty()) {
                       if (F3.peek().getValue() == 13) {
                            T1.push(F3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F3.isEmpty() && (T1.peek().getValue() == F3.peek().getValue() + 1) && (T1.peek().isRed() != F3.peek().isRed())) {
                       T1.push(F3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty()) {
                       if (F3.peek().getValue() == 13) {
                            T2.push(F3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F3.isEmpty() && (T2.peek().getValue() == F3.peek().getValue() + 1) && (T2.peek().isRed() != F3.peek().isRed())) {
                       T2.push(F3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty()) {
                       if (F3.peek().getValue() == 13) {
                            T3.push(F3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F3.isEmpty() && (T3.peek().getValue() == F3.peek().getValue() + 1) && (T3.peek().isRed() != F3.peek().isRed())) {
                       T3.push(F3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty()) {
                       if (F3.peek().getValue() == 13) {
                            T4.push(F3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F3.isEmpty() && (T4.peek().getValue() == F3.peek().getValue() + 1) && (T4.peek().isRed() != F3.peek().isRed())) {
                       T4.push(F3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty()) {
                       if (F3.peek().getValue() == 13) {
                            T5.push(F3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F3.isEmpty() && (T5.peek().getValue() == F3.peek().getValue() + 1) && (T5.peek().isRed() != F3.peek().isRed())) {
                       T5.push(F3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty()) {
                       if (F3.peek().getValue() == 13) {
                            T6.push(F3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F3.isEmpty() && (T6.peek().getValue() == F3.peek().getValue() + 1) && (T6.peek().isRed() != F3.peek().isRed())) {
                       T6.push(F3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty()) {
                       if (F3.peek().getValue() == 13) {
                            T7.push(F3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F3.isEmpty() && (T7.peek().getValue() == F3.peek().getValue() + 1) && (T7.peek().isRed() != F3.peek().isRed())) {
                       T7.push(F3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("F4")) { // T1-T7
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty()) {
                       if (F4.peek().getValue() == 13) {
                            T1.push(F4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F4.isEmpty() && (T1.peek().getValue() == F4.peek().getValue() + 1) && (T1.peek().isRed() != F4.peek().isRed())) {
                       T1.push(F4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty()) {
                       if (F4.peek().getValue() == 13) {
                            T2.push(F4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F4.isEmpty() && (T2.peek().getValue() == F4.peek().getValue() + 1) && (T2.peek().isRed() != F4.peek().isRed())) {
                       T2.push(F4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty()) {
                       if (F4.peek().getValue() == 13) {
                            T3.push(F4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F4.isEmpty() && (T3.peek().getValue() == F4.peek().getValue() + 1) && (T3.peek().isRed() != F4.peek().isRed())) {
                       T3.push(F4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty()) {
                       if (F4.peek().getValue() == 13) {
                            T4.push(F4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F4.isEmpty() && (T4.peek().getValue() == F4.peek().getValue() + 1) && (T4.peek().isRed() != F4.peek().isRed())) {
                       T4.push(F4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty()) {
                       if (F4.peek().getValue() == 13) {
                            T5.push(F4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F4.isEmpty() && (T5.peek().getValue() == F4.peek().getValue() + 1) && (T5.peek().isRed() != F4.peek().isRed())) {
                       T5.push(F4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty()) {
                       if (F4.peek().getValue() == 13) {
                            T6.push(F4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F4.isEmpty() && (T6.peek().getValue() == F4.peek().getValue() + 1) && (T6.peek().isRed() != F4.peek().isRed())) {
                       T6.push(F4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty()) {
                       if (F4.peek().getValue() == 13) {
                            T7.push(F4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!F4.isEmpty() && (T7.peek().getValue() == F4.peek().getValue() + 1) && (T7.peek().isRed() != F4.peek().isRed())) {
                       T7.push(F4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("T1")) { // T1-T7 excluding self and F1-F4
               if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty() && !T1.isEmpty()) {
                       if (T1.peek().getValue() == 13) {
                            T2.push(T1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T1.isEmpty() && (T2.peek().getValue() == T1.peek().getValue() + 1) && (T2.peek().isRed() != T1.peek().isRed())) {
                       T2.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty() && !T1.isEmpty()) {
                       if (T1.peek().getValue() == 13) {
                            T3.push(T1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T1.isEmpty() && (T3.peek().getValue() == T1.peek().getValue() + 1) && (T3.peek().isRed() != T1.peek().isRed())) {
                       T3.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty() && !T1.isEmpty()) {
                       if (T1.peek().getValue() == 13) {
                            T4.push(T1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T1.isEmpty() && (T4.peek().getValue() == T1.peek().getValue() + 1) && (T4.peek().isRed() != T1.peek().isRed())) {
                       T4.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty() && !T1.isEmpty()) {
                       if (T1.peek().getValue() == 13) {
                            T5.push(T1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T1.isEmpty() && (T5.peek().getValue() == T1.peek().getValue() + 1) && (T5.peek().isRed() != T1.peek().isRed())) {
                       T5.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty() && !T1.isEmpty()) {
                       if (T1.peek().getValue() == 13) {
                            T6.push(T1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T1.isEmpty() && (T6.peek().getValue() == T1.peek().getValue() + 1) && (T6.peek().isRed() != T1.peek().isRed())) {
                       T6.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty() && !T1.isEmpty()) {
                       if (T1.peek().getValue() == 13) {
                            T7.push(T1.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T1.isEmpty() && (T7.peek().getValue() == T1.peek().getValue() + 1) && (T7.peek().isRed() != T1.peek().isRed())) {
                       T7.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && T1.peek().getValue() == 1) {
                       F1.push(T1.pop());
                   } else if (!T1.isEmpty() && !F1.isEmpty() && (F1.peek().getValue() == T1.peek().getValue() - 1) && (F1.peek().getSuit() == T1.peek().getSuit())) {
                       F1.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && T1.peek().getValue() == 1) {
                       F2.push(T1.pop());
                   } else if (!T1.isEmpty() && !F2.isEmpty() && (F2.peek().getValue() == T1.peek().getValue() - 1) && (F2.peek().getSuit() == T1.peek().getSuit())) {
                       F2.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && T1.peek().getValue() == 1) {
                       F3.push(T1.pop());
                   } else if (!T1.isEmpty() && !F3.isEmpty() && (F3.peek().getValue() == T1.peek().getValue() - 1) && (F3.peek().getSuit() == T1.peek().getSuit())) {
                       F3.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && T1.peek().getValue() == 1) {
                       F4.push(T1.pop());
                   } else if (!T1.isEmpty() && !F4.isEmpty() && (F4.peek().getValue() == T1.peek().getValue() - 1) && (F4.peek().getSuit() == T1.peek().getSuit())) {
                       F4.push(T1.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("T2")) { // T1-T7 excluding self and F1-F4
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty() && !T2.isEmpty()) {
                       if (T2.peek().getValue() == 13) {
                            T1.push(T2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T2.isEmpty() && (T1.peek().getValue() == T2.peek().getValue() + 1) && (T1.peek().isRed() != T2.peek().isRed())) {
                       T1.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty() && !T2.isEmpty()) {
                       if (T2.peek().getValue() == 13) {
                            T3.push(T2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T2.isEmpty() && (T3.peek().getValue() == T2.peek().getValue() + 1) && (T3.peek().isRed() != T2.peek().isRed())) {
                       T3.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty() && !T2.isEmpty()) {
                       if (T2.peek().getValue() == 13) {
                            T4.push(T2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T2.isEmpty() && (T4.peek().getValue() == T2.peek().getValue() + 1) && (T4.peek().isRed() != T2.peek().isRed())) {
                       T4.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty() && !T2.isEmpty()) {
                       if (T2.peek().getValue() == 13) {
                            T5.push(T2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T2.isEmpty() && (T5.peek().getValue() == T2.peek().getValue() + 1) && (T5.peek().isRed() != T2.peek().isRed())) {
                       T5.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty() && !T2.isEmpty()) {
                       if (T2.peek().getValue() == 13) {
                            T6.push(T2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T2.isEmpty() && (T6.peek().getValue() == T2.peek().getValue() + 1) && (T6.peek().isRed() != T2.peek().isRed())) {
                       T6.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty() && !T2.isEmpty()) {
                       if (T2.peek().getValue() == 13) {
                            T7.push(T2.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T2.isEmpty() && (T7.peek().getValue() == T2.peek().getValue() + 1) && (T7.peek().isRed() != T2.peek().isRed())) {
                       T7.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && T2.peek().getValue() == 1) {
                       F1.push(T2.pop());
                   } else if (!T2.isEmpty() && !F1.isEmpty() && (F1.peek().getValue() == T2.peek().getValue() - 1) && (F1.peek().getSuit() == T2.peek().getSuit())) {
                       F1.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && T2.peek().getValue() == 1) {
                       F2.push(T2.pop());
                   } else if (!T2.isEmpty() && !F2.isEmpty() && (F2.peek().getValue() == T2.peek().getValue() - 1) && (F2.peek().getSuit() == T2.peek().getSuit())) {
                       F2.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && T2.peek().getValue() == 1) {
                       F3.push(T2.pop());
                   } else if (!T2.isEmpty() && !F3.isEmpty() && (F3.peek().getValue() == T2.peek().getValue() - 1) && (F3.peek().getSuit() == T2.peek().getSuit())) {
                       F3.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && T2.peek().getValue() == 1) {
                       F4.push(T2.pop());
                   } else if (!T2.isEmpty() && !F4.isEmpty() && (F4.peek().getValue() == T2.peek().getValue() - 1) && (F4.peek().getSuit() == T2.peek().getSuit())) {
                       F4.push(T2.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("T3")) { // T1-T7 excluding self and F1-F4
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty() && !T3.isEmpty()) {
                       if (T3.peek().getValue() == 13) {
                            T1.push(T3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T3.isEmpty() && (T1.peek().getValue() == T3.peek().getValue() + 1) && (T1.peek().isRed() != T3.peek().isRed())) {
                       T1.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty() && !T3.isEmpty()) {
                       if (T3.peek().getValue() == 13) {
                            T2.push(T3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T3.isEmpty() && (T2.peek().getValue() == T3.peek().getValue() + 1) && (T2.peek().isRed() != T3.peek().isRed())) {
                       T2.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty() && !T3.isEmpty()) {
                       if (T3.peek().getValue() == 13) {
                            T4.push(T3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T3.isEmpty() && (T4.peek().getValue() == T3.peek().getValue() + 1) && (T4.peek().isRed() != T3.peek().isRed())) {
                       T4.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty() && !T3.isEmpty()) {
                       if (T3.peek().getValue() == 13) {
                            T5.push(T3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T3.isEmpty() && (T5.peek().getValue() == T3.peek().getValue() + 1) && (T5.peek().isRed() != T3.peek().isRed())) {
                       T5.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty() && !T3.isEmpty()) {
                       if (T3.peek().getValue() == 13) {
                            T6.push(T3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T3.isEmpty() && (T6.peek().getValue() == T3.peek().getValue() + 1) && (T6.peek().isRed() != T3.peek().isRed())) {
                       T6.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty() && !T3.isEmpty()) {
                       if (T3.peek().getValue() == 13) {
                            T7.push(T3.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T3.isEmpty() && (T7.peek().getValue() == T3.peek().getValue() + 1) && (T7.peek().isRed() != T3.peek().isRed())) {
                       T7.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && T3.peek().getValue() == 1) {
                       F1.push(T3.pop());
                   } else if (!T3.isEmpty() && !F1.isEmpty() && (F1.peek().getValue() == T3.peek().getValue() - 1) && (F1.peek().getSuit() == T3.peek().getSuit())) {
                       F1.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && T3.peek().getValue() == 1) {
                       F2.push(T3.pop());
                   } else if (!T3.isEmpty() && !F2.isEmpty() && (F2.peek().getValue() == T3.peek().getValue() - 1) && (F2.peek().getSuit() == T3.peek().getSuit())) {
                       F2.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && T3.peek().getValue() == 1) {
                       F3.push(T3.pop());
                   } else if (!T3.isEmpty() && !F3.isEmpty() && (F3.peek().getValue() == T3.peek().getValue() - 1) && (F3.peek().getSuit() == T3.peek().getSuit())) {
                       F3.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && T3.peek().getValue() == 1) {
                       F4.push(T3.pop());
                   } else if (!T3.isEmpty() && !F4.isEmpty() && (F4.peek().getValue() == T3.peek().getValue() - 1) && (F4.peek().getSuit() == T3.peek().getSuit())) {
                       F4.push(T3.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }    
           } else if (token2.equalsIgnoreCase("T4")) { // T1-T7 excluding self and F1-F4
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty() && !T4.isEmpty()) {
                       if (T4.peek().getValue() == 13) {
                            T1.push(T4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T4.isEmpty() && (T1.peek().getValue() == T4.peek().getValue() + 1) && (T1.peek().isRed() != T4.peek().isRed())) {
                       T1.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty() && !T4.isEmpty()) {
                       if (T4.peek().getValue() == 13) {
                            T2.push(T4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else 
                   if (!T4.isEmpty() && (T2.peek().getValue() == T4.peek().getValue() + 1) && (T2.peek().isRed() != T4.peek().isRed())) {
                       T2.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty() && !T4.isEmpty()) {
                       if (T4.peek().getValue() == 13) {
                            T3.push(T4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T4.isEmpty() && (T3.peek().getValue() == T4.peek().getValue() + 1) && (T3.peek().isRed() != T4.peek().isRed())) {
                       T3.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty() && !T4.isEmpty()) {
                       if (T4.peek().getValue() == 13) {
                            T5.push(T4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T4.isEmpty() && (T5.peek().getValue() == T4.peek().getValue() + 1) && (T5.peek().isRed() != T4.peek().isRed())) {
                       T5.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty() && !T4.isEmpty()) {
                       if (T4.peek().getValue() == 13) {
                            T6.push(T4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T4.isEmpty() && (T6.peek().getValue() == T4.peek().getValue() + 1) && (T6.peek().isRed() != T4.peek().isRed())) {
                       T6.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty() && !T4.isEmpty()) {
                       if (T4.peek().getValue() == 13) {
                            T7.push(T4.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T4.isEmpty() && (T7.peek().getValue() == T4.peek().getValue() + 1) && (T7.peek().isRed() != T4.peek().isRed())) {
                       T7.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && T4.peek().getValue() == 1) {
                       F1.push(T4.pop());
                   } else if (!T4.isEmpty() && !F1.isEmpty() && (F1.peek().getValue() == T4.peek().getValue() - 1) && (F1.peek().getSuit() == T4.peek().getSuit())) {
                       F1.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && T4.peek().getValue() == 1) {
                       F2.push(T4.pop());
                   } else if (!T4.isEmpty() && !F2.isEmpty() && (F2.peek().getValue() == T4.peek().getValue() - 1) && (F2.peek().getSuit() == T4.peek().getSuit())) {
                       F2.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && T4.peek().getValue() == 1) {
                       F3.push(T4.pop());
                   } else if (!T4.isEmpty() && !F3.isEmpty() && (F3.peek().getValue() == T4.peek().getValue() - 1) && (F3.peek().getSuit() == T4.peek().getSuit())) {
                       F3.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && T4.peek().getValue() == 1) {
                       F4.push(T4.pop());
                   } else if (!T4.isEmpty() && !F4.isEmpty() && (F4.peek().getValue() == T4.peek().getValue() - 1) && (F4.peek().getSuit() == T4.peek().getSuit())) {
                       F4.push(T4.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("T5")) { // T1-T7 excluding self and F1-F4
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty() && !T5.isEmpty()) {
                       if (T5.peek().getValue() == 13) {
                            T1.push(T5.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T5.isEmpty() && (T1.peek().getValue() == T5.peek().getValue() + 1) && (T1.peek().isRed() != T5.peek().isRed())) {
                       T1.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty() && !T5.isEmpty()) {
                       if (T5.peek().getValue() == 13) {
                            T2.push(T5.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T5.isEmpty() && (T2.peek().getValue() == T5.peek().getValue() + 1) && (T2.peek().isRed() != T5.peek().isRed())) {
                       T2.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty() && !T5.isEmpty()) {
                       if (T5.peek().getValue() == 13) {
                            T3.push(T5.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T5.isEmpty() && (T3.peek().getValue() == T5.peek().getValue() + 1) && (T3.peek().isRed() != T5.peek().isRed())) {
                       T3.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty() && !T5.isEmpty()) {
                       if (T5.peek().getValue() == 13) {
                            T4.push(T5.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T5.isEmpty() && (T4.peek().getValue() == T5.peek().getValue() + 1) && (T4.peek().isRed() != T5.peek().isRed())) {
                       T4.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty() && !T5.isEmpty()) {
                       if (T5.peek().getValue() == 13) {
                            T6.push(T5.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T5.isEmpty() && (T6.peek().getValue() == T5.peek().getValue() + 1) && (T6.peek().isRed() != T5.peek().isRed())) {
                       T6.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty() && !T5.isEmpty()) {
                       if (T5.peek().getValue() == 13) {
                            T7.push(T5.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T5.isEmpty() && (T7.peek().getValue() == T5.peek().getValue() + 1) && (T7.peek().isRed() != T5.peek().isRed())) {
                       T7.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && T5.peek().getValue() == 1) {
                       F1.push(T5.pop());
                   } else if (!T5.isEmpty() && !F1.isEmpty() && (F1.peek().getValue() == T5.peek().getValue() - 1) && (F1.peek().getSuit() == T5.peek().getSuit())) {
                       F1.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && T5.peek().getValue() == 1) {
                       F2.push(T5.pop());
                   } else if (!T5.isEmpty() && !F2.isEmpty() && (F2.peek().getValue() == T5.peek().getValue() - 1) && (F2.peek().getSuit() == T5.peek().getSuit())) {
                       F2.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && T5.peek().getValue() == 1) {
                       F3.push(T5.pop());
                   } else if (!T5.isEmpty() && !F3.isEmpty() && (F3.peek().getValue() == T5.peek().getValue() - 1) && (F3.peek().getSuit() == T5.peek().getSuit())) {
                       F3.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && T5.peek().getValue() == 1) {
                       F4.push(T5.pop());
                   } else if (!T5.isEmpty() && !F4.isEmpty() && (F4.peek().getValue() == T5.peek().getValue() - 1) && (F4.peek().getSuit() == T5.peek().getSuit())) {
                       F4.push(T5.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("T6")) { // T1-T7 excluding self and F1-F4
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty() && !T6.isEmpty()) {
                       if (T6.peek().getValue() == 13) {
                            T1.push(T6.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T6.isEmpty() && (T1.peek().getValue() == T6.peek().getValue() + 1) && (T1.peek().isRed() != T6.peek().isRed())) {
                       T1.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty() && !T6.isEmpty()) {
                       if (T6.peek().getValue() == 13) {
                            T2.push(T6.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T6.isEmpty() && (T2.peek().getValue() == T6.peek().getValue() + 1) && (T2.peek().isRed() != T6.peek().isRed())) {
                       T2.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty() && !T6.isEmpty()) {
                       if (T6.peek().getValue() == 13) {
                            T3.push(T6.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T6.isEmpty() && (T3.peek().getValue() == T6.peek().getValue() + 1) && (T3.peek().isRed() != T6.peek().isRed())) {
                       T3.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty() && !T6.isEmpty()) {
                       if (T6.peek().getValue() == 13) {
                            T4.push(T6.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T6.isEmpty() && (T4.peek().getValue() == T6.peek().getValue() + 1) && (T4.peek().isRed() != T6.peek().isRed())) {
                       T4.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty() && !T6.isEmpty()) {
                       if (T6.peek().getValue() == 13) {
                            T5.push(T6.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T6.isEmpty() && (T5.peek().getValue() == T6.peek().getValue() + 1) && (T5.peek().isRed() != T6.peek().isRed())) {
                       T5.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   if (T7.isEmpty() && !T6.isEmpty()) {
                       if (T6.peek().getValue() == 13) {
                            T7.push(T6.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T6.isEmpty() && (T7.peek().getValue() == T6.peek().getValue() + 1) && (T7.peek().isRed() != T6.peek().isRed())) {
                       T7.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && T6.peek().getValue() == 1) {
                       F1.push(T6.pop());
                   } else if (!T6.isEmpty() && !F1.isEmpty() && (F1.peek().getValue() == T6.peek().getValue() - 1) && (F1.peek().getSuit() == T6.peek().getSuit())) {
                       F1.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && T6.peek().getValue() == 1) {
                       F2.push(T6.pop());
                   } else if (!T6.isEmpty() && !F2.isEmpty() && (F2.peek().getValue() == T6.peek().getValue() - 1) && (F2.peek().getSuit() == T6.peek().getSuit())) {
                       F2.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && T6.peek().getValue() == 1) {
                       F3.push(T6.pop());
                   } else if (!T6.isEmpty() && !F3.isEmpty() && (F3.peek().getValue() == T6.peek().getValue() - 1) && (F3.peek().getSuit() == T6.peek().getSuit())) {
                       F3.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && T6.peek().getValue() == 1) {
                       F4.push(T6.pop());
                   } else if (!T6.isEmpty() && !F4.isEmpty() && (F4.peek().getValue() == T6.peek().getValue() - 1) && (F4.peek().getSuit() == T6.peek().getSuit())) {
                       F4.push(T6.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           } else if (token2.equalsIgnoreCase("T7")) { // T1-T7 excluding self and F1-F4
               if (token3.equalsIgnoreCase("T1")) {
                   if (T1.isEmpty() && !T7.isEmpty()) {
                       if (T7.peek().getValue() == 13) {
                            T1.push(T7.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T7.isEmpty() && (T1.peek().getValue() == T7.peek().getValue() + 1) && (T1.peek().isRed() != T7.peek().isRed())) {
                       T1.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   if (T2.isEmpty() && !T7.isEmpty()) {
                       if (T7.peek().getValue() == 13) {
                            T2.push(T7.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T7.isEmpty() && (T2.peek().getValue() == T7.peek().getValue() + 1) && (T2.peek().isRed() != T7.peek().isRed())) {
                       T2.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   if (T3.isEmpty() && !T7.isEmpty()) {
                       if (T7.peek().getValue() == 13) {
                            T3.push(T7.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T7.isEmpty() && (T3.peek().getValue() == T7.peek().getValue() + 1) && (T3.peek().isRed() != T7.peek().isRed())) {
                       T3.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   if (T4.isEmpty() && !T7.isEmpty()) {
                       if (T7.peek().getValue() == 13) {
                            T4.push(T7.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T7.isEmpty() && (T4.peek().getValue() == T7.peek().getValue() + 1) && (T4.peek().isRed() != T7.peek().isRed())) {
                       T4.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   if (T5.isEmpty() && !T7.isEmpty()) {
                       if (T7.peek().getValue() == 13) {
                            T5.push(T7.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T7.isEmpty() && (T5.peek().getValue() == T7.peek().getValue() + 1) && (T5.peek().isRed() != T7.peek().isRed())) {
                       T5.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   if (T6.isEmpty() && !T7.isEmpty()) {
                       if (T7.peek().getValue() == 13) {
                            T6.push(T7.pop());
                       } else {
                           System.out.println("This move is not allowed");
                       }
                   } else if (!T7.isEmpty() && (T6.peek().getValue() == T7.peek().getValue() + 1) && (T6.peek().isRed() != T7.peek().isRed())) {
                       T6.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F1")) {
                   if (F1.isEmpty() && T7.peek().getValue() == 1) {
                       F1.push(T7.pop());
                   } else if (!T7.isEmpty() && !F1.isEmpty() && (F1.peek().getValue() == T7.peek().getValue() - 1) && (F1.peek().getSuit() == T7.peek().getSuit())) {
                       F1.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F2")) {
                   if (F2.isEmpty() && T7.peek().getValue() == 1) {
                       F2.push(T7.pop());
                   } else if (!T7.isEmpty() && !F2.isEmpty() && (F2.peek().getValue() == T7.peek().getValue() - 1) && (F2.peek().getSuit() == T7.peek().getSuit())) {
                       F2.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F3")) {
                   if (F3.isEmpty() && T7.peek().getValue() == 1) {
                       F3.push(T7.pop());
                   } else if (!T7.isEmpty() && !F3.isEmpty() && (F3.peek().getValue() == T7.peek().getValue() - 1) && (F3.peek().getSuit() == T7.peek().getSuit())) {
                       F3.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               } else if (token3.equalsIgnoreCase("F4")) {
                   if (F4.isEmpty() && T7.peek().getValue() == 1) {
                       F4.push(T7.pop());
                   } else if (!T7.isEmpty() && !F4.isEmpty() && (F4.peek().getValue() == T7.peek().getValue() - 1) && (F4.peek().getSuit() == T7.peek().getSuit())) {
                       F4.push(T7.pop());
                   } else {
                       System.out.println("This move is not allowed");
                   }
               }
           }
           if (checkWinningBoard() == true) { // won
               System.out.println("You WON!");  
               System.out.println("Would you like to play again? Y/N");
               Scanner input1 = new Scanner(System.in);
               String choice = input1.nextLine();
               if (choice.equalsIgnoreCase("y")) {
                   restart();
                   initialize();
               } else if (choice.equalsIgnoreCase("n")){
                   k = 1;
               } else {
                   k = 1;
               }
           }
       } else if (token1.equalsIgnoreCase("moveN")) {
           String token2 = input.next();
           String token3 = input.next();
           int token4 = input.nextInt();
           if (token2.equalsIgnoreCase("T1")) {
               if (token3.equalsIgnoreCase("T2")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T1.pop());
                   }
                   if (T2.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T2.peek().getValue() - 1) && (temp.peek().isRed() != T2.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T1.pop());
                   }
                   if (T3.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T3.peek().getValue() - 1) && (temp.peek().isRed() != T3.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   }    
               } else if (token3.equalsIgnoreCase("T4")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T1.pop());
                   }
                   if (T4.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T4.peek().getValue() - 1) && (temp.peek().isRed() != T4.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T1.pop());
                   }
                   if (T5.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T5.peek().getValue() - 1) && (temp.peek().isRed() != T5.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T1.pop());
                   }
                   if (T6.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T6.peek().getValue() - 1) && (temp.peek().isRed() != T6.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T1.pop());
                   }
                   if (T7.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T7.peek().getValue() - 1) && (temp.peek().isRed() != T7.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   }
               }
           } else if (token2.equalsIgnoreCase("T2")) {
               if (token3.equalsIgnoreCase("T1")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T2.pop());
                   }
                   if (T1.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T1.peek().getValue() - 1) && (temp.peek().isRed() != T1.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T2.pop());
                   }
                   if (T3.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T3.peek().getValue() - 1) && (temp.peek().isRed() != T3.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T2.pop());
                   }
                   if (T4.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T4.peek().getValue() - 1) && (temp.peek().isRed() != T4.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T2.pop());
                   }
                   if (T5.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T5.peek().getValue() - 1) && (temp.peek().isRed() != T5.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T2.pop());
                   }
                   if (T6.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T6.peek().getValue() - 1) && (temp.peek().isRed() != T6.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T2.pop());
                   }
                   if (T7.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T7.peek().getValue() - 1) && (temp.peek().isRed() != T7.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   }
               }
           } else if (token2.equalsIgnoreCase("T3")) {
               if (token3.equalsIgnoreCase("T1")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T3.pop());
                   }
                   if (T1.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T1.peek().getValue() - 1) && (temp.peek().isRed() != T1.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T3.pop());
                   }
                   if (T2.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T2.peek().getValue() - 1) && (temp.peek().isRed() != T2.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T3.pop());
                   }
                   if (T4.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T4.peek().getValue() - 1) && (temp.peek().isRed() != T4.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T3.pop());
                   }
                   if (T5.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T5.peek().getValue() - 1) && (temp.peek().isRed() != T5.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T3.pop());
                   }
                   if (T6.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T6.peek().getValue() - 1) && (temp.peek().isRed() != T6.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T3.pop());
                   }
                   if (T7.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T7.peek().getValue() - 1) && (temp.peek().isRed() != T7.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   }
               }
           } else if (token2.equalsIgnoreCase("T4")) {
               if (token3.equalsIgnoreCase("T1")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T4.pop());
                   }
                   if (T1.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T1.peek().getValue() - 1) && (temp.peek().isRed() != T1.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T4.pop());
                   }
                   if (T2.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T2.peek().getValue() - 1) && (temp.peek().isRed() != T2.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T4.pop());
                   }
                   if (T3.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T3.peek().getValue() - 1) && (temp.peek().isRed() != T3.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T4.pop());
                   }
                   if (T5.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T5.peek().getValue() - 1) && (temp.peek().isRed() != T5.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T4.pop());
                   }
                   if (T6.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T6.peek().getValue() - 1) && (temp.peek().isRed() != T6.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T4.pop());
                   }
                   if (T7.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T7.peek().getValue() - 1) && (temp.peek().isRed() != T7.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   }
               }
           } else if (token2.equalsIgnoreCase("T5")) {
               if (token3.equalsIgnoreCase("T1")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T5.pop());
                   }
                   if (T1.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T1.peek().getValue() - 1) && (temp.peek().isRed() != T1.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T5.pop());
                   }
                   if (T2.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T2.peek().getValue() - 1) && (temp.peek().isRed() != T2.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T5.pop());
                   }
                   if (T3.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T3.peek().getValue() - 1) && (temp.peek().isRed() != T3.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T5.pop());
                   }
                   if (T4.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T4.peek().getValue() - 1) && (temp.peek().isRed() != T4.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T5.pop());
                   }
                   if (T6.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T6.peek().getValue() - 1) && (temp.peek().isRed() != T6.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T5.pop());
                   }
                   if (T7.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T7.peek().getValue() - 1) && (temp.peek().isRed() != T7.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   }
               }
           } else if (token2.equalsIgnoreCase("T6")) {
               if (token3.equalsIgnoreCase("T1")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T6.pop());
                   }
                   if (T1.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T1.peek().getValue() - 1) && (temp.peek().isRed() != T1.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T6.pop());
                   }
                   if (T2.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T2.peek().getValue() - 1) && (temp.peek().isRed() != T2.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T6.pop());
                   }
                   if (T3.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T3.peek().getValue() - 1) && (temp.peek().isRed() != T3.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T6.pop());
                   }
                   if (T4.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T4.peek().getValue() - 1) && (temp.peek().isRed() != T4.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T6.pop());
                   }
                   if (T5.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T5.peek().getValue() - 1) && (temp.peek().isRed() != T5.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T7")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T6.pop());
                   }
                   if (T7.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T7.peek().getValue() - 1) && (temp.peek().isRed() != T7.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   }
               }
           } else if (token2.equalsIgnoreCase("T7")) {
               if (token3.equalsIgnoreCase("T1")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T7.pop());
                   }
                   if (T1.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T1.peek().getValue() - 1) && (temp.peek().isRed() != T1.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T1.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T2")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T7.pop());
                   }
                   if (T2.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T2.peek().getValue() - 1) && (temp.peek().isRed() != T2.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T2.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T3")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T7.pop());
                   }
                   if (T3.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T3.peek().getValue() - 1) && (temp.peek().isRed() != T3.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T3.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T4")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T7.pop());
                   }
                   if (T4.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T4.peek().getValue() - 1) && (temp.peek().isRed() != T4.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T4.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T5")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T7.pop());
                   }
                   if (T5.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T5.peek().getValue() - 1) && (temp.peek().isRed() != T5.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T5.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   }
               } else if (token3.equalsIgnoreCase("T6")) {
                   CardStack temp = new CardStack('t');
                   for (int i = 1; i <= token4; i++) {
                       temp.push(T7.pop());
                   }
                   if (T6.isEmpty() && !temp.isEmpty()) {
                       if (temp.peek().getValue() == 13) {
                           while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                        }
                       } else {
                           while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                          }
                       }
                   } else if ((temp.peek().getValue() == T6.peek().getValue() - 1) && (temp.peek().isRed() != T6.peek().isRed())) {
                       while (!temp.isEmpty()) {
                           T6.push(temp.pop());
                       }
                   } else {
                       while(!temp.isEmpty()) {
                           T7.push(temp.pop());
                       }
                   }
               }
           }
           if (checkWinningBoard() == true) { // won
               System.out.println("You WON!");  
               System.out.println("Would you like to play again? Y/N");
               Scanner input1 = new Scanner(System.in);
               String choice = input1.nextLine();
               if (choice.equalsIgnoreCase("y")) {
                   restart();
                   initialize();
               } else if (choice.equalsIgnoreCase("n")){
                   k = 1;
               } else {
                   k = 1;
               }
           }
           
       } else if (token1.equalsIgnoreCase("restart")) {
            restart();
            initialize();   
       } else if (token1.equalsIgnoreCase("quit")) {
            k = 1;
       }
   }
   
   }
   
    public static void restart() {
        deck = new ArrayList(); // 52 cards
        tableauStacks = new CardStack[8];// there are seven
        T1 = new CardStack('t');
        T2 = new CardStack('t');
        T3 = new CardStack('t');
        T4 = new CardStack('t');
        T5 = new CardStack('t');
        T6 = new CardStack('t');
        T7 = new CardStack('t');
        foundationStacks = new CardStack[5]; // there are four
        F1 = new CardStack('f');
        F2 = new CardStack('f');
        F3 = new CardStack('f');
        F4 = new CardStack('f');
        stockStack = new CardStack('s');
        wasteStack = new CardStack('w');
    }
    public static void initialize() {
        //placing into arrays
        tableauStacks[1] = T1;
        tableauStacks[2] = T2;
        tableauStacks[3] = T3;
        tableauStacks[4] = T4;
        tableauStacks[5] = T5;
        tableauStacks[6] = T6;
        tableauStacks[7] = T7;
        foundationStacks[1] = F1;
        foundationStacks[2] = F2;
        foundationStacks[3] = F3;
        foundationStacks[4] = F4;
        //creating new deck
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                deck.add(new Card(j, i));
            }
        }
        Collections.shuffle(deck);
        for (int i = 0; i < 52; i++) {
            stockStack.push(deck.get(i));
        }
        
        
        //tableau stacks
        T1.push(stockStack.pop());
        for (int i = 1; i <= 2; i++) {
            T2.push(stockStack.pop());
        }
        for (int i = 1; i <= 3; i++) {
            T3.push(stockStack.pop());
        }
        for (int i = 1; i <= 4; i++) {
            T4.push(stockStack.pop());
        }
        for (int i = 1; i <= 5; i++) {
            T5.push(stockStack.pop());
        }
        for (int i = 1; i <= 6; i++) {
            T6.push(stockStack.pop());
        }
        for (int i = 1; i <= 7; i++) {
            T7.push(stockStack.pop());
        }
        T1.peek().setFaceUp(true);
        T2.peek().setFaceUp(true);
        T3.peek().setFaceUp(true);
        T4.peek().setFaceUp(true);
        T5.peek().setFaceUp(true);
        T6.peek().setFaceUp(true);
        T7.peek().setFaceUp(true);
        
    }
    
    public static void displayGameBoard() {
        F1.printStack('f');
        F2.printStack('f');
        F3.printStack('f');
        F4.printStack('f');
        System.out.print("        ");
        wasteStack.printStack('w');
        System.out.print("       ");
        stockStack.printStack('s');
        System.out.println();
        System.out.println();
        System.out.print("T7");
        T7.printStack('t');
        System.out.println();
        System.out.print("T6");
        T6.printStack('t');
        System.out.println();
        System.out.print("T5");
        T5.printStack('t');
        System.out.println();
        System.out.print("T4");
        T4.printStack('t');
        System.out.println();
        System.out.print("T3");
        T3.printStack('t');
        System.out.println();
        System.out.print("T2");
        T2.printStack('t');
        System.out.println();
        System.out.print("T1");
        T1.printStack('t');
        System.out.println();
    }
    public static boolean checkWinningBoard() {
        ArrayList<Card> shallowClone = new ArrayList();
        shallowClone.addAll(T1);
        shallowClone.addAll(T2);
        shallowClone.addAll(T3);
        shallowClone.addAll(T4);
        shallowClone.addAll(T5);
        shallowClone.addAll(T6);
        shallowClone.addAll(T7);
        shallowClone.addAll(F1);
        shallowClone.addAll(F2);
        shallowClone.addAll(F3);
        shallowClone.addAll(F4);
        shallowClone.addAll(wasteStack);
        shallowClone.addAll(stockStack);
        int counter = 0;
        for (int i = 0; i < shallowClone.size(); i++) {
            if (shallowClone.get(i).isFaceUp == true) {
                counter++;
            }
        }
        if (counter == 52) {
            return true;
        } else {
            return false;
        }
    }
}
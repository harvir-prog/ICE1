/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @modifier Harvir Singh
 * Student number=991760185
 */
//import java.util.Scanner;
import java.util.Random;

public class CardTrick {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13));
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
//        System.out.println("enter the card value");
//        int uservalue = input.nextInt();
//        input.nextLine();
//        System.out.println("enter the suit");
//        String userSuit = input.nextLine();

//        Card usercard = new Card();
//        usercard.setSuit(userSuit);
//        usercard.setValue(uservalue);
        // and search magicHand here
        //Then report the result here
//        for (Card c : magicHand) {
//            if (c.getValue() == usercard.getValue() && c.getSuit().equalsIgnoreCase(usercard.getSuit())) {
//                System.out.println("your card is in magichand");
//                return;
//            }
//        }
//        System.out.println("Sorry your card is not in magichand");

        // add one luckcard hard code 2,clubs
        Card luckcard=new Card();
        luckcard.setValue(2);
        luckcard.setSuit("Clubs");
        
        for (Card c : magicHand) {
            if (c.getValue() == luckcard.getValue() && c.getSuit().equalsIgnoreCase(luckcard.getSuit())) {
                System.out.println("you are winner");
                return;
            }
        }
        System.out.println("Sorry you lost");
    }

}

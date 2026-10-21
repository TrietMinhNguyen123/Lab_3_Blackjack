import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // TODO: Construct and shuffle a Deck.
//        // TODO: Prompt exactly: How many cards would you like to deal?
//        // TODO: Read an integer, ensuring it is from 0 through 52.
//        // TODO: Deal the cards and print "Dealt cards:" followed by one card per line.
//        // TODO: For invalid input print: Error: Please enter a number from 0 to 52.
//
        ArrayList<Card> dealCards = new ArrayList<>();
        Dealer dealer = new Dealer();

        Deck deck1 = new Deck();
        deck1.shuffle();

        dealer.receiveCard(deck1.dealCard());
        dealer.receiveCard(deck1.dealCard());
        dealer.playTurn(deck1);

        System.out.print("dealer got: " + dealer.getHandTotal());
    }
}

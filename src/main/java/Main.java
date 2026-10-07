import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Construct and shuffle a Deck.
        // TODO: Prompt exactly: How many cards would you like to deal?
        // TODO: Read an integer, ensuring it is from 0 through 52.
        // TODO: Deal the cards and print "Dealt cards:" followed by one card per line.
        // TODO: For invalid input print: Error: Please enter a number from 0 to 52.

        ArrayList<Card> dealCards = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Deck deck1 = new Deck();
        deck1.shuffle();
        System.out.print("How many cards would you like to deal? ");
        int number_of_cards = input.nextInt();
        if(number_of_cards > 0 && number_of_cards <= 52){
            dealCards = deck1.dealCards(number_of_cards);

            for(int i = 0; i < dealCards.size(); i++) {
                System.out.println("Dealt cards: " + (dealCards.get(i)).toString());
            }
        }else{
            System.out.print("Error: Please enter a number from 0 to 52");
        }

    }
}

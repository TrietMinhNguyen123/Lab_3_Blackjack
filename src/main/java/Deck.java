import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        // TODO: Create arrays containing the 13 ranks and 4 suits.
        // TODO: Use nested loops to add all 52 unique Card objects.
    }

    public int getSize() {
        // TODO: Return the number of cards still in the deck.
        return 0;
    }

    public void shuffle() {
        // TODO: Shuffle cards using Collections.shuffle.
    }

    public Card dealCard() {
        // TODO: Return null if empty; otherwise remove and return the top card.
        return null;
    }

    public ArrayList<Card> dealCards(int n) {
        // TODO: Throw IllegalArgumentException if n is negative or too large.
        // TODO: Deal n cards into a new ArrayList and return it.
        return null;
    }
}
